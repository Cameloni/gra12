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
    public JFrame window;
    public boolean wypisywanie;
    public FloatControl fc;

    File muzyka = new File("src/com/company/audio/gra_java_soundtrack(wav).wav");
    File najechanie_audio = new File("src/com/company/audio/przycisk_najechany_audio.wav");
    File klikniecie_audio = new File("src/com/company/audio/przycisk_kliknięty_audio.wav");
    File pergamin_audio = new File("src/com/company/audio/pisanienapergaminie_audio.wav");
    public Clip naj = AudioSystem.getClip();
    public Clip naj2 = AudioSystem.getClip();
    public Clip naj3 = AudioSystem.getClip();
    public FloatControl volume1;
    public FloatControl volume2;
    public Clip per = AudioSystem.getClip();
    public Clip klik = AudioSystem.getClip();

   // Menu menu = new Menu();
    //public String tekst;
    //public int coins;
    //int[] lines = new int[4];
    //double[] price = new double[4];
   public static void Zapis(int tura, int[] juz, int fin, int oby, int leg, int rel, int[] que) throws IOException {
       FileWriter za = new FileWriter("src/com/company/Pliki/Zapis_gry_1");
       PrintWriter out = new PrintWriter(za);
       out.println(tura);
       for(int i = 0; i < 20; i++){
           out.println(juz[i]);
       }
       out.println(fin);
       out.println(oby);
       out.println(leg);
       out.println(rel);
       for(int i = 0; i < 50; i++){
           out.println(que[i]);
       }
       out.close();
   }

    public static void Odczyt(Decyzja W) throws FileNotFoundException {
        File plik = new File("src/com/company/Pliki/Zapis_gry_1");
        Scanner in = new Scanner(plik);
        W.setTura(in.nextInt());
        in.nextLine();
        for(int i = 0; i < 20; i++){
            W.setJuzjest(in.nextInt(), i);
        }
        int s1, s2, s3, s4;
        s1 = in.nextInt();
        s2 = in.nextInt();
        s3 = in.nextInt();
        s4 = in.nextInt();
        W.setStats(s1, s2, s3,s4);
    }
    Menu menu2 = new Menu(this);

    public Game() throws IOException, FontFormatException, InterruptedException, LineUnavailableException, UnsupportedAudioFileException {
        //coins = 1;
        window = new JFrame("Deus consilium");
        window.setIconImage(new ImageIcon("src/com/company/PNG/background/45.png").getImage());
        klik.open(AudioSystem.getAudioInputStream(klikniecie_audio));
        per.open(AudioSystem.getAudioInputStream(pergamin_audio));

        Board wizualizacja = new Board(this);


        //Decyzja wybor = new Decyzja(nr);
        //this.tekst = "ctccoś";
        menu2.setPreferredSize(new Dimension(1200, 780));
        window.add(wizualizacja);
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
        //this.wizualizacja == false;
       // Menu.repaint();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Decyzja wybor = new Decyzja(-1, wizualizacja, this);

        Watek watek = new Watek(this, menu2, wybor, true, false,false, wizualizacja);
        Watek watek_dec = new Watek(this, menu2, wybor, false, true,false, wizualizacja);
        Watek watek_muzyka = new Watek(this, menu2, wybor, false, false, true, wizualizacja);
        watek.start();
        watek_muzyka.start();
        watek_dec.start();

        //wybor.przebieg();
       // this.m("dsddss");



    }

    }
