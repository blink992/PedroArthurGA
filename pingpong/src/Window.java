package PingPong;

import javax.swing.JFrame;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.EventListener;
import java.util.Timer;
import java.util.TimerTask;

import PingPong.*;

public class Window extends Canvas implements KeyListener{

    JLabel container; // Label principal 
    JPanel panelMain;

    Player p1 = new Player(10, 10);
    int width = 1000;
    int height = 700;

    public Window(){

        JFrame frame = new JFrame();



        this.setSize(width,height);
        frame.add(this);
        frame.pack();
        frame.setVisible(true);

        addKeyListener(this);
        setFocusable(true);


        
    }

    public void paint(Graphics g){
        
        p1.draw(g);

    }

    
    @Override
    public void keyPressed(KeyEvent e) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
            public void run(){
                
                p1.updatePosition(p1.y - 1);
                repaint();
            }
        };
        switch(e.getKeyCode()){
            case KeyEvent.VK_W:
                if(!p1.pressedW){
                    timer.scheduleAtFixedRate(task, 1,1000/30);
                }
                p1.pressedW = true;
                break;

            case KeyEvent.VK_S:
                p1.updatePosition(p1.y + 5);
                repaint();
                break;

        }
 
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
      
    }

}