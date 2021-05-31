package com.company;

import java.io.IOException;

public class Zapis_panel {
    Game game;
    Decyzja decyzja;
    public void Zapisywanie_funkcja() throws IOException {
        if (game.zapisywanie == true) {
            game.Zapis(game.aktualny_zapis, decyzja.getTura(), decyzja.getJuz(), decyzja.getFinanse(), decyzja.getLegiony(), decyzja.getObywatele(), decyzja.getReligia(), decyzja.getQuest(), decyzja.getKontynuacja(), decyzja.qq16, decyzja.qq21, decyzja.getNr(),decyzja.getNr());
            game.zapisywanie = false;
        }
    }
    public void Odczytywanie_funkcja() throws IOException {
        if (game.odczytywanie == true) {
            game.Odczyt(game.aktualny_zapis,decyzja);
            game.odczytywanie = false;
        }
    }
    public Zapis_panel(Game game, Decyzja decyzja) throws IOException, InterruptedException {
        this.game = game;
        this.decyzja = decyzja;

    }
}
