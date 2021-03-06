/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.omr.model;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Amir
 */
public class StartProcess extends javax.swing.JFrame {

    /**
     * Creates new form StartProcess
     */
    File AnswerKey = null;
    File OutputLocation = null;
    File ScannedOMRs = null;
    String step1="Choose Your Answer Key File";
    String step2="Choose Your Output Directory";
    String step3="Choose Scanned OMR Files";
    int steps=1;
    String path1="Selected File or Folder....";
    String path2="Selected File or Folder....";
    String path3="Selected File or Folder....";
    String AnswerKeyPath=null;
    String OutputLocationPath=null;
    String ScannedOMRsPath=null;
    int flagAnswerKey=0;
    int flagOutputLocation=0;
    int flagScannedOMR=0;
    public StartProcess() {
        initComponents();
    }
    private boolean msgbox(String s){
	JOptionPane.showMessageDialog(null, s);
        return false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Lets Go For IT");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Choose Your Answer Key File");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Choose File");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Back");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel3.setText("Selected File or Folder....");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jButton2)))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jLabel3))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(steps==1 && AnswerKey!=null){
            steps++;
            jButton3.setEnabled(true);
            jLabel2.setText(step2);
            jLabel3.setText(path2);
        }else if(steps==2 && OutputLocation!=null){
            steps++;
            jLabel2.setText(step3);
            jButton1.setText("Done");
            jLabel3.setText(path3);
        }else if(steps==3 && ScannedOMRs!=null){
            msgbox("YAAAAHUUUUU");
        }else{
            if(steps==1){
                msgbox("Please choose Answer Key file first");
            }else if(steps==2){
                msgbox("Please choose Output Location first");
            }else if(steps==3){
                msgbox("Please choose Scanned OMR files first");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(steps==1){
            JFileChooser AnswerKeyChooser = new JFileChooser();
            AnswerKeyChooser.setDialogTitle(step1);
            AnswerKeyChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            int returnValue = AnswerKeyChooser.showOpenDialog(null);
            System.out.println(returnValue +" and " +JFileChooser.APPROVE_OPTION);
            if(returnValue == JFileChooser.APPROVE_OPTION){
                AnswerKey = AnswerKeyChooser.getSelectedFile();
                AnswerKeyPath = AnswerKey.getAbsolutePath();
                path1="Answer Key : "+AnswerKeyPath;
                flagAnswerKey=1;
            }else if(flagAnswerKey==0){
                AnswerKeyPath= "No Answer Key file choosen by user.";
                path1="Answer Key : "+AnswerKeyPath;
            }else{
                path1=path1;
            }
            
//            if(path1==null){
//                path1="Answer Key : "+AnswerKeyPath;
//            }
            jLabel3.setText(path1);
            System.out.println("Answer Key : "+AnswerKeyPath);
        }else if(steps==2){
            JFileChooser OutputLocationChooser = new JFileChooser();
            OutputLocationChooser.setDialogTitle(step2);
            OutputLocationChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            int returnValue = OutputLocationChooser.showOpenDialog(null);
            if(returnValue == JFileChooser.APPROVE_OPTION){
                OutputLocation = OutputLocationChooser.getSelectedFile();
                OutputLocationPath = OutputLocation.getAbsolutePath();
                path2="Output File Location : "+OutputLocationPath;
                flagOutputLocation=1;
            }else if(flagOutputLocation==0){
                OutputLocationPath= "No Output Location choosen by user.";
                path2="Output File Location : "+OutputLocationPath;
            }else{
                path2=path2;
            }
//            if(path2==null){
//                path2="Output File Location : "+OutputLocationPath;
//            }
            jLabel3.setText(path2);
            System.out.println(path2);
        }else if(steps==3){
            JFileChooser ScannedOMRsChooser = new JFileChooser();
            ScannedOMRsChooser.setDialogTitle(step3);
            ScannedOMRsChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            int returnValue = ScannedOMRsChooser.showOpenDialog(null);
            if(returnValue == JFileChooser.APPROVE_OPTION){
                ScannedOMRs = ScannedOMRsChooser.getSelectedFile();
                ScannedOMRsPath = ScannedOMRs.getAbsolutePath();
                path3="Scanned OMRs Path : "+ScannedOMRsPath;
                flagScannedOMR=1;
            }else if(flagScannedOMR==0){
                ScannedOMRsPath = "No Scanned OMR files choosen by user.";
                path3="Scanned OMRs Path : "+ScannedOMRsPath;
            }else{
                path3=path3;
            }
            
//            if(path3==null){
//                path3="Scanned OMRs Path : "+ScannedOMRsPath;
//            }
            jLabel3.setText(path3);
            System.out.println(path3);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(steps==2){
            steps--;
            jButton3.setEnabled(false);
            jLabel2.setText(step1);
            jLabel3.setText(path1);
        }else if(steps==3){
            steps--;
            jLabel2.setText(step2);
            jButton1.setText("Next");
            jLabel3.setText(path2);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public void Starting() {
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
            java.util.logging.Logger.getLogger(StartProcess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartProcess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartProcess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartProcess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                StartProcess startProcess = new StartProcess();
                startProcess.pack();
                startProcess.setLocationRelativeTo(null);
                startProcess.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
