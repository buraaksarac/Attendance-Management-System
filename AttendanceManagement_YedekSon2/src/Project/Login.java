/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import admin.AdminEkrani;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.*;
import javax.swing.JOptionPane;
/*
 *
 * @author Burak
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame 
     */ 
    public Login() {
        initComponents();
        //test();
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
        jPanel1 = new javax.swing.JPanel();
        ID = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("frame"); // NOI18N
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        kGradientPanel1.setkEndColor(new java.awt.Color(144, 87, 81));
        kGradientPanel1.setkGradientFocus(1100);
        kGradientPanel1.setkStartColor(new java.awt.Color(100, 104, 99));
        kGradientPanel1.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        ID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ID.setForeground(new java.awt.Color(102, 102, 102));
        ID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(144, 87, 81)));

        password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        password.setForeground(new java.awt.Color(102, 102, 102));
        password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(144, 87, 81)));
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("SIGN IN");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("ID :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Password :");

        kGradientPanel2.setkEndColor(new java.awt.Color(100, 104, 99));
        kGradientPanel2.setkGradientFocus(180);
        kGradientPanel2.setkStartColor(new java.awt.Color(144, 87, 81));
        kGradientPanel2.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("            CONTINUE");
        jLabel4.setToolTipText("");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        kGradientPanel2.add(jLabel4);
        jLabel4.setBounds(0, 5, 200, 30);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel1)))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(0, 0, 0)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        kGradientPanel1.add(jPanel1);
        jPanel1.setBounds(590, 80, 310, 430);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("TRACK YOUR ATTENDANCES!");
        jLabel5.setToolTipText("");
        kGradientPanel1.add(jLabel5);
        jLabel5.setBounds(110, 240, 320, 50);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("AttendDance");
        kGradientPanel1.add(jLabel6);
        jLabel6.setBounds(110, 50, 150, 40);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 102));
        jLabel7.setText("GO;");
        kGradientPanel1.add(jLabel7);
        jLabel7.setBounds(110, 220, 130, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Res/Logo.png"))); // NOI18N
        kGradientPanel1.add(jLabel8);
        jLabel8.setBounds(110, 90, 165, 50);

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

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
            String id = ID.getText();
            String pass = password.getText();
         try { 
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test?serverTimezone=UTC&user=root&password=1234");             
            Statement statement = con.createStatement();            
            String b = "SELECT * FROM teacherlogin, login, adminlogin;";
            ResultSet rs = statement.executeQuery(b);
            String userID = null;
            String pswrd = "";
            String userName = "";
            String New = null;
            while(rs.next()) {
                 if(id.equals(rs.getString(("login.ID"))) && pass.equals(rs.getString("login.Password"))){
                     userID = rs.getString("login.ID");
                     pswrd = rs.getString("login.Password");
                     userName = rs.getString("login.name");
                        Welcome.main();
                        this.dispose();
                        Welcome.Name(userName); 
                        Welcome.id(id); 
                        break;
                 }if(id.equals(rs.getString("teacherlogin.ID")) && pass.equals(rs.getString("teacherlogin.Password"))) {
                     userID = rs.getString("teacherlogin.ID");
                     pswrd = rs.getString("teacherlogin.Password");
                     userName = rs.getString("teacherlogin.name");
                        String teacherName = userName;
                        WelcomeTeacher.main();
                        WelcomeTeacher.Name(teacherName);
                        this.dispose();
                        WelcomeTeacher.id(id);
                        break;
                  }if(id.equals(rs.getString("adminlogin.ID")) && pass.equals(rs.getString("adminlogin.Password"))) {
                      userID = rs.getString("adminlogin.ID");
                      pswrd = rs.getString("adminlogin.Password");
                     //userName = rs.getString("teacherlogin.name");
                        AdminEkrani.main();
                        this.dispose(); 
                        break;
                      }                          
            }if(!id.equals(userID) && !pass.equals(pswrd)) {
                      JOptionPane.showMessageDialog(null,"Wrong");
                  }                                                
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "An error accured while establishing connection");
        }            
    }//GEN-LAST:event_jLabel4MouseClicked

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
              // TODO add your handling code here:
            String id = ID.getText();
            String pass = password.getText();
            if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
         try { 
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test?serverTimezone=UTC&user=root&password=1234");             
            Statement statement = con.createStatement();            
            String b = "SELECT * FROM teacherlogin, login, adminlogin;";
            ResultSet rs = statement.executeQuery(b);
            String userID = null;
            String pswrd = "";
            String userName = "";
            String New = null;
            while(rs.next()) {
                 if(id.equals(rs.getString(("login.ID"))) && pass.equals(rs.getString("login.Password"))){
                     userID = rs.getString("login.ID");
                     pswrd = rs.getString("login.Password");
                     userName = rs.getString("login.name");
                        Welcome.main();
                        this.dispose();
                        Welcome.Name(userName); 
                        Welcome.id(id); 
                        break;
                 }if(id.equals(rs.getString("teacherlogin.ID")) && pass.equals(rs.getString("teacherlogin.Password"))) {
                     userID = rs.getString("teacherlogin.ID");
                     pswrd = rs.getString("teacherlogin.Password");
                     userName = rs.getString("teacherlogin.name");
                        String teacherName = userName;
                        WelcomeTeacher.main();
                        WelcomeTeacher.Name(teacherName);
                        this.dispose();
                        WelcomeTeacher.id(id);
                        break;
                  }if(id.equals(rs.getString("adminlogin.ID")) && pass.equals(rs.getString("adminlogin.Password"))) {
                      userID = rs.getString("adminlogin.ID");
                      pswrd = rs.getString("adminlogin.Password");
                     //userName = rs.getString("teacherlogin.name");
                        AdminEkrani.main();
                        this.dispose(); 
                        break;
                      }                          
            }if(!id.equals(userID) && !pass.equals(pswrd)) {
                      JOptionPane.showMessageDialog(null,"Wrong");
                  }                                                
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "An error accured while establishing connection");
        }          
            }
    }//GEN-LAST:event_passwordKeyPressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables

}
