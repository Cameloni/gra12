package com.company;

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.Scanner;
import java.io.File;

public class Game {
    public boolean menu;
    public boolean wizualizacja;
    public boolean zapis_boll;
    public boolean odczyt_boll;
    public boolean opcje_boll;
    public JFrame window;
    public boolean wypisywanie;
    public static int aktualny_zapis = 0;
    public boolean nowy_zapis = false;
    public int death = 0;
    public FloatControl fc;
    public static boolean grane = true;
    public static boolean grane2 = true;
    public static boolean grane3 = true;
    public static boolean zapisywanie = false;
    public static boolean odczytywanie = false;
    File plik11 = new File("src/com/company/Pliki/postep");
    Scanner innn = new Scanner(plik11);
    public int fabuła61 = innn.nextInt();


    File muzyka = new File("src/com/company/audio/gra_java_soundtrack(wav).wav");
    File najechanie_audio = new File("src/com/company/audio/przycisk_najechany_audio.wav");
    File klikniecie_audio = new File("src/com/company/audio/przycisk_kliknięty_audio.wav");
    File pergamin_audio = new File("src/com/company/audio/pisanienapergaminie_audio.wav");
    public Clip naj = AudioSystem.getClip();
    public Clip naj2 = AudioSystem.getClip();
    public Clip naj3 = AudioSystem.getClip();

    public FloatControl volume1;
    public FloatControl volume_naj2;
    public FloatControl volume_naj3;
    public FloatControl volume2;
    public Clip per = AudioSystem.getClip();
    public Clip klik = AudioSystem.getClip();

   // Menu menu = new Menu();
    //public String tekst;
    //public int coins;
    //int[] lines = new int[4];
    //double[] price = new double[4];
   public static void Zapis(int x, int tura, int[] juz, int fin, int leg, int oby, int rel,  int[] que, int kon, int q16, int q21, int nr, int aktual) throws IOException {
       FileWriter za = new FileWriter("src/com/company/Pliki/Zapis_gry_"+ x);
       aktualny_zapis = x;
       PrintWriter out = new PrintWriter(za);
       out.println(tura);
       for(int i = 0; i < 40; i++){
           out.println(juz[i]);
       }
       out.println(fin);
       out.println(leg);
       out.println(oby);
       out.println(rel);
       for(int i = 0; i < 62; i++){
           out.println(que[i]);
       }
       out.println(kon);
       out.println(q16);
       out.println(q21);
       out.println(nr);
       out.println(aktual);
       out.close();
   }

    public static void Odczyt(int x, Decyzja W) throws FileNotFoundException {
        File plik = new File("src/com/company/Pliki/Zapis_gry_" + x);
        Scanner in = new Scanner(plik);
        W.setTura(in.nextInt());
        in.nextLine();
        for(int i = 0; i < 40; i++){
            W.setJuzjest(in.nextInt(), i);
        }
        /*int s1, s2, s3, s4;
        s1 = in.nextInt();
        s2 = in.nextInt();
        s3 = in.nextInt();
        s4 = in.nextInt();*/
        W.setFinanse(in.nextInt());
        W.setLegiony(in.nextInt());
        W.setObywatele(in.nextInt());
        W.setReligia(in.nextInt());
        for(int i = 0; i < 50; i++){
            W.setQuest(i,in.nextInt());
        }
        W.setKontynuacja(in.nextInt());
        W.qq16 = in.nextInt();
        W.qq21 = in.nextInt();
        W.setNr(in.nextInt());
        W.aktualny_numer = (in.nextInt());

        //W.setStats(s1, s2, s3,s4);
    }


    public Game() throws IOException, FontFormatException, InterruptedException, LineUnavailableException, UnsupportedAudioFileException {
        //coins = 1;
        window = new JFrame("Deus Consilium");
        window.setIconImage(new ImageIcon("src/com/company/unused/PNG/background/45.png").getImage());
        per.open(AudioSystem.getAudioInputStream(pergamin_audio));
        naj.open(AudioSystem.getAudioInputStream(najechanie_audio));
        naj2.open(AudioSystem.getAudioInputStream(najechanie_audio));
        naj3.open(AudioSystem.getAudioInputStream(najechanie_audio));
        Board board = new Board(this);
        Decyzja wybor = new Decyzja(-1, board, this);
        Menu menu2 = new Menu(this, wybor, board);
        Zapis_panel zapis_panel = new Zapis_panel(this, wybor);

        //Decyzja wybor = new Decyzja(nr);
        //this.tekst = "ctccoś";
        menu2.setPreferredSize(new Dimension(1200, 780));
        window.add(board);
        window.add(menu2);
        window.getContentPane().getComponent(0).setVisible(false);
        window.getContentPane().getComponent(1).setVisible(true);
        //window.getContentPane().getComponent(2).setVisible(false);
        window.setSize(1200,780);
        window.pack();
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        wypisywanie = true;
        this.menu = true;
        //this.board == false;
       // Menu.repaint();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        Watek watek = new Watek(this, menu2, wybor, true, false,false, board, zapis_panel);
        Watek watek_dec = new Watek(this, menu2, wybor, false, true,false, board, zapis_panel);
        Watek watek_muzyka = new Watek(this, menu2, wybor, false, false, true, board, zapis_panel);
        watek.start();
        watek_muzyka.start();
        watek_dec.start();

        //wybor.przebieg();
       // this.m("dsddss");



    }

    }
