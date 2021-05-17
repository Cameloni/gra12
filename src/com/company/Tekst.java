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

public class Tekst extends JPanel{
    public Game game;
    Font romanfont;
    JPanel pergaminpanel;
    JTextArea textArea;
    Container con;
    JFrame window;


    String text;
    int i = 0;



    Font defaultfont = new Font("Times New Roman", Font.PLAIN, 30);
    public void wypisznapergaminie(String s){
        text = s;
        //timer.start();
    }
    public void wypisznapergaminie2(String s){
        textArea.append(s);
    }
    public Tekst() throws java.io.IOException {
        try {
            romanfont = Font.createFont(Font.TRUETYPE_FONT, new File("src/com/company/fonts/CyborgSister.ttf")).deriveFont(40f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("src/com/company/fonts/CyborgSister.ttf")));
        } catch (IOException | FontFormatException e) {

        }
        //gra = new JFrame();
        pergaminpanel = new JPanel();
        Panel p = new Panel();


        con = window.getContentPane();


        pergaminpanel = new JPanel();
        pergaminpanel.setBounds(300, 500, 600, 200);
        pergaminpanel.setBackground(new Color(0, 0, 0, 1));
        pergaminpanel.setOpaque(false);
        con.add(pergaminpanel);
        window.add(p);


        textArea = new JTextArea("");
        textArea.setBounds(300, 500, 600, 200);
        textArea.setBackground(new Color(0, 0, 0, 1));
        textArea.setOpaque(false);
        textArea.setForeground(Color.red);
        textArea.setFont(romanfont);
        textArea.setLineWrap(true);
        textArea.setEditable(false);
        textArea.setWrapStyleWord(true);
        textArea.setText("");
        pergaminpanel.add(textArea);
        textArea.setVisible(true);
        wypisznapergaminie("Tutaj będą wyświetlać się pytania/decyzje do podjęcia ");

        //Watek watek1c= new Watek(game);
        if(game.wizualizacja==true) {
            Timer timer = new Timer(50, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    char[] character = text.toCharArray();
                    int arrayNumber = character.length;

                    String addedcharacter = "";
                    String blank = "";
                    addedcharacter = blank + character[i];
                    wypisznapergaminie2(addedcharacter);
                    i++;

                    if (i == arrayNumber) {
                        i = 0;
                        //timer.stop();
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException ie) {

                        }
                        textArea.setText("");
                    }
                }
            });
        }
    }
}
