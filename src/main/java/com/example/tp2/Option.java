package com.example.tp2;

public abstract class Option {
    protected double _price;
    protected boolean _isActive;


    public Option(double prix) {
        this._price = prix;
        this._isActive = false;
    }

    public void setActive() {
        this._isActive = true;
    }

    public void setInactive() {
        this._isActive = false;
    }
}
