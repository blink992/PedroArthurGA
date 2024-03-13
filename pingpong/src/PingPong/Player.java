package PingPong;

import javax.swing.JButton;
import java.lang.String;
import java.awt.Color;
import java.awt.Dimension;

public class Player extends JButton{

    String name;
    int score;
    int matches_won;
    Color color = new Color(255, 255, 255);

    public Player(String name){
        this.name = name;

        this.setBackground(color);
        this.setPreferredSize(new Dimension(120,50));

    }

}