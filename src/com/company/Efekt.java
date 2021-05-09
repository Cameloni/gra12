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
        W.setFinanse(W.getFinanse() + finanse);
        W.setObywatele(W.getObywatele() + obywatele);
        W.setLegiony(W.getLegiony() + legiony);
        W.setReligia(W.getReligia() + religia);
    }
}
