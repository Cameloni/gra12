package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Decyzja {
    Scanner sc = new Scanner(System.in);

    public int getTura() {
        return tura;
    }

    public void setTura(int tura) {
        this.tura = tura;
    }

    public int getJuzjest(int j) {
        return juzjest[j];
    }

    public void setJuzjest(int juzjest, int i) {
        this.juzjest[i] = juzjest;
    }

    int[] juzjest;
    int tura;
    int nr;
    int finanse;
    int liczebnosc;
    int obrona;
    int jedzenie;
    int dec;

    public int[] getJuz() {
        return juzjest;
    }

    public void setFinanse(int finanse) {/*POŹNIEJ NAJPRAWDOPODOBNIEJ TRZEBA BĘDZIE ZMODYFIKOWAĆ TE SETTERY.
        if (this.finanse > 0){
            this.finanse += finanse;
            if(this.finanse <= 0){
                this.finanse = 0;
            }
            if(this.finanse > 100){
            this.finanse = 100;
            }
        }*/
        this.finanse = finanse;
    }
    public void setLiczebnosc(int liczebnosc) {
        this.liczebnosc = liczebnosc;
    }

    public void setObrona(int obrona) {
        this.obrona = obrona;
    }

    public void setJedzenie(int jedzenie) {
        this.jedzenie = jedzenie;
    }

    public int getFinanse() {
        return finanse;
    }

    public int getLiczebnosc() {
        return liczebnosc;
    }

    public int getObrona() {
        return obrona;
    }

    public int getJedzenie() {
        return jedzenie;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public int getNr() {
        return nr;
    }

    public Decyzja(int nr) {
        this.nr = nr;
        finanse = 100;
        liczebnosc = 100;
        obrona = 100;
        jedzenie = 100;
        tura = 1;
        juzjest = new int[20];
    }

    public String pasek(int n, int max) {
        String p = "";
        p += "|";
        for (int i = 0; i < n / 5; i++)
            p += "#";
        for (int i = 0; i < (max - n) / 5; i++)
            p += " ";

        p += "|";

        return p;
    }
    public void lub() throws IOException {
        while (dec != 1 && dec != 2) {
            String dec1 = sc.next();
            sc.nextLine();
            if (!dec1.equals("1") && !dec1.equals("2") /*&& !dec1.equals("3")*/) {
                System.out.println("wybierz \"1\" lub \"2\"");
                continue;
            }
            dec = Integer.valueOf(dec1);
            /*if(dec == 3){
                Zapis(8, 4, getFinanse(), getLiczebnosc(), getObrona(), getJedzenie());

            }*/
        }

    }

    public void statystyki() {
        System.out.println("Finanse:       " + pasek(finanse, 100));
        System.out.println("Liczebnosc:    " + pasek(liczebnosc, 100));
        System.out.println("Obrona:        " + pasek(obrona, 100));
        System.out.println("Ilość zapasów: " + pasek(jedzenie, 100));
    }

    public void zbior() throws IOException {

        this.dec = 0;

        switch (nr) {
            case 0:
                System.out.println("Coś0:");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 1:
                System.out.println("Coś1:");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 2:
                System.out.println("Coś2");
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 3:
                System.out.println("Coś3");
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 4:
                System.out.println("Coś4");
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            // itd.
            case 5:
                System.out.println("Coś5");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 6:
                System.out.println("Coś6");
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 7:
                System.out.println("Coś7");
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 8:
                System.out.println("Coś8");
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 9:
                System.out.println("Coś9");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 10:
                System.out.println("Coś10");
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 11:
                System.out.println("Coś11");
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 12:
                System.out.println("Coś12");
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:
                }
                break;
            case 13:
                System.out.println("Coś13");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 14:
                System.out.println("Coś14");
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 15:
                System.out.println("Coś15");
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 16:
                System.out.println("Coś16");
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 17:
                System.out.println("Coś17");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 18:
                System.out.println("Coś18");
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 19:
                System.out.println("Coś19");
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 20:
                System.out.println("Coś20");
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 21:
                System.out.println("Coś21");
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 22:
                System.out.println("Coś22");
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 23:
                System.out.println("Coś23");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 24:
                System.out.println("Coś24");
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 25:
                System.out.println("Coś25");
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 26:
                System.out.println("Coś26");
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 27:
                System.out.println("Coś27");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 28:
                System.out.println("Coś28");

                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 29:
                System.out.println("Coś29");
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
        }
        setTura(getTura() + 1);
    }
}