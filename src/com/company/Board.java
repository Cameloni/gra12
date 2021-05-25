package com.company;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

public class Board extends JPanel implements MouseListener {
/*
    boolean button1_najechany = false;
    boolean button2_najechany= false;
    boolean button1_flipper= false;
    boolean button2_flipper= false;

    public Game game;
    public void mousetrack2() throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        //if(game.menu == true) {

        int x, y;
        //while (true) {
        x = game.window.getMousePosition().x;
        y = game.window.getMousePosition().y;


        if (x > 440 && x < 755 && y > 490 && y < 560) {
            button1_najechany = true;
            if(!game.naj.isOpen()){
                game.naj.open(AudioSystem.getAudioInputStream(game.najechanie_audio));
                //game.naj.start();
            }
            if (button1_flipper==false) {
                button1_flipper = true;

                //tutaj trzeba wstawić komendę grającą kamyczkowy dźwięk
            }
        } else {
            button1_najechany = false;
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


        repaint();
        if(exitflipper == false && wczytaj_flipper==false){
            game.naj.close();
        }

*/
        /*if(wczytaj_flipper== false){
            game.naj.close();
        }
        if(newgame_flipper == false){
            game.naj.close();
        }


    }*/
    //public JLabel tekst = new JLabel();
    public JTextArea jTextArea = new JTextArea();
    public JTextArea[] JJ = new JTextArea[2];
    //public JLabel[] counts = new JLabel[4];
    ImageIcon[] icons = new ImageIcon[15];
    ImageIcon[] staty = new ImageIcon[4];
    public int cezar_blink = 0;
    boolean button1_najechany = false;
    boolean button2_najechany = false;
    //Color[] cols = {Color.green, Color.yellow, Color.orange, Color.red};

