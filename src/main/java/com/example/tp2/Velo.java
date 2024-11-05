package com.example.tp2;

import java.util.ArrayList;
import java.util.List;

public class Velo {

    private List<Option> _lesOptions;
    private double _finalPrice;

    public Velo() {
        _lesOptions = new ArrayList<>();
        _finalPrice = 0;
    }

    public void setOptionActive(Option o){
        if (!o._isActive)
        {
            o.setActive();
            _finalPrice += o._price;
        }
    }

    public void setOptionInactive(Option o){
        if (o._isActive)
        {
            o.setInactive();
            _finalPrice -= o._price;
        }

    }

    public String getPrice(){
        return String.format("%.2f", _finalPrice);
    }


    public List<Option> getOptions() {
        return _lesOptions;
    }
}
