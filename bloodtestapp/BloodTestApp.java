/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloodtestapp;

import javax.swing.JFrame;

/**
 *
 * @author adamk
 */
public class BloodTestApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BloodTestGUI myApp = new BloodTestGUI();
        myApp.setVisible(true);
        
         
     myApp.setSize (500, 310);
     myApp.setLocation(200,100);
     myApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    
    
}
