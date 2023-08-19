package com.vehicle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        VehicleBuilder carBuilder = new CarBuilder();
        VehicleBuilder mcBuilder = new MotorcycleBuilder();
        Director director = new Director();
        director.build(carBuilder);
        director.build(mcBuilder);

        Vehicle car = carBuilder.getVehicle();
        Vehicle motorcycle = mcBuilder.getVehicle();

        System.out.println(car);
        System.out.println(motorcycle);
    }
}
