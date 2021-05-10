package com.company;
import java.awt.*;
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
import javax.swing.*;

public class Main {
    JLabel titleNameLabel;
    Font PIXroma;
    JPanel titleNamePanel;
    Container con;
    JFrame gra;

    public static void Zapis(int tura, int[] juz, int fin, int licz, int obr, int jedz) throws IOException {
        FileWriter za = new FileWriter("src/com/company/Pliki/Zapis_gry_1");
        PrintWriter out = new PrintWriter(za);
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
    public static void main(String[] args) throws IOException {

        new Main();
    }

    public Main() throws java.io.IOException{
        try {
            PIXroma = Font.createFont(Font.TRUETYPE_FONT, new File("src/com/company/inne/PIXroma_8.ttf")).deriveFont(30f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("src/com/company/inne/PIXroma_8.ttf")));
        }
        catch(IOException | FontFormatException e){

        }
        gra = new JFrame();
        titleNamePanel = new JPanel();
        Panel p = new Panel();
       // titleNameLabel = new JLabel();


      //  con.add(titleNamePanel);

        gra.setTitle("Deus consilium");
       // gra.setBounds(0,0,1200 + 14, 780 + 14 + 24);
        gra.setSize(1214,818);
        gra.setLocationRelativeTo(null);
        gra.setIconImage(new ImageIcon("src/com/company/PNG/background/45.png").getImage());
        gra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gra.setResizable(false);
        gra.setVisible(true);
        con = gra.getContentPane();


        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(600, 300, 600, 200);
        titleNamePanel.setBackground(Color.black);
        titleNameLabel = new JLabel("asfghjgfv");
        titleNameLabel.setForeground(Color.blue);
        titleNameLabel.setFont(PIXroma);
       // gra.getContentPane().add(titleNameLabel);
        titleNamePanel.add(titleNameLabel);
        con.add(titleNamePanel);
     //   titleNamePanel.add(titleNameLabel);
     //  con.add(p);
        gra.add(p);
     //   con.add(titleNamePanel);


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
            Zapis(wybor.getTura(), wybor.getJuz(), wybor.getFinanse(), wybor.getObywatele(), wybor.getLegiony(), wybor.getReligia());
        }
    }
}
