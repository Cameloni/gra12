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


        //con = window.getContentPane();


        pergaminpanel = new JPanel();
        pergaminpanel.setBounds(300, 500, 600, 200);
        pergaminpanel.setBackground(new Color(0, 0, 0, 1));
        pergaminpanel.setOpaque(false);
        //window.add(pergaminpanel);
        //window.add(p);


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
            //Timer timer = new Timer(50, new ActionListener() {
              //  @Override
                public void actionPerformed() {

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
      //      });
        }
    //}
}
*/












/*if(Decyzja.finanse==100){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==99){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==98){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==97){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==96){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==95){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==94){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==93){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==92){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==91){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==90){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==89){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==88){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==87){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==86){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==85){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==84){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==83){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==82){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==81){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==80){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==79){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==78){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==77){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==76){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==75){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==74){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==73){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==72){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==71){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==70){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==69){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==68){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==67){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==66){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==65){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==64){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==63){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==62){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==61){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==60){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==59){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==58){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==57){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==56){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==55){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==54){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==53){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==52){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==51){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==50){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==49){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==48){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==47){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==46){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==45){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==44){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==43){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==42){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==41){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==40){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==39){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==38){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==37){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==36){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==35){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==34){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==33){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==32){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==31){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==30){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==29){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==28){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==27){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==26){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==25){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==24){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==23){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==22){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==21){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==20){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==19){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==18){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==17){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==16){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==15){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==14){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==13){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==12){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==11){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==10){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==9){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==8){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==7){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==6){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==5){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==4){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==3){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==2){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==1){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }
        else if(Decyzja.finanse==0){
            g.drawImage(staty[0].getImage(),-25+200,-20,158+200,163, 0, 0, 125, 120,  null);
        }


*/












/*


        if(Decyzja.religia==100){
            g.drawImage(staty[3].getImage(),602+200,11,746+200,163, 0, 0, 200, 210, null);
        }
        else if(Decyzja.religia==95){
            g.drawImage(staty[3].getImage(),610+210,15,745+210,160, 0, 0, 200, 210, null);
        }
        else if(Decyzja.religia==90){
            g.drawImage(staty[3].getImage(),610+210,15,745+210,160, 0, 0, 200, 210, null);
        }
        else if(Decyzja.religia==85){
            g.drawImage(staty[3].getImage(),610+210,15,745+210,160, 0, 0, 200, 210, null);
        }
        else if(Decyzja.religia==80){
            g.drawImage(staty[3].getImage(),610+210,15,745+210,160, 0, 0, 200, 210, null);
        }
        else if(Decyzja.religia==75){
            g.drawImage(staty[3].getImage(),610+210,15,745+210,160, 0, 0, 200, 210, null);
        }
        else if(Decyzja.religia==70){
            g.drawImage(staty[3].getImage(),610+210,15,745+210,160, 0, 0, 200, 210, null);
        }
        else if(Decyzja.religia==65){
            g.drawImage(staty[3].getImage(),610+210,15,745+210,160, 0, 0, 200, 210, null);
        }
        else if(Decyzja.religia==60){
            g.drawImage(staty[3].getImage(),610+210,15,745+210,160, 0, 0, 200, 210, null);
        }
        else if(Decyzja.religia==55){
            g.drawImage(staty[3].getImage(),610+210,15,745+210,160, 0, 0, 200, 210, null);
        }
        else if(Decyzja.religia==530){
            g.drawImage(staty[3].getImage(),610+210,15,745+210,160, 0, 0, 200, 210, null);
        }
        else if(Decyzja.religia==45){
            g.drawImage(staty[3].getImage(),610+210,15,745+210,160, 0, 0, 200, 210, null);
        }
        else if(Decyzja.religia==40){
            g.drawImage(staty[3].getImage(),610+210,15,745+210,160, 0, 0, 200, 210, null);
        }
        else if(Decyzja.religia==35){
            g.drawImage(staty[3].getImage(),610+210,15,745+210,160, 0, 0, 200, 210, null);
        }
        else if(Decyzja.religia==30){
            g.drawImage(staty[3].getImage(),610+210,15,745+210,160, 0, 0, 200, 210, null);
        }
        else if(Decyzja.religia==25){
            g.drawImage(staty[3].getImage(),610+210,15,745+210,160, 0, 0, 200, 210, null);
        }
        else if(Decyzja.religia==20){
            g.drawImage(staty[3].getImage(),610+210,15,745+210,160, 0, 0, 200, 210, null);
        }
        else if(Decyzja.religia==15){
            g.drawImage(staty[3].getImage(),610+210,15,745+210,160, 0, 0, 200, 210, null);
        }
        else if(Decyzja.religia==10){
            g.drawImage(staty[3].getImage(),610+210,15,745+210,160, 0, 0, 200, 210, null);
        }
        else if(Decyzja.religia==5){
            g.drawImage(staty[3].getImage(),610+210,15,745+210,160, 0, 0, 200, 210, null);
        }
        else if(Decyzja.religia==0){
            g.drawImage(staty[3].getImage(),610+210,15,745+210,160, 0, 0, 200, 210, null);
        } */



