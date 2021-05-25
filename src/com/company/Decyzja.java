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
    public static int finanse;
    public static int obywatele;
    public static int legiony;
    public static int religia;
    int dec;
    //Watek watek;
    int kontynuacja;
    public Game game;
    public Board board;
   // Game game = new Game();
    public String kwestia;
    public String kwe1;

    public String getKwe2() {
        return kwe2;
    }

    public void setKwe2(String kwe2) {
        this.kwe2 = kwe2;
    }

    public String kwe2;

    public String getKwe1() {
        return kwe1;
    }

    public void setKwe1(String kwe1) {
        this.kwe1 = kwe1;
    }
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


    public void setStats(int fin, int leg, int oby, int rel){
        while(!(fin==0 && leg==0 && oby==0 && rel==0)) {
            if(fin>0){
                fin -= 5;
                finanse += 5;
            }
            if(fin<0){
                fin += 5;
                finanse -= 5;
            }
            if(leg>0){
                leg -= 5;
                legiony += 5;
            }
            if(leg<0){
                leg += 5;
                legiony -= 5;
            }
            if(oby>0){
                oby -= 5;
                obywatele += 5;
            }
            if(oby<0){
                oby += 5;
                obywatele -= 5;
            }
            if(rel>0){
                rel -= 5;
                religia += 5;
            }
            if(rel<0){
                rel += 5;
                religia -= 5;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {};
            board.repaint();
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

    public Decyzja(int nr, Board board, Game game) throws IOException, InterruptedException, FontFormatException {
        this.nr = nr;
        this.game = game;
        this.board = board;
        finanse = 50;
        obywatele = 50;
        legiony = 50;
        religia = 50;
        tura = 1;
        kwestia = "";
        kwe1 = "";
        kwe2 = "";
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
        //kwestia = "Coś";
        this.dec = 0;
        int los;
       // nr=70;
        //nr=44;
        //nr=2;
        game.wypisywanie = true;
       // board.repaint();
        //nr = 47;
        //quest[15] = 1;
        if(getKontynuacja() != 0){
            nr = getKontynuacja();
            setKontynuacja(0);
        }

        switch (nr) {

            case 0:
                setKwestia("Legioniści wracają do miasta z wygranej wojny. Czy zorganizować z tej okazji ucztę?");
                setKwe1("Nie stać nas na to.");
                setKwe2("To dobry pomysł.");
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:
                        break;
                }
                break;
            case 1:
                setKwestia("Kapłani uważają, że złe warunki pogodowe są znakiem gniewu Bogów. Wymagają złożenia przez twoich poddanych dużych ofiar zwierzęcych.");
                setKwe1("Chyba oszaleli!");
                setKwe2("Niech lud wykona ich rozkazy.");
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:
                        break;
                }
                break;
            case 2:
                los = 1+(int)(Math.random()*30);
                setKwestia("Żołnierze " + los + "-ego legionu rządają zwiększenia ich żołdu. Grożą buntem.");
                setKwe1("Ukarz ich decymacją.");
                setKwe2("Zwiększ ich płace.");
                lub();
                switch (dec) {
                    case 1:
                        setStats(20, -40, 30, 40);
                        break;
                    case 2:
                        setStats(20, -40, 30, -40);
                        if((int)(Math.random()*10) >= 3) {
                             setKontynuacja(100002);
                        }
                        break;
                }
                break;
            case 3:
                setKwestia("Dwaj niewolnicy pokłócili się, w wyniku czego jeden dotkliwie pobił drugiego. Właścicel ofiary domaga się odszkodowania.");
                setKwe1("Zapłaćcie poszkodowanemu.");
                setKwe2("To jego problem.");
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 4:
                setKwestia("");
                setKwe1("");
                setKwe2("");
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
                setKwestia("Naczelny architekt radzi budowę nowego akweduktu.");
                setKwe1("Niech będzie");
                setKwe2("Mamy już ich wystarczająco");
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 15:
                    los = (int)(Math.random()*2);
                    setKwestia("Ludzie donoszą, że picie wody wywołuje drgawki i ból żołądka. Podejrzewamy, że ktoś zanieczyszcza żródło.");
                    setKwe1("Kto mógłby to zrobić?");
                    setKwe2("Nie mam na to czasu");
                    lub();
                    switch (dec){
                        case 1:
                            setKontynuacja(100015);
                            break;
                        case 2:
                            setKontynuacja(200015);
                            break;
                    }
                    break;
            case 16:
                if(quest[16] == 0) {
                    setKwestia("Senat wpadł na pomysł modernizacji floty rzymskiej, co pozwoliłoby na próbę podboju Północnej Afryki.");
                    setKwe1("Nasza flota ma się dobrze");
                    setKwe2("To korzystna inwestycja");
                    lub();
                    switch (dec) {
                        case 1:

                            break;
                        case 2:
                            setQuest(1,16);
                    }
                }
                else if(quest[16] == 1){
                    setKwestia("Flota została ulepszona. Jesteśmy gotowi, by wyruszyć na podbój Północnej Afryki.");
                    setKwe1("Do boju!");
                    setKwe2("Dajmy odpocząć żołnierzom");
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
                    setKwestia("Jeden z gladiatorów strajkuje. Żąda ostrzejszego miecza i nowych sandałów.");
                    setKwe1("Nie zawracajcie mi tym głowy");
                    setKwe2("Dajcie mu to, o co prosi");
                    //dwie opcje do wyboru
                    lub();
                    switch (dec) {
                        case 1:
                            setKontynuacja(100017);
                            break;
                        case 2:

                            break;
                    }
                    break;
            case 18:
                setKwestia("Część lwów z Koloseum przeszła na wegetarianizm. Aby zmieniły zdanie, powinniśmy zakupić dla nich najprzedniejszego mięsa.");
                setKwe1("To dobry pomysł");
                setKwe2("Nie, złóżcie lwy w ofierze Marsowi");
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 19:
                setKwestia("Jeden z kapłanów prosi o pozwolenie na odprawienie czegoś, co nazywa \"rytuałem tysiąca słońc\". Zapewnia, że przyniesie to dobrobyt całemu cesarstwu.");
                setKwe1("Co za bzdury...");
                setKwe2("Jeśli tak uważa...");
                lub();
                switch (dec) {
                    case 1:

                        break;
                    case 2:
                        setKontynuacja(200019);
                        break;
                }
                break;
            case 20:
                setKwestia("Dziś rano z więzienia uciekł niebezpieczny przestępca. Jego egzekucja miała odbyć się godzinę temu. Ludzie domagają się wyjaśnień.");
                setKwe1("To ja ponoszę odpowiedzialność");
                setKwe2("Obwińcie straż");
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 21:
                if(quest[21]==0) {
                    setKwestia("Senat zaleca odnowienie dróg prowadzących do miasta");
                    setKwe1("Odnówmy je");
                    setKwe2("Nie jest to konieczne");
                    lub();
                    switch (dec) {
                        case 1:
                            break;
                        case 2:

                    }
                    break;
                }
                if(quest[21]==1){
                    setKwestia("Senat wpadł na pomysł zorganizowania wyścigu konnego po rzymskich drogach. Lud byłby zachwycony.");
                    setKwe1("Świetny pomysł");
                    setKwe2("Nie stać nas na to");
                    lub();
                    switch (dec) {
                        case 1:
                            break;
                        case 2:
                    }
                    break;
                }
            case 22:
                setKwestia("W tym roku uprawy rolne były wyjątkowo obfite.");
                setKwe1("Bogowie nad nami czuwają");
                setKwe2("To zasługa pracowitości rolników");
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 23:
                setKwestia("Specjaliści donoszą, że główny szyb w jednej z kopalni miedzi może w każdej chwili ulec zawaleniu.");
                setKwe1("To mało prawdopodobne");
                setKwe2("Ewakuujcie górników");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 24:
                setKwestia("Centurioni żądają dostawy niewolników. Możni obywatele również.");
                setKwe1("Wojsko ma pierwszeństwo");
                setKwe2("Lud ma pierwszeństwo");
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 25:
                setKwestia("Na jednej z nadgranicznych farm, wykryto u kóz dziwny rodzaj wysypki. Podobno jest bardzo zakaźna.");
                setKwe1("Wyślijcie tam specjalistów");
                setKwe2("Zabijcie chore kozy");
                lub();
                switch (dec) {
                    case 1:
                        setKontynuacja(100025);
                        break;
                    case 2:

                }
                break;
            case 26:
                setKwestia("Kończą nam się zapasy liści laurowych.");
                setKwe1("Zakupcie nowe jak najprędzej");
                setKwe2("Obejdę się bez liści");;
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 27:
                setKwestia("Senat wpadł na pomysł zorganizowania specjalnych szkoleń taktyki bitewnej dla centurionów.");
                setKwe1("");
                setKwe2("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 28:
                setKwestia("Dziś w nocy któs włamał się do pałacowej stajni i uśmiercił wszystkie konie.");
                setKwe1("");
                setKwe2("");
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 29:
                setKwestia("Zbliżają się Saturnalia - święto Saturna. Czy zorganizować jego obchody?");
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 30:
                setKwestia("Kowal z Akwilei twierdzi, że wynalazł sposób wytwarzania nowego metalu - dwukrotnie mocniejszego i lżejszego od tego, którego używa nasza armia.");
                setKwe1("Sfinansujcie jego badania.");
                setKwe2("To strata pieniędzy");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        setKontynuacja(100030);
                        break;
                    case 2:

                }
                break;
            case 31:
                setKwestia("Na ulicach panoszą się myszy i szczury. Roznoszą choroby i kradną jedzenie. Powinniśmy coś zrobić!");
                setKwe1("Szczury to nie koniec świata");
                setKwe2("Co proponujesz?");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        setKontynuacja(100031);
                        break;
                    case 2:
                        setKontynuacja(200031);
                        break;
                }
                break;
            case 32:
                setKwestia("Barbarzyńcy napadają na mieszkańców północnych miasteczek");
                setKwe1("Wyślijcie wojsko");
                setKwe2("Każcie ludziom uciekać na południe");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 33:
                setKwestia("Twój syn prosi o nowego rumaka");
                setKwe1("Dajcie mu go");
                setKwe2("Nie mam na to czasu");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 34:
                setKwestia("Piraci napadają na naszych kupców. Musimy zapewnić nieustanną ochronę morską dla handlarzy. [To będzie miało stały efekt]");
                setKwe1("Zapewnijcie im wsparcie armii");
                setKwe2("Dadzą sobie radę bez naszej pomocy");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 35:
                setKwestia("Grupa pałacowych kronikarzy pragnie wydać dzieło o Twych wspaniałych rządach. Oczywiście, wszystkie niewygodne fakty zostaną pominięte.");
                setKwe1("To niedobry pomysł");
                setKwe2("To świetny pomysł");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:
                        setKontynuacja(200035);
                        break;
                }
                break;
            case 36:
                setKwestia("Rzymskie łaźnie są ostatnio w niezwykle niehigienicznym stanie. Ktoś musi porządnie zadbać o ich czystość.");
                setKwe1("To obowiązek obywateli");
                setKwe2("To obowiązek żołnierzy");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 37:
                setKwestia("Z wyprawy do Azji Mniejszej przywieziona została spora skrzynia ze złotem");
                setKwe1("Lud jest bogaty!");
                setKwe2("Jestem bogaty!");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 38:
                setKwestia("Astrologowie proszą o pozwolenie na złożenie Jowiszowi w ofierze dziesięciu baranków.");
                setKwe1("Niech tak zrobią");
                setKwe2("To nie jest konieczne");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 39:
                setKwestia("Przybyła dostawa wyśmienitej jakości drewna. Armia potrzebuje nowych włóczni i oszczepów, zaś kapłani żądają remontu sufitu w świątyni boginii Westy.");
                setKwe1("Świątynia jest ważniejsza");
                setKwe2("Włócznie są ważniejsze");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 40:
                setKwestia("Kowal z Akwilei twierdzi, że potrafi wykuć miecz odporny na wszelkie złamania i zgięcia. Potrzebuje jedynie trochę funduszy na pokrycie kosztów.");
                setKwe1("Sfinansujcie go");
                setKwe2("To strata czasu");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        setKontynuacja(100040);
                        break;
                    case 2:
                        break;
                }
                break;
            case 41:
                setKwestia("Jeden z doradców sugeruje zwiększenie racji żywnościowych gladiatorom, dzięki czemu walczyliby bardziej zacięcie");
                setKwe1("Dobrze");
                setKwe2("Nie zgadzam się");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        setKontynuacja(100041);
                        break;
                    case 2:

                }
                break;
            case 42:
                setKwestia("Młody pielgrzym został przyłapamny na kradzieży małych reliktów ze świątyni. Zbrodnia nie jest poważna, ale powinien zostać ukarany.");
                setKwe1("Niech tak się stanie");
                setKwe2("Zostanie ułaskawiony");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 43:
                setKwestia("Zeszłęj nocy wybuchł pożar w domu właściciela Rzymskich Łaźni. Wszyscy zdążyli się ewakuować, ale budynek całkowicie spłonął.");
                setKwe1("");
                setKwe2("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 44:
                setKwestia("Twój syn pyta, czy nie zechciałbyś wziąć relaksującej kąpieli w pałacowych termach.");
                setKwe1("Oczywiście!");
                setKwe2("Innym razem");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        setKontynuacja(100044);
                        break;
                    case 2:
                        break;
                }
                break;
            case 45:
                setKwestia("Senat wpadł na pomysł zatrudnienia poławiaczy pereł na południowym wybrzeżu. W zamian za regularną pensję, będą łowić te rzadkie klejnoty");
                setKwe1("Uczyńmy tak");
                setKwe2("Perły to nic pewnego");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 46:
                setKwestia("Jeden z legionistów wdał się w sprzeczkę z kapłanem i śmiertelnie go zranił. Kolegium, do którego przynależył denat domaga się sprawiedliwości.");
                setKwe1("Ukarzcie legionistę");
                setKwe2("To był wypadek");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:
                }
                break;
            case 47:
                setKwestia("Doszły nas plotki o planowanym powstaniu ludu Tektosagów na terenach Galacji. Powinno się zająć tym wojsko, ale jeśli to tylko plotki, wysłanie tam żołnierzy wywoła strach wśród ludności");
                setKwe1("Wyślijcie armię");
                setKwe2("Czekajmy na rozwój sytuacji");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        setKontynuacja(100047);
                        break;
                    case 2:
                        setKontynuacja(200047);
                }
                break;
            case 48:
                setKwestia("Wczoraj jeden z legionistów zaczął biegać po mieście odbijając od ziemi napompowany świński pęcherz. Kilkoro ludzi przyłączyło się do niego.");
                setKwe1("Zakłócają porządek publiczny");
                setKwe2("To dziwne, ale przecież zgodne z prawem ");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 49:
                setKwestia("Mamy nadwyżki w mięsie i winie. Co powinniśmy z nimi zrobić?");
                setKwe1("Dajcie je kapłanom");
                setKwe2("Dajcie je wojsku");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 50:
                setKwestia("Kapłani twierdzą, że bogowie patrzą na nas krzywym okiem. Radzą rozpalanie ognia w każdym domostwie przez najbliższy miesiąc.");
                setKwe1("Niech będzie");
                setKwe2("Nie ma opcji");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 51:
                setKwestia("Lud uważa, że kapłanom powodzi się zbyt dobrze. Oczekują obniżenia podatków dla ludzi świeckich i podwyższenia ich duchownym.");
                setKwe1("Jeśli to konieczne...");
                setKwe2("Nie ma mowy!");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 52:
                setKwestia("Zorganizowanie wyścigu rydwanów w Circus Maximus z pewnością poprawiłoby nastrój obywatelom.");
                setKwe1("Świetny pomysł.");
                setKwe2("Może innym razem.");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 53:
                setKwestia("Dziś rano córka naczelnego architekta zostałą znaleziona martwa w swojej sypialni. Lud domaga się natychmiastowego śledztwa.");
                setKwe1("");
                setKwe2("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 54:
                setKwestia("Spóźnia się dostawa wina, a pałacowe zapasy są na wyczerpaniu. Powinniśmy wziąć kilka beczek z pobliskiej tawerny.");
                setKwe1("Wino to wino, nieistotne skąd pochodzi");
                setKwe2("Zaczekamy na wino lepszej jakości");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 55:
                setKwestia("Ilość żelaza wydobywanego z naszych kopalń niemal się podwoiła. Możemy dać część kupcom, by je spieniężyli.");
                setKwe1("Zróbmy tak");
                setKwe2("Dajmy to żelazo armii");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 56:
                setKwestia("Kuchnia pałacowa często nie wie co robić z górą resztek. Moglibyśmy je komuś oddać...");
                setKwe1("Niewolnikom");
                setKwe2("Złóżmy je w ofierze bogom.");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 57:
                setKwestia("Handel na północy jest coraz bardziej utrudniony przez napaści barbarzyńców na kupców. Powinniśmy wysłać tam wojsko, by zaprowadzić porządek.");
                setKwe1("Niech tak się stanie");
                setKwe2("To nie jest konieczne");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 58:
                setKwestia("Część krów zaczęła dawać słone mleko. Specjaliści myślą, że to przez użycie nowego nawozu. Powinniśmy wyprodukować nowy");
                setKwe1("Pozbądźcie się nawozu");
                setKwe2("To nie wina nawozu");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 59:
                setKwestia("Pałacowy medyk stworzył nowatorską kurację dla twarzy. Możni dużo za nią zapłacą, jednak najpierw trzeba ją będzie przetestować na niewolnikach");
                setKwe1("Dobrze");
                setKwe2("To zbyt ryzykowne");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        setKontynuacja(100059);
                        break;
                    case 2:
                        break;
                }
                break;
            case 60:
                setKwestia("Pałacowy medyk wynalazł recepturę na środek przeciw bólowi głowi. Aby jednak poddani mogli go stosować, musi być najpierw przetestowany na niewolnikach.");
                setKwe1("Zgadzam się");
                setKwe2("To zbyt ryzykowne");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        setKontynuacja(100060);
                        break;
                    case 2:
                        break;
                }
                break;
            case 61:
                setKwestia("Grupa bluźnierców głosi na ulicach skandaliczne hasła oczerniające bogów. Powinniśmy posłać wojsko i natychmiast rozbić to zgromadzenie.");
                setKwe1("Naprzód!");
                setKwe2("Nie działajmy zbyt pochopnie");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:
                }
                break;
            case 62:
                setKwestia("Twój syn zaoferował Ci usługę u swojego fryzjera. Gwarantuje powalający efekt.");
                setKwe1("Z przyjemnością");
                setKwe2("Cesarska fryzura nie wymaga poprawy");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        setKontynuacja(100062);
                        break;
                    case 2:
                        break;
                }
                break;
            case 63:
                setKwestia("Grupy niewolników uciekają z cesarstwa, po tym jak zbuntowali się przeciwko swoim możnym panom.");
                setKwe1("Jeśli taka ich wola...");
                setKwe2("Poślijcie za nimi wojsko");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 64:
                setKwestia("Zbliżają się Wulkanalia - święto boga Wulkana. Tradycja nakazuje każdemu mieszkańcowi miasta wrzucić w ogień ofiarę z ryby");
                setKwe1("Niech tak będzie");
                setKwe2("To marnowanie jedzenia!");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 65:
                setKwestia("Szpiedzy donoszą, że w mieście rozwija się nielegalny handel. Sugerują przeszukanie kupieckich karawan.");
                setKwe1("Zgadzam się");
                setKwe2("Nie zgadzam się");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 66:
                setKwestia("Twój syn przysyła ci amforę wybornego wina. Czy chcesz spróbować?");
                setKwe1("Jasne!");
                setKwe2("Nie jestem spragniony");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        setKontynuacja(100066);
                        break;
                    case 2:
                        break;
                }
                break;
            case 67:
                setKwestia("Twój syn przysyła Ci w prezencie olejki zapachowe. Wyglądają na bardzo drogie. Czy chcesz ich użyć?");
                setKwe1("Nie potrzebuję olejków");
                setKwe2("To miło z jego strony");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:
                        setKontynuacja(200067);
                        break;
                }
                break;
            case 68:
                setKwestia("Rybacy potrzebują drewna na budowę łodzi. Żołnierze zaś domagają się nowych włóczni i oszczepów.");
                setKwe1("Wspieram rybaków");
                setKwe2("Wspieram żołnierzy");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 69:
                setKwestia("Runęła kolumna w świątyni i przygniotłą modlącego się tam kapłana oraz centuriona. Na miejscu jest medyk, ale ma czas na uratowanie tylko jednej osoby");
                setKwe1("Ratujcie centuriona!");
                setKwe2("Ratujcie kapłana!");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 70:
                setKwestia("Senat wpadł na pomysł wprowadzenia nowej konkurencji walk gladiatorów - walki wręcz - czyli pojedynków bez użycia broni.");
                setKwe1("To nie ma sensu...");
                setKwe2("Świetny pomysł!");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:
                        setKontynuacja(200070);
                        break;
                }
                break;

                /*
            case 71:
                setKwestia("");
                setKwe1("");
                setKwe2("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 72:
                setKwestia("");
                setKwe1("");
                setKwe2("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 73:
                setKwestia("");
                setKwe1("");
                setKwe2("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 74:
                setKwestia("");
                setKwe1("");
                setKwe2("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 75:
                setKwestia("");
                setKwe1("");
                setKwe2("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 76:
                setKwestia("");
                setKwe1("");
                setKwe2("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 77:
                setKwestia("");
                setKwe1("");
                setKwe2("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 78:
                setKwestia("");
                setKwe1("");
                setKwe2("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 79:
                setKwestia("");
                setKwe1("");
                setKwe2("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 80:
                setKwestia("");
                setKwe1("");
                setKwe2("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 81:
                setKwestia("");
                setKwe1("");
                setKwe2("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 82:
                setKwestia("");
                setKwe1("");
                setKwe2("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 83:
                setKwestia("");
                setKwe1("");
                setKwe2("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 84:
                setKwestia("");
                setKwe1("");
                setKwe2("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 85:
                setKwestia("");
                setKwe1("");
                setKwe2("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 86:
                setKwestia("");
                setKwe1("");
                setKwe2("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 87:
                setKwestia("");
                setKwe1("");
                setKwe2("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 88:
                setKwestia("");
                setKwe1("");
                setKwe2("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 89:
                setKwestia("");
                setKwe1("");
                setKwe2("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 90:
                setKwestia("");
                setKwe1("");
                setKwe2("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break;
            case 91:
                setKwestia("");
                setKwe1("");
                setKwe2("");
                //dwie opcje do wyboru
                lub();
                switch (dec) {
                    case 1:
                        break;
                    case 2:

                }
                break; */
                //casy kontynuujące dany wątek od razu po poprzednim
            case 100002:
                los = 0;
                while(los == 0){
                    los = (int) (Math.random() *4);
                }
                if(los == 1){
                    setKwestia("Na wieści o podwyżce zareagował również jeden inny legion. Jego żołnierze także chcą podwyższenia płac.");
                }
                else {
                    setKwestia("Na wieści o podwyżce zareagowały również " + los + " inne legiony. One także chcą podwyższenia płac.");
                }
                setKwe1("1. Nie ma mowy.");
                setKwe2("2.Wynegocjuj niewielką podwyżkę.");
                lub();
                switch (dec){
                    case 1:
                        break;
                    case 2:
                        break;
                }







            case 100015:
                setKwestia("Tylko miejski producent producent wina miał motyw - nieufność ludu wobec czystej wody zwiększyłoby jego zyski. Powinniśmy go przesłuchać");
                setKwe1("Dobrze.");
                setKwe2("Mamy inne opcje??");
                lub();
                switch(dec){
                    case 1:
                        setKontynuacja(110015);
                        setTura(getTura()-1);
                        break;
                    case 2:
                        setKontynuacja(120015);
                        setTura(getTura()-1);
                        break;
                }
                break;
            case 110015:
                setKwestia("Producent wina został przesłuchany. Twierdzi, że nie ma nic wspólnego z zatrutym źródłem.");
                setKwe1("Jest winny! Stracić go!");
                setKwe2("Mamy inne opcje?");
                lub();
                switch(dec){
                    case 1:
                        setKontynuacja(111015);
                        setTura(getTura()-1);
                        break;
                    case 2:
                       setKontynuacja(112015);
                        setTura(getTura()-1);
                       break;
                }
                break;
            case 112115:
            case 121015:
                setKwestia("Ekspedycja odnalazła u zanieczyszczonego źródła martwą owcę, która zatruwała wodę. Winiarz okazał się być niewinny. Lud jest wdzięczny za Twoje starania w dojściu do prawdy.");
                setKwe1("...");
                setKwe2("...");
                setKontynuacja(0);
                setTura(getTura()-1);
                lub();
                break;
            case 111015:
            case 112215:
            case 122015:
                los = (int)(Math.random()*2);
                if(los==0){
                    setKwestia("Mężczyzna został stracony. W jego domu odnaleziono szkodliwą substancję, która zatruła źródło. Poddani są wdzięczni dzięki Twemu słusznemu osądowi.");
                }
                else{
                    setKwestia("Mężczyzna został stracony. Kilka dni później pasterze znaleźli przy zanieczyszczonym źródle martwą owcę, która zatruwała wodę. Lud jest wściekły, przez Twój pochopny osąd winiarza.");
                }
                setKwe1("...");
                setKwe2("...");
                lub();
                setKontynuacja(0);
                setTura(getTura()-1);
                break;
            case 112015:
                setKwestia("Możemy też poszukać przyczyny zatrucia u źródła. Zorganizowanie wyprawy będzie jednak bardzo kosztowne.");
                setKwe1("Niech będzie.");
                setKwe2("Nie, winiarz jest winny!");
                setTura(getTura()-1);
                lub();
                switch(dec){
                    case 1:
                        setKontynuacja(112115);
                        setTura(getTura()-1);
                        break;
                    case 2:
                        setKontynuacja(112215);
                        setTura(getTura()-1);
                        break;
                }
                break;
            case 120015:
                setKwestia("Możemy też poszukać przyczyny zatrucia u źródła. Zorganizowanie wyprawy będzie jednak bardzo kosztowne.");
                setKwe1("Niech będzie.");
                setKwe2("Nie, winiarz jest winny!");
                lub();
                switch(dec){
                    case 1:
                        setKontynuacja(121015);
                        setTura(getTura()-1);
                        break;
                    case 2:
                        setKontynuacja(122015);
                        setTura(getTura()-1);
                        break;
                }
                break;
            case 200015:
                setKwestia("W wyniku wypicia zanieczyszczonej wody, ginie szóstka dzieci. Lud jest rozgoryczony Twoją bezczynnością.");
                setKwe1("...");
                setKwe2("...");
                setKontynuacja(0);
                setTura(getTura()-1);
                lub();
                break;


            case 100017:
                setKwestia("Inni gladiatorzy też chcą lepszego traktowania. Żądają ostrzejszego miecza i nowych sandałów dla każdego wojownika w Koloseum.");
                setKwe1("Niech będzie.");
                setKwe2("Nie ma mowy.");
                setTura(getTura()-1);
                lub();
                switch(dec){
                    case 1:
                        break;
                    case 2:
                        break;
                }
                break;




            case 200019:
                los = (int)(Math.random()*2);
                setTura(getTura()-1);
                if(los==0){
                    setKwestia("Rytuał okazał się sukcesem, uprawy rolne rosną szybciej niż kiedykolwiek.");
                }
                else{
                    setKwestia("Rytuał przyniósł długotrwałą suszę, a w północnej części Cesarstwa wybuchła plaga myszy.");
                }
                setKwe1("...");
                setKwe2("...");
                lub();
                break;



            case 100025:
                setKwestia("Specjaliści po powrocie do pałacu nie potrafili zdiagnozować choroby. Kilka dni później wszyscy w mieście dostali swędzącej wysypki. Szczęście w nieszczęściu, zaraza minęła po tygodniu.");
                setKwe1("...");
                setKwe2("...");
                setTura(getTura()-1);
                setKontynuacja(0);
                lub();
                break;



            case 100030:
                setKwestia("Metal okazał być się kompletnym niewypałem i zmarnowaniem funduszy.");
                setKwe1("...");
                setKwe2("...");
                setTura(getTura()-1);
                setKontynuacja(0);
                lub();
                break;



            case 100031:
                setKwestia("Gryzonie rozmnożyły się i rozlazły się po całym mieście. Obywatele są rozgoryczeni.");
                setKwe1("...");
                setKwe2("...");
                setTura(getTura()-1);
                setKontynuacja(0);
                lub();
                break;
            case 200031:
                setKwestia("Lud mógłby przygotować i rozłożyć w całym mieście trutki na gryzonie. Inną opcją jest zlecenie tego wojsku.");
                setKwe1("Wojsko się tym zajmie.");
                setKwe2("Lud się tym zajmie.");
                setTura(getTura()-1);
                setKontynuacja(0);
                lub();
                break;



            case 200035:
                setKwestia("Obywatele zauważyli przekłamania i zatajenie wielu faktów w kronice. Niektórzy drwią sobie z Ciebie.");
                setKwe1("...");
                setKwe2("...");
                setTura(getTura()-1);
                setKontynuacja(0);
                lub();
                break;



            case 100040:
                setKwestia("Miecz okazał się być zupełną porażką i stratą pieniędzy");
                setKwe1("...");
                setKwe2("...");
                setTura(getTura()-1);
                setKontynuacja(0);
                lub();
                break;



            case 100041:
                setKwestia("Najedzeni gladiatorzy stali się ociężali i powolni. Lud od razu zauważył spadek ich formy.");
                setKwe1("...");
                setKwe2("...");
                setTura(getTura()-1);
                setKontynuacja(0);
                lub();
                break;



            case 100044:
                setKwestia("Biorąc kąpiel zaczynasz tracić świadomość, umierasz w basenie z powodu udaru.");
                setKwe1("...");
                setKwe2("...");
                setTura(getTura()-1);
                setKontynuacja(0);
                lub();
                break;

            case 100047:
                setKwestia("Powstanie rzeczywiście było przygotowywane. Ludzie są wdzięczni za błyskawiczną reakcję wojska.");
                setKwe1("...");
                setKwe2("...");
                setTura(getTura()-1);
                setKontynuacja(0);
                lub();
                break;
            case 200047:
                setKwestia("Powstanie nie było plotką. Wielu ludzi musiało uciekać ze swych domostw na zachód.");
                setKwe1("...");
                setKwe2("...");
                setTura(getTura()-1);
                setKontynuacja(0);
                lub();
                break;



            case 100059:
                setKwestia("Maść okazuje się być sukcesem, stała się bardzo popularna wśród elity mieszkańców Rzymu.");
                setKwe1("...");
                setKwe2("...");
                setTura(getTura()-1);
                setKontynuacja(0);
                lub();
                break;



            case 100060:
                setKwestia("Środek okazał się wywoływać problemy z trawieniem i utratę świadomości. Dwaj testowani niewolnicy zmarli po jego zażyciu.");
                setKwe1("...");
                setKwe2("...");
                setTura(getTura()-1);
                setKontynuacja(0);
                lub();
                break;



            case 100062:
                setKwestia("Siedząc na fotelu, zamykasz oczy. Nagle fryzjer przykłada Ci do ust kawałek szmatki, przez co nie możesz oddychać.. Umierasz przez uduszenie.");
                setKwe1("...");
                setKwe2("...");
                setTura(getTura()-1);
                setKontynuacja(0);
                lub();
                break;



            case 100066:
                setKwestia("Pijąc wino, odczuwasz kręcenie w głowie. Chwilę póżniej, leżysz martwy przed tronem.");
                setKwe1("...");
                setKwe2("...");
                setTura(getTura()-1);
                setKontynuacja(0);
                lub();
                break;



            case 200067:
                setKwestia("Zapach olejków usypia Cię, twoja głowa robi się ciężka. Godzinę później służba znajduje Cię martwego z powodu odurzenia olejkami");
                setKwe1("...");
                setKwe2("...");
                setTura(getTura()-1);
                setKontynuacja(0);
                lub();
                break;



            case 200070:
                setKwestia("Walki wręcz okazują się być straszliwie mało dynamiczne, niezbyt krwawe oraz po prostu nudne. Ludzie nie chcą oglądać nowej konkurencji.");
                setKwe1("...");
                setKwe2("...");
                setTura(getTura()-1);
                setKontynuacja(0);
                lub();
                break;
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
                nr = (int) (Math.random() * 70);

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
            game.wypisywanie = true;
            zbior();
            setJuzjest(nr, i % 20);
            nr = -1;


            // wyjscie(gra);
            //Odczyt(wybor);
            //Zapis(wybor.getTura(), wybor.getJuz(), wybor.getFinanse(), wybor.getObywatele(), wybor.getLegiony(), wybor.getReligia(), wybor.getQuest());
        }
    }
}