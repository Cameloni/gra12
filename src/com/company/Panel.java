package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;


public class Panel extends JPanel {

    public Panel(){

    }



    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);//
        /*src/com/company/pixelpictures/2021-05-08_17h50_51.png*/
        ImageIcon tron =  new ImageIcon("src/com/company/pixelpictures/output-onlinepngtools (10).png");
        ImageIcon cezar = new ImageIcon("src/com/company/pixelpictures/CezarSam.png");
        ImageIcon sluga = new ImageIcon("src/com/company/pixelpictures/sługa.png");
        ImageIcon sluga2 = new ImageIcon("src/com/company/pixelpictures/sługa2.png");
        ImageIcon tlo = new ImageIcon("src/com/company/pixelpictures/tło.png");
        ImageIcon tlo2 = new ImageIcon("src/com/company/pixelpictures/tło2.png");
        ImageIcon pergamin = new ImageIcon("src/com/company/pictures/per3.png");
        g.setColor(Color.gray);
        g.drawImage(tron.getImage(),0, 0, 1200, 780, null );
        g.drawImage(cezar.getImage(),500,200,200,300,null);
        g.drawImage(sluga.getImage(), 30, 270, 350, 300, null);
        g.drawImage(sluga2.getImage(),1240, 250, -280, 300, null);
        g.drawImage(pergamin.getImage(), 50, 500, 1100, 300, null);
        //g.drawImage(tlo2.getImage(), 0, 0, 1200, 780, null);
        //g.drawImage(tlo.getImage(), 0, 0, 1200, 780, null);
        //System.out.println(g.getClipBounds().width + " "+g.getClipBounds().height);
        /*for(int i = 0; i < 64; i++){
            g.drawLine(i*20,0,i*20,479);
        }
        for(int i = 0; i < 48; i++){
            g.drawLine(0,i*20,640,i*20);
        }*/
// wyrysowanie linii poziomych

        /*g.setColor(Color.RED);
        for(int i=0; i< 2; i++) {
            g.drawLine(320+i, 0, 320+i, 479);
        }
        g.drawLine(320-10,20,320,0);
        g.drawLine(320+10,20,320,0);
        for(int i=0; i< 2; i++) {
            g.drawLine(0, 239+i, 639, 239+i);
        }
        g.drawLine(620,240+10,639,240);
        g.drawLine(620,240-10,639,240);*/
        //g.drawImage(obr.getImage(),10, 10,null);
        /*for(int i = 0; i < 6; i++ ) {
            if (i%2 != 0) {
                for(int j = 0; j < 8; j+=2){
                    g.drawImage(obr.getImage(),j * 80, i * 80, 80, 80, null);
                }
            } else {
                for(int j = 1; j < 8; j+=2){
                    g.drawImage(obr.getImage(),j * 80 , i * 80, 80, 80, null);
                }
            }
        }*/

    }

}