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
        icons[4] = new ImageIcon("src/com/company/pixelpictures/scroll.png");
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
        g.drawImage(icons[4].getImage(), 25, 150, 1150, 830, null);
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


//Decyzja.religia = 0;
        if(Decyzja.religia==100){
            g.drawImage(staty[3].getImage(),602+200,11,746+200,163, 0, 0, 200, 210, null);
        }
        else if(Decyzja.religia==95){
            g.drawImage(staty[3].getImage(),602+200,11,746+200,163, 0, 0, 200, 210, null);
        }
        else if(Decyzja.religia==90){
            g.drawImage(staty[3].getImage(),603+220,11,745+200,163, 200, 0, 370, 210, null);
        }
        else if(Decyzja.religia==85){
            g.drawImage(staty[3].getImage(),602+220,11,745+200,163, 370, 0, 540, 210, null);
        }
        else if(Decyzja.religia==80){
            g.drawImage(staty[3].getImage(),616+205,11,742+206,163, 540, 0, 715, 210, null);
        }
        else if(Decyzja.religia==75){
            g.drawImage(staty[3].getImage(),625+200,11,743+200,163, 715, 0, 880, 210, null);
        }
        else if(Decyzja.religia==70){
            g.drawImage(staty[3].getImage(),603+200,39,746+200,162, 0, 210, 200, 380, null);
        }
        else if(Decyzja.religia==65){
            g.drawImage(staty[3].getImage(),602+222,39,745+200,161, 200, 210, 370, 380, null);
        }
        else if(Decyzja.religia==60){
            g.drawImage(staty[3].getImage(),623+200,39,744+200,161, 370, 210, 540, 380, null);
        }
        else if(Decyzja.religia==55){
            g.drawImage(staty[3].getImage(),622+200,39,744+200,161, 540, 210, 710, 380, null);
        }
        else if(Decyzja.religia==50){
            g.drawImage(staty[3].getImage(),622+200,39,743+200,161, 710, 210, 880, 380, null);
        }
        else if(Decyzja.religia==45){
            g.drawImage(staty[3].getImage(),603+200,38,746+200,161, 0, 380, 200, 550, null);
        }
        else if(Decyzja.religia==40){
            g.drawImage(staty[3].getImage(),624+200,38,745+200,161, 200, 380, 370, 550, null);
        }
        else if(Decyzja.religia==35){
            g.drawImage(staty[3].getImage(),623+200,38,744+200,161, 370, 380, 540, 550, null);
        }
        else if(Decyzja.religia==30){
            g.drawImage(staty[3].getImage(),622+200,38,744+200,161, 540, 380, 710, 550, null);
        }
        else if(Decyzja.religia==25){
            g.drawImage(staty[3].getImage(),621+200,38,743+200,161, 710, 380, 880, 550, null);
        }
        else if(Decyzja.religia==20){
            g.drawImage(staty[3].getImage(),603+200,38,746+200,160, 0, 550, 200, 720, null);
        }
        else if(Decyzja.religia==15){
            g.drawImage(staty[3].getImage(),623+200,38,745+200,160, 200, 550, 370, 720, null);
        }
        else if(Decyzja.religia==10){
            g.drawImage(staty[3].getImage(),623+200,38,744+200,160, 370, 550, 540, 720, null);
        }
        else if(Decyzja.religia==5){
            g.drawImage(staty[3].getImage(),622+200,38,744+200,160, 540, 550, 710, 720, null);
        }
        else if(Decyzja.religia==0){
            g.drawImage(staty[3].getImage(),622+200,38,743+200,160, 710, 550, 880, 720, null);
        }



//Decyzja.obywatele = 0;
        if(Decyzja.obywatele==100){
           g.drawImage(staty[2].getImage(),350+230,-25,520+232,160, 0, 0, 240, 255, null);
        }
        else if(Decyzja.obywatele==95){
            g.drawImage(staty[2].getImage(),350+230,-25,520+232,160, 0, 0, 240, 255, null);
        }
        else if(Decyzja.obywatele==90){
           g.drawImage(staty[2].getImage(),398+232,-25,520+230,159, 240, 0, 410, 255, null);
        }
        else if(Decyzja.obywatele==85){
            g.drawImage(staty[2].getImage(),397+232,-25,519+231,159, 410, 0, 580, 255, null);
        }
        else if(Decyzja.obywatele==80){
            g.drawImage(staty[2].getImage(),396+232,-25,518+231,159, 580, 0, 750, 255, null);
        }
        else if(Decyzja.obywatele==75){
            g.drawImage(staty[2].getImage(),395+233,-25,517+232,159, 750, 0, 920, 255, null);
        }
        else if(Decyzja.obywatele==70){
            g.drawImage(staty[2].getImage(),350+231,39,519+233,162, 0, 260, 240, 430, null);
        }
        else if(Decyzja.obywatele==65){
            g.drawImage(staty[2].getImage(),395+235,39,519+232,162, 240, 260, 410, 430, null);
        }
        else if(Decyzja.obywatele==60){
            g.drawImage(staty[2].getImage(),394+235,39,518+232,162, 410, 260, 580, 430, null);
        }
        else if(Decyzja.obywatele==55){
            g.drawImage(staty[2].getImage(),394+234,39,518+232,162, 580, 260, 750, 430, null);
        }
        else if(Decyzja.obywatele==50){
            g.drawImage(staty[2].getImage(),394+233,39,518+231,162, 750, 260, 920, 430, null);
        }
        else if(Decyzja.obywatele==45){
            g.drawImage(staty[2].getImage(),347+233,39,512+240,162, 0, 430, 240, 600, null);
        }
        else if(Decyzja.obywatele==40){
            g.drawImage(staty[2].getImage(),387+243,39,511+240,162, 240, 430, 410, 600, null);
        }
        else if(Decyzja.obywatele==35){
            g.drawImage(staty[2].getImage(),386+243,39,510+240,162, 410, 430, 580, 600, null);
        }
        else if(Decyzja.obywatele==30){
            g.drawImage(staty[2].getImage(),385+243,39,510+240,162, 580, 430, 750, 600, null);
        }
        else if(Decyzja.obywatele==25){
            g.drawImage(staty[2].getImage(),385+243,39,509+240,162, 750, 430, 920, 600, null);
        }
        else if(Decyzja.obywatele==20){
            g.drawImage(staty[2].getImage(),351+230,38,509+242,168, 0, 600, 240, 780, null);
        }
        else if(Decyzja.obywatele==15){
            g.drawImage(staty[2].getImage(),349+281,38,509+242,168, 240, 600, 410, 780, null);
        }
        else if(Decyzja.obywatele==10){
            g.drawImage(staty[2].getImage(),349+280,38,509+241,168, 410, 600, 580, 780, null);
        }
        else if(Decyzja.obywatele==5){
            g.drawImage(staty[2].getImage(),348+280,38,509+241,168, 580, 600, 750, 780, null);
        }
        else if(Decyzja.obywatele==0){
            g.drawImage(staty[2].getImage(),348+280,38,509+241,168, 750, 600, 920, 780, null);
        }








