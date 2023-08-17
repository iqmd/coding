package com.tempcon.model;


/**
 * Celsius
 */
public class Celsius implements Temperature {
    private double temp=0;

    public Celsius(double temp){
        this.temp = temp;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public int unitType(){
        return 0;
    }


}
