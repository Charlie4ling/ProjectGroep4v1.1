/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectgroep4;

import java.awt.Color;
import static java.awt.Color.*;
import java.awt.Graphics;

/**
 *
 * @author Charlie
 */
public class Tile {
    protected int height = 50;
    protected int width = 50;
    protected int x = 0;
    protected int y = 0;
    protected Color colour;
    
    public Tile(Color c,int x, int y){
        this.colour = c;
        this.x=x;
        this.y=y;
    }
    
    public void draw (Graphics g){
        //draw rectangle using the graphics object passed through already in the constructor
        g.setColor(colour);
        g.fillRect(x, y, height, width);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, height, width);
    }
}
