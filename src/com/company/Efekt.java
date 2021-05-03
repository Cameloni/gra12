package com.company;
// coś mi się zepsuło z commit
public class Efekt { //to będą te efekty chroniące przed śmiercią
    int finanse;
    int liczebnosc;
    int obrona;
    int jedzenie;
    String nazwa;
    //int cena;
    int ilosc;
    public Efekt(String nazwa, int fin, int licz, int obr, int jedz /*?int cena?*/){
        this.nazwa = nazwa;
        finanse = fin;
        liczebnosc = licz;
        obrona = obr;
        jedzenie = jedz;
        //this.cena = cena;
        ilosc = 0;
    }
    public void uzyj(Decyzja W){
        W.setFinanse(W.getFinanse() + finanse);
        W.setLiczebnosc(W.getLiczebnosc() + liczebnosc);
        W.setObrona(W.getObrona() + obrona);
        W.setJedzenie(W.getJedzenie() + jedzenie);
    }
}