    public Board(Game game) throws IOException, FontFormatException {
        this.setLayout(null);

        /*icons[0] = new ImageIcon("src/com/company/pixelpictures/SalaTronowa.png");
        icons[1] = new ImageIcon("src/com/company/pixelpictures/CezarSam.png");
        icons[2] = new ImageIcon("src/com/company/pixelpictures/pergamin4.png");
        icons[3] = new ImageIcon("src/com/company/pixelpictures/sługa.png");*/
        icons[0] =  new ImageIcon("src/com/company/pixelpictures/SalaTronowa.png");
        icons[1] = new ImageIcon("src/com/company/pixelpictures/Cezarsam7.png");
        icons[2] = new ImageIcon("src/com/company/pixelpictures/sługa.png");
        icons[3] = new ImageIcon("src/com/company/pixelpictures/sługa2.png");
        //icons[4] = new ImageIcon("src/com/company/pixelpictures/tło.png");
        icons[4] = new ImageIcon("src/com/company/pixelpictures/Bez nazwy2.png");
        icons[5] = new ImageIcon("src/com/company/buttons/ustawienia_button.png");
        icons[6] = new ImageIcon("src/com/company/buttons/potencialny_guzik_decyzji.png");
        icons[7] = new ImageIcon("src/com/company/buttons/potencialny_guzik_decyzji.png");
        icons[11] = new ImageIcon("src/com/company/pixelpictures/oznaczenie_modyfikowanej_statystyki_religia.png");
        icons[12] = new ImageIcon("src/com/company/pixelpictures/oznaczenie_modyfikowanej_statystyki_autorytet.png");
        icons[13] = new ImageIcon("src/com/company/pixelpictures/oznaczenie_modyfikowanej_statystyki_armia.png");
        icons[14] = new ImageIcon("src/com/company/pixelpictures/oznaczenie_modyfikowanej_statystyki_finanse.png");
        icons[10] = new ImageIcon("src/com/company/pixelpictures/ramka.png");
        staty[0] = new ImageIcon("src/com/company/statystyki/coins_stats.png");
        staty[1] = new ImageIcon("src/com/company/statystyki/army_stats.png");
        staty[2] = new ImageIcon("src/com/company/statystyki/authority_stats.png");
        staty[3] = new ImageIcon("src/com/company/statystyki/religion_stats.png");
        //add(coins);
        //this.game = game;
        Font romanfont = Font.createFont(Font.TRUETYPE_FONT, new File("src/com/company/fonts/CyborgSister.ttf")).deriveFont(40f);
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("src/com/company/fonts/CyborgSister.ttf")));
        Font romanfont1 = Font.createFont(Font.TRUETYPE_FONT, new File("src/com/company/fonts/CyborgSister.ttf")).deriveFont(30f);
        GraphicsEnvironment ge1 = GraphicsEnvironment.getLocalGraphicsEnvironment();
        ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("src/com/company/fonts/CyborgSister.ttf")));
        //JTextArea jTextArea;
        this.jTextArea = new JTextArea("");
        this.jTextArea.setVisible(true);
        this.jTextArea.setBounds(200, 480, 800, 300);
        this.jTextArea.setBackground(new Color(0, 0, 0, 1));
        this.jTextArea.setOpaque(false);
        //jTextArea.setForeground(Color.red);
        this.jTextArea.setFont(romanfont);
        this.jTextArea.setLineWrap(true);
        this.jTextArea.setEditable(false);
        this.jTextArea.setHighlighter(null);
        this.jTextArea.setWrapStyleWord(true);
        //jTextArea.setText("ccaaaa");

        this.jTextArea.setFont(romanfont);
        //jTextArea.setForeground(Color.getHSBColor(500,850,200));

        //MOŻNA WYBRAĆ WŁASNY KOLOR..
        this.jTextArea.setForeground(new Color(111, 97, 9));
        setSize(1200, 780);
        add(this.jTextArea);
        //jTextArea.setForeground(Color.BLACK);

        //tekst.setBounds(300, 500, 600, 200);
        for(int i =0 ; i< 2; i++) {
            JJ[i] = new JTextArea();
            this.JJ[i] = new JTextArea("");
            if(i == 0){
                this.JJ[i].setBounds(200, 680, 500, 300);
            }
            else {
                this.JJ[i].setBounds(650, 680, 500, 300);
            }
            this.JJ[i].setBackground(new Color(0, 0, 0, 1));
            this.JJ[i].setOpaque(false);
            //jTextArea.setForeground(Color.red);
            this.JJ[i].setFont(romanfont1);
            this.JJ[i].setLineWrap(true);
            this.JJ[i].setEditable(false);
            this.JJ[i].setWrapStyleWord(true);
            //jTextArea.setText("ccaaaa");
            this.JJ[i].setFont(romanfont1);
            //jTextArea.setForeground(Color.getHSBColor(500,850,200));

            //MOŻNA WYBRAĆ WŁASNY KOLOR..
            this.JJ[i].setForeground(new Color(116, 14, 53));
            add(this.JJ[i]);
            //jTextArea.setForeground(Color.BLACK);
            //this.JJ[i].setVisible(true);
        }
        //jTextArea.setText("");




        /*for(int i =0 ; i< 4; i++) {
            counts[i] = new JLabel();
            counts[i].setBounds(100, 88 + 100 * i, 636, 98);
            this.counts[i].setFont(new Font("Arial", Font.PLAIN, 20));
            this.counts[i].setForeground(Color.black);
            add(counts[i]);
        }*/addMouseListener(this);
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        //System.out.println(getWidth());
        //System.out.println(getHeight());
        /*g.drawImage(icons[0].getImage(),0,0, 1200,780, null);
        g.drawImage(icons[1].getImage(),300,200, 200,200, null);
        g.drawImage(icons[2].getImage(),50,500, 1100,300, null);
        g.drawImage(icons[3].getImage(),50,300, 200,200, null);*/
        //g.drawImage(icons[0].getImage(),0,0, 1200,780, null);
        g.drawImage(icons[0].getImage(),0, 0, 1200, 780, null );
        if(cezar_blink==0){
            g.drawImage(icons[1].getImage(),465,200,685,510, 0, 0, 700, 1075, null);
        }
        else if(cezar_blink==1){
            g.drawImage(icons[1].getImage(),465-3,200,685+5,510, 675, 0, 1400, 1075, null);
        }
        else if(cezar_blink==2){
            g.drawImage(icons[1].getImage(),480-16,200-1,700+4,510-2, 1340, 0, 2100, 1075, null);
        }

        g.drawImage(icons[10].getImage(),217,25,750,150,null);
       // g.drawImage(icons[2].getImage(), 30, 270, 350, 300, null);
       // g.drawImage(icons[3].getImage(),1200, 250, -280, 300, null);
        g.drawImage(icons[4].getImage(), -1150, 275, 3500, 650, null);
        g.drawImage(icons[5].getImage(), 1120, 20, 50, 50, null);
        g.drawImage(icons[11].getImage(), 618, -40, 630, 630, null);
        g.drawImage(icons[12].getImage(), 424, -40, 630, 630, null);
        g.drawImage(icons[13].getImage(), 228, -40, 630, 630, null);
        g.drawImage(icons[14].getImage(), 41, -35, 610, 610, null);



        //g.drawImage(icons[6].getImage(),100, 630, 500, 150, null);
        if(button1_najechany==false){
            g.drawImage(icons[6].getImage(),150,650,600,770, 0, 0, 700 ,166, null);
        }
        else{
            g.drawImage(icons[6].getImage(),150,650,600,770, 0, 166, 700 ,332, null);
        }
        if(button2_najechany==false){
            g.drawImage(icons[7].getImage(),600,650,1050,770, 0, 0, 700 ,166, null);
        }
        else{
            g.drawImage(icons[7].getImage(),600,650,1050,770, 0, 166, 700 ,332, null);
        }


        ///////////////////////////////////////////////////////////////////////////////////////////////////////////



