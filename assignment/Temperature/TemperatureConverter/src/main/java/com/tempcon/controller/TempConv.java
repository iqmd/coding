package com.tempcon.controller;

import com.tempcon.model.*;
    ;

/**
 * TempConv
 */
public class TempConv {
    private Temperature temp;

    public TempConv(Temperature temp){
        this.temp = temp;
    }

    public Temperature convertToFahrenheit(){
        double t = temp.getTemp()*(9/5)+32;
        temp = new Fahrenheit(t);
        return temp;
    }
    public Temperature convertToCelsius(){
        double t = temp.getTemp() - 32 * (5/9);
        temp = new Celsius(t);
        return temp;
    }
}
