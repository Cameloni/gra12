package com.company;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.Scanner;

public class Game {
    public boolean menu;
    public boolean wizualizacja;
    public JFrame window;



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
        W.setFinanse(in.nextInt());
        W.setObywatele(in.nextInt());
        W.setLegiony(in.nextInt());
        W.setReligia(in.nextInt());
    }
    Menu menu2 = new Menu(this);

    public Game() throws IOException, FontFormatException, InterruptedException {
        //coins = 1;
        window = new JFrame("Deus consilium");
        window.setIconImage(new ImageIcon("src/com/company/PNG/background/45.png").getImage());
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

        this.menu = true;
       // Menu.repaint();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Decyzja wybor = new Decyzja(-1);
        Watek watek = new Watek(this, menu2, wybor);
        watek.start();
       // this.m("dsddss");

        int nr = -1;
        for (int iiii = 0; iiii < wybor.juzjest.length; iiii++){
            wybor.setJuzjest(-1, iiii);
        }

        for (int i = 0; i < 50; i++) {
            while (nr < 0) {
                nr = (int) (Math.random() * 30);

                for (int j = 0; j < 20; j++) {
                    if (wybor.getJuzjest(j) == -1) {
                        //tutaj chodziło że jeżeli to będzie równe -1 to nie ma już porównywać bo dalsze numery też
                        //będą równe -1, czyli nie są jeszcze wypełnione.
                        break;
                    }
                    if (nr == wybor.getJuzjest(j)) {
                        //tutaj natomiast sprawdzam czy pojawił się już dany numer.
                        nr = -1;
                        break;
                    }
                }
            }
            System.out.println("--|" + wybor.getTura()+ " tura |--");
            wybor.statystyki();
            wybor.setNr(nr);
            wybor.zbior();
            wybor.setJuzjest(nr, i % 20);
            nr = -1;
            if(wybor.getKontynuacja() != 0){
                nr = wybor.getKontynuacja();
                wybor.setKontynuacja(0);
            }

            // wyjscie(gra);
            //Odczyt(wybor);
            Zapis(wybor.getTura(), wybor.getJuz(), wybor.getFinanse(), wybor.getObywatele(), wybor.getLegiony(), wybor.getReligia(), wybor.getQuest());
        }
        }

    }
