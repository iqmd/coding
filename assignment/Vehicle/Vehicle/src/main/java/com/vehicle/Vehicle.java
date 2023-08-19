package com.vehicle;


/**
 * Vehicle
 */
public class Vehicle {
    private String type;
    private String engine;
    private int seats;
    private boolean airbags;
    private boolean GPS;

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getEngine() {
        return engine;
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }
    public int getSeats() {
        return seats;
    }
    public void setSeats(int seats) {
        this.seats = seats;
    }
    public boolean getAirbags() {
        return airbags;
    }
    public void setAirbags(boolean airbags) {
        this.airbags = airbags;
    }
    public boolean getGPS() {
        return GPS;
    }
    public void setGPS(boolean gPS) {
        GPS = gPS;
    }


    @Override
    public String toString() {
        return "Vehicle [GPS=" + GPS + ", airbags=" + airbags + ", engine=" + engine + ", seats=" + seats + ", type="
                + type + "]";
    }


}
