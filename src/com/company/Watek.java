package com.company;
import com.sun.jdi.Value;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;
import javax.swing.JTextArea;
import javax.swing.*;

import static javax.sound.sampled.FloatControl.Type.VOLUME;

public class Watek extends Thread {
    public Game game;
    public Menu m;
    public Board board;
    public Decyzja decyzja;
    public char[] character;
    boolean wglowne;
    boolean wdec;
    int sec;
    int sec1;
    int mr;
    int mm;
    boolean grane;

    Clip muz = AudioSystem.getClip();


    Font romanfont;
    JPanel pergaminpanel;
    JTextArea textArea;
    Container con;
    String text;
    int i = 0;
    int ii = 0;
    String addedcharacter = "";
    //Font defaultfont = new Font("Times New Roman", Font.PLAIN, 30);

    public Watek(Game game, Menu menu, Decyzja d, Boolean wglowne, Boolean wdec, Boolean grane, Board board) throws IOException, FontFormatException, LineUnavailableException, UnsupportedAudioFileException {
        this.game = game;
        this.m = menu;
        this.decyzja = d;
        this.wglowne = wglowne;
        this.wdec = wdec;
        this.grane = grane;
        this.board = board;
        sec = 0;
        sec1 = 0;
        mr = 0;
        mm = 0;


        /*if(decyzja == null){
            try{

            } catch (Exception e) {
                e.printStackTrace();
            }
        }*/
        //board.add(board.tekst);

    }

    public void napisy() {
        if (wglowne == true) {
            if (game.wizualizacja == true) {
                JPanel a = (JPanel) game.window.getContentPane().getComponent(0);

                this.character = "".toCharArray();

                this.character = decyzja.getKwestia().toCharArray();
                if (i < character.length) {

                    ii = 0;
                    //JTextArea jTextArea = new JTextArea();
                    // String blank = blank + character[i];
                    addedcharacter = addedcharacter + character[i];
                    //jTextArea.setText(addedcharacter);

                    ((JTextArea) a.getComponent(0)).setText(addedcharacter);
                    //wypisznapergaminie2(addedcharacter);
                    i++;
                } else {
                    addedcharacter = "";

                    ii = 1;
                }

            }
        }
    }

    public void dec_run() throws IOException {
        if (wdec == true) {
            if (game.wizualizacja == true) {
                decyzja.przebieg();
            } else {

            }
        }
    }               /* } catch (NullPointerException e){
                    decyzja.setKwestia("AAAA");
                }*/
                /*if(game.menu == true){
                    //m.repaint();
                    a.getComponent(1).repaint();

                }*/

    public void playmusic() throws IllegalArgumentException {
        try {
            //FloatControl volume = (FloatControl) muz.getControl(VOLUME);

            //volume.setValue(-10f);

            muz.open(AudioSystem.getAudioInputStream(game.muzyka));
            FloatControl volume = (FloatControl) muz.getControl(FloatControl.Type.MASTER_GAIN);
            volume.setValue(-50f);
            muz.loop(999999999);
            //muz.start();


                /*if (game.menu == true) {
                    clip.start();
                }*/

        } catch (Exception e) {
        }

            /*try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/

    }

    public static void play(Clip clip) {


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
    public void mruganie() {
        sec1++;
        if (game.wizualizacja == true) {
            if (sec1 % (130 + mr)== 0) {
                board.cezar_blink++;
                board.repaint();
            }
            if (sec1 % (130 + mr) == 2) {
                board.cezar_blink++;
                board.repaint();
            }
            if (sec1 % (130 + mr) == 6) {
                board.cezar_blink = 1;
                board.repaint();
            }
            if (sec1 % (130 +mr) == 8) {
                board.cezar_blink = 0;
                board.repaint();
                mr = 150 - (int)(Math.random()*30);
                //mm++;
            }
        }
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
        if (grane == true) {
            playmusic();
        }
        mr = 0;
        while (true) {
            windows();


            if (wglowne == true) {

                mruganie();


                if (game.menu == true) {
                    try {
                        m.mousetrack();
                    } catch (NullPointerException e) {
                    }

                }
            }

            try {
                dec_run();
            } catch (IOException e) {
            }

            napisy();

            //tmp = String.valueOf(game.lines[i]) + " (" + (int)game.price[i] + ")";
            //((Board)game.window.getContentPane().getComponent(0)).counts[i].setText(tmp);
            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
                //e.printStackTrace();
            }


        }
    }
}
