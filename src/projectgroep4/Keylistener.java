/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectgroep4;

import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.VK_DOWN;
import static java.awt.event.KeyEvent.VK_LEFT;
import static java.awt.event.KeyEvent.VK_RIGHT;
import static java.awt.event.KeyEvent.VK_UP;
import java.awt.event.KeyListener;

/**
 *
 * @author Stephan
 */
public class Keylistener implements KeyListener {
    
    
    public void keyPressed(KeyEvent ke) {
            System.out.println("key pressed is: " + ke.getKeyCode());
            
          
            switch (ke.getKeyCode()){
            case VK_DOWN:
              
               break;
            case VK_UP:
              
               break;
            case VK_LEFT:
           
               break;
            case VK_RIGHT:
             
               break;
            }
           
        }

        @Override
        public void keyTyped(KeyEvent ke) {
            
        }

        @Override
        public void keyReleased(KeyEvent ke) {
           
    }
    
}
