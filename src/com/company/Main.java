package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] juzjest = new int[20];
        int nr = -1;
        for (int iiii = 0; iiii < juzjest.length; iiii++){
            juzjest[iiii] = -1;
        }
        //fjkjaefhka xdsda kfuiyutyrewkkk
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
