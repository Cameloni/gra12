package com.company;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;
import java.awt.Container;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JTextArea;
import javax.swing.*;

public class Watek extends Thread {
    public Game game;
    public Menu m;
    public Board board;
    public Decyzja decyzja;
    public char[] character;
    boolean wglowne;
    boolean wdec;
    int sec;
    boolean grane;

    String addedcharacter = "";
    Font romanfont;
    JPanel pergaminpanel;
    JTextArea textArea;
    Container con;
    String text;
    int i = 0;
    //Font defaultfont = new Font("Times New Roman", Font.PLAIN, 30);

    public Watek(Game game, Menu menu, Decyzja d, Boolean wglowne, Boolean wdec, Boolean grane) throws IOException, FontFormatException {
        this.game = game;
        this.m = menu;
        this.decyzja = d;
        this.wglowne = wglowne;
        this.wdec = wdec;
        this.grane = grane;
        this.sec = 0;
        /*if(decyzja == null){
            try{

            } catch (Exception e) {
                e.printStackTrace();
            }
        }*/
        //board.add(board.tekst);

    }
    public void napisy() {
        if (game.wizualizacja == true) {
            JPanel a = (JPanel) game.window.getContentPane().getComponent(0);
            //board.tekst.setText("Tu można ładnie pisać");
            //String x = board.getToolTipText();
            //try{
            //this.decyzja = new Decyzja(-1);
            //} catch (IOException e){} catch (InterruptedException e) {
            //    e.printStackTrace();
            //} catch (FontFormatException e) {
            //     e.printStackTrace();
            // }
            //decyzja.kwestia = new String();

                /*if(decyzja.kwestia == null){
                    try {

                        decyzja.getKwestia();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }*/

            //decyzja.setKwestia(game.wybor.getKwestia());
            //decyzja.kwestia = "O Lol";
            this.character = "".toCharArray();
            this.character = decyzja.getKwestia().toCharArray();
            //try {
            if (i < character.length) {
                //JTextArea jTextArea = new JTextArea();
                // String blank = blank + character[i];
                addedcharacter = addedcharacter + character[i];
                //jTextArea.setText(addedcharacter);
                ((JTextArea) a.getComponent(0)).setText(addedcharacter);
                //wypisznapergaminie2(addedcharacter);
                i++;
            } else {
                addedcharacter = "";
                ((JTextArea) a.getComponent(0)).setText(decyzja.getKwestia());

            }
        }
    }
    public void dec_run() throws IOException {
        if(game.wizualizacja == true){
            decyzja.przebieg();
        }
        else {

        }

    }               /* } catch (NullPointerException e){
                    decyzja.setKwestia("AAAA");
                }*/
                /*if(game.menu == true){
                    //m.repaint();
                    a.getComponent(1).repaint();

                }*/

    public void playmusic(File m){

        if (grane== true) {

            try {
                if (sec % 321 ==0){
                    Clip muz = AudioSystem.getClip();
                    muz.open(AudioSystem.getAudioInputStream(m));
                    muz.start();

                }
                /*if (game.menu == true) {
                    clip.start();
                }*/
                sec++;
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
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
            if(wglowne==true){
                napisy();
                if(game.menu == true){
                    try {
                        m.mousetrack();
                    } catch (NullPointerException e) { }

                }
            }
            if(wdec== true){
                try {
                    dec_run();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(grane == true){
                playmusic(game.muzyka);
            }

                //tmp = String.valueOf(game.lines[i]) + " (" + (int)game.price[i] + ")";
                //((Board)game.window.getContentPane().getComponent(0)).counts[i].setText(tmp);



                try {
                    Thread.sleep(40);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

    }
}
