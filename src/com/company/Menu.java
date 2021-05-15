package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Menu extends JPanel implements MouseListener {

    ImageIcon tlo;
    ImageIcon wczytaj;
    ImageIcon nazwa;
    Game game;
    public Menu(Game game){
        this.game = game;
        ImageIcon tlo = new ImageIcon("src/com/company/pixelpictures/tło2.png");
        ImageIcon wczytaj = new ImageIcon("src/com/company/buttons/roman_button (2).png");
        //napis jest szpetny
        ImageIcon DC = new ImageIcon("src/com/company/pixelpictures/DC.png");
        this.wczytaj = wczytaj;
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
            g.drawImage(wczytaj.getImage(),450,300,250,250,null);
            g.drawImage(nazwa.getImage(),600,100,400,300,null);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getX()>450 && e.getY()<550)
            if(e.getY()>300 && e.getX()<700){
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

