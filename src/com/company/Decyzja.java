package com.company;

import java.awt.*;
import java.io.IOException;
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
    public void setQuest(int quest, int i) {
        this.quest[i] = quest;
    }
    int []quest;
    int[] juzjest;
    int tura;
    int nr;
    int finanse;
    int obywatele;
    int legiony;
    int religia;
    int dec;
    //Watek watek;
    int kontynuacja;
   // Game game = new Game();
    public String kwestia;
   // Watek watek = new Watek(game.game, );

    public int getKontynuacja() {
        return kontynuacja;
    }

    public void setKontynuacja(int kontynuacja) {
        this.kontynuacja = kontynuacja;
    }
    public int[] getQuest() {
        return quest;
    }

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
    public void setObywatele(int obywatele) {
        this.obywatele = obywatele;
    }

    public void setLegiony(int legiony) {
        this.legiony = legiony;
    }

    public void setReligia(int religia) {
        this.religia = religia;
    }

    public int getFinanse() {
        return finanse;
    }

    public int getObywatele() {
        return obywatele;
    }

    public int getLegiony() {
        return legiony;
    }

    public int getReligia() {
        return religia;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public int getNr() {
        return nr;
    }

    public Decyzja(int nr) throws IOException, InterruptedException, FontFormatException {
        this.nr = nr;
        finanse = 50;
        obywatele = 50;
        legiony = 50;
        religia = 50;
        tura = 1;
        kwestia = " ";
        kontynuacja = 0;
        juzjest = new int[20];
        quest = new int[50];

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
    /*int q1=0, q2=0, q3=0, q4=0, q5=0, q6=0, q7=0, q8=0, q9=0, q10=0, q11=0, q12=0, q13=0, q14=0, q15=0, q16=0, q17=0, q18=0, q19=0, q20=0, q21=0,q22=0, q23=0, q24=0, q25=0,
            q26=0, q27=0,
            q28=0, q29=0, q30=0, q31=0, q32=0, q33=0, q34=0, q35=0, q36=0, q37=0, q38=0, q39=0, q40=0, q41=0, q42=0, q43=0, q44=0, q45=0, q46=0, q47=0, q48=0;
*/
    public void statystyki() {
        System.out.println("Finanse:       " + pasek(finanse, 100));
        System.out.println("Obywatele:     " + pasek(obywatele, 100));
        System.out.println("Siła wojska:   " + pasek(legiony, 100));
        System.out.println("Religia:       " + pasek(religia, 100));
    }

    public String getKwestia() {
        return kwestia;
    }

    public void setKwestia(String kwestia) {
        this.kwestia = kwestia;
    }

    //Main st = new Main();
    public void zbior() throws IOException {
//
        kwestia = "Coś";
        this.dec = 0;
        int los;
        nr=0;


        switch (nr) {
            case 0:
                System.out.println("Legioniści wracają do miasta z wygranej wojny. Czy zorganizować z tej okazji ucztę?");
                kwestia = "Legioniści wracają do miasta z wygranej wojny. Czy zorganizować z tej okazji ucztę?";
                //dwie opcje do wyboru
                System.out.println("1. Nie stać nas na to.");
                System.out.println("2. To dobry pomysł.");
                lub();
                switch (dec) {
                    case 1:
                        setLegiony(getLegiony()-20);
                        setObywatele(getObywatele()-10);
                        setFinanse(getFinanse()+10);
                        break;
                    case 2:
                        setLegiony(getLegiony()+20);
                        setFinanse(getFinanse()-20);
                        break;
                }
                break;
            case 1:
                System.out.println("Kapłani uważają, że złe warunki pogodowe są znakiem gniewu Bogów. Wymagają złożenia przez twoich poddanych dużych ofiar zwierzęcych.");
                setKwestia("Kapłani uważają, że złe warunki pogodowe są znakiem gniewu Bogów. Wymagają złożenia przez twoich poddanych dużych ofiar zwierzęcych.");
                System.out.println("1. Chyba oszaleli!");
                System.out.println("2. Niech lud wykona ich rozkazy.");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        setReligia(getReligia()-30);
                        setObywatele(getObywatele()+20);
                        break;
                    case 2:
                        setReligia(getReligia()+20);
                        setObywatele(getObywatele()-20);
                        break;
                }
                break;
            case 2:
                int legion = 0;
                while(legion == 0){
                    legion = (int) (Math.random() * 31);
                }
                System.out.println("Żołnierze piątego legionu rządają zwiększenia ich żołdu. Grożą buntem.");
                setKwestia("Żołnierze \" + (int) (Math.random() * 30) + \"-ego legionu rządają zwiększenia ich żołdu. Grożą buntem.");
                System.out.println("1. Ukarz ich decymacją.");
                System.out.println("2. Zwiększ ich płace.");
                lub();
                switch (dec) {
                    case 1:
                        setLegiony(getLegiony()-30);
                        setFinanse(getFinanse()+20);
                        break;
                    case 2:
                        setLegiony(getLegiony()+20);
                        setFinanse(getFinanse()-20);
                        if((int)(Math.random()*10) >= 3) {
                            setKontynuacja(50);
                        }
                        break;
                }
                break;
            case 3:
                System.out.println("Coś3");
                setKwestia("cos");
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 4:
                System.out.println("Coś4");
                setKwestia("cos");
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
                setKwestia("cos");
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
                setKwestia("cos");
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 7:
                System.out.println("Coś7");
                setKwestia("cos");
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 8:
                System.out.println("Coś8");
                setKwestia("cos");
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 9:
                System.out.println("Coś9");
                setKwestia("cos");
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
                setKwestia("cos");
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 11:
                System.out.println("Coś11");
                setKwestia("cos");
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 12:
                System.out.println("Coś12");
                setKwestia("cos");
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:
                }
                break;
            case 13:
                System.out.println("Coś13");
                setKwestia("cos");
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
                setKwestia("cos");
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 15:
                if(quest[15] == 0) {
                    System.out.println("Naczelny architekt radzi budowę nowego akweduktu.");
                    setKwestia("Naczelny architekt radzi budowę nowego akweduktu.");
                    System.out.println("1. Niech będzie");
                    System.out.println("2. Mamy już ich wystarczająco");
                    lub();
                    switch (dec) {
                        case 1:
                            break;
                        case 2:
                    }
                    break;
                }
                else if(quest[15]==1){
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    lub();
                    switch (dec){
                        case 1:
                            break;
                        case 2:
                            break;
                    }

                }
            case 16:
                if(quest[16] == 0) {
                    System.out.println("Senat wpadł na kosztowny pomysł modernizacji floty rzymskiej, co pozwoliłoby na próbę podboju północnoafrykańskiej fenickiej koloni - Kartaginy");
                    setKwestia("cos 1");
                    System.out.println("1. Nasza flota ma się dobrze");
                    System.out.println("2. To korzystna inwestycja");
                    lub();
                    switch (dec) {
                        case 1:

                            break;
                        case 2:
                            setQuest(1,16);
                    }
                }
                else if(quest[16] == 1){
                    System.out.println("Flota została ulepszona. Jesteśmy gotowi, by wyruszyć na podbój Kartaginy.");
                    System.out.println("1. Do boju!");
                    System.out.println("2. Dajmy odpocząć żołnierzom");
                    lub();
                    switch (dec){
                        case 1:
                            break;
                        case 2:
                            break;
                    }
                }
                break;
            case 17:
                System.out.println("Jeden z gladiatorów strajkuje. Żąda ostrzejszego miecza i nowych sandałów. Lud zdaje się go popierać.");
                System.out.println("Nie zawracajcie mi tym głowy");
                System.out.println("Dajcie mu wszystko czego chce.");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 18:
                System.out.println("Część lwów z Koloseum przeszła na wegetarianizm. Aby zmieniły zdanie, senat sugeruje zakupienie dla nich najprzedniejszego mięsa");
                setKwestia("cos 1");
                System.out.println("To dobry pomysł");
                System.out.println("Nie, złóżcie lwy w ofierze Marsowi");
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 19:
                System.out.println("Jeden z kapłanów prosi o pozwolenie na odprawienie czegoś, co nazywa 'rytuałem tysiąca słońc'. Zapewnia, że przyniesie to dobrobyt całemu cesarstwu.");
                setKwestia("cos 1");
                System.out.println("Co za bzdury...");
                System.out.println("Jeśli tak uważa...");
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 20:
                System.out.println("");
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
                //casy kontynuujące dany wątek od razu po poprzednim
            case 50:
                int q = 0;
                while(q == 0){
                    q = (int) (Math.random() *4);
                }
                if(q == 1){
                    System.out.println("Pytanie bonus. Na wieści o podwyżce zareagował również jeden inny legion. Jego żołnierze także chcą podwyższenia płac.");

                }
                else {
                    System.out.println("Pytanie bonus. Na wieści o podwyżce zareagowały również " + q + " inne legiony. One także chcą podwyższenia płac.");
                }
                System.out.println("1. Nie ma mowy.");
                System.out.println("2.Wynegocjuj niewielką podwyżkę.");
                lub();
                switch (dec){
                    case 1:
                        setLegiony(getLegiony()-q*5);
                        break;
                    case 2:
                        setFinanse(getFinanse()- q*5);
                        setLegiony(getLegiony() + q*5);
                        break;
                }

        }
        setTura(getTura() + 1);
    }
}