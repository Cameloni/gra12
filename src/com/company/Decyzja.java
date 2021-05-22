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
    int[] quest;
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
        if(finanse>0) {
            while (finanse > 0) {
                this.finanse += 1;
                finanse -= 1;
                try {
                    Thread.sleep(100);
                }catch(InterruptedException e){};
            }
        }
        else{
            while(finanse<0){
                this.finanse -= 1;
                finanse += 1;
                try {
                    Thread.sleep(500);
                }catch(InterruptedException e){};
            }
        }
    }
    public void setObywatele(int obywatele) {
        if(obywatele>0) {
            while (obywatele > 0) {
                this.obywatele += 5;
                obywatele -= 5;
                try {
                    Thread.sleep(500);
                }catch(InterruptedException e){};
            }
        }
        else{
            while(obywatele<0){
                this.obywatele -= 5;
                obywatele += 5;
                try {
                    Thread.sleep(500);
                }catch(InterruptedException e){};
            }
        }
    }

    public void setLegiony(int legiony) {
        if(legiony>0) {
            while (legiony > 0) {
                this.legiony += 5;
                legiony -= 5;
                try {
                    Thread.sleep(500);
                }catch(InterruptedException e){};
            }
        }
        else{
            while(legiony<0){
                this.legiony -= 5;
                legiony += 5;
                try {
                    Thread.sleep(500);
                }catch(InterruptedException e){};
            }
        }
    }

    public void setReligia(int religia) {
        if(religia>0) {
            while (religia > 0) {
                this.religia += 5;
                religia -= 5;
                try {
                    Thread.sleep(100);
                }catch(InterruptedException e){};
            }
        }
        else{
            while(religia<0){
                this.religia -= 5;
                religia += 5;
                try {
                    Thread.sleep(500);
                }catch(InterruptedException e){};
            }
        }
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

    public Decyzja(int nr, Board board) throws IOException, InterruptedException, FontFormatException {
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
        //nr=0;



        switch (nr) {
            case 0:
                setKwestia("Legioniści wracają do miasta z wygranej wojny. Czy zorganizować z tej okazji ucztę?");
                //dwie opcje do wyboru
                System.out.println("1. Nie stać nas na to.");
                System.out.println("2. To dobry pomysł.");
               // setFinanse(10);
                lub();
                switch (dec) {
                    case 1:
                        setLegiony(-20);
                        setObywatele(-10);
                        setFinanse(10);
                        break;
                    case 2:
                        setLegiony(20);
                        setFinanse(-20);
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
                        setReligia(-30);
                        setObywatele(20);
                        break;
                    case 2:
                        setReligia(20);
                        setObywatele(-20);
                        break;
                }
                break;
            case 2:
                int legion = 0;
                while(legion == 0){
                    legion = (int) (Math.random() * 31);
                }
                System.out.println("Żołnierze piątego legionu rządają zwiększenia ich żołdu. Grożą buntem.");
                setKwestia("Żołnierze " + (int) (Math.random() * 30) + "-ego legionu rządają zwiększenia ich żołdu. Grożą buntem.");
                System.out.println("1. Ukarz ich decymacją.");
                System.out.println("2. Zwiększ ich płace.");
                lub();
                switch (dec) {
                    case 1:
                        setLegiony(-30);
                        setFinanse(20);
                        break;
                    case 2:
                        setLegiony(20);
                        setFinanse(-20);
                        if((int)(Math.random()*10) >= 3) {
                            setKontynuacja(100);
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
                    System.out.println("Senat wpadł na pomysł modernizacji floty rzymskiej, co pozwoliłoby na próbę podboju północnoafrykańskiej fenickiej koloni - Kartaginy");
                    setKwestia("Senat wpadł na pomysł modernizacji floty rzymskiej, co pozwoliłoby na próbę podboju Północnej Afryki.");
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
                    System.out.println("Flota została ulepszona. Jesteśmy gotowi, by wyruszyć na podbój Północnej Afryki.");
                    setKwestia("Flota została ulepszona. Jesteśmy gotowi, by wyruszyć na podbój Północnej Afryki.");
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
                if(quest[17]==0) {
                    System.out.println("Jeden z gladiatorów strajkuje. Żąda ostrzejszego miecza i nowych sandałów. Lud zdaje się go popierać.");
                    setKwestia("Jeden z gladiatorów strajkuje. Żąda ostrzejszego miecza i nowych sandałów.");
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
                }
                else if(quest[17]==1){

                }
            case 18:
                System.out.println("Część lwów z Koloseum przeszła na wegetarianizm. Aby zmieniły zdanie, powinniśmy zakupić dla nich najprzedniejszego mięsa");
                setKwestia("Część lwów z Koloseum przeszła na wegetarianizm. Aby zmieniły zdanie, powinniśmy zakupić dla nich najprzedniejszego mięsa.");
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
                setKwestia("Jeden z kapłanów prosi o pozwolenie na odprawienie czegoś, co nazywa 'rytuałem tysiąca słońc'. Zapewnia, że przyniesie to dobrobyt całemu cesarstwu.");
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
                setKwestia("Dziś rano z więzienia uciekł niebezpieczny przestępca. Jego egzekucja miała odbyć się godzinę temu. Ludzie domagają się wyjaśnień.");
                System.out.println("To ja ponoszę odpowiedzialność");
                System.out.println("Obwińcie straż");
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 21:
                System.out.println("Senat zaleca odnowienie dróg prowadzących do miasta.");
                setKwestia("Senat zaleca odnowienie dróg prowadzących do miasta");
                System.out.println("");
                System.out.println("");
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 22:
                System.out.println("");
                setKwestia("W tym roku uprawy rolne były wyjątkowo obfite.");
                System.out.println("Bogowie nad nami czuwają.");
                System.out.println("To zasługa pracowitości rolników.");
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 23:
                System.out.println("Coś23");
                setKwestia("Specjaliści donoszą, że główny szyb w jednej z kopalni miedzi może w każdej chwili ulec zawaleniu.");
                System.out.println("");
                System.out.println("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 24:
                System.out.println("Zarządcy kamieniołomów żądają dostawy niewolników. Możni obywatele również.");
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 25:
                System.out.println("Na jednej z farm, wykryto u krów dziwny rodzaj wysypki.");
                setKwestia("Na jednej z farm, wykryto u krów dziwny rodzaj wysypki.");
                System.out.println("");
                System.out.println("");
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 26:
                System.out.println("Coś26");
                setKwestia("Kończą nam się zapasy liści laurowych.");
                System.out.println("");
                System.out.println("");
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 27:
                System.out.println("Coś27");
                setKwestia("Senat wpadł na pomysł zorganizowania specjalnych szkoleń taktyki bitewnej dla centurionów.");
                System.out.println("");
                System.out.println("");
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
                setKwestia("Dziś w nocy któs włamał się do pałacowej stajni i uśmiercił wszystkie konie.");
                System.out.println("");
                System.out.println("");
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 29:
                System.out.println("Zbliżają się Saturnalia - święto Saturna. Czy zorganizować jego obchody?");
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 30:
                System.out.println("Coś27");
                setKwestia("Senat wpadł na pomysł zorganizowania specjalnych szkoleń taktyki bitewnej dla centurionów.");
                System.out.println("");
                System.out.println("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 31:
                System.out.println("Coś27");
                setKwestia("");
                System.out.println("");
                System.out.println("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 32:
                System.out.println("Coś27");
                setKwestia("");
                System.out.println("");
                System.out.println("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 33:
                System.out.println("Coś27");
                setKwestia("");
                System.out.println("");
                System.out.println("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 34:
                System.out.println("Coś27");
                setKwestia("");
                System.out.println("");
                System.out.println("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 35:
                System.out.println("Coś27");
                setKwestia("");
                System.out.println("");
                System.out.println("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 36:
                System.out.println("Coś27");
                setKwestia("");
                System.out.println("");
                System.out.println("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 37:
                System.out.println("Coś27");
                setKwestia("");
                System.out.println("");
                System.out.println("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 38:
                System.out.println("Coś27");
                setKwestia("");
                System.out.println("");
                System.out.println("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 39:
                System.out.println("Coś27");
                setKwestia("");
                System.out.println("");
                System.out.println("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 40:
                System.out.println("Coś27");
                setKwestia("");
                System.out.println("");
                System.out.println("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 41:
                System.out.println("Coś27");
                setKwestia("");
                System.out.println("");
                System.out.println("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 42:
                System.out.println("Coś27");
                setKwestia("");
                System.out.println("");
                System.out.println("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 43:
                System.out.println("Coś27");
                setKwestia("");
                System.out.println("");
                System.out.println("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 44:
                System.out.println("Coś27");
                setKwestia("");
                System.out.println("");
                System.out.println("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 45:
                System.out.println("Coś27");
                setKwestia("");
                System.out.println("");
                System.out.println("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 46:
                System.out.println("Coś27");
                setKwestia("");
                System.out.println("");
                System.out.println("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 47:
                System.out.println("Coś27");
                setKwestia("");
                System.out.println("");
                System.out.println("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 48:
                System.out.println("Coś27");
                setKwestia("");
                System.out.println("");
                System.out.println("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 49:
                System.out.println("Coś27");
                setKwestia("");
                System.out.println("");
                System.out.println("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 50:
                System.out.println("Coś27");
                setKwestia("");
                System.out.println("");
                System.out.println("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 51:
                System.out.println("Coś27");
                setKwestia("");
                System.out.println("");
                System.out.println("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 52:
                System.out.println("Coś27");
                setKwestia("");
                System.out.println("");
                System.out.println("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 53:
                System.out.println("Coś27");
                setKwestia("");
                System.out.println("");
                System.out.println("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 54:
                System.out.println("Coś27");
                setKwestia("");
                System.out.println("");
                System.out.println("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 55:
                System.out.println("Coś27");
                setKwestia("");
                System.out.println("");
                System.out.println("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 56:
                System.out.println("Coś27");
                setKwestia("");
                System.out.println("");
                System.out.println("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 57:
                System.out.println("Coś27");
                setKwestia("");
                System.out.println("");
                System.out.println("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 58:
                System.out.println("Coś27");
                setKwestia("");
                System.out.println("");
                System.out.println("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 59:
                System.out.println("Coś27");
                setKwestia("");
                System.out.println("");
                System.out.println("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 60:
                System.out.println("Coś27");
                setKwestia("");
                System.out.println("");
                System.out.println("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 61:
                System.out.println("Coś27");
                setKwestia("");
                System.out.println("");
                System.out.println("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 62:
                System.out.println("Coś27");
                setKwestia("");
                System.out.println("");
                System.out.println("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 63:
                System.out.println("Coś27");
                setKwestia("");
                System.out.println("");
                System.out.println("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 64:
                System.out.println("Coś27");
                setKwestia("");
                System.out.println("");
                System.out.println("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 65:
                System.out.println("Coś27");
                setKwestia("");
                System.out.println("");
                System.out.println("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 66:
                System.out.println("Coś27");
                setKwestia("");
                System.out.println("");
                System.out.println("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 67:
                System.out.println("Coś27");
                setKwestia("");
                System.out.println("");
                System.out.println("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 68:
                System.out.println("Coś27");
                setKwestia("");
                System.out.println("");
                System.out.println("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 69:
                System.out.println("Coś27");
                setKwestia("");
                System.out.println("");
                System.out.println("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 70:
                System.out.println("Coś27");
                setKwestia("");
                System.out.println("");
                System.out.println("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 71:
                System.out.println("Coś27");
                setKwestia("");
                System.out.println("");
                System.out.println("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 72:
                System.out.println("Coś27");
                setKwestia("");
                System.out.println("");
                System.out.println("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;

                //casy kontynuujące dany wątek od razu po poprzednim
            case 100:
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
    public void przebieg() throws IOException {
        int nr = -1;
        for (int iiii = 0; iiii < juzjest.length; iiii++){
            setJuzjest(-1, iiii);
        }

        for (int i = 0; i < 50; i++) {
            while (nr < 0) {
                nr = (int) (Math.random() * 30);

                for (int j = 0; j < 20; j++) {
                    if (getJuzjest(j) == -1) {
                        //tutaj chodziło że jeżeli to będzie równe -1 to nie ma już porównywać bo dalsze numery też
                        //będą równe -1, czyli nie są jeszcze wypełnione.
                        break;
                    }
                    if (nr == getJuzjest(j)) {
                        //tutaj natomiast sprawdzam czy pojawił się już dany numer.
                        nr = -1;
                        break;
                    }
                }
            }
            System.out.println("--|" + getTura()+ " tura |--");
            statystyki();
            setNr(nr);
            zbior();
            setJuzjest(nr, i % 20);
            nr = -1;
            if(getKontynuacja() != 0){
                nr = getKontynuacja();
                setKontynuacja(0);
            }

            // wyjscie(gra);
            //Odczyt(wybor);
            //Zapis(wybor.getTura(), wybor.getJuz(), wybor.getFinanse(), wybor.getObywatele(), wybor.getLegiony(), wybor.getReligia(), wybor.getQuest());
        }
    }
}