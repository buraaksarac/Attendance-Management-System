/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JButton;
/**
 *
 * @author Burak
 */
public class TakeAttendance extends javax.swing.JFrame {
    static ArrayList<String> arr;
  
    /**
     * 
     * Creates new form NewJFrame
     */
    public TakeAttendance() {
        initComponents();
            arr();
    }
        public static ArrayList<String> array(ArrayList<String> a) {
        arr = a;
        System.out.println(arr);
        return arr;
    }
         public void arr() {
        JButton a;
        JButton b;
        int x = 400;
        int y = 150;
        int count = 0;
        for(int i = 0; i<arr.size(); i++) {
            count++;
        }
        String[] myArr = new String[count];
        for(int k = 0; k<arr.size(); k++) {
            myArr[k] = arr.get(k);
        }
        for(int j = 0; j<myArr.length; j++) { 
            if(j == 0) {
                a = new JButton();
                a.setText(myArr[j]);
                a.setFont(new Font("Segoe UI", 0, 18));
                a.setBackground(Color.GREEN);
                a.setForeground(new Color(255, 255, 255));
                a.setBounds(x, y, 250, 50);
                a.addActionListener((java.awt.event.ActionEvent evt) -> {
                        Internal.setCourseID(1);
                        buttonActionPerformed(evt);   
                });
                kGradientPanel1.add(a); 
                y=y+55;  
            }else if(j==1) {
                b = new JButton();
                b.setText(myArr[j]);
                b.setFont(new Font("Segoe UI", 0, 18));
                b.setBackground(Color.GREEN);
                b.setForeground(new Color(255, 255, 255));
                b.setBounds(x, y, 250, 50);
                b.addActionListener((java.awt.event.ActionEvent evt) -> {
                        Internal.setCourseID(2);
                        buttonActionPerformed(evt);   
                });
                kGradientPanel1.add(b); 
                y=y+55; 
            }
            Internal.setCourseID(1);
      }
    }
         private void buttonActionPerformed(ActionEvent e) { 
             Internal in = new Internal();
             kGradientPanel1.add(in);
             in.setVisible(true);
         } 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        kGradientPanel1.setkEndColor(new java.awt.Color(144, 87, 81));
        kGradientPanel1.setkGradientFocus(1100);
        kGradientPanel1.setkStartColor(new java.awt.Color(100, 104, 99));
        kGradientPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Res/BackArrow.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        kGradientPanel1.add(jLabel1);
        jLabel1.setBounds(20, 20, 40, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Take The Attendance of Class You're In ");
        kGradientPanel1.add(jLabel2);
        jLabel2.setBounds(140, 30, 400, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 953, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(967, 617));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        WelcomeTeacher.main();
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     *regenerated by the Form Editor.
     */
    /**
     */
    public static void main() {
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TakeAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }    
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TakeAttendance().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}