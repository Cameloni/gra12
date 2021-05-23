package com.company;

public class Efekt { //to będą te efekty chroniące przed śmiercią
    int finanse;
    int obywatele;
    int legiony;
    int religia;
    String nazwa;
    //int cena;
    int ilosc;
    public Efekt(String nazwa, int fin, int oby, int leg, int rel /*?int cena?*/){
        this.nazwa = nazwa;
        finanse = fin;
        obywatele = oby;
        legiony = leg;
        religia = rel;
        //this.cena = cena;
        ilosc = 0;
    }
    public void uzyj(Decyzja W){
        W.setFinanse(finanse);
        W.setObywatele(obywatele);
        W.setLegiony(legiony);
        W.setReligia(religia);
    }
}
