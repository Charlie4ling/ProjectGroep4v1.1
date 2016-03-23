/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectgroep4;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Charlie
 */
public class ProjectGroep4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Board frame = new Board();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //ensures the form closes properly
        frame.setBounds(0, 0, 600, 600);  //set size  
        frame.setLocationRelativeTo(null); //centre of screen
        frame.getContentPane().setBackground(Color.WHITE); //white 'canvas'
        frame.setVisible(true);
        // TODO code application logic here
    }
    
}
