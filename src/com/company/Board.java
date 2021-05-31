package com.company;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Board extends JPanel implements MouseListener {
    Game game;
    Decyzja decyzja;
    static public Boolean mozna = false;
    static public Boolean opcja1 = false;
    static public Boolean opcja2 = false;
    Boolean button1_najechany = false;
    Boolean button2_najechany = false;
    Boolean opcje_najechany = false;
    Boolean opcja1_flipper = false;
    Boolean opcja2_flipper = false;
    Boolean opcje_flipper = false;
    boolean wczytaj_najechany = false;
    boolean nowa_gra_najechany = false;
    boolean wyjscie_najechany = false;
    boolean return_najechany = false;
    public static boolean death2;

    boolean dc = false;
    boolean newgame_flipper = false, wczytaj_flipper = false, exitflipper = false;
    boolean menu_najechany;
    boolean again_najechany;
    public static boolean ustawienia_boll = false;
    boolean flipper = false;
    public static boolean green_fin1;
    public static boolean green_leg1;
    public static boolean green_oby1;
    public static boolean green_rel1;
    public static boolean green_fin2;
    public static boolean green_leg2;
    public static boolean green_oby2;
    public static boolean green_rel2;
    public static int nr = -1;
    public void mousetrack2() throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        //if(game.menu == true) {

        int x, y;
        //while (true) {
        x = game.window.getMousePosition().x;
        y = game.window.getMousePosition().y;

        if (x > 160 && x < 580 && y > 680 && y < 756+30) {
            button1_najechany = true;
            //if (!game.naj.isOpen()) {
                //game.naj.open(AudioSystem.getAudioInputStream(game.najechanie_audio));
                //game.naj.start();
            //}
            if(game.death==0) {
                switch (nr) {
                    case 0:
                        green_fin1 = true;
                        green_leg1 = true;
                        green_oby1 = false;
                        green_rel1 = false;
                        break;
                    case 1:
                        green_fin1 = true;
                        green_leg1 = false;
                        green_oby1 = true;
                        green_rel1 = true;
                        break;
                    case 2:
                        green_fin1 = true;
                        green_leg1 = true;
                        green_oby1 = false;
                        green_rel1 = false;
                        break;
                    case 3:
                        green_fin1 = true;
                        green_leg1 = false;
                        green_oby1 = true;
                        green_rel1 = false;
                        break;
                    case 4:
                        green_fin1 = false;
                        green_leg1 = false;
                        green_oby1 = true;
                        green_rel1 = false;
                        break;
                    case 5:
                        green_fin1 = false;
                        green_leg1 = true;
                        green_oby1 = false;
                        green_rel1 = true;
                        break;
                    case 6:
                        green_fin1 = false;
                        green_leg1 = false;
                        green_oby1 = false;
                        green_rel1 = false;
                        break;
                    case 7:
                        green_fin1 = true;
                        green_leg1 = true;
                        green_oby1 = true;
                        green_rel1 = false;
                        break;
                    case 8:
                        green_fin1 = true;
                        green_leg1 = false;
                        green_oby1 = false;
                        green_rel1 = true;
                        break;
                    case 9:
                        green_fin1 = true;
                        green_leg1 = true;
                        green_oby1 = true;
                        green_rel1 = false;
                        break;
                    case 10:
                        green_fin1 = false;
                        green_leg1 = false;
                        green_oby1 = false;
                        green_rel1 = false;
                        break;
                    case 11:
                        green_fin1 = false;
                        green_leg1 = false;
                        green_oby1 = true;
                        green_rel1 = false;
                        break;
                    case 12:
                        green_fin1 = false;
                        green_leg1 = true;
                        green_oby1 = true;
                        green_rel1 = false;
                        break;
                    case 13:
                        green_fin1 = false;
                        green_leg1 = true;
                        green_oby1 = false;
                        green_rel1 = true;
                        break;
                    case 14:
                        green_fin1 = true;
                        green_leg1 = true;
                        green_oby1 = true;
                        green_rel1 = true;
                        break;
                    case 15:
                        green_fin1 = false;
                        green_leg1 = false;
                        green_oby1 = false;
                        green_rel1 = false;
                        break;
                    case 16:
                        if (Decyzja.quest[16] == 0) {
                            green_fin1 = false;
                            green_leg1 = false;
                            green_oby1 = false;
                            green_rel1 = false;
                        } else if (Decyzja.quest[16] == 1) {
                            green_fin1 = true;
                            green_leg1 = true;
                            green_oby1 = false;
                            green_rel1 = false;
                        }
                        break;
                    case 17:
                        green_fin1 = true;
                        green_leg1 = false;
                        green_oby1 = true;
                        green_rel1 = false;
                        break;
                    case 18:
                        green_fin1 = true;
                        green_leg1 = false;
                        green_oby1 = true;
                        green_rel1 = false;
                        break;
                    case 19:
                        green_fin1 = false;
                        green_leg1 = false;
                        green_oby1 = false;
                        green_rel1 = true;
                        break;
                    case 20:
                        green_fin1 = false;
                        green_leg1 = true;
                        green_oby1 = true;
                        green_rel1 = false;
                        break;
                    case 21:
                        if (Decyzja.quest[21] == 0) {
                            green_fin1 = true;
                            green_leg1 = false;
                            green_oby1 = true;
                            green_rel1 = false;
                        } else if (Decyzja.quest[21] == 1) {
                            green_fin1 = true;
                            green_leg1 = false;
                            green_oby1 = true;
                            green_rel1 = true;
                        }
                        break;
                    case 22:
                        green_fin1 = false;
                        green_leg1 = false;
                        green_oby1 = false;
                        green_rel1 = true;
                        break;
                    case 23:
                        green_fin1 = true;
                        green_leg1 = false;
                        green_oby1 = true;
                        green_rel1 = false;
                        break;
                    case 24:
                        green_fin1 = false;
                        green_leg1 = true;
                        green_oby1 = true;
                        green_rel1 = false;
                        break;
                    case 25:
                        green_fin1 = true;
                        green_leg1 = true;
                        green_oby1 = true;
                        green_rel1 = true;
                        break;
                    case 26:
                        green_fin1 = true;
                        green_leg1 = false;
                        green_oby1 = true;
                        green_rel1 = false;
                        break;
                    case 27:
                        green_fin1 = true;
                        green_leg1 = true;
                        green_oby1 = false;
                        green_rel1 = false;
                        break;
                    case 28:
                        green_fin1 = false;
                        green_leg1 = true;
                        green_oby1 = true;
                        green_rel1 = false;
                        break;
                    case 29:
                        green_fin1 = true;
                        green_leg1 = true;
                        green_oby1 = true;
                        green_rel1 = true;
                        break;
                    case 30:
                        green_fin1 = true;
                        green_leg1 = false;
                        green_oby1 = false;
                        green_rel1 = false;
                        break;
                    case 31:
                        green_fin1 = false;
                        green_leg1 = false;
                        green_oby1 = true;
                        green_rel1 = false;
                        break;
                    case 32:
                        green_fin1 = false;
                        green_leg1 = true;
                        green_oby1 = true;
                        green_rel1 = false;
                        break;
                    case 33:
                        green_fin1 = true;
                        green_leg1 = false;
                        green_oby1 = true;
                        green_rel1 = false;
                        break;
                    case 34:
                        green_fin1 = true;
                        green_leg1 = true;
                        green_oby1 = true;
                        green_rel1 = false;
                        break;
                    case 35:
                        green_fin1 = false;
                        green_leg1 = false;
                        green_oby1 = false;
                        green_rel1 = false;
                        break;
                    case 36:
                        green_fin1 = false;
                        green_leg1 = true;
                        green_oby1 = true;
                        green_rel1 = false;
                        break;
                    case 37:
                        green_fin1 = true;
                        green_leg1 = true;
                        green_oby1 = true;
                        green_rel1 = true;
                        break;
                    case 38:
                        green_fin1 = true;
                        green_leg1 = false;
                        green_oby1 = true;
                        green_rel1 = true;
                        break;
                    case 39:
                        green_fin1 = false;
                        green_leg1 = true;
                        green_oby1 = false;
                        green_rel1 = true;
                        break;
                    case 40:
                        green_fin1 = true;
                        green_leg1 = false;
                        green_oby1 = false;
                        green_rel1 = false;
                        break;
                    case 41:
                        green_fin1 = true;
                        green_leg1 = false;
                        green_oby1 = true;
                        green_rel1 = false;
                        break;
                    case 42:
                        green_fin1 = false;
                        green_leg1 = false;
                        green_oby1 = true;
                        green_rel1 = true;
                        break;
                    case 43:
                        green_fin1 = true;
                        green_leg1 = false;
                        green_oby1 = true;
                        green_rel1 = false;
                        break;
                    case 44:
                        green_fin1 = false;
                        green_leg1 = false;
                        green_oby1 = false;
                        green_rel1 = false;
                        break;
                    case 45:
                        green_fin1 = true;
                        green_leg1 = false;
                        green_oby1 = false;
                        green_rel1 = false;
                        break;
                    case 46:
                        green_fin1 = false;
                        green_leg1 = true;
                        green_oby1 = false;
                        green_rel1 = true;
                        break;
                    case 47:
                        green_fin1 = false;
                        green_leg1 = true;
                        green_oby1 = true;
                        green_rel1 = true;
                        break;
                    case 48:
                        green_fin1 = false;
                        green_leg1 = false;
                        green_oby1 = true;
                        green_rel1 = false;
                        break;
                    case 49:
                        green_fin1 = false;
                        green_leg1 = true;
                        green_oby1 = false;
                        green_rel1 = true;
                        break;
                    case 50:
                        green_fin1 = true;
                        green_leg1 = false;
                        green_oby1 = true;
                        green_rel1 = true;
                        break;
                    case 51:
                        green_fin1 = true;
                        green_leg1 = false;
                        green_oby1 = true;
                        green_rel1 = true;
                        break;
                    case 52:
                        green_fin1 = true;
                        green_leg1 = false;
                        green_oby1 = true;
                        green_rel1 = true;
                        break;
                    case 53:
                        green_fin1 = false;
                        green_leg1 = true;
                        green_oby1 = false;
                        green_rel1 = true;
                        break;
                    case 54:
                        green_fin1 = true;
                        green_leg1 = false;
                        green_oby1 = true;
                        green_rel1 = false;
                        break;
                    case 55:
                        green_fin1 = true;
                        green_leg1 = true;
                        green_oby1 = false;
                        green_rel1 = false;
                        break;
                    case 56:
                        green_fin1 = false;
                        green_leg1 = false;
                        green_oby1 = true;
                        green_rel1 = true;
                        break;
                    case 57:
                        green_fin1 = true;
                        green_leg1 = true;
                        green_oby1 = true;
                        green_rel1 = false;
                        break;
                    case 58:
                        green_fin1 = true;
                        green_leg1 = false;
                        green_oby1 = true;
                        green_rel1 = false;
                        break;
                    case 59:
                        green_fin1 = true;
                        green_leg1 = false;
                        green_oby1 = true;
                        green_rel1 = false;
                        break;
                    case 60:
                        green_fin1 = false;
                        green_leg1 = false;
                        green_oby1 = false;
                        green_rel1 = false;
                        break;
                    case 61:
                        green_fin1 = false;
                        green_leg1 = true;
                        green_oby1 = false;
                        green_rel1 = false;
                        break;
                    case 100002:
                        green_fin1 = true;
                        green_leg1 = true;
                        green_oby1 = false;
                        green_rel1 = false;
                    case 100015:
                        green_fin1 = false;
                        green_leg1 = false;
                        green_oby1 = true;
                        green_rel1 = false;
                    case 110015:
                        green_fin1 = false;
                        green_leg1 = true;
                        green_oby1 = true;
                        green_rel1 = true;
                        break;
                    case 112015:
                        green_fin1 = true;
                        green_leg1 = true;
                        green_oby1 = true;
                        green_rel1 = true;
                        break;
                    case 120015:
                        green_fin1 = true;
                        green_leg1 = true;
                        green_oby1 = true;
                        green_rel1 = true;
                        break;
                    case 200017:
                        green_fin1 = true;
                        green_leg1 = false;
                        green_oby1 = true;
                        green_rel1 = false;
                        break;
                    case 200031:
                        green_fin1 = false;
                        green_leg1 = true;
                        green_oby1 = true;
                        green_rel1 = false;
                        break;

                }
            }
            else{
                green_fin1 = false;
                green_leg1 = false;
                green_oby1 = false;
                green_rel1 = false;
                green_fin2 = false;
                green_leg2 = false;
                green_oby2 = false;
                green_rel2 = false;
            }


            if (!opcja1_flipper) {
                opcja1_flipper = true;

            }
        }
        else {
            button1_najechany = false;
            opcja1_flipper = false;
            green_fin1 = false;
            green_leg1 = false;
            green_oby1 = false;
            green_rel1 = false;
        }
        if (x > 610 && x < 1030+5 && y > 680 && y < 756+30) {
            button2_najechany = true;
            //if (!game.naj2.isOpen()) {
            //    game.naj2.open(AudioSystem.getAudioInputStream(game.najechanie_audio));
                //game.naj.start();
            //}

            if(game.death==0) {
                switch (nr) {
                    case 0:
                        green_fin2 = true;
                        green_leg2 = true;
                        green_oby2 = true;
                        green_rel2 = false;
                        break;
                    case 1:
                        green_fin2 = true;
                        green_leg2 = false;
                        green_oby2 = true;
                        green_rel2 = true;
                        break;
                    case 2:
                        green_fin2 = true;
                        green_leg2 = true;
                        green_oby2 = false;
                        green_rel2 = false;
                        break;
                    case 3:
                        green_fin2 = true;
                        green_leg2 = false;
                        green_oby2 = true;
                        green_rel2 = false;
                        break;
                    case 4:
                        green_fin2 = false;
                        green_leg2 = false;
                        green_oby2 = false;
                        green_rel2 = false;
                        break;
                    case 5:
                        green_fin2 = false;
                        green_leg2 = true;
                        green_oby2 = true;
                        green_rel2 = true;
                        break;
                    case 6:
                        green_fin2 = false;
                        green_leg2 = false;
                        green_oby2 = true;
                        green_rel2 = false;
                        break;
                    case 7:
                        green_fin2 = true;
                        green_leg2 = true;
                        green_oby2 = false;
                        green_rel2 = false;
                        break;
                    case 8:
                        green_fin2 = true;
                        green_leg2 = false;
                        green_oby2 = true;
                        green_rel2 = true;
                        break;
                    case 9:
                        green_fin2 = false;
                        green_leg2 = true;
                        green_oby2 = true;
                        green_rel2 = false;
                        break;
                    case 10:
                        green_fin2 = false;
                        green_leg2 = false;
                        green_oby2 = true;
                        green_rel2 = false;
                        break;
                    case 11:
                        green_fin2 = false;
                        green_leg2 = false;
                        green_oby2 = false;
                        green_rel2 = false;
                        break;
                    case 12:
                        green_fin2 = false;
                        green_leg2 = true;
                        green_oby2 = true;
                        green_rel2 = false;
                        break;
                    case 13:
                        green_fin2 = false;
                        green_leg2 = true;
                        green_oby2 = false;
                        green_rel2 = true;
                        break;
                    case 14:
                        green_fin2 = true;
                        green_leg2 = false;
                        green_oby2 = true;
                        green_rel2 = false;
                        break;
                    case 15:
                        green_fin2 = false;
                        green_leg2 = true;
                        green_oby2 = true;
                        green_rel2 = true;
                        break;
                    case 16:
                        if (Decyzja.quest[16] == 0) {
                            green_fin2 = true;
                            green_leg2 = true;
                            green_oby2 = false;
                            green_rel2 = false;
                        } else if (Decyzja.quest[16] == 1) {
                            green_fin2 = false;
                            green_leg2 = true;
                            green_oby2 = false;
                            green_rel2 = false;
                        }
                        break;
                    case 17:
                        green_fin2 = true;
                        green_leg2 = false;
                        green_oby2 = true;
                        green_rel2 = false;
                        break;
                    case 18:
                        green_fin2 = false;
                        green_leg2 = false;
                        green_oby2 = true;
                        green_rel2 = true;
                        break;
                    case 19:
                        green_fin2 = true;
                        green_leg2 = true;
                        green_oby2 = true;
                        green_rel2 = true;
                        break;
                    case 20:
                        green_fin2 = false;
                        green_leg2 = true;
                        green_oby2 = true;
                        green_rel2 = false;
                        break;
                    case 21:
                        if (Decyzja.quest[21] == 0) {
                            green_fin2 = true;
                            green_leg2 = false;
                            green_oby2 = true;
                            green_rel2 = false;
                        } else if (Decyzja.quest[21] == 1) {
                            green_fin2 = true;
                            green_leg2 = false;
                            green_oby2 = true;
                            green_rel2 = true;
                        }
                        break;
                    case 22:
                        green_fin2 = false;
                        green_leg2 = false;
                        green_oby2 = true;
                        green_rel2 = false;
                        break;
                    case 23:
                        green_fin2 = true;
                        green_leg2 = false;
                        green_oby2 = true;
                        green_rel2 = false;
                        break;
                    case 24:
                        green_fin2 = false;
                        green_leg2 = true;
                        green_oby2 = true;
                        green_rel2 = false;
                        break;
                    case 25:
                        green_fin2 = true;
                        green_leg2 = false;
                        green_oby2 = true;
                        green_rel2 = false;
                        break;
                    case 26:
                        green_fin2 = true;
                        green_leg2 = false;
                        green_oby2 = true;
                        green_rel2 = false;
                        break;
                    case 27:
                        green_fin2 = true;
                        green_leg2 = true;
                        green_oby2 = false;
                        green_rel2 = false;
                        break;
                    case 28:
                        green_fin2 = false;
                        green_leg2 = true;
                        green_oby2 = true;
                        green_rel2 = false;
                        break;
                    case 29:
                        green_fin2 = true;
                        green_leg2 = true;
                        green_oby2 = true;
                        green_rel2 = true;
                        break;
                    case 30:
                        green_fin2 = true;
                        green_leg2 = false;
                        green_oby2 = true;
                        green_rel2 = false;
                        break;
                    case 31:
                        green_fin2 = false;
                        green_leg2 = true;
                        green_oby2 = true;
                        green_rel2 = false;
                        break;
                    case 32:
                        green_fin2 = false;
                        green_leg2 = true;
                        green_oby2 = true;
                        green_rel2 = false;
                        break;
                    case 33:
                        green_fin2 = true;
                        green_leg2 = false;
                        green_oby2 = true;
                        green_rel2 = false;
                        break;
                    case 34:
                        green_fin2 = true;
                        green_leg2 = true;
                        green_oby2 = true;
                        green_rel2 = false;
                        break;
                    case 35:
                        green_fin2 = false;
                        green_leg2 = false;
                        green_oby2 = true;
                        green_rel2 = false;
                        break;
                    case 36:
                        green_fin2 = false;
                        green_leg2 = true;
                        green_oby2 = true;
                        green_rel2 = false;
                        break;
                    case 37:
                        green_fin2 = true;
                        green_leg2 = false;
                        green_oby2 = false;
                        green_rel2 = false;
                        break;
                    case 38:
                        green_fin2 = true;
                        green_leg2 = false;
                        green_oby2 = false;
                        green_rel2 = true;
                        break;
                    case 39:
                        green_fin2 = false;
                        green_leg2 = true;
                        green_oby2 = false;
                        green_rel2 = true;
                        break;
                    case 40:
                        green_fin2 = false;
                        green_leg2 = false;
                        green_oby2 = true;
                        green_rel2 = false;
                        break;
                    case 41:
                        green_fin2 = true;
                        green_leg2 = false;
                        green_oby2 = true;
                        green_rel2 = false;
                        break;
                    case 42:
                        green_fin2 = false;
                        green_leg2 = false;
                        green_oby2 = true;
                        green_rel2 = true;
                        break;
                    case 43:
                        green_fin2 = true;
                        green_leg2 = false;
                        green_oby2 = true;
                        green_rel2 = false;
                        break;
                    case 44:
                        green_fin2 = false;
                        green_leg2 = false;
                        green_oby2 = true;
                        green_rel2 = false;
                        break;
                    case 45:
                        green_fin2 = false;
                        green_leg2 = false;
                        green_oby2 = false;
                        green_rel2 = false;
                        break;
                    case 46:
                        green_fin2 = false;
                        green_leg2 = true;
                        green_oby2 = false;
                        green_rel2 = true;
                        break;
                    case 47:
                        green_fin2 = false;
                        green_leg2 = true;
                        green_oby2 = true;
                        green_rel2 = true;
                        break;
                    case 48:
                        green_fin2 = false;
                        green_leg2 = false;
                        green_oby2 = true;
                        green_rel2 = false;
                        break;
                    case 49:
                        green_fin2 = false;
                        green_leg2 = true;
                        green_oby2 = false;
                        green_rel2 = true;
                        break;
                    case 50:
                        green_fin2 = true;
                        green_leg2 = false;
                        green_oby2 = false;
                        green_rel2 = true;
                        break;
                    case 51:
                        green_fin2 = true;
                        green_leg2 = false;
                        green_oby2 = true;
                        green_rel2 = true;
                        break;
                    case 52:
                        green_fin2 = true;
                        green_leg2 = false;
                        green_oby2 = true;
                        green_rel2 = true;
                        break;
                    case 53:
                        green_fin2 = false;
                        green_leg2 = true;
                        green_oby2 = false;
                        green_rel2 = true;
                        break;
                    case 54:
                        green_fin2 = true;
                        green_leg2 = false;
                        green_oby2 = true;
                        green_rel2 = false;
                        break;
                    case 55:
                        green_fin2 = true;
                        green_leg2 = true;
                        green_oby2 = true;
                        green_rel2 = false;
                        break;
                    case 56:
                        green_fin2 = false;
                        green_leg2 = false;
                        green_oby2 = true;
                        green_rel2 = true;
                        break;
                    case 57:
                        green_fin2 = true;
                        green_leg2 = true;
                        green_oby2 = true;
                        green_rel2 = false;
                        break;
                    case 58:
                        green_fin2 = true;
                        green_leg2 = false;
                        green_oby2 = false;
                        green_rel2 = false;
                        break;
                    case 59:
                        green_fin2 = false;
                        green_leg2 = false;
                        green_oby2 = false;
                        green_rel2 = false;
                        break;
                    case 60:
                        green_fin2 = false;
                        green_leg2 = false;
                        green_oby2 = true;
                        green_rel2 = false;
                        break;
                    case 61:
                        green_fin2 = false;
                        green_leg2 = false;
                        green_oby2 = false;
                        green_rel2 = false;
                        break;
                    case 100002:
                        green_fin2 = true;
                        green_leg2 = true;
                        green_oby2 = false;
                        green_rel2 = false;
                    case 110015:
                        green_fin2 = false;
                        green_leg2 = false;
                        green_oby2 = false;
                        green_rel2 = false;
                        break;
                    case 112015:
                        green_fin2 = false;
                        green_leg2 = true;
                        green_oby2 = true;
                        green_rel2 = true;
                        break;
                    case 120015:
                        green_fin2 = false;
                        green_leg2 = true;
                        green_oby2 = true;
                        green_rel2 = true;
                        break;
                    case 200017:
                        green_fin2 = true;
                        green_leg2 = false;
                        green_oby2 = true;
                        green_rel2 = false;
                        break;
                    case 200031:
                        green_fin2 = false;
                        green_leg2 = true;
                        green_oby2 = true;
                        green_rel2 = false;
                        break;
                }
            }
            else{
                green_fin1 = false;
                green_leg1 = false;
                green_oby1 = false;
                green_rel1 = false;
                green_fin2 = false;
                green_leg2 = false;
                green_oby2 = false;
                green_rel2 = false;
            }

            if (!opcja2_flipper) {
                opcja2_flipper = true;

            }
        }
        else {
            button2_najechany = false;
            opcja2_flipper = false;
            green_fin2 = false;
            green_leg2 = false;
            green_oby2 = false;
            green_rel2 = false;
        }


        if (x > 440 && x < 755 && y > 585 && y < 670) {
            opcje_najechany = true;
            //if (!game.naj3.isOpen()) {
            //    game.naj3.open(AudioSystem.getAudioInputStream(game.najechanie_audio));


                //game.naj.start();
            //}
            if (opcje_flipper == false) {
                opcje_flipper = true;

                //tutaj trzeba wstawić komendę grającą kamyczkowy dźwięk
            }
        } else {
            opcje_najechany = false;
            opcje_flipper = false;
        }

        repaint();
        /*if (opcja1_flipper == false) {
            game.naj.close();
        }
        if (button2_najechany == false) {
            game.naj2.close();
        }
        if (opcje_flipper == false) {
            game.naj3.close();
        }*/
    }
    public void mousetrack3() throws IOException, UnsupportedAudioFileException, LineUnavailableException {

        int x, y;
        x = game.window.getMousePosition().x;
        y = game.window.getMousePosition().y;
        if(x > 399 && x < 810 && y > 424 && y < 611){
            again_najechany = true;
            if(!game.naj2.isOpen()) {
                game.naj2.open(AudioSystem.getAudioInputStream(game.najechanie_audio));
            }
        }
        else{
            again_najechany = false;
        }
        if(x > 410 && x < 810 && y > 667 && y < 754){
            menu_najechany = true;
        }
        else{
            menu_najechany = false;
        }

        if(x > 240 && x < 347 && y > 50 && y < 103){
            return_najechany = true;
        }
        else{
            return_najechany = false;
        }
    }
    //public JLabel tekst = new JLabel();
    public JTextArea jTextArea = new JTextArea();
    public JTextArea[] JJ = new JTextArea[2];
    public JTextArea jlicznik = new JTextArea();
    public JTextArea licznik = new JTextArea();
    //public JLabel[] counts = new JLabel[4];
    ImageIcon[] icons = new ImageIcon[40];
    ImageIcon[] staty = new ImageIcon[4];
    ImageIcon kwadrat;
    ImageIcon zapis1_icon;
    ImageIcon zapis2_icon;
    ImageIcon zapis3_icon;
    ImageIcon wroc;
    ImageIcon nazwa;
    ImageIcon nazwa2;
    ImageIcon wczytaj;
    public int cezar_blink = 0;

    //Color[] cols = {Color.green, Color.yellow, Color.orange, Color.red};
    public MouseListener TextKlik = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("x " + e.getX() + "  y " + e.getY());
            if(mozna == true){
                opcja1 = true;
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
    };
    public MouseListener TextKlik1 = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("x1 " + e.getX() + "  y1 " + e.getY());
            if(mozna == true){
                opcja2 = true;
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
    };
    public Board(Game game) throws IOException, FontFormatException {
        this.setLayout(null);
        this.game = game;
        //opcja1 = false;
        //opcja2 = false;
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
        icons[6] = new ImageIcon("src/com/company/buttons/decision_button.png");
        icons[7] = new ImageIcon("src/com/company/buttons/decision_button.png");
        icons[8] = new ImageIcon("src/com/company/buttons/decision_button_null.png");
        icons[9] = new ImageIcon("src/com/company/buttons/decision_button_null.png");
        icons[11] = new ImageIcon("src/com/company/pixelpictures/oznaczenie_modyfikowanej_statystyki_religia.png");
        icons[12] = new ImageIcon("src/com/company/pixelpictures/oznaczenie_modyfikowanej_statystyki_autorytet.png");
        icons[13] = new ImageIcon("src/com/company/pixelpictures/oznaczenie_modyfikowanej_statystyki_armia.png");
        icons[14] = new ImageIcon("src/com/company/pixelpictures/oznaczenie_modyfikowanej_statystyki_finanse.png");
        icons[10] = new ImageIcon("src/com/company/pixelpictures/ramka.png");
        staty[0] = new ImageIcon("src/com/company/statystyki/coins_stats.png");
        staty[1] = new ImageIcon("src/com/company/statystyki/army_stats.png");
        staty[2] = new ImageIcon("src/com/company/statystyki/authority_stats.png");
        staty[3] = new ImageIcon("src/com/company/statystyki/religion_stats.png");
        icons[16] = new ImageIcon("src/com/company/death_screen/death_screen (10).png");
        icons[17] = new ImageIcon("src/com/company/death_screen/death_screen (9).png");
        icons[18] = new ImageIcon("src/com/company/death_screen/death_screen (8).png");
        icons[19] = new ImageIcon("src/com/company/death_screen/death_screen (7).png");
        icons[20] = new ImageIcon("src/com/company/death_screen/death_screen (6).png");
        icons[21] = new ImageIcon("src/com/company/death_screen/death_screen (5).png");
        icons[22] = new ImageIcon("src/com/company/death_screen/death_screen (4).png");
        icons[23] = new ImageIcon("src/com/company/death_screen/death_screen (3).png");
        icons[24] = new ImageIcon("src/com/company/death_screen/death_screen (2).png");
        icons[25] = new ImageIcon("src/com/company/death_screen/death_screen (1).png");
        icons[26] = new ImageIcon("src/com/company/buttons/again_button.png");
        icons[27] = new ImageIcon("src/com/company/buttons/menu_button.png");
        icons[28] = new ImageIcon("src/com/company/buttons/roman_button (4).png");
        ImageIcon kwadrat = new ImageIcon("src/com/company/pixelpictures/tlo_opcji.png");
        ImageIcon zapis1_icon = new ImageIcon("src/com/company/buttons/roman_button (5).png");
        ImageIcon zapis2_icon = new ImageIcon("src/com/company/buttons/roman_button (6).png");
        ImageIcon zapis3_icon = new ImageIcon("src/com/company/buttons/roman_button (7).png");
        ImageIcon wczytaj = new ImageIcon("src/com/company/buttons/roman_button (2).png");
        ImageIcon wroc = new ImageIcon("src/com/company/buttons/return_button2.png");
        ImageIcon DC = new ImageIcon("src/com/company/pixelpictures/tytuł.dc.png");
        ImageIcon DC2 = new ImageIcon("src/com/company/pixelpictures/pixil-frame-0 (20).png");

        this.kwadrat = kwadrat;
        this.wroc = wroc;
        this.wczytaj = wczytaj;
        this.zapis1_icon = zapis1_icon;
        this.zapis2_icon = zapis2_icon;
        this.zapis3_icon = zapis3_icon;
        nazwa = DC;
        nazwa2 = DC2;

        Font romanfont = Font.createFont(Font.TRUETYPE_FONT, new File("src/com/company/fonts/CyborgSister.ttf")).deriveFont(40f);
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("src/com/company/fonts/CyborgSister.ttf")));
        Font romanfont1 = Font.createFont(Font.TRUETYPE_FONT, new File("src/com/company/fonts/CyborgSister.ttf")).deriveFont(33f);
        GraphicsEnvironment ge1 = GraphicsEnvironment.getLocalGraphicsEnvironment();
        ge1.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("src/com/company/fonts/CyborgSister.ttf")));
        //JTextArea jTextArea;
        this.jTextArea = new JTextArea("");
        this.jTextArea.setVisible(true);
        this.jTextArea.setBounds(200, 480, 800, 170);
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

        this.jTextArea.setForeground(new Color(116, 14, 53));

        setSize(1200, 780);
        setBounds(0,0,1200, 780);
        add(this.jTextArea);
        this.jlicznik = new JTextArea("");
        this.jlicznik.setVisible(true);
        this.jlicznik.setBounds(20, 20, 140, 50);
        this.jlicznik.setBackground(new Color(104, 79, 26, 111));
        this.jlicznik.setOpaque(false);
        //jTextArea.setForeground(Color.red);
        this.jlicznik.setFont(romanfont);
        this.jlicznik.setLineWrap(true);
        this.jlicznik.setEditable(false);
        this.jlicznik.setHighlighter(null);
        this.jlicznik.setWrapStyleWord(true);
        //jTextArea.setText("ccaaaa");

        this.jlicznik.setFont(romanfont);
        //jTextArea.setForeground(Color.getHSBColor(500,850,200));

        //MOŻNA WYBRAĆ WŁASNY KOLOR..

        this.jlicznik.setForeground(new Color(51, 8, 88));
        add(this.jlicznik);
        //jTextArea.setForeground(Color.BLACK);

        //tekst.setBounds(300, 500, 600, 200);
        for(int i =0 ; i< 2; i++) {
            JJ[i] = new JTextArea();
            this.JJ[i] = new JTextArea("");
            if(i == 0){
                this.JJ[i].setBounds(200, 680, 370, 90);
                this.JJ[i].addMouseListener(TextKlik);
            }
            else {
                this.JJ[i].setBounds(650, 680, 370, 90);
                this.JJ[i].addMouseListener(TextKlik1);
            }
            this.JJ[i].setBackground(new Color(0, 0, 0, 1));
            this.JJ[i].setOpaque(false);
            //jTextArea.setForeground(Color.red);
            this.JJ[i].setFont(romanfont1);
            this.JJ[i].setLineWrap(true);
            this.JJ[i].setHighlighter(null);
            this.JJ[i].setEditable(false);
            this.JJ[i].setWrapStyleWord(true);
            //jTextArea.setText("ccaaaa");
            this.JJ[i].setFont(romanfont1);
            //jTextArea.setForeground(Color.getHSBColor(500,850,200));

            //MOŻNA WYBRAĆ WŁASNY KOLOR..
            this.JJ[i].setForeground(new Color(158, 139, 14));
            //this.JJ[i].setForeground(new Color(111, 97, 9));
            //this.JJ[i].addMouseListener(this);
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
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //System.out.println(getWidth());
        //System.out.println(getHeight());
        /*g.drawImage(icons[0].getImage(),0,0, 1200,780, null);
        g.drawImage(icons[1].getImage(),300,200, 200,200, null);
        g.drawImage(icons[2].getImage(),50,500, 1100,300, null);
        g.drawImage(icons[3].getImage(),50,300, 200,200, null);*/
        //g.drawImage(icons[0].getImage(),0,0, 1200,780, null);
        g.drawImage(icons[0].getImage(), 0, 0, 1200, 780, null);
        if (cezar_blink == 0) {
            g.drawImage(icons[1].getImage(), 465, 200, 685, 510, 0, 0, 700, 1075, null);
        } else if (cezar_blink == 1) {
            g.drawImage(icons[1].getImage(), 465 - 3, 200, 685 + 5, 510, 675, 0, 1400, 1075, null);
        } else if (cezar_blink == 2) {
            g.drawImage(icons[1].getImage(), 480 - 16, 200 - 1, 700 + 4, 510 - 2, 1340, 0, 2100, 1075, null);
        }
        if (ustawienia_boll == false) {
            g.drawImage(icons[10].getImage(), 217, 25, 750, 150, null);
            // g.drawImage(icons[2].getImage(), 30, 270, 350, 300, null);
            // g.drawImage(icons[3].getImage(),1200, 250, -280, 300, null);
            g.drawImage(icons[4].getImage(), 25, 130, 1150, 920, null);
            g.drawImage(icons[5].getImage(), 1120, 20, 60, 60, null);
            if (Decyzja.death_screen != 0 && ustawienia_boll == false) {
                this.jTextArea.setVisible(false);
                this.JJ[0].setVisible(false);
                this.JJ[1].setVisible(false);

            } else {
                this.jTextArea.setVisible(true);
                this.JJ[0].setVisible(true);
                this.JJ[1].setVisible(true);
            }

            //g.drawImage(icons[6].getImage(),100, 630, 500, 150, null);
            if (mozna) {
                if (button1_najechany == false) {
                    g.drawImage(icons[6].getImage(), 150, 650, 600 - 10, 770, 0, 0, 814, 230 - 3, null);
                } else {
                    g.drawImage(icons[6].getImage(), 150, 650, 600 - 10, 770, 0, 230, 814, 460, null);
                    if (green_fin1) {
                        g.drawImage(icons[14].getImage(), 41, -35, 610, 610, null);
                    }
                    if (green_leg1) {
                        g.drawImage(icons[13].getImage(), 228, -40, 630, 630, null);
                    }
                    if (green_oby1) {
                        g.drawImage(icons[12].getImage(), 424, -40, 630, 630, null);
                    }
                    if (green_rel1) {
                        g.drawImage(icons[11].getImage(), 618, -40, 630, 630, null);
                    }
                }
                if (!button2_najechany) {
                    g.drawImage(icons[7].getImage(), 600, 650, 1050 - 10, 770, 0, 0, 814, 230 - 3, null);
                } else {
                    g.drawImage(icons[7].getImage(), 600, 650, 1050 - 10, 770, 0, 230, 814, 460, null);
                    if (green_fin2) {
                        g.drawImage(icons[14].getImage(), 41, -35, 610, 610, null);
                    }
                    if (green_leg2) {
                        g.drawImage(icons[13].getImage(), 228, -40, 630, 630, null);
                    }
                    if (green_oby2) {
                        g.drawImage(icons[12].getImage(), 424, -40, 630, 630, null);
                    }
                    if (green_rel2) {
                        g.drawImage(icons[11].getImage(), 618, -40, 630, 630, null);
                    }
                }
            } else {
                //g.drawImage(icons[8].getImage(), 150, 650, 440, 120, null);
                //g.drawImage(icons[9].getImage(), 600, 650, 440, 120,null);
            }


            if (Decyzja.death_screen == 1) {
                g.drawImage(icons[16].getImage(), 0, 0, 1200, 780, null);
            } else if (Decyzja.death_screen == 2) {
                g.drawImage(icons[17].getImage(), 0, 0, 1200, 780, null);
            } else if (Decyzja.death_screen == 3) {
                g.drawImage(icons[18].getImage(), 0, 0, 1200, 780, null);
            } else if (Decyzja.death_screen == 4) {
                g.drawImage(icons[19].getImage(), 0, 0, 1200, 780, null);
            } else if (Decyzja.death_screen == 5) {
                g.drawImage(icons[20].getImage(), 0, 0, 1200, 780, null);
            } else if (Decyzja.death_screen == 6) {
                g.drawImage(icons[21].getImage(), 0, 0, 1200, 780, null);
            } else if (Decyzja.death_screen == 7) {
                g.drawImage(icons[22].getImage(), 0, 0, 1200, 780, null);
            } else if (Decyzja.death_screen == 8) {
                g.drawImage(icons[23].getImage(), 0, 0, 1200, 780, null);
            } else if (Decyzja.death_screen == 9) {
                g.drawImage(icons[24].getImage(), 0, 0, 1200, 780, null);
            } else if (Decyzja.death_screen == 10) {
                g.drawImage(icons[25].getImage(), 0, 0, 1200, 780, null);
                if (again_najechany == false) {
                    g.drawImage(icons[26].getImage(), 175, 400, 1019, 605, 0, 350, 1400, 670, null);
                } else {
                    g.drawImage(icons[26].getImage(), 180, 395, 1024, 606, 0, 0, 1400, 330, null);
                }
                if (menu_najechany == false) {
                    g.drawImage(icons[27].getImage(), 337, 600, 867, 750, 0, 0, 1400, 350, null);
                } else {
                    g.drawImage(icons[27].getImage(), 337, 631, 867, 769, 0, 350, 1400, 670, null);
                }
            }


            ///////////////////////////////////////////////////////////////////////////////////////////////////////////


//Decyzja.religia = 0;
            if (Decyzja.death_screen == 0) {
                if (Decyzja.religia >= 100) {
                    g.drawImage(staty[3].getImage(), 602 + 200, 11, 746 + 200, 163, 0, 0, 200, 210, null);
                } else if (Decyzja.religia == 95) {
                    g.drawImage(staty[3].getImage(), 602 + 200, 11, 746 + 200, 163, 0, 0, 200, 210, null);
                } else if (Decyzja.religia == 90) {
                    g.drawImage(staty[3].getImage(), 603 + 220, 11, 745 + 200, 163, 200, 0, 370, 210, null);
                } else if (Decyzja.religia == 85) {
                    g.drawImage(staty[3].getImage(), 602 + 220, 11, 745 + 200, 163, 370, 0, 540, 210, null);
                } else if (Decyzja.religia == 80) {
                    g.drawImage(staty[3].getImage(), 616 + 205, 11, 742 + 206, 163, 540, 0, 715, 210, null);
                } else if (Decyzja.religia == 75) {
                    g.drawImage(staty[3].getImage(), 625 + 200, 11, 743 + 200, 163, 715, 0, 880, 210, null);
                } else if (Decyzja.religia == 70) {
                    g.drawImage(staty[3].getImage(), 603 + 200, 39, 746 + 200, 162, 0, 210, 200, 380, null);
                } else if (Decyzja.religia == 65) {
                    g.drawImage(staty[3].getImage(), 602 + 222, 39, 745 + 200, 161, 200, 210, 370, 380, null);
                } else if (Decyzja.religia == 60) {
                    g.drawImage(staty[3].getImage(), 623 + 200, 39, 744 + 200, 161, 370, 210, 540, 380, null);
                } else if (Decyzja.religia == 55) {
                    g.drawImage(staty[3].getImage(), 622 + 200, 39, 744 + 200, 161, 540, 210, 710, 380, null);
                } else if (Decyzja.religia == 50) {
                    g.drawImage(staty[3].getImage(), 622 + 200, 39, 743 + 200, 161, 710, 210, 880, 380, null);
                } else if (Decyzja.religia == 45) {
                    g.drawImage(staty[3].getImage(), 603 + 200, 38, 746 + 200, 161, 0, 380, 200, 550, null);
                } else if (Decyzja.religia == 40) {
                    g.drawImage(staty[3].getImage(), 624 + 200, 38, 745 + 200, 161, 200, 380, 370, 550, null);
                } else if (Decyzja.religia == 35) {
                    g.drawImage(staty[3].getImage(), 623 + 200, 38, 744 + 200, 161, 370, 380, 540, 550, null);
                } else if (Decyzja.religia == 30) {
                    g.drawImage(staty[3].getImage(), 622 + 200, 38, 744 + 200, 161, 540, 380, 710, 550, null);
                } else if (Decyzja.religia == 25) {
                    g.drawImage(staty[3].getImage(), 621 + 200, 38, 743 + 200, 161, 710, 380, 880, 550, null);
                } else if (Decyzja.religia == 20) {
                    g.drawImage(staty[3].getImage(), 603 + 200, 38, 746 + 200, 160, 0, 550, 200, 720, null);
                } else if (Decyzja.religia == 15) {
                    g.drawImage(staty[3].getImage(), 623 + 200, 38, 745 + 200, 160, 200, 550, 370, 720, null);
                } else if (Decyzja.religia == 10) {
                    g.drawImage(staty[3].getImage(), 623 + 200, 38, 744 + 200, 160, 370, 550, 540, 720, null);
                } else if (Decyzja.religia == 5) {
                    g.drawImage(staty[3].getImage(), 622 + 200, 38, 744 + 200, 160, 540, 550, 710, 720, null);
                } else if (Decyzja.religia <= 0) {
                    g.drawImage(staty[3].getImage(), 622 + 200, 38, 743 + 200, 160, 710, 550, 880, 720, null);
                }


//Decyzja.obywatele = 0;
                if (Decyzja.obywatele >= 100) {
                    g.drawImage(staty[2].getImage(), 350 + 230, -25, 520 + 232, 160, 0, 0, 240, 255, null);
                } else if (Decyzja.obywatele == 95) {
                    g.drawImage(staty[2].getImage(), 350 + 230, -25, 520 + 232, 160, 0, 0, 240, 255, null);
                } else if (Decyzja.obywatele == 90) {
                    g.drawImage(staty[2].getImage(), 398 + 232, -25, 520 + 230, 159, 240, 0, 410, 255, null);
                } else if (Decyzja.obywatele == 85) {
                    g.drawImage(staty[2].getImage(), 397 + 232, -25, 519 + 231, 159, 410, 0, 580, 255, null);
                } else if (Decyzja.obywatele == 80) {
                    g.drawImage(staty[2].getImage(), 396 + 232, -25, 518 + 231, 159, 580, 0, 750, 255, null);
                } else if (Decyzja.obywatele == 75) {
                    g.drawImage(staty[2].getImage(), 395 + 233, -25, 517 + 232, 159, 750, 0, 920, 255, null);
                } else if (Decyzja.obywatele == 70) {
                    g.drawImage(staty[2].getImage(), 350 + 231, 39, 519 + 233, 162, 0, 260, 240, 430, null);
                } else if (Decyzja.obywatele == 65) {
                    g.drawImage(staty[2].getImage(), 395 + 235, 39, 519 + 232, 162, 240, 260, 410, 430, null);
                } else if (Decyzja.obywatele == 60) {
                    g.drawImage(staty[2].getImage(), 394 + 235, 39, 518 + 232, 162, 410, 260, 580, 430, null);
                } else if (Decyzja.obywatele == 55) {
                    g.drawImage(staty[2].getImage(), 394 + 234, 39, 518 + 232, 162, 580, 260, 750, 430, null);
                } else if (Decyzja.obywatele == 50) {
                    g.drawImage(staty[2].getImage(), 394 + 233, 39, 518 + 231, 162, 750, 260, 920, 430, null);
                } else if (Decyzja.obywatele == 45) {
                    g.drawImage(staty[2].getImage(), 347 + 233, 39, 512 + 240, 162, 0, 430, 240, 600, null);
                } else if (Decyzja.obywatele == 40) {
                    g.drawImage(staty[2].getImage(), 387 + 243, 39, 511 + 240, 162, 240, 430, 410, 600, null);
                } else if (Decyzja.obywatele == 35) {
                    g.drawImage(staty[2].getImage(), 386 + 243, 39, 510 + 240, 162, 410, 430, 580, 600, null);
                } else if (Decyzja.obywatele == 30) {
                    g.drawImage(staty[2].getImage(), 385 + 243, 39, 510 + 240, 162, 580, 430, 750, 600, null);
                } else if (Decyzja.obywatele == 25) {
                    g.drawImage(staty[2].getImage(), 385 + 243, 39, 509 + 240, 162, 750, 430, 920, 600, null);
                } else if (Decyzja.obywatele == 20) {
                    g.drawImage(staty[2].getImage(), 351 + 230, 38, 509 + 242, 168, 0, 600, 240, 780, null);
                } else if (Decyzja.obywatele == 15) {
                    g.drawImage(staty[2].getImage(), 349 + 281, 38, 509 + 242, 168, 240, 600, 410, 780, null);
                } else if (Decyzja.obywatele == 10) {
                    g.drawImage(staty[2].getImage(), 349 + 280, 38, 509 + 241, 168, 410, 600, 580, 780, null);
                } else if (Decyzja.obywatele == 5) {
                    g.drawImage(staty[2].getImage(), 348 + 280, 38, 509 + 241, 168, 580, 600, 750, 780, null);
                } else if (Decyzja.obywatele <= 0) {
                    g.drawImage(staty[2].getImage(), 348 + 280, 38, 509 + 241, 168, 750, 600, 920, 780, null);
                }


//Decyzja.legiony = 5;
                if (Decyzja.legiony >= 100) {
                    g.drawImage(staty[1].getImage(), 180 + 230, 32, 321 + 231, 162, 0, 0, 200, 180, null);
                } else if (Decyzja.legiony == 95) {
                    g.drawImage(staty[1].getImage(), 180 + 230, 32, 321 + 231, 162, 0, 0, 200, 180, null);
                } else if (Decyzja.legiony == 90) {
                    g.drawImage(staty[1].getImage(), 175 + 260, 32, 321 + 231, 162, 207, 0, 370, 180, null);
                } else if (Decyzja.legiony == 85) {
                    g.drawImage(staty[1].getImage(), 173 + 260, 32, 321 + 232, 162, 374, 0, 544, 180, null);
                } else if (Decyzja.legiony == 80) {
                    g.drawImage(staty[1].getImage(), 172 + 260, 32, 321 + 232, 162, 544, 0, 714, 180, null);
                } else if (Decyzja.legiony == 75) {
                    g.drawImage(staty[1].getImage(), 171 + 260, 32, 321 + 232, 162, 714, 0, 884, 180, null);
                } else if (Decyzja.legiony == 70) {
                    g.drawImage(staty[1].getImage(), 170 + 240, 38, 321 + 232, 160, 0, 180, 200, 350, null);
                } else if (Decyzja.legiony == 65) {
                    g.drawImage(staty[1].getImage(), 175 + 260, 38, 321 + 231, 160, 206, 180, 370, 350, null);
                } else if (Decyzja.legiony == 60) {
                    g.drawImage(staty[1].getImage(), 170 + 263, 38, 321 + 231, 160, 375, 180, 540, 350, null);
                } else if (Decyzja.legiony == 55) {
                    g.drawImage(staty[1].getImage(), 170 + 262, 38, 321 + 233, 160, 545, 180, 715, 350, null);
                } else if (Decyzja.legiony == 50) {
                    g.drawImage(staty[1].getImage(), 170 + 262, 38, 321 + 231, 160, 715, 180, 884, 350, null);
                } else if (Decyzja.legiony == 45) {
                    g.drawImage(staty[1].getImage(), 170 + 240, 38, 321 + 235, 160, 0, 350, 205, 520, null);
                } else if (Decyzja.legiony == 40) {
                    g.drawImage(staty[1].getImage(), 170 + 264, 38, 322 + 230, 160, 205, 350, 370, 520, null);
                } else if (Decyzja.legiony == 35) {
                    g.drawImage(staty[1].getImage(), 170 + 260, 38, 322 + 230, 160, 370, 350, 540, 520, null);
                } else if (Decyzja.legiony == 30) {
                    g.drawImage(staty[1].getImage(), 169 + 260+3, 38, 322 + 230+3, 160, 543, 350, 713, 520, null);
                } else if (Decyzja.legiony == 25) {
                    g.drawImage(staty[1].getImage(), 169 + 260+3, 38, 322 + 230+3, 160, 715, 350, 883, 520, null);
                } else if (Decyzja.legiony == 20) {
                    g.drawImage(staty[1].getImage(), 169+3 + 241, 37, 322 + 234+3, 159, 3, 520, 208, 690, null);
                } else if (Decyzja.legiony == 15) {
                    g.drawImage(staty[1].getImage(), 169 + 268, 37, 326 + 229, 159, 208, 520, 373, 690, null);
                } else if (Decyzja.legiony == 10) {
                    g.drawImage(staty[1].getImage(), 165 + 268, 37, 326 + 229, 159, 373, 520, 543, 690, null);
                } else if (Decyzja.legiony == 5) {
                    g.drawImage(staty[1].getImage(), 167 + 263, 37, 326 + 229, 159, 543, 520, 713, 690, null);
                } else if (Decyzja.legiony <= 0) {
                    g.drawImage(staty[1].getImage(), 166 + 267, 37, 326 + 227, 159, 716, 520, 885, 690, null);
                }


//Decyzja.finanse=0;
                if (Decyzja.finanse >= 100) {
                    g.drawImage(staty[0].getImage(), 230 + 3, 30 + 5, 158 + 200 - 3, 160 - 3, 0, 0, 400, 400, null);
                } else if (Decyzja.finanse == 95) {
                    g.drawImage(staty[0].getImage(), 230 + 3, 30 + 5, 158 + 200 - 3, 160 - 3, 0, 0, 400, 400, null);
                } else if (Decyzja.finanse == 90) {
                    g.drawImage(staty[0].getImage(), 230 + 6, 30 + 5, 155 + 203, 160 - 3, 400, 0, 800, 400, null);
                } else if (Decyzja.finanse == 85) {
                    g.drawImage(staty[0].getImage(), 230 + 9, 30 + 5, 155 + 206, 160 - 3, 800, 0, 1200, 400, null);
                } else if (Decyzja.finanse == 80) {
                    g.drawImage(staty[0].getImage(), 233 + 9, 30 + 5, 150 + 211, 160 - 3, 1200, 0, 1590, 400, null);
                } else if (Decyzja.finanse == 75) {
                    g.drawImage(staty[0].getImage(), 232 + 10, 30 + 5, 150 + 214, 160 - 3, 1590, 0, 1990, 400, null);
                } else if (Decyzja.finanse == 70) {
                    g.drawImage(staty[0].getImage(), 223 + 10, 30 + 8, 140 + 215, 160, 0, 400, 400, 800, null);
                } else if (Decyzja.finanse == 65) {
                    g.drawImage(staty[0].getImage(), 223 + 13, 30 + 8, 140 + 218, 160, 400, 400, 800, 800, null);
                } else if (Decyzja.finanse == 60) {
                    g.drawImage(staty[0].getImage(), 226 + 13, 30 + 8, 143 + 218, 160, 800, 400, 1200, 800, null);
                } else if (Decyzja.finanse == 55) {
                    g.drawImage(staty[0].getImage(), 229 + 13, 30 + 8, 143 + 218, 160, 1200, 400, 1590, 800, null);
                } else if (Decyzja.finanse == 50) {
                    g.drawImage(staty[0].getImage(), 229 + 11, 30 + 8, 143 + 224, 160, 1585, 400, 2000, 800, null);
                } else if (Decyzja.finanse == 45) {
                    g.drawImage(staty[0].getImage(), 224 + 9, 30 + 11, 143 + 212, 163, 0, 800, 400, 1200, null);
                } else if (Decyzja.finanse == 40) {
                    g.drawImage(staty[0].getImage(), 227 + 9, 30 + 11, 143 + 215, 163, 400, 800, 800, 1200, null);
                } else if (Decyzja.finanse == 35) {
                    g.drawImage(staty[0].getImage(), 229 + 10, 30 + 11, 146 + 215, 163, 800, 800, 1200, 1200, null);
                } else if (Decyzja.finanse == 30) {
                    g.drawImage(staty[0].getImage(), 229 + 13, 30 + 11, 146 + 215, 163, 1200, 800, 1590, 1200, null);
                } else if (Decyzja.finanse == 25) {
                    g.drawImage(staty[0].getImage(), 229 + 13, 30 + 11, 148 + 219, 163, 1590, 800, 2000, 1200, null);
                } else if (Decyzja.finanse == 20) {
                    g.drawImage(staty[0].getImage(), 219 + 14, 30 + 14, 138 + 217, 166, 0, 1200, 400, 1600, null);
                } else if (Decyzja.finanse == 15) {
                    g.drawImage(staty[0].getImage(), 222 + 14, 30 + 14, 141 + 217, 166, 400, 1200, 800, 1600, null);
                } else if (Decyzja.finanse == 10) {
                    g.drawImage(staty[0].getImage(), 225 + 14, 30 + 14, 144 + 217, 166, 800, 1200, 1200, 1600, null);
                } else if (Decyzja.finanse == 5) {
                    g.drawImage(staty[0].getImage(), 228 + 14, 30 + 14, 144 + 217, 166, 1200, 1200, 1590, 1600, null);
                } else if (Decyzja.finanse <= 0) {
                    g.drawImage(staty[0].getImage(), 227 + 15, 30 + 14, 150 + 217, 166, 1590, 1200, 2000, 1600, null);
                }
            }
            //g.drawImage(icons[7].getImage(),600, 630, 500, 150, null);
////
        } else {
            g.drawImage(kwadrat.getImage(), 210, 0, 780, 780, null);

            if (dc == false) {
                g.drawImage(nazwa.getImage(), 350, 20, 500, 300, null);
            } else {
                g.drawImage(nazwa2.getImage(), 350, 20, 500, 300, null);
            }
            if (nowa_gra_najechany == true) {
                g.drawImage(icons[28].getImage(), 425-8, 347, 765-8, 442, 0, 0, 1416, 329, null);
            } else {
                g.drawImage(icons[28].getImage(), 427-10, 345+8, 767-10, 442+8, 0, 336, 1416, 672, null);
            }
            if (wczytaj_najechany == false) {
                //g.drawImage(icons[28].getImage(), 425, 457, 765, 552, 0, 0, 1416, 327, null);
                g.drawImage(wczytaj.getImage(), 425, 457, 765, 552, 0, 0, 1416, 327, null);
                //g.drawImage(zapis2_icon.getImage(), 425, 457, 765, 552, 0, 0, 1416, 327, null);
            } else {
                g.drawImage(wczytaj.getImage(), 426, 461, 766, 561, 0, 330, 1416, 672, null);
                //g.drawImage(icons[28].getImage(), 426, 461+1, 766, 561+1, 0, 330, 1416, 672, null);
                //g.drawImage(zapis2_icon.getImage(), 426, 461+1, 766, 561+1, 0, 330, 1416, 672, null);


            }
            /*if (wyjscie_najechany == true) {
                g.drawImage(zapis3_icon.getImage(), 425-3, 570+2, 765-3, 670+2, 0, 330, 1416, 672, null);
            } else {
                g.drawImage(zapis3_icon.getImage(), 424, 568, 764, 663, 0, 0, 1416, 325, null);
            }*/
            if (menu_najechany == false) {
                g.drawImage(icons[27].getImage(), 137, 600, 867, 750, 0, 0, 1400, 350, null);
            } else {
                g.drawImage(icons[27].getImage(), 337, 631, 867, 769, 0, 350, 1400, 670, null);
            }
            if(return_najechany == false) {
                g.drawImage(wroc.getImage(), 160, 20, 400, 80, 0, 0, 1400, 340, null);
            }
            else{
                g.drawImage(wroc.getImage(), 160, 22, 400, 77, 0, 350, 1400, 670, null);
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("x " + e.getX() + "  y " + e.getY());
        /*if (game.zapis_boll == true) {
            if (e.getX() > 425 && e.getY() > 347 && e.getX() < 765 && e.getY() < 442) {
                game.menu = false;
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
        }*/
        if(Decyzja.death_screen == 0){
            if(ustawienia_boll == false) {
                if (e.getX() > 160 && e.getX() < 580 && e.getY() > 656 && e.getY() < 756) {
                    if (mozna == true) {
                        opcja1 = true;
                    }
                }
                if (e.getX() > 610 && e.getX() < 1030 && e.getY() > 656 && e.getY() < 756) {
                    if (mozna == true) {
                        opcja2 = true;
                    }
                }
            }
            if(ustawienia_boll == true){
                int x, y;
                x = game.window.getMousePosition().x;
                y = game.window.getMousePosition().y;
                if(x > 410 && x < 810 && y > 667 && y < 754){
                    game.zapis_boll = false;
                    game.odczyt_boll = false;
                    game.wizualizacja = false;
                    ustawienia_boll = false;
                    game.menu = true;
                    Decyzja.death_screen = 0;
                    int[] jj = new int[40];
                    int[] q = new int[50];
                    for(int i = 0; i < 40; i++){
                        jj[i] = 0;
                    }
                    for(int i = 0; i < 50; i++){
                        q[i] = 0;
                    }
                    game.zapisywanie = true;
                }

                if (e.getX() > 235 && e.getX() < 342 && e.getY() > 20 && e.getY() < 75) {
                    //game.menu = true;
                    ustawienia_boll = false;
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

            if(e.getX() > 1125 && e.getX() < 1180 && e.getY() > 20 && e.getY() < 75 && game.death == 0){
                ustawienia_boll = true;
            }
        }
        if(Decyzja.death_screen == 10){
            int x, y;
            x = game.window.getMousePosition().x;
            y = game.window.getMousePosition().y;
            if(x > 399 && x < 810 && y > 424 && y < 611){
                game.zapis_boll = false;
                game.odczyt_boll = false;
                game.wizualizacja = true;
                ustawienia_boll = false;
                game.menu = false;
                game.grane = true;
                game.grane2 = true;
                Decyzja.death_screen = 0;
                int[] jj = new int[40];
                int[] q = new int[50];
                for(int i = 0; i < 40; i++){
                    jj[i] = 0;
                }
                for(int i = 0; i < 50; i++){
                    q[i] = 0;
                }
                try {
                    game.Zapis(game.aktualny_zapis,1, jj,50,50,50,50, q,0,0,0,-1,0);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                game.odczytywanie = true;
                //game.Odczyt(game.aktualny_zapis, );
            }
            if(x > 410 && x < 810 && y > 667 && y < 754){
                game.zapis_boll = false;
                game.odczyt_boll = false;
                game.wizualizacja = false;
                ustawienia_boll = false;
                game.menu = true;
                Decyzja.death_screen = 0;
                int[] jj = new int[40];
                int[] q = new int[50];
                for(int i = 0; i < 40; i++){
                    jj[i] = 0;
                }
                for(int i = 0; i < 50; i++){
                    q[i] = 0;
                }
                try {
                    game.Zapis(game.aktualny_zapis,1, jj,50,50,50,50, q,0,0,0,-1,0);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        }
        /*if (e.getX() > 170 && e.getX() < 370 && e.getY() > 260 && e.getY() < 530) {

            try {
                //game.klik.open(AudioSystem.getAudioInputStream(game.klikniecie_audio));
                //game.volume2 = (FloatControl) game.klik.getControl(FloatControl.Type.MASTER_GAIN);
                //game.volume2.setValue(-25f);
                game.klik.loop(1);
                //game.klik.start();
                try {
                    Thread.sleep(600);
                } catch (InterruptedException en) {
                    //e.printStackTrace();
                }
                game.klik.stop();
            } catch (IllegalArgumentException exception){
            }
            repaint();
        }
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

