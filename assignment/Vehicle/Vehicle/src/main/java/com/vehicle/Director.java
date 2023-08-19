package com.vehicle;


/**
 * Director
 */
public class Director {

    public void build(VehicleBuilder builder){
        builder.buildAirbags();
        builder.buildEngine();
        builder.buildGPS();
        builder.buildSeats();
        builder.buildType();
    }

}