/*







public void setFinanse(int finanse) {/*POŹNIEJ NAJPRAWDOPODOBNIEJ TRZEBA BĘDZIE ZMODYFIKOWAĆ TE SETTERY.
        if (this.finanse > 0){
            this.finanse += finanse;
            if(this.finanse <= 0){
                this.finanse = 0;
            }
            if(this.finanse > 100){
            this.finanse = 100;
            }
        }*/



/*
        if(finanse>0) {
        while (finanse > 0) {
        this.finanse += 1;
        finanse -= 1;
        try {
        Thread.sleep(100);
        }catch(InterruptedException e){};
        board.repaint();
        }
        }
        else{
        while(finanse<0){
        this.finanse -= 1;
        finanse += 1;
        try {
        Thread.sleep(500);
        }catch(InterruptedException e){};
        board.repaint();
        }
        }
        }
public void setObywatele(int obywatele) {
        if(obywatele>0) {
        while (obywatele > 0) {
        this.obywatele += 5;
        obywatele -= 5;
        try {
        Thread.sleep(500);
        }catch(InterruptedException e){};
        board.repaint();
        }
        }
        else{
        while(obywatele<0){
        this.obywatele -= 5;
        obywatele += 5;
        try {
        Thread.sleep(500);
        }catch(InterruptedException e){};
        board.repaint();
        }
        }
        }

public void setLegiony(int legiony) {
        if(legiony>0) {
        while (legiony > 0) {
        this.legiony += 5;
        legiony -= 5;
        try {
        Thread.sleep(500);
        }catch(InterruptedException e){};
        board.repaint();
        }
        }
        else{
        while(legiony<0){
        this.legiony -= 5;
        legiony += 5;
        try {
        Thread.sleep(500);
        }catch(InterruptedException e){};
        board.repaint();
        }
        }
        }

public void setReligia(int religia) {
        if(religia>0) {
        while (religia > 0) {
        this.religia += 5;
        religia -= 5;
        try {
        Thread.sleep(100);
        }catch(InterruptedException e){};
        board.repaint();
        }
        }
        else{
        while(religia<0){
        this.religia -= 5;
        religia += 5;
        try {
        Thread.sleep(500);
        }catch(InterruptedException e){};
        board.repaint();
        }
        }
        } */








/*
            case 71:
                setKwestia("");
                setKwe1("");
                setKwe2("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 72:
                setKwestia("");
                setKwe1("");
                setKwe2("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 73:
                setKwestia("");
                setKwe1("");
                setKwe2("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 74:
                setKwestia("");
                setKwe1("");
                setKwe2("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 75:
                setKwestia("");
                setKwe1("");
                setKwe2("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 76:
                setKwestia("");
                setKwe1("");
                setKwe2("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 77:
                setKwestia("");
                setKwe1("");
                setKwe2("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 78:
                setKwestia("");
                setKwe1("");
                setKwe2("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 79:
                setKwestia("");
                setKwe1("");
                setKwe2("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 80:
                setKwestia("");
                setKwe1("");
                setKwe2("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 81:
                setKwestia("");
                setKwe1("");
                setKwe2("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 82:
                setKwestia("");
                setKwe1("");
                setKwe2("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 83:
                setKwestia("");
                setKwe1("");
                setKwe2("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 84:
                setKwestia("");
                setKwe1("");
                setKwe2("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 85:
                setKwestia("");
                setKwe1("");
                setKwe2("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 86:
                setKwestia("");
                setKwe1("");
                setKwe2("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 87:
                setKwestia("");
                setKwe1("");
                setKwe2("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 88:
                setKwestia("");
                setKwe1("");
                setKwe2("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 89:
                setKwestia("");
                setKwe1("");
                setKwe2("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 90:
                setKwestia("");
                setKwe1("");
                setKwe2("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 91:
                setKwestia("");
                setKwe1("");
                setKwe2("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break; */