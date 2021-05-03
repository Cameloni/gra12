package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.*;

public class Main {

    public static void Odczyt(Decyzja W) throws FileNotFoundException {
        File plik = new File("src/com/company/Pliki/Zapis_gry_1");
        Scanner in = new Scanner(plik);
        while (in.hasNext()) {
            W.setFinanse(in.nextInt());
            in.nextLine();
            W.setLiczebnosc(in.nextInt());
            in.nextLine();
            W.setObrona(in.nextInt());
            in.nextLine();
            W.setJedzenie(in.nextInt());
            in.nextLine();
        }
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
        int[] juzjest = new int[20];
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
        }
    }
}
