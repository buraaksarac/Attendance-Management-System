/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import static Project.WelcomeTeacher.id;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Burak
 */
public class Internal extends javax.swing.JInternalFrame {
    /**
     * Creates new form NewJInternalFrame
     */
    static int courseID = 1;
    JCheckBox box;
    
    JButton button = new JButton();
    String Id;
    String courseIDPublic;
    String all;
    ArrayList<String> myList = new ArrayList<>();
    boolean selected = false;
    boolean pressed = false;
 
    ArrayList<String> arr = new ArrayList<>();
    public static void setCourseID(int c) {
        courseID = c;
    }
    public static int getCourseID() {
        return courseID;
    }
    public Internal() {
        this.myList = new ArrayList<String>();
        initComponents();
        connection();
        if(courseID == 1) {
        write();
        }
        else if(courseID == 2) {
            write2();
        }
    }
    public void write() {
        JLabel label;      
        JCheckBox box2;
        int x = 75;
        int y = 35;
        int boxAxis_X = 150;
        int boxAxis_Y = 50;
        int box2Axis_X = 260;
        int box2Axis_Y = 50;
        button.setBounds(230, 219, 60, 30);
        button.setText("Save");
        Panel.add(button);  

        for(int j = 0; j<arr.size(); j++) {
            String s = arr.get(j);
            char c=s.charAt(0);
            String newS = String.valueOf(c);
            
            if(Integer.parseInt(newS) == courseID) {                                    
            label = new JLabel();
            box = new JCheckBox();
            box2= new JCheckBox();
            box.setText("Absent");
            box.setBounds(boxAxis_X, boxAxis_Y, 100, 25);
            String a = arr.get(j);
            box.addItemListener((ItemEvent e) -> {
              if(e.getStateChange() == ItemEvent.SELECTED) {
                 char c2 = a.charAt(4);
                 char c3 = a.charAt(5);
                 char c4 = a.charAt(6);
                 char c5 = a.charAt(7);
            
                 String newS2 = String.valueOf(c2);
                 String newS3 = String.valueOf(c3);
                 String newS4 = String.valueOf(c4);
                 String newS5 = String.valueOf(c5);

                 all = newS2+newS3+newS4+newS5; 
                 selected = true;
                 myList.add(all);
                 System.out.println(myList);
              } else {
                 if(myList != null) {
                     myList.remove(all);
                     System.out.println(myList);
                 }
                }                       
            });
            box2.setText("Here");
            box2.setBounds(box2Axis_X, box2Axis_Y, 100, 25);           

            label.setBounds(x, y, 100, 50);
            label.setText(arr.get(j));
            label.setFont(new Font("Sogoe UI", 0, 14));
            label.setForeground(new Color(0, 0, 0));

            Panel.add(label);
            Panel.add(box);
            Panel.add(box2);
            
            y = y+30;
            boxAxis_Y = boxAxis_Y + 35;
            box2Axis_Y = box2Axis_Y + 35;
            if(pressed == true) {
                break;
            }
          }          
       }
        button();
    }
        public void write2() {
            
        int count = 0;
        JLabel label;      
        JCheckBox box2;
        int x = 75;
        int y = 35;
        int boxAxis_X = 150;
        int boxAxis_Y = 50;
        int box2Axis_X = 260;
        int box2Axis_Y = 50;
        button.setBounds(230, 219, 60, 30);
        button.setText("Save");
        Panel.add(button);  

        for(int i = 0; i<arr.size(); i++) {
            count++;
        }
        for(int j = 0; j<arr.size(); j++) {
            //if(j==1  && j<=count) {
            String s = arr.get(j);
            char c=s.charAt(0);
            String newS = String.valueOf(c);
            
            if(Integer.parseInt(newS) == courseID) {

            label = new JLabel();
            box = new JCheckBox();
            box2= new JCheckBox();
            box.setText("Absent");
            box.setBounds(boxAxis_X, boxAxis_Y, 100, 25);
            String a = arr.get(j);
            box.addItemListener((ItemEvent e) -> {
              if(e.getStateChange() == ItemEvent.SELECTED) {
                 char c2 = a.charAt(4);
                 char c3 = a.charAt(5);
                 char c4 = a.charAt(6);
                 char c5 = a.charAt(7);
            
                 String newS2 = String.valueOf(c2);
                 String newS3 = String.valueOf(c3);
                 String newS4 = String.valueOf(c4);
                 String newS5 = String.valueOf(c5);

                 all = newS2+newS3+newS4+newS5; 
                 selected = true;
                 myList.add(all);
                 System.out.println(myList);
              } else {
                 if(myList != null) {
                     myList.remove(all);
                     System.out.println(myList);
                 }
                }                       
            });
            box2.setText("Here");
            box2.setBounds(box2Axis_X, box2Axis_Y, 100, 25);           

            label.setBounds(x, y, 100, 50);
            label.setText(arr.get(j));
            label.setFont(new Font("Sogoe UI", 0, 14));
            label.setForeground(new Color(0, 0, 0));

            Panel.add(label);
            Panel.add(box);
            Panel.add(box2);
            
            y = y+30;
            boxAxis_Y = boxAxis_Y + 35;
            box2Axis_Y = box2Axis_Y + 35;
            if(pressed == true) {
                break;
            }
          }          
       }
        button();
  }
     public void button() {
        pressed = true;
        button.addActionListener((ActionEvent e) -> {   
              boxActionPerformed(e);
              this.dispose(); 
              JOptionPane.showMessageDialog(null, "Successfully saved!");  
            }); 
     }
     public void boxActionPerformed(ActionEvent e) { 
         if(selected == true) {
             connection2();
         }
     }
     public void connection2() {
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test?serverTimezone=UTC&user=root&password=1234"); 
             System.out.println(myList);
            for(int i = 0; i<myList.size(); i++) {
            Id = myList.get(i);
            String b = "UPDATE attendances SET attendance = attendance+1 WHERE courseID = " + courseID +" and StudentID = " + Id;
            PreparedStatement stmt = con.prepareStatement(b);
            stmt.executeUpdate();
            }
        }catch(ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "An error accured while connection.");
        }  
     }
    public void connection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test?serverTimezone=UTC&user=root&password=1234");             
            Statement statement = con.createStatement();            
            String b = "select attendances.StudentID, teachercourses.courseID from teachercourses INNER JOIN attendances ON teachercourses.courseID = attendances.courseID where teachercourses.teacherID =" +id;
            ResultSet rs = statement.executeQuery(b);         
            while(rs.next()) {
                   String courseId = rs.getString("teachercourses.courseID");
                   String first = rs.getString("StudentID");
                   arr.add(courseId+" - "+first);
            }      
        }catch(ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "An error accured while connection.");
        }                  
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();

        setBorder(null);
        setClosable(true);

        Panel.setAutoscrolls(true);

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 522, Short.MAX_VALUE)
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 315, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    // End of variables declaration//GEN-END:variables
}
