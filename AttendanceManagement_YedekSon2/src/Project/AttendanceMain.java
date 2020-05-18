/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JOptionPane;
/**
 *
 * @author Burak
 */
public class AttendanceMain {
    /**
     */
    public static int number = 0;
    public static void main(String[] args) {
        // TODO code application logic here
        Login a = new Login();
        Login.main();
        Action evt;
        evt = new AbstractAction()
        {          
            @Override
            public void actionPerformed(ActionEvent e)
            {       
               int c = JOptionPane.showConfirmDialog(null, "Are you still there?", "hi", JOptionPane.YES_OPTION);
                if(c == JOptionPane.YES_OPTION){
                    
                } else {
                System.exit(0);
                //MouseListener event = (MouseListener)e.getSource();
                System.out.println(number);
                number++;
                System.out.println(number);
                // System.out.println(event.equals(false));
                // JOptionPane.showMessageDialog(null, "Are u stil there?");
            }
            }
        };         
            InactivityListener listener = new InactivityListener(a, evt, 5);
            listener.start();        
    }
}
