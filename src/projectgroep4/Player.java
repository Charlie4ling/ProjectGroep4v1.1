/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectgroep4;

import java.awt.Color;
import java.awt.Graphics;


/**
 *
 * @author Charlie
 */
public class Player extends Tile {

    public Player(Color c,int x, int y) {
        super(c,x,y);
    }
    
    @Override
    public void draw (Graphics g){
        //draw rectangle using the graphics object passed through already in the constructor
        g.setColor(colour);
        g.fillRect(x, y, height, width);
        
    }
    
    public void move(int numberPixelsX, int numberPixelsY){
        this.x = this.x + numberPixelsX;
        this.y = this.y + numberPixelsY;
    }
     
    
}
