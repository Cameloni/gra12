package com.company;

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
        W.setObywatele(W.getObywatele() + liczebnosc);
        W.setLegiony(W.getLegiony() + obrona);
        W.setReligia(W.getReligia() + jedzenie);
    }
}
