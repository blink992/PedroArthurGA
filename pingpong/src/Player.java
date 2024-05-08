package PingPong;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import java.lang.String;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Player {

    private String name;
    private int score;
    private int matches_won;

    private int width = 20;
    private int height = 200;

    private int direction = 0;
    private int velocity = 7;
    
    private int x;
    private int y;

    private Color color = Color.white;

    private static int count = 0;

    
    public Player(int x, int y){
        this.x = x;
        this.y = y;
        this.score = 0;
    }

    public int getY(){
        return this.y;
    }

    public void setDirection(int direction){
        this.direction = direction * this.velocity;
    }

    public int getDirection() {
        return this.direction;
    }

    public int getWidth(){
        return this.width;
    }

    public int getHeight(){
        return this.height;
    }

    public int getScore(){
        return this.score;
    }

    public void incrementScore(){
        this.score++;
    }

    public void draw(Graphics g){
        g.setColor(this.color);
        g.fillRect(this.x, this.y, this.width, this.height);
    }

    public void updatePosition(){       
        if((this.y + this.direction) < 0)
            this.y = 0;
        else if((this.y + this.direction) > (Game.height - this.height))
            this.y = (Game.height - this.height);
        else
            this.y = this.y + this.direction;

    }

    

}