Decyzja.legiony = 100;
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






//Decyzja.finanse=100;
        if(Decyzja.finanse==100){
            g.drawImage(staty[0].getImage(),230+3,30+5,158+200-3,160-3, 0, 0, 400, 400,   null);
        }
        else if(Decyzja.finanse==95){
            g.drawImage(staty[0].getImage(),230+3,30+5,158+200-3,160-3, 0, 0, 400, 400,   null);
        }
        else if(Decyzja.finanse==90){
            g.drawImage(staty[0].getImage(),230+3,30+5,158+200-3,160-3, 0, 0, 400, 400,   null);
        }
        else if(Decyzja.finanse==85){
            g.drawImage(staty[0].getImage(),230+3,30+5,158+200-3,160-3, 0, 0, 400, 400,   null);
        }
        else if(Decyzja.finanse==80){
            g.drawImage(staty[0].getImage(),230+3,30+5,158+200-3,160-3, 0, 0, 400, 400,   null);
        }
        else if(Decyzja.finanse==75){
            g.drawImage(staty[0].getImage(),230+3,30+5,158+200-3,160-3, 0, 0, 400, 400,   null);
        }
        else if(Decyzja.finanse==70){
            g.drawImage(staty[0].getImage(),230+3,30+5,158+200-3,160-3, 0, 0, 400, 400,   null);
        }
        else if(Decyzja.finanse==65){
            g.drawImage(staty[0].getImage(),230+3,30+5,158+200-3,160-3, 0, 0, 400, 400,   null);
        }
        else if(Decyzja.finanse==60){
            g.drawImage(staty[0].getImage(),230+3,30+5,158+200-3,160-3, 0, 0, 400, 400,   null);
        }
        else if(Decyzja.finanse==55){
            g.drawImage(staty[0].getImage(),230+3,30+5,158+200-3,160-3, 0, 0, 400, 400,   null);
        }
        else if(Decyzja.finanse==50){
            g.drawImage(staty[0].getImage(),230+3,30+5,158+200-3,160-3, 0, 0, 400, 400,   null);
        }
        else if(Decyzja.finanse==45){
            g.drawImage(staty[0].getImage(),230+3,30+5,158+200-3,160-3, 0, 0, 400, 400,   null);
        }
        else if(Decyzja.finanse==40){
            g.drawImage(staty[0].getImage(),230+3,30+5,158+200-3,160-3, 0, 0, 400, 400,   null);
        }
        else if(Decyzja.finanse==35){
            g.drawImage(staty[0].getImage(),230+3,30+5,158+200-3,160-3, 0, 0, 400, 400,   null);
        }
        else if(Decyzja.finanse==30){
            g.drawImage(staty[0].getImage(),230+3,30+5,158+200-3,160-3, 0, 0, 400, 400,   null);
        }
        else if(Decyzja.finanse==25){
            g.drawImage(staty[0].getImage(),230+3,30+5,158+200-3,160-3, 0, 0, 400, 400,   null);
        }
        else if(Decyzja.finanse==20){
            g.drawImage(staty[0].getImage(),230+3,30+5,158+200-3,160-3, 0, 0, 400, 400,   null);
        }
        else if(Decyzja.finanse==15){
            g.drawImage(staty[0].getImage(),230+3,30+5,158+200-3,160-3, 0, 0, 400, 400,   null);
        }
        else if(Decyzja.finanse==10){
            g.drawImage(staty[0].getImage(),230+3,30+5,158+200-3,160-3, 0, 0, 400, 400,   null);
        }
        else if(Decyzja.finanse==5){
            g.drawImage(staty[0].getImage(),230+3,30+5,158+200-3,160-3, 0, 0, 400, 400,   null);
        }
        else if(Decyzja.finanse==0){
            g.drawImage(staty[0].getImage(),230+3,30+5,158+200-3,160-3, 0, 0, 400, 400,   null);
        }

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

