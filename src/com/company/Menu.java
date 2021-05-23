package com.company;


import com.sun.jdi.IntegerValue;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.ArrayList;

public class Menu extends JPanel implements MouseListener {
    ImageIcon tlo;
    ImageIcon nowa_gra;
    ImageIcon wczytaj;
    ImageIcon wyjscie;
    ImageIcon nazwa;
    ImageIcon nazwa2;
    Game game;
    //ArrayList<Point> punkty = new ArrayList<Point>();
    boolean wczytaj_najechany = false;
    boolean nowa_gra_najechany = false;
    boolean wyjscie_najechany = false;
    boolean dc = false;
    boolean newgame_flipper = false, wczytaj_flipper = false, exitflipper = false;

    public boolean flipper1 = false;
    boolean flipper2 = false, flipper3 = false;
    public void mousetrack() throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        //if(game.menu == true) {
        repaint();
            int x, y;
            //while (true) {
                x = game.window.getMousePosition().x;
                y = game.window.getMousePosition().y;

        if (x > 440 && x < 755 && y > 375 && y < 450) {
            nowa_gra_najechany = true;
            if(!game.naj.isOpen()){
                game.naj.open(AudioSystem.getAudioInputStream(game.najechanie_audio));
                //game.naj.start();
            }
            if (!newgame_flipper) {
                newgame_flipper = true;

                //tutaj trzeba wstawić komendę grającą kamyczkowy dźwięk
            }
        } else {
            nowa_gra_najechany = false;
            newgame_flipper = false;
        }
                if (x > 440 && x < 755 && y > 490 && y < 560) {
                    wczytaj_najechany = true;
                    if(!game.naj.isOpen()){
                        game.naj.open(AudioSystem.getAudioInputStream(game.najechanie_audio));
                        //game.naj.start();
                    }
                    if (wczytaj_flipper==false) {
                        wczytaj_flipper = true;

                        //tutaj trzeba wstawić komendę grającą kamyczkowy dźwięk
                    }
                } else {
                    wczytaj_najechany = false;
                    wczytaj_flipper = false;
                }


        if (x > 440 && x < 755 && y > 585 && y < 670) {
            wyjscie_najechany = true;
            if(!game.naj.isOpen()){
                game.naj.open(AudioSystem.getAudioInputStream(game.najechanie_audio));
                //game.naj.start();
            }
            if (exitflipper == false) {
                exitflipper = true;

                //tutaj trzeba wstawić komendę grającą kamyczkowy dźwięk
            }
        } else {
            wyjscie_najechany = false;
            exitflipper = false;
        }

        if ((x > 420 && x < 765 && y > 45 + 14 && y < 285)||(x > 390 && x < 800 && y > 200+14 && y < 285 + 14)) {
            dc = true;
        }
        else {
            dc = false;
        }

        if(exitflipper == false && wczytaj_flipper==false && newgame_flipper==false){
            repaint();
            game.naj.close();
        }

        /*if(wczytaj_flipper== false){
            game.naj.close();
        }
        if(newgame_flipper == false){
            game.naj.close();
        }*/


    }
    //}


    public Menu(Game game){

        this.game = game;
        ImageIcon tlo = new ImageIcon("src/com/company/pixelpictures/tło2.png");
        ImageIcon nowa_gra = new ImageIcon("src/com/company/buttons/roman_button (1).png");
        ImageIcon wczytaj = new ImageIcon("src/com/company/buttons/roman_button (2).png");
        ImageIcon wyjscie = new ImageIcon("src/com/company/buttons/roman_button (3).png");
        ImageIcon DC = new ImageIcon("src/com/company/pixelpictures/tytuł.dc.png");
        ImageIcon DC2 = new ImageIcon("src/com/company/pixelpictures/pixil-frame-0 (20).png");
        this.nowa_gra = nowa_gra;
        this.wczytaj = wczytaj;
        this.wyjscie = wyjscie;
        this.tlo = tlo;
        nazwa = DC;
        nazwa2 = DC2;
        setSize(1200, 780);
        addMouseListener(this);
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        //g.drawRect(40, 80, 640 - 80, 480 - 160);
        g.drawImage(tlo.getImage(), 0, 0,1200,780, null);
        if(dc == false) {
            g.drawImage(nazwa.getImage(), 350, 20, 500, 300, null);
        }
        else{
            g.drawImage(nazwa2.getImage(), 350, 20, 500, 300, null);
        }
        if(nowa_gra_najechany==false){
            g.drawImage(nowa_gra.getImage(),425,347,765,442, 0, 0, 1416 ,329, null);
        }
        else{
            g.drawImage(nowa_gra.getImage(),427,345,767,442, 0, 336, 1416 ,672, null);
        }
        if(wczytaj_najechany==false){
            g.drawImage(wczytaj.getImage(),425,457,765,552, 0, 0, 1416 ,327, null);
        }
        else{
            g.drawImage(wczytaj.getImage(),425,460,765,560, 0, 330, 1416 ,672, null);


        }
        if(wyjscie_najechany==false){
            g.drawImage(wyjscie.getImage(),425,570,765,670, 0, 330, 1416 ,672, null);
        }
        else{
            g.drawImage(wyjscie.getImage(),425,567,765,662, 0, 0, 1416 ,325, null);
        }


    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("x " + e.getX() + "  y " + e.getY());
        if (e.getX() > 435 && e.getX() < 745 && e.getY() > 460 && e.getY() < 530) {
            game.menu = false;
            game.wizualizacja = true;
            repaint();
            System.out.println("---------------Wczytaj--------------");;
        }
        if (e.getX() > 438 && e.getX() < 744 && e.getY() > 570 && e.getY() < 640) {
            System.exit(0);
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {


    }

    @Override
    public void mouseExited(MouseEvent e) {


    }

}

