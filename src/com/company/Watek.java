package com.company;

import javax.swing.*;

public class Watek extends Thread{
    public Game game;
    public Watek(Game game){
        this.game = game;
    }

    public void windows(){
        if(game.menu==false && game.window.getContentPane().getComponent(1).isVisible() == true)
            game.window.getContentPane().getComponent(1).setVisible(false);
        if(game.menu==true && game.window.getContentPane().getComponent(1).isVisible() == false)
            game.window.getContentPane().getComponent(1).setVisible(true);

        if(game.wizualizacja==false && game.window.getContentPane().getComponent(0).isVisible() == true)
            game.window.getContentPane().getComponent(0).setVisible(false);
        if(game.wizualizacja==true && game.window.getContentPane().getComponent(0).isVisible() == false)
            game.window.getContentPane().getComponent(0).setVisible(true);
    }

    public void run(){

            int sec = 0;

            while (true) {
            windows();
            sec++;
            if(game.wizualizacja==true && sec % 20 == 0)
            {
                /*game.coins += game.lines[0];
                game.coins += game.lines[1] * 3;
                game.coins += game.lines[2] * 10;
                game.coins += game.lines[3] * 50;*/
                JPanel a = (JPanel)game.window.getContentPane().getComponent(0);
                //((JLabel)a.getComponent(0)).setText(String.valueOf(game.coins));
                sec = 0;
            }
              //  String tmp;
            /*for(int i =0; i< 4; i++) {
                tmp = String.valueOf(game.lines[i]) + " (" + (int)game.price[i] + ")";
                ((Board)game.window.getContentPane().getComponent(0)).counts[i].setText(tmp);
            }*/
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
