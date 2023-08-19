package com.vehicle;


/**
 * VehicleBuilder
 */
public interface VehicleBuilder {

    public void buildType();
    public void buildEngine();
    public void buildSeats();
    public void buildAirbags();
    public void buildGPS();

    public Vehicle getVehicle();
}
