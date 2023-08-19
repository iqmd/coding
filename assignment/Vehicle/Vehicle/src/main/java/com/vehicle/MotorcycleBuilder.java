package com.vehicle;


/**
 * MotorcycleBuilder
 */
public class  MotorcycleBuilder implements VehicleBuilder {
    private Vehicle motorcycle = new Vehicle();

    public void buildType(){
        motorcycle.setType("Motorcycle");
    }

    public void buildEngine(){
        motorcycle.setEngine("petrol");
    }

    public void buildSeats(){
        motorcycle.setSeats(2);
    }

    public void buildAirbags(){
        motorcycle.setAirbags(false);
    }

    public void buildGPS(){
        motorcycle.setGPS(false);
    }

    public Vehicle getVehicle(){
        return motorcycle;
    }
}
