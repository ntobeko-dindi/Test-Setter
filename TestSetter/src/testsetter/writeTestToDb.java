package testsetter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author XCODING
 */
public class writeTestToDb {
    private String testName = readTestName();
    
    public String readTestName(){
        String name = null;
        Scanner in = null;
        try
        {
            in = new Scanner(new FileInputStream("C:\\TestSetter\\available tests\\test_name.txt"));
            name = in.nextLine();
        }
        catch(FileNotFoundException ex){
            ex.printStackTrace();
        }
        finally{
            if(in != null){
                in.close();
            }
        }
        return name;
    }
    
    public void checkTestName(){
        if(this.testName != null){
            readTest();
        }
    }
    public void readTest(){
         Scanner inputStream = null;
        Scanner inputStream1 = null;
        
        try
        {
            inputStream = new Scanner(new FileInputStream("C:\\TestSetter\\test\\testQuestions.txt"));
            inputStream1 = new Scanner(new FileInputStream("C:\\TestSetter\\test\\testAnswers.txt"));
            
            while(inputStream.hasNextLine())
            {   
                byte [] bytes = new FileCrypto().decrypt(inputStream.nextLine().getBytes());
                String aStr = new String(bytes);
                
                
                byte [] bytes1 = new FileCrypto().decrypt(inputStream1.nextLine().getBytes());
                String [] aStr1 = new String(bytes1).split("-");
                
                String sql = "INSERT INTO tests (test_name,question,answer_one,answer_two,answer_three,answer_four,correct_answer) VALUES('"+this.testName+"','"+aStr+"','"+aStr1[0]+"','"+aStr1[1]+"','"+aStr1[2]+"','"+aStr1[3]+"','"+aStr1[4]+"')";
                new DataAccess().Update(sql);
            }
        } catch(FileNotFoundException ex){
            ex.printStackTrace();
        }
        finally{
            if(inputStream != null){
                inputStream.close();
            }
            if(inputStream1 != null){
                inputStream1.close();
            }
            readTestTorF();
        }
    }
     public void readTestTorF(){
        try
        (Scanner inputStream = new Scanner(new FileInputStream("C:\\TestSetter\\test\\trueOrFalse.txt"))) {
            
            while(inputStream.hasNext())
            {
                byte[] bytes = new FileCrypto().decrypt(inputStream.nextLine().getBytes());
                String aStr = new String(bytes);
                String [] arr = aStr.split("-");
                
                String sql = "INSERT INTO testsTorF (test_name,question,answer) VALUES('"+this.testName+"','"+arr[0]+"','"+arr[1]+"')";
                new DataAccess().Update(sql);
            }
        } catch(FileNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
