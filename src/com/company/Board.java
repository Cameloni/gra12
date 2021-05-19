package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

public class Board extends JPanel implements MouseListener {

    public Game game;
    //public JLabel tekst = new JLabel();
    public JTextArea jTextArea = new JTextArea();
    //public JLabel[] counts = new JLabel[4];
    ImageIcon[] icons = new ImageIcon[10];

    //Color[] cols = {Color.green, Color.yellow, Color.orange, Color.red};

    public Board(Game game) throws IOException, FontFormatException {
        this.setLayout(null);

        /*icons[0] = new ImageIcon("src/com/company/pixelpictures/SalaTronowa.png");
        icons[1] = new ImageIcon("src/com/company/pixelpictures/CezarSam.png");
        icons[2] = new ImageIcon("src/com/company/pixelpictures/pergamin4.png");
        icons[3] = new ImageIcon("src/com/company/pixelpictures/sługa.png");*/
        icons[0] =  new ImageIcon("src/com/company/pixelpictures/SalaTronowa.png");
        icons[1] = new ImageIcon("src/com/company/pixelpictures/CezarSam.png");
        icons[2] = new ImageIcon("src/com/company/pixelpictures/sługa.png");
        icons[3] = new ImageIcon("src/com/company/pixelpictures/sługa2.png");
        //icons[4] = new ImageIcon("src/com/company/pixelpictures/tło.png");
        icons[4] = new ImageIcon("src/com/company/pixelpictures/pergamin4.png");
        icons[5] = new ImageIcon("src/com/company/buttons/ustawienia_button.png");
        //add(coins);
        this.game = game;
        Font romanfont = Font.createFont(Font.TRUETYPE_FONT, new File("src/com/company/fonts/CyborgSister.ttf")).deriveFont(40f);
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("src/com/company/fonts/CyborgSister.ttf")));
        JTextArea jTextArea;
        jTextArea = new JTextArea("");
        jTextArea.setBounds(270, 520, 630, 200);
        jTextArea.setBackground(new Color(0, 0, 0, 1));
        jTextArea.setOpaque(false);
        //jTextArea.setForeground(Color.red);
        jTextArea.setFont(romanfont);
        jTextArea.setLineWrap(true);
        jTextArea.setEditable(false);
        jTextArea.setWrapStyleWord(true);
        //jTextArea.setText("ccaaaa");
        jTextArea.setFont(romanfont);
        //jTextArea.setForeground(Color.getHSBColor(500,850,200));

        //MOŻNA WYBRAĆ WŁASNY KOLOR..
        jTextArea.setForeground(new Color(135,120,1));

        //jTextArea.setForeground(Color.BLACK);
        jTextArea.setVisible(true);
        //tekst.setBounds(300, 500, 600, 200);


        //jTextArea.setText("");

        add(jTextArea);

        setSize(1200, 780);
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
        g.drawImage(icons[1].getImage(),490,230,200,320,null);
        g.drawImage(icons[2].getImage(), 30, 270, 350, 300, null);
        g.drawImage(icons[3].getImage(),1200, 250, -280, 300, null);
        g.drawImage(icons[4].getImage(), 100, 470, 1000, 300, null);
        g.drawImage(icons[5].getImage(),1120,25,50,50, null);
        //g.drawImage(icons[5].getImage(), 0, 0, 1200, 780, null);
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

