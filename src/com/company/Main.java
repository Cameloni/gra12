package com.company;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.*;

public class Main {

    public static void main(String[] args) throws IOException {

        JFrame gra = new JFrame();
        Panel p = new Panel();
        gra.add(p);
        gra.setTitle("trzeba wymyślić nazwę");
        gra.setBounds(0,0,640 + 14, 480 + 14 + 24);

        //gra.setSize(250,250);
        gra.setLocationRelativeTo(null);

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
