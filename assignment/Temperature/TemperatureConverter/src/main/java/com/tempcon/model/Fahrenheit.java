package com.tempcon.model;


public class Fahrenheit implements Temperature{
    private double temp=0;

    public Fahrenheit(double temp){
        this.temp = temp;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public int unitType(){
        return 1;
    }


}
