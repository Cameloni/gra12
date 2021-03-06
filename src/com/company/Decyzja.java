package com.company;
//
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Queue;
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
    public static int[] quest;
    public int aktualny_numer;
    int[] juzjest;
    int tura;
    int nr;
    int qq16;
    int qq21;
    public static int finanse;
    public static int obywatele;
    public static int legiony;
    public static int religia;
    public static int death_screen = 0;
    int dec;
    //Watek watek;
    int kontynuacja;
    public Game game;
    public Board board;
   // Game game = new Game();
    public String kwestia;
    public String kwe1;
    int difficulty = 0;
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

    public static void setReligia(int religia) {
        Decyzja.religia = religia;
    }

    public static void setLegiony(int legiony) {
        Decyzja.legiony = legiony;
    }

    public static void setObywatele(int obywatele) {
        Decyzja.obywatele = obywatele;
    }

    public static void setFinanse(int finanse) {
        Decyzja.finanse = finanse;
    }

    public void changeDeath_screen(){
        for(int i=0; i<11; i++){
            death_screen = i;
            try{
            Thread.sleep(100);
        } catch (InterruptedException e) {};
        }
    }

    public void setStats(int fin, int leg, int oby, int rel){
        while(!(fin==0 && leg==0 && oby==0 && rel==0)) {
            if(fin>0){
                fin -= 5;
                finanse += 5;
                if(finanse >= 100){
                    game.death = 2;
                }
            }
            if(fin<0){
                fin += 5;
                finanse -= 5;
                if(finanse <= 0){
                    game.death = 1;
                }
            }
            if(leg>0){
                leg -= 5;
                legiony += 5;
                if(legiony >= 100){
                    game.death = 4;
                }
            }
            if(leg<0){
                leg += 5;
                legiony -= 5;
                if(legiony <= 0){
                    game.death = 3;
                }
            }
            if(oby>0){
                oby -= 5;
                obywatele += 5;
                if(obywatele >= 100){
                    obywatele = 100;
                }
            }
            if(oby<0){
                oby += 5;
                obywatele -= 5;
                if(obywatele <= 0){
                    game.death = 5;
                }
            }
            if(rel>0){
                rel -= 5;
                religia += 5;
                if(religia >= 100){
                    game.death = 8;
                }
            }
            if(rel<0){
                rel += 5;
                religia -= 5;
                if(religia <= 0){
                    game.death = 7;
                }
            }
            board.repaint();
            try {
                Thread.sleep(120);
            } catch (InterruptedException e) {};

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
        qq16 = 0;
        qq21 = 0;
        kontynuacja = 0;
        juzjest = new int[40];
        quest = new int[62];
        File plik11 = new File("src/com/company/Pliki/postep");
        Scanner innn = new Scanner(plik11);
        quest[61] = innn.nextInt();
        aktualny_numer = 0;

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

        while (this.dec != 1 || this.dec != 2) {
            //String dec1 = "";
            //System.out.print("");
            if(game.grane3 == false){
                return;
            }
            if(Board.opcja1 == true) {
                this.dec = 1;
                Board.opcja1 = false;
                break;
                //    sc.nextLine();
            }
            if(Board.opcja2 == true) {
                this.dec = 2;
                Board.opcja2 = false;
                break;
                //    sc.nextLine();
            }
            try {
                Thread.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            /*if(game.wizualizacja == false){
                game.grane2 = false;
                break;
            }*/
            /*if (!dec1.equals("1") && !dec1.equals("2") ) {
                //System.out.println("wybierz \"1\" lub \"2\"");
                continue;
            }
            dec = Integer.valueOf(dec1);
            break;*/
        }
            /*if(dec == 3){
                Zapis(8, 4, getFinanse(), getLiczebnosc(), getObrona(), getJedzenie());

            }*/
    }


    public void statystyki() {
        System.out.println("Finanse:       " + pasek(finanse, 100));
        System.out.println("Obywatele:     " + pasek(obywatele, 100));
        System.out.println("Si??a wojska:   " + pasek(legiony, 100));
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
        //if(game.grane3 == false){
        //    return;
        //}
        //kwestia = "Co??";
        this.dec = 0;
        int los;
        // nr=70;
       // nr=15;
        //nr = 2;
       // nr=31;
        game.wypisywanie = true;
        // board.repaint();
        //nr = 47;
        //nr = 1;
        //quest[15] = 1;
        //finanse=0;
       // nr=61;
        if(nr == 16 && getQuest()[16] == 3){
            nr = (int)(Math.random()*15);
        }
        if(getQuest()[16] != 0 && getKontynuacja() == 0 && getQuest()[16] != 3){
            qq16++;
        }
        if(getQuest()[21] != 0 && getKontynuacja() == 0 && qq16 != 15){
            qq21++;
        }
        if(qq16 == 6){
            nr = 16;
            qq16 = 0;
        }
        if(qq21 == 4){
            nr = 15;
            qq21 = -999999;
        }
        if (getKontynuacja() != 0) {
            nr = getKontynuacja();
            setKontynuacja(0);
        }
        if(aktualny_numer != 0){
            nr = aktualny_numer;
            aktualny_numer = 0;
        }
        game.fabu??a61 = quest[61];
        FileWriter f = new FileWriter("src/com/company/Pliki/postep");
        PrintWriter out1 = new PrintWriter(f);
        out1.println(game.fabu??a61);
        out1.close();
        Board.nr = nr;
        //nr = 61;
        if (game.death==0) {
            switch (nr) {

                case 0:
                    setKwestia("Legioni??ci wracaj?? do miasta z wygranej wojny. Powinni??my wyprawi?? uczt?? na ich cze????.");
                    setKwe1("Nie sta?? nas na to.");
                    setKwe2("To dobry pomys??.");
                    lub();
                    switch (this.dec) {
                        case 1:
                            setStats(15, -20-difficulty, 0, 0);
                            break;
                        case 2:
                            setStats(-15-difficulty, 15, 5, 0);
                            break;
                    }
                    break;
                case 1:
                    setKwestia("Kap??ani uwa??aj??, ??e z??e warunki pogodowe s?? znakiem gniewu Bog??w. Wymagaj?? z??o??enia przez Twoich poddanych du??ych ofiar zwierz??cych.");
                    setKwe1("Chyba oszaleli!");
                    setKwe2("Niech lud wykona ich rozkazy.");
                    lub();
                    switch (dec) {
                        case 1:
                            setStats(5, 0, 15, -20-difficulty);
                            break;
                        case 2:
                            setStats(-5-difficulty, 0, -15, 15);
                            break;
                    }
                    break;
                case 2:
                    los = 1 + (int) (Math.random() * 30);
                    setKwestia("??o??nierze " + los + "-ego legionu rz??daj?? zwi??kszenia ich ??o??du. Gro???? buntem.");
                    setKwe1("Ukarz ich decymacj??.");
                    setKwe2("Zwi??ksz ich p??ace.");
                    lub();
                    switch (dec) {
                        case 1:
                            setStats(20, -25, 0, 0);
                            break;
                        case 2:
                            setStats(-20-difficulty, 20, 0 ,0);
                            if ((int) (Math.random() * 10) >= 3) {
                                setKontynuacja(100002);
                            }
                            break;
                    }
                    break;
                case 3:
                    setKwestia("Dwaj niewolnicy pok????cili si??, w wyniku czego jeden dotkliwie pobi?? drugiego. W??a??ciciel ofiary domaga si?? odszkodowania.");
                    setKwe1("Zap??a??cie poszkodowanemu.");
                    setKwe2("To jego problem.");
                    lub();
                    switch (dec) {
                        case 1:
                            setStats(-20-difficulty, 0, 15, 0);
                            break;
                        case 2:
                            setStats(15, 0, -20-difficulty, 0);
                            break;
                    }
                    break;
                case 4:
                    setKwestia("Pa??acowy medyk wynalaz?? receptur?? na ??rodek przeciw b??lowi g??owi. Aby jednak poddani mogli go stosowa??, musi by?? najpierw przetestowany na niewolnikach.");
                    setKwe1("Zgadzam si??");
                    setKwe2("To zbyt ryzykowne");
                    lub();
                    switch (dec) {
                        case 1:
                            setKontynuacja(100004);
                            break;
                        case 2:
                            break;
                    }
                    break;
                case 5:
                    setKwestia("Grupa blu??nierc??w g??osi na ulicach skandaliczne has??a oczerniaj??ce bog??w. Powinni??my pos??a?? wojsko i natychmiast rozbi?? to zgromadzenie.");
                    setKwe1("Naprz??d!");
                    setKwe2("Nie dzia??ajmy zbyt pochopnie.");
                    lub();
                    switch (dec) {
                        case 1:
                            setStats(0, -15-difficulty, 0, 15);
                            break;
                        case 2:
                            setStats(0, 5, 10, -20);
                            break;
                    }
                    break;
                case 6:
                    setKwestia("Tw??j syn zaoferowa?? Ci us??ug?? u swojego fryzjera. Gwarantuje powalaj??cy efekt.");
                    setKwe1("Z przyjemno??ci??");
                    setKwe2("Cesarska fryzura nie wymaga poprawy");
                    lub();
                    switch (dec) {
                        case 1:
                            game.death = 9;
                            break;
                        case 2:
                            setStats(0, 0, -5-difficulty, 0);
                            break;
                    }
                    break;
                case 7:
                    setKwestia("Grupy niewolnik??w uciekaj?? z cesarstwa, po tym jak zbuntowali si?? przeciwko swoim mo??nym panom. Za sprowadzenie ich z powrotem zosta??a wyznaczona du??a nagroda.");
                    setKwe1("Niech uciekaj??, je??li taka ich wola.");
                    setKwe2("Po??lijcie za nimi wojsko.");
                    lub();
                    switch (dec) {
                        case 1:
                            setStats(-10, 15+difficulty, -10-difficulty, 0);
                            break;
                        case 2:
                            setStats(20, -20, 0, 0 );
                            break;
                    }
                    break;
                case 8:
                    setKwestia("Zbli??aj?? si?? Wulkanalia - ??wi??to boga Wulkana. Tradycja nakazuje ka??demu mieszka??cowi miasta rzuci?? w ogie?? ofiar?? z ryby.");
                    setKwe1("Niech tak b??dzie");
                    setKwe2("To marnowanie jedzenia!");
                    lub();
                    switch (dec) {
                        case 1:
                            setStats(-15-difficulty, 0, 0, 15);
                            break;
                        case 2:
                            setStats(10, 0, 5, -20);
                            break;
                    }
                    break;
                case 9:
                    setKwestia("Szpiedzy donosz??, ??e w mie??cie rozwija si?? nielegalny handel. Sugeruj?? przeszukanie kupieckich karawan.");
                    setKwe1("Zgadzam si??");
                    setKwe2("Nie zgadzam si??");
                    lub();
                    switch (dec) {
                        case 1:
                            setStats(-10-difficulty, -10, 15, 0);
                            break;
                        case 2:
                            setStats(0, 10, -15-difficulty, 0);
                            break;
                    }
                    break;
                case 10:
                    setKwestia("Tw??j syn przysy??a ci amfor?? wybornego wina. Czy chcesz spr??bowa???");
                    setKwe1("Jasne!");
                    setKwe2("Nie jestem spragniony");
                    lub();
                    switch (dec) {
                        case 1:
                            game.death = 10;
                            break;
                        case 2:
                            setStats(0, 0, -5-difficulty, 0);
                            break;
                    }
                    break;
                case 11:
                    setKwestia("Tw??j syn przysy??a Ci w prezencie olejki zapachowe. Wygl??daj?? na bardzo drogie. Czy chcesz ich u??y???");
                    setKwe1("Nie potrzebuj?? olejk??w.");
                    setKwe2("To mi??o z jego strony.");
                    lub();
                    switch (dec) {
                        case 1:
                            setStats(0, 0, -5-difficulty, 0);
                            break;
                        case 2:
                            game.death = 11;
                            break;
                    }
                    break;
                case 12:
                    setKwestia("Rybacy potrzebuj?? drewna na budow?? ??odzi. ??o??nierze za?? domagaj?? si?? nowych w????czni i oszczep??w.");
                    setKwe1("Wspieram rybak??w.");
                    setKwe2("Wspieram ??o??nierzy.");
                    lub();
                    switch (dec) {
                        case 1:
                            setStats(0, -20, 15, 0);
                            break;
                        case 2:
                            setStats(0, 15, -20, 0);
                            break;
                    }
                    break;
                case 13:
                    setKwestia("Run????a kolumna w ??wi??tyni i przygniot??a modl??cego si?? tam kap??ana oraz centuriona! Na miejscu jest medyk, ale ma czas na uratowanie tylko jednej osoby...");
                    setKwe1("Ratujcie centuriona!");
                    setKwe2("Ratujcie kap??ana!");
                    lub();
                    switch (dec) {
                        case 1:
                            setStats(0, 15, 0, -20-difficulty);
                            break;
                        case 2:
                            setStats(0, -20-difficulty, 0, 15);
                            break;
                    }
                    break;
                case 14:
                    setKwestia("Naczelny architekt radzi budow?? nowego akweduktu.");
                    setKwe1("Niech b??dzie.");
                    setKwe2("Mamy ju?? ich wystarczaj??co.");
                    switch (dec) {
                        case 1:
                            setStats(-30, 5, 20, 5);
                            break;
                        case 2:
                            setStats(15, 0, -15-difficulty, 0);
                            break;
                    }
                    break;
                case 15:
                    los = (int) (Math.random() * 2);
                    setKwestia("Ludzie donosz??, ??e picie wody wywo??uje drgawki i b??l ??o????dka. Podejrzewamy, ??e kto?? zanieczyszcza ??r??d??o.");
                    setKwe1("Kto m??g??by to zrobi???");
                    setKwe2("Nie mam na to czasu.");
                    lub();
                    switch (dec) {
                        case 1:
                            setKontynuacja(100015);
                            break;
                        case 2:
                            setKontynuacja(200015);
                            break;
                    }
                    break;
                //case 62:
                case 16:
                    if (quest[16] == 0) {
                        setKwestia("Senat wpad?? na pomys?? modernizacji floty rzymskiej, co pozwoli??oby na pr??b?? podboju Kartaginy w P????nocnej Afryce.");
                        setKwe1("Nasza flota ma si?? dobrze.");
                        setKwe2("To korzystna inwestycja.");
                        lub();
                        switch (dec) {
                            case 1:
                                break;
                            case 2:
                                setStats(-20-difficulty, 15, 0, 0);
                                setQuest(1, 16);
                                break;
                        }
                    } else if (quest[16] == 1) {
                        setKwestia("Flota zosta??a ulepszona. Jeste??my gotowi, by wyruszy?? na podb??j Kartaginy.");
                        setKwe1("Do boju!");
                        setKwe2("Dajmy odpocz???? ??o??nierzom.");
                        lub();
                        switch (dec) {
                            case 1:
                                setStats(-10, -10, 0, 0);
                                setQuest(2, 16);
                                break;
                            case 2:
                                setStats(0, 5, 0, 0);
                                break;
                        }
                    }
                    else if(quest[16]==2){
                        setKwestia("Podb??j Kartaginy zosta?? zako??czony sukcesem, Cesarstwo Rzymskie pokaza??o sw?? pot??g?? ca??emu ??wiatu.");
                        setKwe1("??wietnie!");
                        setKwe2("Wspaniale!");
                        setQuest(3, 16);
                        lub();
                        setStats(20, 20, 20, 20);
                        //setQuest(3,16);
                    }
                    break;
                case 17:
                    setKwestia("Jeden z gladiator??w strajkuje. ????da ostrzejszego miecza i nowych sanda????w.");
                    setKwe1("Nie zawracajcie mi tym g??owy");
                    setKwe2("Dajcie mu to, o co prosi");
                    //dwie opcje do wyboru
                    lub();
                    switch (dec) {
                        case 1:
                            setStats(10, 0, -15-difficulty, 0);
                            break;
                        case 2:
                            setStats(-15-difficulty, 0, 10, 0);
                            setKontynuacja(200017);
                            break;
                    }
                    break;
                case 18:
                    setKwestia("Cz?????? lw??w z Koloseum przesz??a na wegetarianizm. Nie chc?? ju?? po??era?? ludzi. Aby zmieni??y zdanie, powinni??my zakupi?? dla nich najprzedniejszego mi??sa.");
                    setKwe1("To dobry pomys??");
                    setKwe2("Nie, z??????cie lwy w ofierze Marsowi");
                    lub();
                    switch (dec) {
                        case 1:
                            setStats(-20-difficulty, 0, 15, 0);
                            break;
                        case 2:
                            setStats(0, 0, -15-difficulty, 10);
                            break;
                    }
                    break;
                case 19:
                    setKwestia("Jeden z kap??an??w prosi o pozwolenie na odprawienie czego??, co nazywa \"rytua??em tysi??ca s??o??c\". Zapewnia, ??e przyniesie to dobrobyt ca??emu cesarstwu.");
                    setKwe1("Co za bzdury...");
                    setKwe2("Je??li tak uwa??a...");
                    lub();
                    switch (dec) {
                        case 1:
                            setStats(0, 0, 0, -15-difficulty);
                            break;
                        case 2:
                            setKontynuacja(200019);
                            break;
                    }
                    break;
                case 20:
                    setKwestia("Dzi?? rano z wi??zienia uciek?? niebezpieczny przest??pca. Jego egzekucja mia??a odby?? si?? godzin?? temu. Ludzie domagaj?? si?? wyja??nie??.");
                    setKwe1("To ja ponosz?? odpowiedzialno????");
                    setKwe2("Obwi??cie stra??");
                    lub();
                    switch (dec) {
                        case 1:
                            setStats(0, 15, -20-difficulty, 0);
                            break;
                        case 2:
                            setStats(0, -20-difficulty, 15, 0);
                            break;
                    }
                    break;
                case 21:
                    if (quest[21] == 0) {
                        setKwestia("Senat zaleca odnowienie dr??g prowadz??cych do miasta.");
                        setKwe1("Odn??wmy je");
                        setKwe2("Nie jest to konieczne");
                        lub();
                        switch (dec) {
                            case 1:
                                setStats(-20-difficulty, 0, 15+difficulty, 0);
                                break;
                            case 2:
                                setStats(10+difficulty, 0, -15-difficulty, 0);
                                break;
                        }
                        break;
                    }
                    if (quest[21] == 1) {
                        setKwestia("Senat wpad?? na pomys?? zorganizowania wy??cigu konnego po rzymskich drogach. Lud by??by zachwycony.");
                        setKwe1("??wietny pomys??");
                        setKwe2("Nie sta?? nas na to");
                        lub();
                        switch (dec) {
                            case 1:
                                setStats(-20-difficulty, 0, 10+difficulty, 10);
                                break;
                            case 2:
                                setStats(15+difficulty, 0, -10-difficulty ,-10);
                                break;
                        }
                        break;
                    }
                case 22:
                    setKwestia("W tym roku uprawy rolne by??y wyj??tkowo obfite.");
                    setKwe1("Bogowie nad nami czuwaj??");
                    setKwe2("To zas??uga pracowito??ci rolnik??w");
                    lub();
                    switch (dec) {
                        case 1:
                            setStats(0, 0, 0, 15);
                            break;
                        case 2:
                            setStats(0, 0, 15, 0);
                            break;
                    }
                    break;
                case 23:
                    setKwestia("Specjali??ci donosz??, ??e g????wny szyb w jednej z kopalni miedzi mo??e w ka??dej chwili ulec zawaleniu.");
                    setKwe1("To ma??o prawdopodobne.");
                    setKwe2("Ewakuujcie g??rnik??w.");
                    //dwie opcje do wyboru
                    lub();
                    switch (dec) {
                        case 1:
                            setKontynuacja(100023);
                            break;
                        case 2:
                            setKontynuacja(200023);
                            break;
                    }
                    break;
                case 24:
                    setKwestia("Centurioni ????daj?? dostawy niewolnik??w. Mo??ni obywatele r??wnie??.");
                    setKwe1("Wojsko ma pierwsze??stwo.");
                    setKwe2("Lud ma pierwsze??stwo.");
                    lub();
                    switch (dec) {
                        case 1:
                            setStats(0, 15, -15-difficulty, 0);
                            break;
                        case 2:
                            setStats(0, -15-difficulty, 15, 0);
                            break;
                    }
                    break;
                case 25:
                    setKwestia("Na jednej z nadgranicznych farm, wykryto u k??z dziwny rodzaj wysypki. Podobno jest bardzo zaka??na.");
                    setKwe1("Wy??lijcie tam specjalist??w.");
                    setKwe2("Zabijcie chore kozy.");
                    lub();
                    switch (dec) {
                        case 1:
                            setKontynuacja(100025);
                            break;
                        case 2:
                            setStats(-10-difficulty, 0, -10-difficulty, 0);
                            break;
                    }
                    break;
                case 26:
                    setKwestia("Ko??cz?? nam si?? zapasy li??ci laurowych. Cesarski wizerunek mo??e na tym ucierpie??.");
                    setKwe1("Zakupcie nowe jak najpr??dzej!");
                    setKwe2("Obejd?? si?? bez li??ci.");

                    lub();
                    switch (dec) {
                        case 1:
                            setStats(-15, 0, 5, 0);
                            break;
                        case 2:
                            setStats(10, 0, -10-difficulty, 0);
                            break;
                    }
                    break;
                case 27:
                    setKwestia("Senat wpad?? na pomys?? zorganizowania specjalnych szkole?? taktyki bitewnej dla centurion??w.");
                    setKwe1("Macie moj?? zgod??.");
                    setKwe2("Nie ma mowy.");
                    lub();
                    switch (dec) {
                        case 1:
                            setStats(-15-difficulty, 15, 0, 0);
                            break;
                        case 2:
                            setStats(15, -15-difficulty, 0 ,0);
                            break;
                    }
                    break;
                case 28:
                    setKwestia("Naczelny genera?? skar??y si??, ??e racje ??ywno??ciowe dla legionist??w s?? zbyt ma??e. Uwa??a, ??e powinni??my przekazywa?? wojsku cz?????? jedzenia przeznaczonego dla obywateli.");
                    setKwe1("Zgadzam si?? z nim.");
                    setKwe2("Legioni??ci maj?? walczy??, nie je????.");
                    lub();
                    switch (dec) {
                        case 1:
                            setStats(0, 15, -20, 0);
                            break;
                        case 2:
                            setStats(0, -20, 15 ,0);
                            break;
                    }
                    break;
                case 29:
                    setKwestia("Zbli??aj?? si?? Saturnalia - ??wi??to Saturna. Czy zorganizowa?? jego obchody?");
                    setKwe1("Mo??e w przysz??ym roku.");
                    setKwe2("Oczywi??cie.");
                    lub();
                    switch (dec) {
                        case 1:
                            setStats(20+difficulty, -10, -10-difficulty, -10-difficulty);
                            break;
                        case 2:
                            setStats(-25-difficulty, 10, 10, 10);
                            break;
                    }
                    break;
                case 30:
                    setKwestia("Kowal z Akwilei twierdzi, ??e wynalaz?? spos??b wytwarzania nowego metalu - dwukrotnie mocniejszego i l??ejszego od tego, kt??rego u??ywa nasza armia.");
                    setKwe1("Sfinansujcie jego badania.");
                    setKwe2("To strata pieni??dzy");
                    lub();
                    switch (dec) {
                        case 1:
                            setKontynuacja(100030);
                            break;
                        case 2:
                            setStats(5, 0, -10, 0);
                            break;
                    }
                    break;
                case 31:
                    setKwestia("Na ulicach panosz?? si?? myszy i szczury. Roznosz?? choroby i kradn?? jedzenie. Powinni??my co?? zrobi??!");
                    setKwe1("Szczury to nie koniec ??wiata");
                    setKwe2("Co proponujesz?");
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
                    setKwestia("Barbarzy??cy napadaj?? na mieszka??c??w p????nocnych miasteczek");
                    setKwe1("Wy??lijcie wojsko");
                    setKwe2("Ka??cie ludziom ucieka?? na po??udnie");
                    lub();
                    switch (dec) {
                        case 1:
                            setStats(0, -20-difficulty, 15, 0);
                            break;
                        case 2:
                            setStats(0, 15, -20-difficulty, 0);
                            break;
                    }
                    break;
                case 33:
                    setKwestia("Tw??j syn prosi o nowego rumaka. Stary podobno mu si?? znudzi??.");
                    setKwe1("Dajcie mu go.");
                    setKwe2("Nie mam na to czasu.");
                    lub();
                    switch (dec) {
                        case 1:
                            setStats(-10-difficulty, 0, 10, 0);
                            break;
                        case 2:
                            setStats(10, 0, -10-difficulty, 0);
                            break;
                    }
                    break;
                case 34:
                    setKwestia("Piraci napadaj?? na naszych kupc??w. Musimy zapewni?? nieustann?? ochron?? morsk?? dla handlarzy.");
                    setKwe1("Zapewnijcie im wsparcie armii.");
                    setKwe2("Dadz?? sobie rad?? bez naszej pomocy.");
                    lub();
                    switch (dec) {
                        case 1:
                            setStats(15, -25-difficulty, 10, 0);
                            break;
                        case 2:
                            setStats(-15-difficulty, 25, -15, 0);
                            break;
                    }
                    break;
                case 35:
                    setKwestia("Grupa pa??acowych kronikarzy pragnie wyda?? dzie??o o Twych wspania??ych rz??dach. Oczywi??cie, wszystkie niewygodne fakty zostan?? pomini??te.");
                    setKwe1("To niedobry pomys??");
                    setKwe2("To ??wietny pomys??");
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
                    setKwestia("Rzymskie ??a??nie s?? ostatnio w bardzo niehigienicznym stanie. Kto?? musi porz??dnie zadba?? o ich czysto????.");
                    setKwe1("To obowi??zek obywateli");
                    setKwe2("To obowi??zek ??o??nierzy");
                    lub();
                    switch (dec) {
                        case 1:
                            setStats(0, 15, -20-difficulty, 0);
                            break;
                        case 2:
                            setStats(0, -20-difficulty, 15, 0);
                            break;
                    }
                    break;
                case 37:
                    setKwestia("Z wyprawy do Azji Mniejszej przywieziona zosta??a spora skrzynia ze z??otem");
                    setKwe1("Lud jest bogaty!");
                    setKwe2("Jestem bogaty!");
                    lub();
                    switch (dec) {
                        case 1:
                            setStats(10, 10, 10, 10);
                            break;
                        case 2:
                            setStats(30, 0, 0, 0);
                            break;
                    }
                    break;
                case 38:
                    setKwestia("Astrologowie prosz?? o pozwolenie na z??o??enie w ofierze Jowiszowi dziesi??ciu barank??w.");
                    setKwe1("Niech tak zrobi??.");
                    setKwe2("To nie jest konieczne.");
                    lub();
                    switch (dec) {
                        case 1:
                            setStats(-10, 0, -10-difficulty, 15);
                            break;
                        case 2:
                            setStats(10, 0, 0, -15-difficulty);
                            break;
                    }
                    break;
                case 39:
                    setKwestia("Przyby??a dostawa wy??mienitej jako??ci drewna. Armia potrzebuje nowych w????czni i oszczep??w, za?? kap??ani ????daj?? remontu sufitu w ??wi??tyni boginii Westy.");
                    setKwe1("??wi??tynia jest wa??niejsza");
                    setKwe2("W????cznie s?? wa??niejsze");
                    lub();
                    switch (dec) {
                        case 1:
                            setStats(0, -20-difficulty, 0, 15);
                            break;
                        case 2:
                            setStats(0, 15, 0, -20-difficulty);
                            break;
                    }
                    break;
                case 40:
                    setKwestia("Kowal z Akwilei twierdzi, ??e potrafi wyku?? miecz odporny na wszelkie z??amania i zgi??cia. Potrzebuje jedynie troch?? funduszy na pokrycie koszt??w.");
                    setKwe1("Sfinansujcie go");
                    setKwe2("To strata czasu");
                    lub();
                    switch (dec) {
                        case 1:
                            setKontynuacja(100040);
                            break;
                        case 2:
                            setStats(0, 0, -5, 0);
                            break;
                    }
                    break;
                case 41:
                    setKwestia("Jeden z doradc??w sugeruje zwi??kszenie racji ??ywno??ciowych gladiatorom, dzi??ki czemu walczyliby bardziej zaci??cie.");
                    setKwe1("Dobrze.");
                    setKwe2("Nie zgadzam si??.");
                    lub();
                    switch (dec) {
                        case 1:
                            setKontynuacja(100041);
                            break;
                        case 2:
                            setStats(10, 0, -10-difficulty, 0);
                            break;
                    }
                    break;
                case 42:
                    setKwestia("M??ody pielgrzym zosta?? przy??apany na kradzie??y ma??ych relikt??w ze ??wi??tyni. Zbrodnia nie jest powa??na, ale powinien zosta?? ukarany.");
                    setKwe1("Niech tak si?? stanie");
                    setKwe2("Zostanie u??askawiony");
                    lub();
                    switch (dec) {
                        case 1:
                            setStats(0, 0, -20-difficulty, 15);
                            break;
                        case 2:
                            setStats(0, 0, 15, -20-difficulty);
                            break;
                    }
                    break;
                case 43:
                    setKwestia("Zesz??ej nocy wybuch?? po??ar w domu w??a??ciciela Rzymskich ??a??ni. Wszyscy zd????yli si?? ewakuowa??, ale budynek ca??kowicie sp??on????. Poszkodowany prosi o wsparcie finansowe.");
                    setKwe1("Sta?? go na zakup nowego domu.");
                    setKwe2("Nie ma sprawy.");
                    lub();
                    switch (dec) {
                        case 1:
                            setStats(15, 0, -15-difficulty, 0);
                            break;
                        case 2:
                            setStats(-15-difficulty, 0, 15, 0);
                            break;
                    }
                    break;
                case 44:
                    setKwestia("Tw??j syn pyta, czy nie zechcia??by?? wzi???? relaksuj??cej k??pieli w pa??acowych termach.");
                    setKwe1("Oczywi??cie!");
                    setKwe2("Innym razem");
                    lub();
                    switch (dec) {
                        case 1:
                            game.death = 8;
                            break;
                        case 2:
                            setStats(0, 0, -5-difficulty, 0);
                            break;
                    }
                    break;
                case 45:
                    setKwestia("Grupa m????czyzn propopuje nam swe us??ugi jako po??awiacze pere??. W zamian za regularn?? pensj??, b??d?? ??owi?? dla nas te rzadkie klejnoty.");
                    setKwe1("Uczy??my tak.");
                    setKwe2("To si?? nam nie op??aci.");
                    lub();
                    switch (dec) {
                        case 1:
                            setKontynuacja(100045);
                            break;
                        case 2:
                            break;
                    }
                    break;
                case 46:
                    setKwestia("Jeden z legionist??w wda?? si?? w sprzeczk?? z kap??anem i ??miertelnie go zrani??. Kolegium, do kt??rego przynale??y?? denat domaga si?? sprawiedliwo??ci.");
                    setKwe1("Ukarzcie legionist??.");
                    setKwe2("To by?? wypadek.");
                    lub();
                    switch (dec) {
                        case 1:
                            setStats(0, -20, 0, 15);
                            break;
                        case 2:
                            setStats(0, 15, 0,-20);
                            break;
                    }
                    break;
                case 47:
                    setKwestia("Dosz??y nas plotki o planowanym powstaniu ludu Tektosag??w na terenach Galacji. Powinno si?? zaj???? tym wojsko, ale je??li to tylko plotki, wys??anie tam ??o??nierzy wywo??a strach w??r??d ludno??ci");
                    setKwe1("Wy??lijcie armi??");
                    setKwe2("Czekajmy na rozw??j sytuacji");
                    lub();
                    switch (dec) {
                        case 1:
                            setKontynuacja(100047);
                            break;
                        case 2:
                            setKontynuacja(200047);
                            break;
                    }
                    break;
                case 48:
                    setKwestia("Wczoraj jeden z legionist??w zacz???? biega?? po mie??cie odbijaj??c od ziemi napompowany ??wi??ski p??cherz. Kilkoro ludzi przy????czy??o si?? do niego.");
                    setKwe1("Zak????caj?? porz??dek publiczny!");
                    setKwe2("To dziwne, ale przecie?? zgodne z prawem.");
                    lub();
                    switch (dec) {
                        case 1:
                            setStats(0, 0, -10-difficulty, 0);
                            break;
                        case 2:
                            setStats(0, 0, 10, 0);
                            break;
                    }
                    break;
                case 49:
                    setKwestia("Mamy nadwy??ki w mi??sie i winie. Co powinni??my z nimi zrobi???");
                    setKwe1("Dajcie je kap??anom.");
                    setKwe2("Dajcie je wojsku.");
                    lub();
                    switch (dec) {
                        case 1:
                            setStats(0, -15-difficulty, 0, 15);
                            break;
                        case 2:
                            setStats(0, 15, 0, -15-difficulty);
                            break;
                    }
                    break;
                case 50:
                    setKwestia("Kap??ani twierdz??, ??e bogowie patrz?? na nas krzywym okiem. Radz?? rozpalanie ognia w ka??dym domostwie przez najbli??szy miesi??c.");
                    setKwe1("Niech b??dzie.");
                    setKwe2("Nie ma opcji!");
                    lub();
                    switch (dec) {
                        case 1:
                            setStats(-15, 0, -5-difficulty, 15);
                            break;
                        case 2:
                            setStats(15, 0, 0, -20-difficulty);
                            break;
                    }
                    break;
                case 51:
                    setKwestia("Lud uwa??a, ??e kap??anom powodzi si?? zbyt dobrze. Oczekuj?? obni??enia podatk??w dla ludzi ??wieckich i podwy??szenia ich duchownym.");
                    setKwe1("Je??li to konieczne...");
                    setKwe2("Nie ma mowy!");
                    lub();
                    switch (dec) {
                        case 1:
                            setStats(-10, 0, 10, -15-difficulty);
                            break;
                        case 2:
                            setStats(10, 0, -15-difficulty, 10);
                            break;
                    }
                    break;
                case 52:
                    setKwestia("Zorganizowanie wy??cigu rydwan??w w Circus Maximus z pewno??ci?? poprawi??oby nastr??j obywatelom.");
                    setKwe1("??wietny pomys??.");
                    setKwe2("Mo??e innym razem.");
                    lub();
                    switch (dec) {
                        case 1:
                            setStats(-30, 0, 15, 10);
                            break;
                        case 2:
                            setStats(20, 0, -15, -10);
                            break;
                    }
                    break;
                case 53:
                    setKwestia("Jeden z legionist??w splun???? na ??cian?? ??wi??tyni bogini Wenus. Kap??ani s?? oburzeni - rz??daj?? wymierzenia dotkliwej kary.");
                    setKwe1("Nie ma takiej potrzeby.");
                    setKwe2("Poniesie konsekwencje.");
                    lub();
                    switch (dec) {
                        case 1:
                            setStats(0, 15, 0, -15-difficulty);
                            break;
                        case 2:
                            setStats(0, -15-difficulty, 0, 15);
                            break;
                    }
                    break;
                case 54:
                    setKwestia("Sp????nia si?? dostawa wina, a pa??acowe zapasy s?? na wyczerpaniu. Powinni??my wzi???? kilka beczek tego trunku z pobliskiej tawerny. Rzecz jasna, b??dzie ono nieco gorsze od wina cesarskiego.");
                    setKwe1("Wino to wino, nieistotne sk??d pochodzi.");
                    setKwe2("Zaczekamy na wino lepszej jako??ci.");
                    lub();
                    switch (dec) {
                        case 1:
                            setStats(10, 0, -15-difficulty, 0);
                            break;
                        case 2:
                            setStats(-15-difficulty, 0, 10, 0);
                            break;
                    }
                    break;
                case 55:
                    setKwestia("Ilo???? ??elaza wydobywanego z naszych kopal?? niemal si?? podwoi??a. Mo??emy da?? cz?????? kupcom, by je spieni????yli.");
                    setKwe1("Zr??bmy tak.");
                    setKwe2("Dajmy to ??elazo armii.");
                    lub();
                    switch (dec) {
                        case 1:
                            setStats(20, -15, 0, 0);
                            break;
                        case 2:
                            setStats(-10, 20, -5, 0);
                            break;
                    }
                    break;
                case 56:
                    setKwestia("Kuchnia pa??acowa cz??sto nie wie co robi?? z g??r?? resztek. Mogliby??my je komu?? odda??...");
                    setKwe1("Niewolnikom");
                    setKwe2("Z??????my je w ofierze bogom.");
                    lub();
                    switch (dec) {
                        case 1:
                            setStats(0, 0, 15, -10-difficulty);
                            break;
                        case 2:
                            setStats(0, 0, -10-difficulty, 15);
                            break;
                    }
                    break;
                case 57:
                    setKwestia("Handel na p????nocy jest coraz bardziej utrudniony przez napady barbarzy??c??w na kupc??w. Powinni??my wys??a?? tam wojsko, by zaprowadzi?? porz??dek.");
                    setKwe1("Niech tak si?? stanie");
                    setKwe2("To nie jest konieczne");
                    lub();
                    switch (dec) {
                        case 1:
                            setStats(15, -30, 10, 0 );
                            break;
                        case 2:
                            setStats(-15, 20, -10, 0);
                            break;
                    }
                    break;
                case 58:
                    setKwestia("Cz?????? kr??w zacz????a dawa?? s??one mleko. Specjali??ci my??l??, ??e to przez u??ycie nowego nawozu. Powinni??my wyprodukowa?? nowy");
                    setKwe1("Pozb??d??cie si?? nawozu.");
                    setKwe2("To nie wina nawozu.");
                    lub();
                    switch (dec) {
                        case 1:
                            setKontynuacja(100058);
                            break;
                        case 2:
                            setKontynuacja(200058);
                            break;
                    }
                    break;
                case 59:
                    setKwestia("Pa??acowy medyk stworzy?? nowatorsk?? kuracj?? dla twarzy. Mo??ni du??o za ni?? zap??ac??, jednak najpierw trzeba j?? b??dzie przetestowa?? na niewolnikach");
                    setKwe1("Dobrze");
                    setKwe2("To zbyt ryzykowne");
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
                    setKwestia("Senat wpad?? na pomys?? wprowadzenia nowej konkurencji walk gladiator??w - walki wr??cz - czyli pojedynk??w bez u??ycia broni.");
                    setKwe1("To nie ma sensu...");
                    setKwe2("??wietny pomys??!");
                    lub();
                    switch (dec) {
                        case 1:
                            break;
                        case 2:
                            setKontynuacja(200060);
                            break;
                    }
                    break;
                case 61:
                    if(quest[61]==0){
                        //legiony = 5;
                        if(legiony > 5){
                            setKwestia("Jeste??my wystarczaj??co silni, by zaatakowa?? i podbi?? ziemie barbarzy??skiego plemiona Alaman??w. Wielu naszych ??o??nierzy polegnie w boju, ale to niska cena w zamian za poszerzenie terytorium Cesarstwa Rzymskiego.");
                            setKwe1("Do boju!");
                            setKwe2("Nie mo??emy ryzykowa?? ??ycia legionist??w.");
                            lub();
                            switch (dec) {
                                case 1:
                                    setStats(0, -5, 0, 0);
                                    quest[61]++;
                                    break;
                                case 2:
                                    break;
                            }
                            break;
                        }
                        else{
                            setKwestia("Tw??j syn pyta, czy nie zechcia??by?? wybra?? si?? z nim do Cyrku.");
                            setKwe1("Mo??e innym razem.");
                            setKwe2("Z przyjemno??ci??.");
                            lub();
                            switch (dec) {
                                case 1:
                                    break;
                                case 2:
                                    setKontynuacja(200061);
                                    break;
                            }
                            break;
                        }
                    }
                    else if(quest[61]==1){
                        if(legiony > 10){
                            setKwestia("Jeste??my wystarczaj??co silni, by zaatakowa?? i podbi?? ziemie barbarzy??skiego plemiona Sweb??w. Wielu naszych ??o??nierzy polegnie w boju, ale to niska cena w zamian za poszerzenie terytorium Cesarstwa Rzymskiego.");
                            setKwe1("Do boju!");
                            setKwe2("Nie mo??emy ryzykowa?? ??ycia legionist??w.");
                            lub();
                            switch (dec) {
                                case 1:
                                    setStats(0, -10, 0, 0);
                                    quest[61]++;
                                    break;
                                case 2:
                                    break;
                            }
                            break;
                        }
                        else{
                            setKwestia("Tw??j syn pyta, czy nie zechcia??by?? wybra?? si?? z nim do Cyrku.");
                            setKwe1("Mo??e innym razem.");
                            setKwe2("Z przyjemno??ci??.");
                            lub();
                            switch (dec) {
                                case 1:
                                    break;
                                case 2:
                                    setKontynuacja(200061);
                                    break;
                            }
                            break;
                        }
                    }
                    else if(quest[61]==2){
                        if(legiony > 15){
                            setKwestia("Jeste??my wystarczaj??co silni, by zaatakowa?? i podbi?? ziemie barbarzy??skiego plemiona Kwad??w. Wielu naszych ??o??nierzy polegnie w boju, ale to niska cena w zamian za poszerzenie terytorium Cesarstwa Rzymskiego.");
                            setKwe1("Do boju!");
                            setKwe2("Nie mo??emy ryzykowa?? ??ycia legionist??w.");
                            lub();
                            switch (dec) {
                                case 1:
                                    setStats(0, -15, 0, 0);
                                    quest[61]++;
                                    break;
                                case 2:
                                    break;
                            }
                            break;
                        }
                        else{
                            setKwestia("Tw??j syn pyta, czy nie zechcia??by?? wybra?? si?? z nim do Cyrku.");
                            setKwe1("Mo??e innym razem.");
                            setKwe2("Z przyjemno??ci??.");
                            lub();
                            switch (dec) {
                                case 1:
                                    break;
                                case 2:
                                    setKontynuacja(200061);
                                    break;
                            }
                            break;
                        }
                    }
                    else if(quest[61]==3){
                        if(legiony > 20){
                            setKwestia("Jeste??my wystarczaj??co silni, by zaatakowa?? i podbi?? ziemie barbarzy??skiego plemiona Burgund??w. Wielu naszych ??o??nierzy polegnie w boju, ale to niska cena w zamian za poszerzenie terytorium Cesarstwa Rzymskiego.");
                            setKwe1("Do boju!");
                            setKwe2("Nie mo??emy ryzykowa?? ??ycia legionist??w.");
                            lub();
                            switch (dec) {
                                case 1:
                                    setStats(0, -20, 0, 0);
                                    quest[61]++;
                                    break;
                                case 2:
                                    break;
                            }
                            break;
                        }
                        else{
                            setKwestia("Tw??j syn pyta, czy nie zechcia??by?? wybra?? si?? z nim do Cyrku.");
                            setKwe1("Mo??e innym razem.");
                            setKwe2("Z przyjemno??ci??.");
                            lub();
                            switch (dec) {
                                case 1:
                                    break;
                                case 2:
                                    setKontynuacja(200061);
                                    break;
                            }
                            break;
                        }
                    }
                    else if(quest[61]==4){
                        if(legiony > 30){
                            setKwestia("Jeste??my wystarczaj??co silni, by zaatakowa?? i podbi?? ziemie barbarzy??skiego plemiona Wandal??w. Wielu naszych ??o??nierzy polegnie w boju, ale to niska cena w zamian za poszerzenie terytorium Cesarstwa Rzymskiego.");
                            setKwe1("Do boju!");
                            setKwe2("Nie mo??emy ryzykowa?? ??ycia legionist??w.");
                            lub();
                            switch (dec) {
                                case 1:
                                    setStats(0, -30, 0, 0);
                                    quest[61]++;
                                    break;
                                case 2:
                                    break;
                            }
                            break;
                        }
                        else{
                            setKwestia("Tw??j syn pyta, czy nie zechcia??by?? wybra?? si?? z nim do Cyrku.");
                            setKwe1("Mo??e innym razem.");
                            setKwe2("Z przyjemno??ci??.");
                            lub();
                            switch (dec) {
                                case 1:
                                    break;
                                case 2:
                                    setKontynuacja(200061);
                                    break;
                            }
                            break;
                        }
                    }
                    else if(quest[61]==5){
                        if(legiony > 50){
                            setKwestia("Jeste??my wystarczaj??co silni, by zaatakowa?? i podbi?? ziemie barbarzy??skiego plemiona Angl??w. Wielu naszych ??o??nierzy polegnie w boju, ale to niska cena w zamian za poszerzenie terytorium Cesarstwa Rzymskiego.");
                            setKwe1("Do boju!");
                            setKwe2("Nie mo??emy ryzykowa?? ??ycia legionist??w.");
                            lub();
                            switch (dec) {
                                case 1:
                                    setStats(0, -50, 0, 0);
                                    quest[61]++;
                                    break;
                                case 2:
                                    break;
                            }
                            break;
                        }
                        else{
                            setKwestia("Tw??j syn pyta, czy nie zechcia??by?? wybra?? si?? z nim do Cyrku.");
                            setKwe1("Mo??e innym razem.");
                            setKwe2("Z przyjemno??ci??.");
                            lub();
                            switch (dec) {
                                case 1:
                                    break;
                                case 2:
                                    setKontynuacja(200061);
                                    break;
                            }
                            break;
                        }
                    }
                    else if(quest[61]==6){
                        if(legiony > 60){
                            setKwestia("Jeste??my wystarczaj??co silni, by zaatakowa?? i podbi?? ziemie barbarzy??skiego plemiona Jut??w. Wielu naszych ??o??nierzy polegnie w boju, ale to niska cena w zamian za poszerzenie terytorium Cesarstwa Rzymskiego.");
                            setKwe1("Do boju!");
                            setKwe2("Nie mo??emy ryzykowa?? ??ycia legionist??w.");
                            lub();
                            switch (dec) {
                                case 1:
                                    setStats(0, -60, 0, 0);
                                    quest[61]++;
                                    break;
                                case 2:
                                    break;
                            }
                            break;
                        }
                        else{
                            setKwestia("Tw??j syn pyta, czy nie zechcia??by?? wybra?? si?? z nim do Cyrku.");
                            setKwe1("Mo??e innym razem.");
                            setKwe2("Z przyjemno??ci??.");
                            lub();
                            switch (dec) {
                                case 1:
                                    break;
                                case 2:
                                    setKontynuacja(200061);
                                    break;
                            }
                            break;
                        }
                    }
                    else if(quest[61]==7){
                        if(legiony > 75){
                            setKwestia("Jeste??my wystarczaj??co silni, by zaatakowa?? i podbi?? ziemie barbarzy??skiego plemiona Wizygot??w. Wielu naszych ??o??nierzy polegnie w boju, ale to niska cena w zamian za poszerzenie terytorium Cesarstwa Rzymskiego.");
                            setKwe1("Do boju!");
                            setKwe2("Nie mo??emy ryzykowa?? ??ycia legionist??w.");
                            lub();
                            switch (dec) {
                                case 1:
                                    setStats(0, -75, 0, 0);
                                    quest[61]++;
                                    break;
                                case 2:
                                    break;
                            }
                            break;
                        }
                        else{
                            setKwestia("Tw??j syn pyta, czy nie zechcia??by?? wybra?? si?? z nim do Cyrku.");
                            setKwe1("Mo??e innym razem.");
                            setKwe2("Z przyjemno??ci??.");
                            lub();
                            switch (dec) {
                                case 1:
                                    break;
                                case 2:
                                    setKontynuacja(200061);
                                    break;
                            }
                            break;
                        }
                    }
                    else if(quest[61]==8){
                        if(legiony > 90){
                            setKwestia("Jeste??my wystarczaj??co silni, by zaatakowa?? i podbi?? ziemie barbarzy??skiego plemiona Hun??w. Wielu naszych ??o??nierzy polegnie w boju, ale to niska cena w zamian za poszerzenie terytorium Cesarstwa Rzymskiego.");
                            setKwe1("Do boju!");
                            setKwe2("Nie mo??emy ryzykowa?? ??ycia legionist??w.");
                            lub();
                            switch (dec) {
                                case 1:
                                    setStats(0, -90, 0, 0);
                                    quest[61]++;
                                    break;
                                case 2:
                                    break;
                            }
                            break;
                        }
                        else{
                            setKwestia("Tw??j syn pyta, czy nie zechcia??by?? wybra?? si?? z nim do Cyrku.");
                            setKwe1("Mo??e innym razem.");
                            setKwe2("Z przyjemno??ci??.");
                            lub();
                            switch (dec) {
                                case 1:
                                    break;
                                case 2:
                                    setKontynuacja(200061);
                                    break;
                            }
                            break;
                        }
                    }
                    else if(quest[61]==9){
                        setKwestia("Twoje Imperium sta??o si?? prawdziw?? pot??g??. Jeste?? najlepszym W??adc??, jakiego kiedukolwiek mia??o Cesarstwo Rzymskie.");
                        setKwe1("...");
                        setKwe2("...");
                        lub();
                        setStats(15, 15, 15, 15);
                        break;
                    }
                    break;


                //casy kontynuuj??ce dany w??tek od razu po poprzednim
                case 100002:
                    los = 0;
                    while (los == 0) {
                        los = (int) (Math.random() * 4);
                    }
                    if (los == 1) {
                        setKwestia("Na wie??ci o podwy??ce zareagowa?? r??wnie?? jeden inny legion. Jego ??o??nierze tak??e chc?? podwy??szenia p??ac.");
                    } else {
                        setKwestia("Na wie??ci o podwy??ce zareagowa??y r??wnie?? " + los + " inne legiony. One tak??e chc?? podwy??szenia p??ac.");
                    }
                    setKwe1("Nie ma mowy.");
                    setKwe2("Wynegocjuj niewielk?? podwy??k??.");
                    lub();
                    switch (dec) {
                        case 1:
                            setStats(5+difficulty, -15-difficulty, 0, 0);
                            break;
                        case 2:
                            setStats(-los*5, los*5-5, 0, 0 );
                            break;
                    }
                    break;



                case 100004:
                    setKwestia("??rodek okaza?? si?? wywo??ywa?? problemy z trawieniem i utrat?? ??wiadomo??ci. Dwaj testowani niewolnicy zmarli po jego za??yciu.");
                    setKwe1("...");
                    setKwe2("...");
                    setTura(getTura() - 1);
                    setStats(0, 0, -20, 0);
                    setKontynuacja(0);
                    lub();
                    break;



                case 100015:
                    setKwestia("Tylko miejski producent wina mia?? motyw - nieufno???? ludu wobec czystej wody zwi??kszy??aby jego zyski. Powinni??my go przes??ucha??.");
                    setKwe1("Dobrze");
                    setKwe2("Mamy inne opcje?");
                    lub();
                    switch (dec) {
                        case 1:
                            setKontynuacja(110015);
                            setStats(0,0,-5,0);
                            setTura(getTura() - 1);
                            break;
                        case 2:
                            setKontynuacja(120015);
                            setTura(getTura() - 1);
                            break;
                    }
                    break;
                case 110015:
                    setKwestia("Producent wina zosta?? przes??uchany. Twierdzi, ??e nie ma nic wsp??lnego z zatrutym ??r??d??em.");
                    setKwe1("Jest winny! Straci?? go!");
                    setKwe2("Mamy inne opcje?");
                    lub();
                    switch (dec) {
                        case 1:
                            setKontynuacja(111015);
                            setTura(getTura() - 1);
                            break;
                        case 2:
                            setKontynuacja(112015);
                            setTura(getTura() - 1);
                            break;
                    }
                    break;
                case 112115:
                case 121015:
                    setKwestia("Ekspedycja odnalaz??a u zanieczyszczonego ??r??d??a martw?? owc??, kt??ra zatruwa??a wod??. Winiarz okaza?? si?? by?? niewinny. Lud jest wdzi??czny za Twoje starania w doj??ciu do prawdy.");
                    setKwe1("...");
                    setKwe2("...");
                    setTura(getTura() - 1);
                    setStats(-30, 20, 20, 20);
                    setKontynuacja(0);
                    lub();
                    break;
                case 111015:
                case 112215:
                case 122015:
                    los = (int) (Math.random() * 2);
                    setKwe1("...");
                    setKwe2("...");
                    if (los == 0) {
                        setKwestia("M????czyzna zosta?? stracony. W jego domu odnaleziono szkodliw?? substancj??, kt??ra zatru??a ??r??d??o. Poddani s?? wdzi??czni dzi??ki Twemu s??usznemu os??dowi.");
                        setStats(0, 15, 20, 15);
                    } else {
                        setKwestia("M????czyzna zosta?? stracony. Kilka dni p????niej pasterze znale??li przy zanieczyszczonym ??r??dle martw?? owc??, kt??ra zatruwa??a wod??. Lud jest w??ciek??y, przez Tw??j pochopny os??d winiarza.");
                        setStats(0, -15, -25, -15);
                    }
                    lub();
                    setKontynuacja(0);
                    setTura(getTura() - 1);
                    break;
                case 112015:
                    setKwestia("Mo??emy te?? poszuka?? przyczyny zatrucia u ??r??d??a. Zorganizowanie wyprawy b??dzie jednak bardzo kosztowne.");
                    setKwe1("Niech b??dzie");
                    setKwe2("Nie, rzu??cie winiarza lwom na po??arcie!");
                    setTura(getTura() - 1);
                    lub();
                    switch (dec) {
                        case 1:
                            setKontynuacja(112115);
                            setTura(getTura() - 1);
                            break;
                        case 2:
                            setKontynuacja(112215);
                            setTura(getTura() - 1);
                            break;
                    }
                    break;
                case 120015:
                    setKwestia("Mo??emy te?? poszuka?? przyczyny zatrucia u ??r??d??a. Zorganizowanie wyprawy b??dzie jednak bardzo kosztowne.");
                    setKwe1("Niech b??dzie");
                    setKwe2("Nie, rzu??cie winiarza lwom na po??arcie!");
                    lub();
                    switch (dec) {
                        case 1:
                            setKontynuacja(121015);
                            setTura(getTura() - 1);
                            break;
                        case 2:
                            setKontynuacja(122015);
                            setTura(getTura() - 1);
                            break;
                    }
                    break;
                case 200015:
                    setKwestia("W wyniku wypicia zanieczyszczonej wody, ginie sz??stka dzieci. Lud jest rozgoryczony Twoj?? bezczynno??ci??.");
                    setKwe1("...");
                    setKwe2("...");
                    setKontynuacja(0);
                    setTura(getTura() - 1);
                    setStats(0, -20, -20, -20);
                    lub();
                    break;


                case 200017:
                    setKwestia("Inni gladiatorzy te?? chc?? lepszego traktowania. ????daj?? ostrzejszego miecza i nowych sanda????w dla ka??dego wojownika w Koloseum.");
                    setKwe1("Niech b??dzie");
                    setKwe2("Nie ma mowy");
                    setTura(getTura() - 1);
                    setKontynuacja(0);
                    lub();
                    switch (dec) {
                        case 1:
                            setStats(-20, 0, 20, 0);
                            break;
                        case 2:
                            setStats(15, 0, -20, 0);
                            break;
                    }
                    break;


                case 200019:
                    los = (int) (Math.random() * 2);
                    setTura(getTura() - 1);
                    setKontynuacja(0);
                    setKwe1("...");
                    setKwe2("...");
                    if (los == 0) {
                        setKwestia("Rytua?? okaza?? si?? sukcesem, uprawy rolne rosn?? szybciej ni?? kiedykolwiek. W Cesarstwie nasta?? dobrobyt.");
                        setStats(10, 10, 10, 10);
                    } else {
                        setKwestia("Rytua?? przyni??s?? d??ugotrwa???? susz??, a w p????nocnej cz????ci Cesarstwa wybuch??a plaga myszy.");
                        setStats(-10, -10, -10, -10);
                    }
                    lub();
                    break;


                case 100023:
                    los = (int) (Math.random() * 2);
                    if(los==0){
                        setKwestia("Obawy specjalist??w okaza??y si?? by?? nieuzasadnione. Ku naszej uldze, szyb nie zawali?? si??. Praca g??rnik??w pozosta??a niezak????cona.");
                        setKwe1("...");
                        setKwe2("...");
                        setStats(20, 0, 5, 0);
                        setTura(getTura() - 1);
                        setKontynuacja(0);
                        lub();
                        break;
                    }
                    else{
                        setKwestia("Specjali??ci mieli racj??. Szyb zawali?? si??, powoduj??c ??mier?? kilkunastu ludzi. Poddani s?? w??ciekli.");
                        setKwe1("...");
                        setKwe2("...");
                        setStats(-10, 0, -15-difficulty, 0);
                        setTura(getTura() - 1);
                        setKontynuacja(0);
                        lub();
                        break;
                    }
                case 200023:
                    los = (int) (Math.random() * 2);
                    if(los==0) {
                        setKwestia("Obawy specjalist??w okaza??y si?? by?? nieuzasadnione. Szyb nie zawali?? si??, a ewakuacja g??rnik??w spowodowa??a op????nienia w dostawie miedzi.");
                        setKwe1("...");
                        setKwe2("...");
                        setStats(-10-difficulty, 0, -5, 0);
                        setTura(getTura() - 1);
                        setKontynuacja(0);
                        lub();
                        break;
                    }
                    else{
                        setKwestia("Specjali??ci mieli racj??. Szyb zawali?? si??, a g??rnicy z ulg?? stwierdzili, ??e ich ewakuacja uratowa??a im ??ycie.");
                        setKwe1("...");
                        setKwe2("...");
                        setStats(5, 0, 20, 0);
                        setTura(getTura() - 1);
                        setKontynuacja(0);
                        lub();
                        break;
                    }


                case 100025:
                    setKwestia("Specjali??ci po powrocie do pa??acu nie potrafili zdiagnozowa?? choroby. Kilka dni p????niej wszyscy w mie??cie dostali sw??dz??cej wysypki. Szcz????cie w nieszcz????ciu, zaraza min????a po tygodniu.");
                    setKwe1("...");
                    setKwe2("...");
                    setStats(-15, -15, -15, -15);
                    setTura(getTura() - 1);
                    setKontynuacja(0);
                    lub();
                    break;


                case 100030:
                    setKwestia("Metal okaza?? by?? si?? kompletnym niewypa??em i zmarnowaniem funduszy.");
                    setKwe1("...");
                    setKwe2("...");
                    setStats(-15, 0, 0, 0);
                    setTura(getTura() - 1);
                    setKontynuacja(0);
                    lub();
                    break;


                case 100031:
                    setKwestia("Gryzonie rozmno??y??y si?? i rozlaz??y si?? po ca??ym mie??cie. Obywatele s?? rozgoryczeni.");
                    setKwe1("...");
                    setKwe2("...");
                    setStats(0, 0, -20, 0);
                    setTura(getTura() - 1);
                    setKontynuacja(0);
                    lub();
                    break;
                case 200031:
                    setKwestia("Lud m??g??by przygotowa?? i roz??o??y?? w ca??ym mie??cie trutki na gryzonie. Inn?? opcj?? jest zlecenie tego wojsku.");
                    setKwe1("Wojsko si?? tym zajmie.");
                    setKwe2("Lud si?? tym zajmie.");
                    setTura(getTura() - 1);
                    setKontynuacja(0);
                    lub();
                    switch(dec){
                        case 1:
                            setStats(0, -15, 10, 0);
                            break;
                        case 2:
                            setStats(0, 10, -15,0);
                            break;
                    }
                    break;


                case 200035:
                    setKwestia("Obywatele zauwa??yli przek??amania i zatajenie wielu fakt??w w kronice. Niekt??rzy drwi?? sobie z Ciebie.");
                    setKwe1("...");
                    setKwe2("...");
                    setTura(getTura() - 1);
                    setKontynuacja(0);
                    setStats(0, 0, -15, 0);
                    lub();
                    break;


                case 100040:
                    setKwestia("Miecz okaza?? si?? by?? zupe??n?? pora??k?? i strat?? pieni??dzy.");
                    setKwe1("...");
                    setKwe2("...");
                    setTura(getTura() - 1);
                    setKontynuacja(0);
                    setStats(-15, 0, 0, 0);
                    lub();
                    break;


                case 100041:
                    setKwestia("Najedzeni gladiatorzy stali si?? oci????ali i powolni. Lud od razu zauwa??y?? spadek ich formy.");
                    setKwe1("...");
                    setKwe2("...");
                    setTura(getTura() - 1);
                    setKontynuacja(0);
                    setStats(-10, 0, -15, 0);
                    lub();
                    break;


                case 100045:
                    los = (int)(Math.random()*2);
                    if(los == 0){
                        setKwestia("Inwestycja op??aci??a si?? - sprzedawanie odnajdywanych pere?? generuje du??e zyski.");
                        setKwe1("...");
                        setKwe2("...");
                        setTura(getTura() - 1);
                        setKontynuacja(0);
                        setStats(25, 0, 0, 0);
                        lub();
                        break;
                    }
                    else if(los == 1){
                        setKwestia("Po??awiacze pere?? okazali si?? by?? zwyk??ymi oszustami - po otrzymaniu pensji uciekli na wsch??d. Odnalezienie ich jest ju?? niemo??liwe.");
                        setKwe1("...");
                        setKwe2("...");
                        setTura(getTura() - 1);
                        setKontynuacja(0);
                        setStats(-15-difficulty, 0, 0, 0);
                        lub();
                        break;
                    }



                case 100047:
                    setKwestia("Powstanie rzeczywi??cie by??o przygotowywane. Ludzie s?? wdzi??czni za b??yskawiczn?? reakcj?? wojska.");
                    setKwe1("...");
                    setKwe2("...");
                    setTura(getTura() - 1);
                    setKontynuacja(0);
                    setStats(0, 15 ,15, 15);
                    lub();
                    break;
                case 200047:
                    setKwestia("Powstanie nie by??o plotk??. Wielu ludzi musia??o ucieka?? ze swych domostw na zach??d.");
                    setKwe1("...");
                    setKwe2("...");
                    setTura(getTura() - 1);
                    setKontynuacja(0);
                    setStats(0, -15, -15, -15);
                    lub();
                    break;



                case 100058:
                    setKwestia("Po pozbyciu si?? nawozu, zwierz??ta wyzdrowia??y. Hodowcy s?? wdzi??czni za Twoj?? pomoc.");
                    setKwe1("...");
                    setKwe2("...");
                    setStats(10, 0, 10, 0);
                    setTura(getTura() - 1);
                    setKontynuacja(0);
                    lub();
                    break;
                case 200058:
                    setKwestia("Hodowcy pozostali przy u??ywaniu nawozu. Problem ze s??onym mlekiem pozosta?? nierozwi??zany. Chore krowy musia??y zosta?? zabite.");
                    setKwe1("...");
                    setKwe2("...");
                    setTura(getTura() - 1);
                    setKontynuacja(0);
                    setStats(-15, 0, 0, 0);
                    lub();
                    break;



                case 100059:
                    setKwestia("Ma???? okaza??a si?? by?? sukcesem, sta??a si?? bardzo popularna w??r??d elity mieszka??c??w Rzymu.");
                    setKwe1("...");
                    setKwe2("...");
                    setTura(getTura() - 1);
                    setKontynuacja(0);
                    setStats(15, 0, 15, 0);
                    lub();
                    break;





                case 200060:
                    setKwestia("Walki wr??cz okazuj?? si?? by?? straszliwie ma??o dynamiczne, niezbyt krwawe oraz po prostu nudne. Ludzie nie chc?? ogl??da?? nowej konkurencji.");
                    setKwe1("...");
                    setKwe2("...");
                    setTura(getTura() - 1);
                    setKontynuacja(0);
                    setStats(0, 0, -20, 0);
                    lub();
                    break;


                case 200061:
                    setKwestia("Wyj??cie do Cyrku z Twoim Synem okaza??o si?? by?? bardzo przyjemne. Powracasz do pa??acu w wyj??tkowo dobrym humorze.");
                    setKwe1("...");
                    setKwe2("...");
                    setTura(getTura() - 1);
                    setKontynuacja(0);
                    lub();
                    break;
            }
            setTura(getTura() + 1);
            if(getTura() % 10 == 0){
                difficulty += 5;
            }
        }
        else if(game.death==1){
            game.death = 0;
            setKwestia("Z powodu panuj??cej w Twoim pa??stwie biedy i ub??stwa, na po??udniu Cesarstwa wybucha ??miertelna zaraza, kt??ra dziesi??tkuje ludno????. Umierasz w swojej sypialni, kaszl??c i pluj??c krwi??.");
            setKwe1("...");
            setKwe2("...");
            game.death = 0;
            game.grane = false;
            lub();

            changeDeath_screen();
        }
        else if(game.death==2){
            game.death = 0;
            setKwestia("Plemiona barbarzy??c??w, widz??c bogactwo Cesarstwa, postanawiaj?? si?? zjednoczy?? i wsp??lnie najecha?? Rzym. Twoje pa??stwo zostaje spl??drowane, a Ty musisz uda?? si?? na wygnanie. Z rozpaczy pope??niasz samob??jstwo.");
            setKwe1("...");
            setKwe2("...");
            game.death = 0;
            game.grane = false;
            lub();

            changeDeath_screen();
        }
        else if(game.death==3){
            game.death = 0;
            setKwestia("Rzym zostaje najechany przez dzikie plemiona barbarzy??c??w z p????nocy. Razem ze swoim ostatnim genera??em zostajesz otoczony w swoim pa??acu i zamordowany. Twoje cia??o spoczywa w ka??u??y krwi.");
            setKwe1("...");
            setKwe2("...");
            game.death = 0;
            game.grane = false;
            lub();

            changeDeath_screen();
        }
        else if(game.death==4){
            game.death = 0;
            setKwestia("Naczelny genera??, wykorzystuj??c pot??g?? armii rzymskiej, otacza Tw??j pa??ac i domaga si?? natychmiastowej kapitulacji. Po z??o??eniu broni, zostajesz publicznie stracony.");
            setKwe1("...");
            setKwe2("...");
            game.death = 0;
            game.grane = false;
            lub();

            changeDeath_screen();
        }
        else if(game.death==5){
            game.death = 0;
            setKwestia("Oddzia?? niezadowolonych z Twoich rz??d??w rebeliant??w wdziera si?? do pa??acu i przegania Ci?? po ulicach miasta. Zostajesz zniewa??ony i rzucony lwom na po??arcie.");
            setKwe1("...");
            setKwe2("...");
            game.death = 0;
            game.grane = false;
            lub();

            changeDeath_screen();
        }
        else if(game.death==6){
            game.death = 0;
            setKwestia("");
            setKwe1("...");
            setKwe2("...");
            game.death = 0;
            game.grane = false;
            lub();
            changeDeath_screen();
        }
        else if(game.death==7){
            game.death = 0;
            setKwestia("W czasie kryzysu wiary lud podwa??a Twoje prawo do w??adzy i zwraca si?? przeciwko Tobie i kap??anom. Giniesz stratowany przez w??ciek???? t??uszcz??.");
            setKwe1("...");
            setKwe2("...");
            game.death = 0;
            game.grane = false;
            lub();

            changeDeath_screen();
        }
        else if(game.death==8){
            game.death = 0;
            setKwestia("Bior??c k??piel zaczynasz traci?? ??wiadomo????, umierasz w basenie z powodu udaru.");
            setKwe1("...");
            setKwe2("...");
            game.death = 0;
            game.grane = false;
            lub();

            changeDeath_screen();
        }
        else if(game.death==9){
            game.death = 0;
            setKwestia("Siedz??c na fotelu, zamykasz oczy. Nagle fryzjer przyk??ada Ci do ust kawa??ek szmatki, przez co nie mo??esz oddycha??.. Umierasz przez uduszenie.");
            setKwe1("...");
            setKwe2("...");
            game.death = 0;
            game.grane = false;
            lub();
            changeDeath_screen();
        }
        else if(game.death==10){
            game.death = 0;
            setKwestia("Pij??c wino, odczuwasz kr??cenie w g??owie. Chwil?? p????niej, le??ysz martwy przed tronem.");
            setKwe1("...");
            setKwe2("...");
            game.death = 0;
            game.grane = false;
            lub();

            changeDeath_screen();
        }
        else if(game.death==11){
            game.death = 0;
            setKwestia("Zapach olejk??w usypia Ci??, twoja g??owa robi si?? ci????ka. Godzin?? p????niej s??u??ba znajduje Ci?? martwego z powodu odurzenia olejkami.");
            setKwe1("...");
            setKwe2("...");
            game.death = 0;
            game.grane = false;
            lub();

            changeDeath_screen();
        }
        if(game.grane3 == false){
            return;
        }
    }






    public void przebieg() throws IOException {
        int nr;
        if(aktualny_numer != 0){
            nr = aktualny_numer;
        }
        else {
            nr = -1;
        }
        if(game.grane == false){
            game.grane = true;

        }
        //if()
        //int aktual_zapis = game.aktualny_zapis;
        for (int iiii = 0; iiii < juzjest.length; iiii++){
            setJuzjest(-1, iiii);
        }

        for (int i = 0; i < 999999999; i++) {
            if(game.grane3 == false){
                return;
            }

            //if(death_screen == 0) {
                while (nr < 0) {
                    nr = (int) (Math.random() * 62);

                    for (int j = 0; j < 40; j++) {
                        if (getJuzjest(j) == -1) {
                            //tutaj chodzi??o ??e je??eli to b??dzie r??wne -1 to nie ma ju?? por??wnywa?? bo dalsze numery te??
                            //b??d?? r??wne -1, czyli nie s?? jeszcze wype??nione.
                            break;
                        }
                        if (nr == getJuzjest(j)) {
                            //tutaj natomiast sprawdzam czy pojawi?? si?? ju?? dany numer.
                            nr = -1;
                            break;
                        }
                    }
                }

            System.out.println("--|" + getTura() + " tura |--");
                statystyki();
                setNr(nr);
                game.wypisywanie = true;
                zbior();


            setJuzjest(nr, i % 40);
                nr = -1;
                if(game.grane2 == false){
                    return;
                }
                if(game.grane == false){
                    game.grane2 = false;
                }


            }


            // wyjscie(gra);
            //Odczyt(wybor);
            //Zapis(wybor.getTura(), wybor.getJuz(), wybor.getFinanse(), wybor.getObywatele(), wybor.getLegiony(), wybor.getReligia(), wybor.getQuest());
       // }
    }
}