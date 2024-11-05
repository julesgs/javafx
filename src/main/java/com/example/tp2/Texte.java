package com.example.tp2;

public class Texte extends Option {

    private String _textePerso;

    public Texte (String textePerso, double prix) {
        super(prix);

        this._textePerso = textePerso;
    }
}
