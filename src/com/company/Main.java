package com.company;
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

public class Main {

/*
    Font romanfont;
    JPanel pergaminpanel;
    JTextArea textArea;
    Container con;
    JFrame gra;


    String text;
    int i = 0;



    Font defaultfont = new Font("Times New Roman", Font.PLAIN, 30);
    public void wypisznapergaminie(String s){
        text = s;
        timer.start();
    }
    public void wypisznapergaminie2(String s){
        textArea.append(s);
    }
*/

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
    public static void wyjscie(JFrame J){
        J.setVisible(false);
        System.exit(0);
    }
    public static void main(String[] args) throws IOException, FontFormatException, InterruptedException {
        new Game();

        int nr = -1;
        Decyzja wybor = new Decyzja(nr);
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
            System.out.println("--|" +wybor.getTura()+ " tura |--");
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
        //new Main();
}
