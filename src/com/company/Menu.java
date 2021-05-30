package com.company;
import com.sun.jdi.IntegerValue;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Menu extends JPanel implements MouseListener {
    ImageIcon tlo;
    ImageIcon nowa_gra;
    ImageIcon newgame;
    ImageIcon wczytaj;
    ImageIcon wyjscie;
    ImageIcon nazwa;
    ImageIcon nazwa2;
    ImageIcon kwadrat;
    ImageIcon zapis1_icon;
    ImageIcon zapis2_icon;
    ImageIcon zapis3_icon;
    ImageIcon wroc;
    Game game;
    //ArrayList<Point> punkty = new ArrayList<Point>();
    static boolean newgame_boll = false;
    public Decyzja decyzja;
    boolean wczytaj_najechany = false;
    boolean nowa_gra_najechany = false;
    boolean wyjscie_najechany = false;
    boolean zapis1_najechany = false;
    boolean zapis2_najechany = false;
    boolean zapis3_najechany = false;
    boolean dc = false;
    boolean newgame_flipper = false, wczytaj_flipper = false, exitflipper = false;

    public boolean flipper1 = false;
    boolean flipper2 = false, flipper3 = false;
    public void mousetrack() throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        //if(game.menu == true) {

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
                    if(!game.naj2.isOpen()){
                        game.naj2.open(AudioSystem.getAudioInputStream(game.najechanie_audio));
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
            if(!game.naj3.isOpen()){
                game.naj3.open(AudioSystem.getAudioInputStream(game.najechanie_audio));


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
        repaint();
        if(newgame_flipper == false){
            game.naj.close();
        }
        if(wczytaj_flipper == false){
            game.naj2.close();
        }
        if(exitflipper == false){
            game.naj3.close();
        }


        /*if(wczytaj_flipper== false){
            game.naj.close();
        }
        if(newgame_flipper == false){
            game.naj.close();
        }*/


    }
    //}


    public Menu(Game game, Decyzja decyzja){
        this.decyzja = decyzja;
        this.game = game;
        ImageIcon tlo = new ImageIcon("src/com/company/pixelpictures/tło2.png");
        ImageIcon nowa_gra = new ImageIcon("src/com/company/buttons/roman_button (1).png");
        ImageIcon newgame = new ImageIcon("src/com/company/buttons/newgame.png");
        ImageIcon wczytaj = new ImageIcon("src/com/company/buttons/roman_button (2).png");
        ImageIcon wyjscie = new ImageIcon("src/com/company/buttons/roman_button (3).png");
        ImageIcon DC = new ImageIcon("src/com/company/pixelpictures/tytuł.dc.png");
        ImageIcon DC2 = new ImageIcon("src/com/company/pixelpictures/pixil-frame-0 (20).png");
        ImageIcon kwadrat = new ImageIcon("src/com/company/pixelpictures/tlo_opcji.png");
        ImageIcon zapis1_icon = new ImageIcon("src/com/company/buttons/roman_button (5).png");
        ImageIcon zapis2_icon = new ImageIcon("src/com/company/buttons/roman_button (6).png");
        ImageIcon zapis3_icon = new ImageIcon("src/com/company/buttons/roman_button (7).png");
        ImageIcon wroc = new ImageIcon("src/com/company/buttons/return_button.png");
        this.nowa_gra = nowa_gra;
        this.wczytaj = wczytaj;
        this.wyjscie = wyjscie;
        this.tlo = tlo;
        this.kwadrat = kwadrat;
        this.wroc = wroc;
        this.zapis1_icon = zapis1_icon;
        this.zapis2_icon = zapis2_icon;
        this.zapis3_icon = zapis3_icon;
        this.newgame = newgame;
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
        if(game.zapis_boll == false && game.odczyt_boll == false) {
            if (dc == false) {
                g.drawImage(nazwa.getImage(), 350, 20, 500, 300, null);
            } else {
                g.drawImage(nazwa2.getImage(), 350, 20, 500, 300, null);
            }
            if (nowa_gra_najechany == false) {
                g.drawImage(nowa_gra.getImage(), 425, 347, 765, 442, 0, 0, 1416, 329, null);
            } else {
                g.drawImage(nowa_gra.getImage(), 427, 345, 767, 442, 0, 336, 1416, 672, null);
            }
            if (wczytaj_najechany == false) {
                g.drawImage(wczytaj.getImage(), 425, 457, 765, 552, 0, 0, 1416, 327, null);
            } else {
                g.drawImage(wczytaj.getImage(), 426, 461, 766, 561, 0, 330, 1416, 672, null);


            }
            if (wyjscie_najechany == false) {
                g.drawImage(wyjscie.getImage(), 425, 570, 765, 670, 0, 330, 1416, 672, null);
            } else {
                g.drawImage(wyjscie.getImage(), 424, 568, 764, 663, 0, 0, 1416, 325, null);
            }
        } else {
            g.drawImage(kwadrat.getImage(), 210, 0, 780, 780, null);

            if (dc == false) {
                g.drawImage(nazwa.getImage(), 350, 20, 500, 300, null);
            } else {
                g.drawImage(nazwa2.getImage(), 350, 20, 500, 300, null);
            }
            if (nowa_gra_najechany == true) {
                g.drawImage(zapis1_icon.getImage(), 425-8, 347, 765-8, 442, 0, 0, 1416, 329, null);
            } else {
                g.drawImage(zapis1_icon.getImage(), 427-10, 345+8, 767-10, 442+8, 0, 336, 1416, 672, null);
            }
            if (wczytaj_najechany == false) {
                g.drawImage(zapis2_icon.getImage(), 425, 457, 765, 552, 0, 0, 1416, 327, null);
            } else {
                g.drawImage(zapis2_icon.getImage(), 426, 461+1, 766, 561+1, 0, 330, 1416, 672, null);


            }
            if (wyjscie_najechany == true) {
                g.drawImage(zapis3_icon.getImage(), 425-3, 570+2, 765-3, 670+2, 0, 330, 1416, 672, null);
            } else {
                g.drawImage(zapis3_icon.getImage(), 424, 568, 764, 663, 0, 0, 1416, 325, null);
            }
            g.drawImage(wroc.getImage(),500,450,158*5,92*6,null);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("x " + e.getX() + "  y " + e.getY());
        if (game.zapis_boll == true) {
            if (e.getX() > 425 && e.getY() > 347 && e.getX() < 765 && e.getY() < 442) {
                game.menu = false;
                game.grane = true;
                game.wizualizacja = true;
                int[] jj = new int[40];
                int[] q = new int[50];
                for(int i = 0; i < 40; i++){
                    jj[i] = 0;
                }
                for(int i = 0; i < 50; i++){
                    q[i] = 0;
                }
                try {
                    game.Zapis(1,1, jj,50,50,50,50, q,0,0,0,-1);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                game.death = 0;
                try {
                    game.Odczyt(1, decyzja);
                } catch (FileNotFoundException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                }
                try {
                    try {
                        game.klik.open(AudioSystem.getAudioInputStream(game.klikniecie_audio));
                    } catch (LineUnavailableException lineUnavailableException) {
                        lineUnavailableException.printStackTrace();
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    } catch (UnsupportedAudioFileException unsupportedAudioFileException) {
                        unsupportedAudioFileException.printStackTrace();
                    }
                    //game.volume2 = (FloatControl) game.klik.getControl(FloatControl.Type.MASTER_GAIN);
                    //game.volume2.setValue(-25f);
                    //newgame_boll = true;
                    //repaint();
                    game.klik.loop(1);
                    //game.klik.start();
                    try {
                        Thread.sleep(450);
                    } catch (InterruptedException en) {
                        //e.printStackTrace();
                    }
                    //game.klik.stop();
                } catch (IllegalArgumentException exception) {

                }
                game.klik.close();
                repaint();
                System.out.println("---------------Nowa gra--------------");
            }
            if (e.getX() > 435 && e.getX() < 745 && e.getY() > 460 && e.getY() < 530) {
                game.menu = false;
                game.wizualizacja = true;
                game.grane = true;
                int[] jj = new int[40];
                int[] q = new int[50];
                for(int i = 0; i < 40; i++){
                    jj[i] = 0;
                }
                for(int i = 0; i < 50; i++){
                    q[i] = 0;
                }
                try {
                    game.Zapis(2,1, jj,50,50,50,50, q,0,0,0,-1);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                game.death = 0;
                decyzja.death_screen = 0;
                decyzja.setNr((int)(Math.random()*61));
                try {
                    game.Odczyt(2, decyzja);
                } catch (FileNotFoundException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                }
                try {
                    try {
                        game.klik.open(AudioSystem.getAudioInputStream(game.klikniecie_audio));
                    } catch (LineUnavailableException lineUnavailableException) {
                        lineUnavailableException.printStackTrace();
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    } catch (UnsupportedAudioFileException unsupportedAudioFileException) {
                        unsupportedAudioFileException.printStackTrace();
                    }
                    //game.klik.open(AudioSystem.getAudioInputStream(game.klikniecie_audio));
                    //game.volume2 = (FloatControl) game.klik.getControl(FloatControl.Type.MASTER_GAIN);
                    //game.volume2.setValue(-25f);
                    game.klik.loop(1);
                    //game.klik.start();
                    try {
                        Thread.sleep(450);
                    } catch (InterruptedException en) {
                        //e.printStackTrace();
                    }
                    //game.klik.stop();
                } catch (IllegalArgumentException exception) {
                }
                game.klik.close();
                repaint();
                System.out.println("---------------Nowa Gra--------------");
            }
            if (e.getX() > 438 && e.getX() < 744 && e.getY() > 570 && e.getY() < 640) {
                game.menu = false;
                game.wizualizacja = true;
                game.grane = true;
                int[] jj = new int[40];
                int[] q = new int[50];
                for(int i = 0; i < 40; i++){
                    jj[i] = 0;
                }
                for(int i = 0; i < 50; i++){
                    q[i] = 0;
                }
                try {
                    game.Zapis(2,1, jj,50,50,50,50, q,0,0,0,-1);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                game.death = 0;
                try {
                    game.Odczyt(2, decyzja);
                } catch (FileNotFoundException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                }
                try {
                    try {
                        game.klik.open(AudioSystem.getAudioInputStream(game.klikniecie_audio));
                    } catch (LineUnavailableException lineUnavailableException) {
                        lineUnavailableException.printStackTrace();
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    } catch (UnsupportedAudioFileException unsupportedAudioFileException) {
                        unsupportedAudioFileException.printStackTrace();
                    }
                    //game.volume2 = (FloatControl) game.klik.getControl(FloatControl.Type.MASTER_GAIN);
                    //game.volume2.setValue(-25f);
                    game.klik.loop(1);
                    //game.klik.start();
                    try {
                        Thread.sleep(450);
                    } catch (InterruptedException en) {
                        //e.printStackTrace();
                    }
                    //game.klik.stop();
                } catch (IllegalArgumentException exception) {

                }
                game.klik.close();
                repaint();
            }
            if (e.getX() > 812 && e.getX() < 950 && e.getY() > 692 && e.getY() < 747) {
                //game.menu = true;
                game.zapis_boll = false;
                try {
                    try {
                        game.klik.open(AudioSystem.getAudioInputStream(game.klikniecie_audio));
                    } catch (LineUnavailableException lineUnavailableException) {
                        lineUnavailableException.printStackTrace();
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    } catch (UnsupportedAudioFileException unsupportedAudioFileException) {
                        unsupportedAudioFileException.printStackTrace();
                    }
                    //game.volume2 = (FloatControl) game.klik.getControl(FloatControl.Type.MASTER_GAIN);
                    //game.volume2.setValue(-25f);
                    game.klik.loop(1);
                    //game.klik.start();
                    try {
                        Thread.sleep(450);
                    } catch (InterruptedException en) {
                        //e.printStackTrace();
                    }
                    //game.klik.stop();
                } catch (IllegalArgumentException exception) {

                }
                game.klik.close();
                repaint();
            }
        }
        if (game.odczyt_boll == true) {
            if (e.getX() > 425 && e.getY() > 347 && e.getX() < 765 && e.getY() < 442) {
                game.menu = false;
                game.wizualizacja = true;
                game.grane = true;
                try {
                    game.Odczyt(1, decyzja);
                } catch (FileNotFoundException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                }
                try {
                    try {
                        game.klik.open(AudioSystem.getAudioInputStream(game.klikniecie_audio));
                    } catch (LineUnavailableException lineUnavailableException) {
                        lineUnavailableException.printStackTrace();
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    } catch (UnsupportedAudioFileException unsupportedAudioFileException) {
                        unsupportedAudioFileException.printStackTrace();
                    }
                    //game.volume2 = (FloatControl) game.klik.getControl(FloatControl.Type.MASTER_GAIN);
                    //game.volume2.setValue(-25f);
                    //newgame_boll = true;
                    //repaint();
                    game.klik.loop(1);
                    //game.klik.start();
                    try {
                        Thread.sleep(450);
                    } catch (InterruptedException en) {
                        //e.printStackTrace();
                    }
                   // game.klik.stop();
                } catch (IllegalArgumentException exception) {

                }
                game.klik.close();
                repaint();
                System.out.println("---------------Nowa gra--------------");
            }
            if (e.getX() > 435 && e.getX() < 745 && e.getY() > 460 && e.getY() < 530) {
                game.menu = false;
                game.wizualizacja = true;
                game.grane = true;
                try {
                    game.Odczyt(2, decyzja);
                } catch (FileNotFoundException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                }
                try {
                    try {
                        game.klik.open(AudioSystem.getAudioInputStream(game.klikniecie_audio));
                    } catch (LineUnavailableException lineUnavailableException) {
                        lineUnavailableException.printStackTrace();
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    } catch (UnsupportedAudioFileException unsupportedAudioFileException) {
                        unsupportedAudioFileException.printStackTrace();
                    }
                    //game.klik.open(AudioSystem.getAudioInputStream(game.klikniecie_audio));
                    //game.volume2 = (FloatControl) game.klik.getControl(FloatControl.Type.MASTER_GAIN);
                    //game.volume2.setValue(-25f);
                    game.klik.loop(1);
                    //game.klik.start();
                    try {
                        Thread.sleep(450);
                    } catch (InterruptedException en) {
                        //e.printStackTrace();
                    }
                   // game.klik.stop();
                } catch (IllegalArgumentException exception) {
                }
                game.klik.close();
                repaint();
                System.out.println("---------------Nowa Gra--------------");
            }
            if (e.getX() > 438 && e.getX() < 744 && e.getY() > 570 && e.getY() < 640) {
                try {
                    game.Odczyt(3, decyzja);
                } catch (FileNotFoundException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                }
                game.menu = false;
                game.wizualizacja = true;
                game.grane = true;
                try {
                    try {
                        game.klik.open(AudioSystem.getAudioInputStream(game.klikniecie_audio));
                    } catch (LineUnavailableException lineUnavailableException) {
                        lineUnavailableException.printStackTrace();
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    } catch (UnsupportedAudioFileException unsupportedAudioFileException) {
                        unsupportedAudioFileException.printStackTrace();
                    }
                    //game.volume2 = (FloatControl) game.klik.getControl(FloatControl.Type.MASTER_GAIN);
                    //game.volume2.setValue(-25f);
                    game.klik.loop(1);
                    //game.klik.start();
                    try {
                        Thread.sleep(450);
                    } catch (InterruptedException en) {
                        //e.printStackTrace();
                    }
                    game.klik.close();
                } catch (IllegalArgumentException exception) {

                }
                repaint();
            }
            if (e.getX() > 812 && e.getX() < 950 && e.getY() > 692 && e.getY() < 747) {
                //game.menu = true;
                game.odczyt_boll = false;
                try {
                    try {
                        game.klik.open(AudioSystem.getAudioInputStream(game.klikniecie_audio));
                    } catch (LineUnavailableException lineUnavailableException) {
                        lineUnavailableException.printStackTrace();
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    } catch (UnsupportedAudioFileException unsupportedAudioFileException) {
                        unsupportedAudioFileException.printStackTrace();
                    }
                    //game.volume2 = (FloatControl) game.klik.getControl(FloatControl.Type.MASTER_GAIN);
                    //game.volume2.setValue(-25f);
                    game.klik.loop(1);
                    //game.klik.start();
                    try {
                        Thread.sleep(450);
                    } catch (InterruptedException en) {
                        //e.printStackTrace();
                    }
                    game.klik.close();
                } catch (IllegalArgumentException exception) {

                }
                repaint();
            }
        }
        if (game.zapis_boll == false && game.odczyt_boll == false) {
            if (e.getX() > 425 && e.getY() > 347 && e.getX() < 765 && e.getY() < 442) {
                game.zapis_boll = true;
                try {
                    try {
                        game.klik.open(AudioSystem.getAudioInputStream(game.klikniecie_audio));
                    } catch (LineUnavailableException lineUnavailableException) {
                        lineUnavailableException.printStackTrace();
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    } catch (UnsupportedAudioFileException unsupportedAudioFileException) {
                        unsupportedAudioFileException.printStackTrace();
                    }
                    //game.volume2 = (FloatControl) game.klik.getControl(FloatControl.Type.MASTER_GAIN);
                    //game.volume2.setValue(-25f);
                    //newgame_boll = true;
                    //repaint();
                    game.klik.loop(1);
                    //game.klik.start();
                    try {
                        Thread.sleep(450);
                    } catch (InterruptedException en) {
                        //e.printStackTrace();
                    }
                    game.klik.close();
                    //game.klik.stop();
                } catch (IllegalArgumentException exception) {

                }
                repaint();
                System.out.println("---------------Nowa gra--------------");
            }
            if (e.getX() > 435 && e.getX() < 745 && e.getY() > 460 && e.getY() < 530) {
                //game.menu = false;
                //game.wizualizacja = true;
                game.odczyt_boll = true;
                try {
                    try {
                    game.klik.open(AudioSystem.getAudioInputStream(game.klikniecie_audio));
                } catch (LineUnavailableException lineUnavailableException) {
                    lineUnavailableException.printStackTrace();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                } catch (UnsupportedAudioFileException unsupportedAudioFileException) {
                    unsupportedAudioFileException.printStackTrace();
                }
                    //game.klik.open(AudioSystem.getAudioInputStream(game.klikniecie_audio));
                    //game.volume2 = (FloatControl) game.klik.getControl(FloatControl.Type.MASTER_GAIN);
                    //game.volume2.setValue(-25f);
                    game.klik.loop(1);
                    //game.klik.start();
                    try {
                        Thread.sleep(450);
                    } catch (InterruptedException en) {
                        //e.printStackTrace();
                    }
                    game.klik.close();
                } catch (IllegalArgumentException exception) {
                }
                repaint();
                System.out.println("---------------Wczytaj--------------");
            }
            if (e.getX() > 438 && e.getX() < 744 && e.getY() > 570 && e.getY() < 640) {
                try {
                    try {
                        game.klik.open(AudioSystem.getAudioInputStream(game.klikniecie_audio));
                    } catch (LineUnavailableException lineUnavailableException) {
                        lineUnavailableException.printStackTrace();
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    } catch (UnsupportedAudioFileException unsupportedAudioFileException) {
                        unsupportedAudioFileException.printStackTrace();
                    }
                    //game.volume2 = (FloatControl) game.klik.getControl(FloatControl.Type.MASTER_GAIN);
                    //game.volume2.setValue(-25f);
                    game.klik.loop(1);
                    //game.klik.start();
                    try {
                        Thread.sleep(450);
                    } catch (InterruptedException en) {
                        //e.printStackTrace();
                    }
                    game.klik.close();
                } catch (IllegalArgumentException exception) {

                }
                System.exit(0);
            }

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

