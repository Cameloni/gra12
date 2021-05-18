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
    boolean wczytaj_najechany = false;
    boolean flipper1 = false, flipper2 = false;
    public void mousetrack(){
        int x, y;
        while(true){
            x = MouseInfo.getPointerInfo().getLocation().x;
            y = MouseInfo.getPointerInfo().getLocation().y;
            if(x>825 && x<1100 && y> 490 && y<560){
                wczytaj_najechany = true;
                if(flipper1==false){
                    flipper1 = true;
                    flipper2 = true;
                }
                else{
                    flipper2 = false;
                }
            }
            else{
                wczytaj_najechany = false;
                if(flipper1==true){
                    flipper1 = false;
                    flipper2 = true;
                }
                else{
                    flipper2 = false;
                }
            }
            if(flipper2==true){
                repaint();
            }
        }
    }
    public Menu(Game game){

        this.game = game;
        ImageIcon tlo = new ImageIcon("src/com/company/pixelpictures/tło2.png");
        ImageIcon wczytaj = new ImageIcon("src/com/company/buttons/roman_button (2).png");
        ImageIcon DC = new ImageIcon("src/com/company/pixelpictures/tytuł.dc.png");
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
            g.drawImage(nazwa.getImage(),350,20,500,300,null);
            if(wczytaj_najechany==false){
                g.drawImage(wczytaj.getImage(),425,347,765,442, 0, 0, 1416 ,329, null);
            }
            else{
                g.drawImage(wczytaj.getImage(),425,350,765,450, 0, 336, 1416 ,672, null);
                //g.drawImage(wczytaj.getImage(),500,350,600,450, 0, 0, 1416 ,325, null);
            }




    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getX()>=500 && e.getX()<=700 && e.getY()>=350 && e.getY()<=450){
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

