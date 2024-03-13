package PingPong;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import PingPong.Player;

public class Window extends JFrame{

    JLabel container; // Label principal 
    JPanel panelMain;
    Dimension size = new Dimension(1000,600);
    GridLayout layout = new GridLayout(2, 1);

    public Window(){
        
        
        
        panelMain = new JPanel();
        panelMain.setSize(size);
        panelMain.setVisible(true);
        panelMain.setBackground(new Color(25, 39, 70 ));
        panelMain.setLayout(layout);
        this.add(panelMain);
        
        JPanel panel2 = new JPanel(new BorderLayout());
        panelMain.add(panel2);
        JPanel panel3 = new JPanel(new BorderLayout());
        panelMain.add(panel3);

        Player player1 = new Player("jogador 1");
        Player player2 = new Player("jogador 2");
        
        
        panel2.add(player1, BorderLayout.NORTH);
        panel3.add(player2, BorderLayout.SOUTH);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(size);
        this.setVisible(true);
        

    }

}