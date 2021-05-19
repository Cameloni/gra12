package com.company;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.io.*;
import java.awt.Container;
import java.util.Scanner;
import javax.swing.JTextArea;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import javax.swing.*;

public class Watek extends Thread {
    public Game game;
    public Menu m;
    public Board board;
    String addedcharacter = "";
    Font romanfont;
    JPanel pergaminpanel;
    JTextArea textArea;
    Container con;
    String text;
    int i = 0;
    private Menu menu;
    //Font defaultfont = new Font("Times New Roman", Font.PLAIN, 30);

    public Watek(Game game, Menu menu) throws IOException, FontFormatException {
        this.game = game;
        this.m = menu;
        //board.add(board.tekst);

    }

    public void windows() {
        if (game.menu == false && game.window.getContentPane().getComponent(1).isVisible() == true)
            game.window.getContentPane().getComponent(1).setVisible(false);
        if (game.menu == true && game.window.getContentPane().getComponent(1).isVisible() == false)
            game.window.getContentPane().getComponent(1).setVisible(true);

        if (game.wizualizacja == false && game.window.getContentPane().getComponent(0).isVisible() == true)
            game.window.getContentPane().getComponent(0).setVisible(false);
        if (game.wizualizacja == true && game.window.getContentPane().getComponent(0).isVisible() == false)
            game.window.getContentPane().getComponent(0).setVisible(true);
    }

    public void run() {

        while (true) {
            windows();

            if(game.menu == true){
                try {
                    m.mousetrack();
                } catch (NullPointerException e) { }

            }
                //tmp = String.valueOf(game.lines[i]) + " (" + (int)game.price[i] + ")";
                //((Board)game.window.getContentPane().getComponent(0)).counts[i].setText(tmp);
            if(game.wizualizacja == true){
                JPanel a = (JPanel)game.window.getContentPane().getComponent(0);
                //board.tekst.setText("Tu można ładnie pisać");
                //String x = board.getToolTipText();
                char[] character = "Coś napisane. ezsssssssssssssss dlsfk;ds sjff kkkkkkkkkkkkkkkk aaskdkkfkfl \nlkdflksjfdlajdfs".toCharArray();
                /*if(game.menu == true){
                    //m.repaint();
                    a.getComponent(1).repaint();

                }*/
                if(i <character.length) {
                    //JTextArea jTextArea = new JTextArea();
                    //String blank = blank + character[i];
                    addedcharacter = addedcharacter + character[i];
                    //jTextArea.setText(addedcharacter);
                    ((JTextArea) a.getComponent(0)).setText(addedcharacter);

                    //wypisznapergaminie2(addedcharacter);

                    i++;
                }
            //    if (i == arrayNumber) {
             //       i = 0;
                    ///char[] tmp = game.tekst.toCharArray();

                    /*game.coins += game.lines[0];
                    game.coins += game.lines[1] * 3;
                    game.coins += game.lines[2] * 10;
                    game.coins += game.lines[3] * 50;*/
                    //JPanel a = (JPanel)game.window.getContentPane().getComponent(0);
                    //((JLabel)a.getComponent(0)).setText(String.valueOf(game.coins));
                    /*JPanel a = (JPanel)game.window.getContentPane().getComponent(0);
                    ((JLabel)a.getComponent(0)).setText(String.valueOf(tmp[i]));
                    sec = 0;
                    i++;
                    a.repaint();*/

                }

                try {
                    Thread.sleep(40);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

    }
}
