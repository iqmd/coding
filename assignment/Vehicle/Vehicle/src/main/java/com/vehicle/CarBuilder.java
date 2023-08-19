package com.vehicle;


/**
 * CarBuilder
 */
public class  CarBuilder implements VehicleBuilder {
    private Vehicle car = new Vehicle();

    public void buildType(){
        car.setType("Car");
    }

    public void buildEngine(){
        car.setEngine("diesel");
    }

    public void buildSeats(){
        car.setSeats(5);
    }

    public void buildAirbags(){
        car.setAirbags(true);
    }

    public void buildGPS(){
        car.setGPS(true);
    }

    public Vehicle getVehicle(){
        return car;
    }
}
