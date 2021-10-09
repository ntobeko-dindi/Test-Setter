package testsetter;

import java.time.LocalDate;

/**
 *
 * @author XCODING
 */
public class Test {
    private String test_name;
    
    public Test(){
        
    }
    public Test(String test_name){
        this.test_name = test_name;
    }

    public String getTest_name() {
        return test_name;
    }
    //INNER CLASS
    public class TestDetails{
        private LocalDate date = LocalDate.now();
        private int duration;
        
        public TestDetails(){
            
        }
        public TestDetails(LocalDate date,int duration){
            this.date = date;
            this.duration = duration;
        }

        public String dateToString(){
            return this.date.toString();
        }
        public LocalDate getDate() {
            return date;
        }

        public int getDuration() {
            return duration;
        }
    }
}
