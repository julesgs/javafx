package com.example.tp2;


public class CouleurCadre extends Option {

    private String _nomCouleur;

    public CouleurCadre(String nomCouleur, double prix) {
        super(prix);

        this._nomCouleur = nomCouleur;
    }

}
