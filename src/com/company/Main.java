package com.company;
import java.io.*;
import java.util.Scanner;
import javax.swing.*;

public class Main {
    public static void Zapis(int tura, int[] juz, int fin, int licz, int obr, int jedz) throws IOException {
        FileWriter za = new FileWriter("src/com/company/Pliki/Zapis_gry_1");
        PrintWriter out = new PrintWriter(za);
        //coś tu źle zrobiłem
        out.println(tura);
        for(int i = 0; i < 20; i++){
            out.println(juz[i]);
        }
        out.println(fin);
        out.println(licz);
        out.println(obr);
        out.println(jedz);
        out.close();
    }
    public static void Odczyt(Decyzja W) throws FileNotFoundException {
        File plik = new File("src/com/company/Pliki/Zapis_gry_1");
        Scanner in = new Scanner(plik);
        W.setTura(in.nextInt());
        in.nextLine();
        for(int i = 0; i < 20; i++)
            //nie da się zrobić odczytu juzjest, trzeba dodac juzjest do Decyzji, zrobie to jutro
        W.setFinanse(in.nextInt());
        in.nextLine();
        W.setLiczebnosc(in.nextInt());
        in.nextLine();
        W.setObrona(in.nextInt());
        in.nextLine();
        W.setJedzenie(in.nextInt());
        in.nextLine();
    }
    public static void wyjscie(JFrame J){ // jeśli dodamy jakiś przycisk "wyjście z gry" to dzięki tej metodzie bedzie mozna zatrzymywać program zamiast użycia krzyżyka na okienku z grą
        J.setVisible(false);
        System.exit(0);
    }
    public static void main(String[] args) throws IOException {

        JFrame gra = new JFrame();
        Panel p = new Panel();
        gra.add(p);
        gra.setTitle("Deus consilium");
        gra.setBounds(0,0,640 + 14, 480 + 14 + 24);
        //gra.setSize(250,250);
        gra.setLocationRelativeTo(null);
        gra.setIconImage(new ImageIcon("src/com/company/PNG/background/45.png").getImage());
        gra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        gra.setVisible(true);

        int[] juzjest = new int[20]; // lepiej będzie jak juzjest bedzie przypisane do decyzji, ale narazie moze tak zostać
        // wtedy też będzie można przerzucić "Zapis" i "Odczyt" do Decyzji.
        int nr = -1;
        for (int iiii = 0; iiii < juzjest.length; iiii++){
            juzjest[iiii] = -1;
        }
        Decyzja wybor = new Decyzja(nr);
        for (int i = 0; i < 35; i++) {
            while (nr < 0) {
                nr = (int) (Math.random() * 30);

                for (int j = 0; j < 20; j++) {

                    if (juzjest[j] == -1) {
                        break;
                    }
                    if (nr == juzjest[j]) {
                        nr = -1;
                        break;
                    }
                }
            }
            wybor.statystyki();
            wybor.setNr(nr);
            wybor.zbior();
            if (juzjest[19] == -1) {
                juzjest[i] = nr;
            } else {
                juzjest[i - 20] = nr;
            }
            nr = -1;
            // wyjscie(gra);
            //Odczyt(wybor);
            Zapis(wybor.getTura(), juzjest, wybor.getFinanse(), wybor.getLiczebnosc(), wybor.getObrona(), wybor.getJedzenie());
        }
    }
}
