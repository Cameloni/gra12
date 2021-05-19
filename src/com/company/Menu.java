package com.company;


import com.sun.jdi.IntegerValue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Menu extends JPanel implements MouseListener {
    ImageIcon tlo;
    ImageIcon nowa_gra;
    ImageIcon wczytaj;
    ImageIcon wyjscie;
    ImageIcon nazwa;
    Game game;
    //ArrayList<Point> punkty = new ArrayList<Point>();
    boolean wczytaj_najechany = false;
    boolean nowa_gra_najechany = false;
    boolean wyjscie_najechany = false;

    boolean flipper1 = false, flipper2 = false;
    public void mousetrack(){
        //if(game.menu == true) {
            int x, y;
            //while (true) {
                x = game.window.getMousePosition().x;
                y = game.window.getMousePosition().y;
                if (x > 425 && x < 745 && y > 470 && y < 530) {
                    wczytaj_najechany = true;
                    /*if (flipper1 == false) {
                        flipper1 = true;
                        flipper2 = true;
                    } else {
                        flipper2 = false;
                    }*/
                } else {
                    wczytaj_najechany = false;
                    /*if (flipper1 == true) {
                        flipper1 = false;
                        flipper2 = true;
                    } else {
                        flipper2 = false;
                    }*/
                }
        if (x > 425 && x < 765 && y > 370 && y < 430) {
            nowa_gra_najechany = true;
                    /*if (flipper1 == false) {
                        flipper1 = true;
                        flipper2 = true;
                    } else {
                        flipper2 = false;
                    }*/
        } else {
            nowa_gra_najechany = false;
                    /*if (flipper1 == true) {
                        flipper1 = false;
                        flipper2 = true;
                    } else {
                        flipper2 = false;
                    }*/
        }

        if (x > 425 && x < 765 && y > 590 && y < 670) {
            wyjscie_najechany = true;
                    /*if (flipper1 == false) {
                        flipper1 = true;
                        flipper2 = true;
                    } else {
                        flipper2 = false;
                    }*/
        } else {
            wyjscie_najechany = false;
                    /*if (flipper1 == true) {
                        flipper1 = false;
                        flipper2 = true;
                    } else {
                        flipper2 = false;
                    }*/
        }
        /*if (flipper2 == true) {
                    repaint();
                }*/
        repaint();
    }
    //}


    public Menu(Game game){

        this.game = game;
        ImageIcon tlo = new ImageIcon("src/com/company/pixelpictures/tło2.png");
        ImageIcon nowa_gra = new ImageIcon("src/com/company/buttons/roman_button (1).png");
        ImageIcon wczytaj = new ImageIcon("src/com/company/buttons/roman_button (2).png");
        ImageIcon wyjscie = new ImageIcon("src/com/company/buttons/roman_button (3).png");
        ImageIcon DC = new ImageIcon("src/com/company/pixelpictures/tytuł.dc.png");
        this.nowa_gra = nowa_gra;
        this.wczytaj = wczytaj;
        this.wyjscie = wyjscie;
        this.tlo = tlo;
        nazwa = DC;
        setSize(1200, 780);
        addMouseListener(this);
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        //g.drawRect(40, 80, 640 - 80, 480 - 160);
        g.drawImage(tlo.getImage(), 0, 0,1200,780, null);
        g.drawImage(nazwa.getImage(),350,20,500,300,null);
        if(nowa_gra_najechany==false){
            g.drawImage(nowa_gra.getImage(),425,347,765,442, 0, 0, 1416 ,329, null);
        }
        else{
            g.drawImage(nowa_gra.getImage(),427,345,765,442, 0, 336, 1416 ,672, null);
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
        if(e.getX()>=430 && e.getX()<=760 && e.getY()>=455 && e.getY()<=545){
            game.menu = false;
            game.wizualizacja = true;
            repaint();
            //        System.out.println("bum");
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

