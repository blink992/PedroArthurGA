package PingPong;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.lang.String;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import PingPong.*;


public class Player {

    String name;
    int score;
    int matches_won;

    int width = 20;
    int height = 200;

    boolean pressedW = false;
    boolean pressedS = false;
    boolean pressedDown = false;
    boolean pressedUp = false;
    
    int x;
    int y;

    Color color = new Color(255, 255, 255);

    static int count = 0;

    public Player(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics g){
        g.setColor(color);
        g.fillRect(this.x, this.y, width, height);
    }

    public void updatePosition(int y){
        this.y = y;

    }


 

    

}