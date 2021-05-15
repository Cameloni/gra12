package com.company;

import javax.swing.*;
import java.awt.*;

public class Game {
    public boolean menu;
    public boolean wizualizacja;
    public JFrame window;
    //public int coins;
    int[] lines = new int[4];
    //double[] price = new double[4];

    public Game(){
        //coins = 1;
        window = new JFrame("Deus consilium");
        window.setIconImage(new ImageIcon("src/com/company/PNG/background/45.png").getImage());
        Board wizualizacja = new Board(this);
        Menu menu = new Menu(this);

        menu.setPreferredSize(new Dimension(1200, 780));
        window.add(wizualizacja);
        window.add(menu);

        window.getContentPane().getComponent(0).setVisible(false);
        window.getContentPane().getComponent(1).setVisible(true);
        window.setSize(1200,780);
        window.pack();
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        this.menu = true;
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Watek watek = new Watek(this);
        watek.start();
    }

}
