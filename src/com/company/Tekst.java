/*package com.company;
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

public class Tekst {
    Font romanfont;
    JPanel pergaminpanel;
    JTextArea textArea;
    Container con;
    JFrame gra;


    String text;
    int i = 0;



    Font defaultfont = new Font("Times New Roman", Font.PLAIN, 30);
    public void wypisznapergaminie(String s){
        text = s;
        timer.start();
    }
    public void wypisznapergaminie2(String s){
        textArea.append(s);
    }
    public Main() throws java.io.IOException {
        try {
            romanfont = Font.createFont(Font.TRUETYPE_FONT, new File("src/com/company/fonts/CyborgSister.ttf")).deriveFont(40f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("src/com/company/fonts/CyborgSister.ttf")));
        } catch (IOException | FontFormatException e) {

        }
        //gra = new JFrame();
        pergaminpanel = new JPanel();
        Panel p = new Panel();


        /*gra.setTitle("Deus consilium");
       // gra.setBounds(0,0,1200 + 14, 780 + 14 + 24);
        gra.setSize(1214,818);
        gra.setLocationRelativeTo(null);
        gra.setIconImage(new ImageIcon("src/com/company/PNG/background/45.png").getImage());
        gra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gra.setResizable(false);
        gra.setVisible(true);*/
 /*       con = gra.getContentPane();


        pergaminpanel = new JPanel();
        pergaminpanel.setBounds(300, 500, 600, 200);
        pergaminpanel.setBackground(new Color(0, 0, 0, 1));
        pergaminpanel.setOpaque(false);
        con.add(pergaminpanel);
        gra.add(p);

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
                    timer.stop();
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException ie) {

                    }
                    textArea.setText("");
                }
            }
        });

    }
}*/
