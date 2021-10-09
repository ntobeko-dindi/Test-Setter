/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testsetter;

import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Questions extends javax.swing.JFrame {

    ArrayList<String> questions = new ArrayList<String>();
    ArrayList<String> answers = new ArrayList<String>();
    //ArrayList<String> correctAnswers = new ArrayList<String>();
    
    ArrayList<String> trueOfFalseQuestionsAndAnswers = new ArrayList<String>();
    
    int questionsNumber = 1;
    public Questions() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtQuestion = new javax.swing.JEditorPane();
        lblQuestionNumber = new javax.swing.JLabel();
        btnSaveQuestion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAnswerA = new javax.swing.JTextField();
        txtAnswerB = new javax.swing.JTextField();
        txtAnswerC = new javax.swing.JTextField();
        txtAnswerD = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jcTrueOrFalse = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        btnUploadTest = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        correctAnswer = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jScrollPane2.setViewportView(txtQuestion);

        lblQuestionNumber.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lblQuestionNumber.setText("Question 1");

        btnSaveQuestion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSaveQuestion.setText("SAVE QUESTION");
        btnSaveQuestion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSaveQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveQuestionActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Answers :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText(" Correct Answers");

        txtAnswerD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnswerDActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("True / False : ");

        jcTrueOrFalse.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jcTrueOrFalse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DEFAULT", "TRUE", "FALSE" }));
        jcTrueOrFalse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcTrueOrFalseActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Set Your Test");

        btnUploadTest.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUploadTest.setText("Upload Test");
        btnUploadTest.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUploadTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadTestActionPerformed(evt);
            }
        });

        jLabel7.setText("A");

        jLabel8.setText("C");

        jLabel9.setText("D");

        jLabel1.setText("B");

        correctAnswer.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        correctAnswer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblQuestionNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAnswerA, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(227, 227, 227)
                                .addComponent(jLabel6)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcTrueOrFalse, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(correctAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel8)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAnswerD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                    .addComponent(txtAnswerC)
                                    .addComponent(txtAnswerB)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(btnSaveQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                .addComponent(btnUploadTest, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(11, 11, 11)
                .addComponent(lblQuestionNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAnswerA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAnswerB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAnswerC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcTrueOrFalse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtAnswerD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnUploadTest, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSaveQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(correctAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtAnswerDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnswerDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnswerDActionPerformed

    private void btnSaveQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveQuestionActionPerformed

        try
        {
            String question = txtQuestion.getText().trim();

            if(!txtQuestion.getText().trim().isEmpty() 
                    && txtAnswerA.getText().trim().isEmpty() 
                        && txtAnswerB.getText().trim().isEmpty() 
                            && txtAnswerC.getText().trim().isEmpty() 
                                && txtAnswerD.getText().trim().isEmpty()
                                    && !jcTrueOrFalse.getSelectedItem().equals("Default"))
            {
                trueOfFalseQuestionsAndAnswers.add(question+"-"+jcTrueOrFalse.getSelectedItem().toString());
                
                questionsNumber++;
                
                clear();
                lblQuestionNumber.setText("Question "+questionsNumber);
            }
            else if(txtQuestion.getText().trim().isEmpty() 
                    || txtAnswerA.getText().trim().isEmpty() 
                        || txtAnswerB.getText().trim().isEmpty() 
                            || txtAnswerC.getText().trim().isEmpty() 
                                || txtAnswerD.getText().trim().isEmpty())
            {
                JOptionPane.showMessageDialog(null,
                        "Please Fill Out All Fields Before Saving The Question",
                            "ERROR",JOptionPane.ERROR_MESSAGE);
            }
            
            else
            {
                String answer = txtAnswerA.getText().trim()+"-"+txtAnswerB.getText().trim()+"-"+txtAnswerC.getText().trim()+"-"+txtAnswerD.getText().trim()+"-"+getCorrectAnswer();
                
                questions.add(question);
                answers.add(answer);
                //correctAnswers.add(getCorrectAnswer());
                questionsNumber++;
                
                clear();
                lblQuestionNumber.setText("Question "+questionsNumber);
            }
        }
        catch(HeadlessException ex)
        {
            
        }
    }//GEN-LAST:event_btnSaveQuestionActionPerformed

    public String getCorrectAnswer()
    {
        String a = "";
        if(correctAnswer.getSelectedItem().equals("A"))
        {
            a = txtAnswerA.getText();
        }
        else if(correctAnswer.getSelectedItem().equals("B"))
        {
            a = txtAnswerB.getText();
        }
        else if(correctAnswer.getSelectedItem().equals("C"))
        {
            a = txtAnswerC.getText();
        }
        else if(correctAnswer.getSelectedItem().equals("D"))
        {
            a = txtAnswerD.getText();
        }
        return a;
    }
    private void clear()
    {
        txtQuestion.setText(null);
        txtAnswerA.setText(null);
        txtAnswerB.setText(null);
        txtAnswerC.setText(null);
        txtAnswerD.setText(null);
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void btnUploadTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadTestActionPerformed
        new writeTestToDb().checkTestName();
    String test_date = new Test().new TestDetails().dateToString();
    //test_date.dateToString();
    boolean noTest = false;
    try
    {
        if(questions.isEmpty() && trueOfFalseQuestionsAndAnswers.isEmpty())
        {
            throw new Exception();
        }
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,"You Haven't Set The Test, Please Set The Test First","ERROR",JOptionPane.ERROR_MESSAGE);
        noTest = true;
    }
    
    if(!noTest){
        int response = JOptionPane.showConfirmDialog(this, "Are You Done Setting The Test?");
        
        if(response == 0)
        {
            PrintWriter outputStream = null;
            PrintWriter outputStream1 = null;
            String name = JOptionPane.showInputDialog(null,"Please Enter The Test Name ","PROMPT",JOptionPane.QUESTION_MESSAGE);
            String password = JOptionPane.showInputDialog(null,"Please Create Password For The Test","PROMPT",JOptionPane.QUESTION_MESSAGE);
            int count = 0;
            try{
            outputStream = new PrintWriter(new FileOutputStream("C:\\TestSetter\\test\\testQuestions.txt"));
            outputStream1 = new PrintWriter(new FileOutputStream("C:\\TestSetter\\available tests\\test_name.txt"));

            outputStream1.println(name);
            outputStream1.println(password);
            outputStream1.close();
            
                while(count < questions.size())
                {
                    EncryptModel crypto = new FileCrypto();
                    String enc = new String(crypto.encrypt(questions.get(count).getBytes()));
                    outputStream.println(enc);
                    count++;
                }
                outputStream.close();
                WriteAnswers();
            }
            catch(FileNotFoundException e){
                JOptionPane.showMessageDialog(null,"Please Fill Out All Fields Correctly"+e,"ERROR",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    }//GEN-LAST:event_btnUploadTestActionPerformed

    private void jcTrueOrFalseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcTrueOrFalseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcTrueOrFalseActionPerformed

    private void WriteAnswers()
    {
        PrintWriter outputStream = null;
            int count = 0;
            try{
                outputStream = new PrintWriter(new FileOutputStream("C:\\TestSetter\\test\\testAnswers.txt"));
            
                while(count < answers.size())
                {
                    EncryptModel crypto = new FileCrypto();
                    String enc = new String(crypto.encrypt(answers.get(count).getBytes()));
                    outputStream.println(enc);
                    count++;
                } 
            }
            catch(FileNotFoundException e){ }
           finally
           { 
            outputStream.close();
            count = 0;
            try{
                outputStream = new PrintWriter(new FileOutputStream("C:\\TestSetter\\test\\trueOrFalse.txt"));
            
                while(count < trueOfFalseQuestionsAndAnswers.size())
                {
                    String enc = new String(new FileCrypto().encrypt(trueOfFalseQuestionsAndAnswers.get(count).getBytes()));
                    outputStream.println(enc);
                    count++;
                } 
            }
            catch(Exception e){}
            
                finally    
                {
                    outputStream.close();
                   this.setVisible(false);
                   JOptionPane.showMessageDialog(null,"Test Uploaded Successfully");
                }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Questions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Questions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Questions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Questions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Questions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveQuestion;
    private javax.swing.JButton btnUploadTest;
    private javax.swing.JComboBox<String> correctAnswer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jcTrueOrFalse;
    private javax.swing.JLabel lblQuestionNumber;
    private javax.swing.JTextField txtAnswerA;
    private javax.swing.JTextField txtAnswerB;
    private javax.swing.JTextField txtAnswerC;
    private javax.swing.JTextField txtAnswerD;
    private javax.swing.JEditorPane txtQuestion;
    // End of variables declaration//GEN-END:variables

}