Decyzja.religia=100;
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
        }


        if(Decyzja.obywatele==100){
           g.drawImage(staty[2].getImage(),350+230,-25,520+232,160, 0, 0, 240, 255, null);
        }
        else if(Decyzja.obywatele==95){
            g.drawImage(staty[2].getImage(),350+230,-25,520+232,160, 0, 0, 240, 255, null);
        }
        else if(Decyzja.obywatele==90){
           g.drawImage(staty[2].getImage(),350+230,-25,520+232,160, 0, 0, 240, 255, null);
        }
        else if(Decyzja.obywatele==85){
           g.drawImage(staty[2].getImage(),350+230,-25,520+232,160, 0, 0, 240, 255, null);
        }
        else if(Decyzja.obywatele==80){
            g.drawImage(staty[2].getImage(),350+230,-25,520+232,160, 0, 0, 240, 255, null);
        }
        else if(Decyzja.obywatele==75){
            g.drawImage(staty[2].getImage(),350+230,-25,520+232,160, 0, 0, 240, 255, null);
        }
        else if(Decyzja.obywatele==70){
            g.drawImage(staty[2].getImage(),350+230,-25,520+232,160, 0, 0, 240, 255, null);
        }
        else if(Decyzja.obywatele==65){
            g.drawImage(staty[2].getImage(),350+230,-25,520+232,160, 0, 0, 240, 255, null);
        }
        else if(Decyzja.obywatele==60){
            g.drawImage(staty[2].getImage(),350+230,-25,520+232,160, 0, 0, 240, 255, null);
        }
        else if(Decyzja.obywatele==55){
            g.drawImage(staty[2].getImage(),350+230,-25,520+232,160, 0, 0, 240, 255, null);
        }
        else if(Decyzja.obywatele==50){
            g.drawImage(staty[2].getImage(),350+230,-25,520+232,160, 0, 0, 240, 255, null);
        }
        else if(Decyzja.obywatele==45){
            g.drawImage(staty[2].getImage(),350+230,-25,520+232,160, 0, 0, 240, 255, null);
        }
        else if(Decyzja.obywatele==40){
            g.drawImage(staty[2].getImage(),350+230,-25,520+232,160, 0, 0, 240, 255, null);
        }
        else if(Decyzja.obywatele==35){
            g.drawImage(staty[2].getImage(),350+230,-25,520+232,160, 0, 0, 240, 255, null);
        }
        else if(Decyzja.obywatele==30){
            g.drawImage(staty[2].getImage(),350+230,-25,520+232,160, 0, 0, 240, 255, null);
        }
        else if(Decyzja.obywatele==25){
            g.drawImage(staty[2].getImage(),350+230,-25,520+232,160, 0, 0, 240, 255, null);
        }
        else if(Decyzja.obywatele==20){
            g.drawImage(staty[2].getImage(),350+230,-25,520+232,160, 0, 0, 240, 255, null);
        }
        else if(Decyzja.obywatele==15){
            g.drawImage(staty[2].getImage(),350+230,-25,520+232,160, 0, 0, 240, 255, null);
        }
        else if(Decyzja.obywatele==10){
            g.drawImage(staty[2].getImage(),350+230,-25,520+232,160, 0, 0, 240, 255, null);
        }
        else if(Decyzja.obywatele==5){
            g.drawImage(staty[2].getImage(),350+230,-25,520+232,160, 0, 0, 240, 255, null);
        }
        else if(Decyzja.obywatele==0){
            g.drawImage(staty[2].getImage(),350+230,-25,520+232,160, 0, 0, 240, 255, null);
        }









        if(Decyzja.legiony==100){
            g.drawImage(staty[1].getImage(),180+230,32,321+231,162, 0, 0, 200, 180, null);
        }
        else if(Decyzja.legiony==95){
            g.drawImage(staty[1].getImage(),180+230,32,321+231,162, 0, 0, 200, 180, null);
        }
        else if(Decyzja.legiony==90){
            g.drawImage(staty[1].getImage(),180+230,32,321+231,162, 0, 0, 200, 180, null);
        }
        else if(Decyzja.legiony==85){
            g.drawImage(staty[1].getImage(),180+230,32,321+231,162, 0, 0, 200, 180, null);
        }
        else if(Decyzja.legiony==80){
            g.drawImage(staty[1].getImage(),180+230,32,321+231,162, 0, 0, 200, 180, null);
        }
        else if(Decyzja.legiony==75){
            g.drawImage(staty[1].getImage(),180+230,32,321+231,162, 0, 0, 200, 180, null);
        }
        else if(Decyzja.legiony==70){
            g.drawImage(staty[1].getImage(),180+230,32,321+231,162, 0, 0, 200, 180, null);
        }
        else if(Decyzja.legiony==65){
            g.drawImage(staty[1].getImage(),180+230,32,321+231,162, 0, 0, 200, 180, null);
        }
        else if(Decyzja.legiony==60){
            g.drawImage(staty[1].getImage(),180+230,32,321+231,162, 0, 0, 200, 180, null);
        }
        else if(Decyzja.legiony==55){
            g.drawImage(staty[1].getImage(),180+230,32,321+231,162, 0, 0, 200, 180, null);
        }
        else if(Decyzja.legiony==50){
            g.drawImage(staty[1].getImage(),180+230,32,321+231,162, 0, 0, 200, 180, null);
        }
        else if(Decyzja.legiony==45){
            g.drawImage(staty[1].getImage(),180+230,32,321+231,162, 0, 0, 200, 180, null);
        }
        else if(Decyzja.legiony==40){
            g.drawImage(staty[1].getImage(),180+230,32,321+231,162, 0, 0, 200, 180, null);
        }
        else if(Decyzja.legiony==35){
            g.drawImage(staty[1].getImage(),180+230,32,321+231,162, 0, 0, 200, 180, null);
        }
        else if(Decyzja.legiony==30){
            g.drawImage(staty[1].getImage(),180+230,32,321+231,162, 0, 0, 200, 180, null);
        }
        else if(Decyzja.legiony==25){
            g.drawImage(staty[1].getImage(),180+230,32,321+231,162, 0, 0, 200, 180, null);
        }
        else if(Decyzja.legiony==20){
            g.drawImage(staty[1].getImage(),180+230,32,321+231,162, 0, 0, 200, 180, null);
        }
        else if(Decyzja.legiony==15){
            g.drawImage(staty[1].getImage(),180+230,32,321+231,162, 0, 0, 200, 180, null);
        }
        else if(Decyzja.legiony==10){
            g.drawImage(staty[1].getImage(),180+230,32,321+231,162, 0, 0, 200, 180, null);
        }
        else if(Decyzja.legiony==5){
            g.drawImage(staty[1].getImage(),180+230,32,321+231,162, 0, 0, 200, 180, null);
        }
        else if(Decyzja.legiony==0){
            g.drawImage(staty[1].getImage(),180+230,32,321+231,162, 0, 0, 200, 180, null);
        }





        if(Decyzja.finanse==100){
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
        //g.drawImage(icons[7].getImage(),600, 630, 500, 150, null);
////
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        /*System.out.println("--------------------------");
        System.out.println("X: .. " + e.getX() + "  Y:.." + e.getY());
        if(e.getY()>78+100 && e.getY()< 78+100+98){
        }*/
        repaint();
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

