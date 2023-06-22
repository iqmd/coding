import java.util.*;
public class Test {
    public static void main(String args[]){
        Vehicle bike = new Bike();
        bike.setWheels(2);
        bike.setSeats(1);
        bike.setAverage(30);


        Vehicle car = new Car();
        car.setWheels(4);
        car.setSeats(5);
        car.setAverage(50);

        List<Vehicle> vehicle = new ArrayList<>();
        List<Vehicle> record = new ArrayList<>();

        vehicle.add(bike);
        vehicle.add(car);

        Vehicle recbike = bike.clone();
        Vehicle reccar = car.clone();

        record.add(recbike);
        record.add(reccar);

        System.out.println(record.get(0).getAverage());
        System.out.println(record.get(1).getAverage());

    }
}
