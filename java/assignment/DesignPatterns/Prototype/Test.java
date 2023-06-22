import java.util.*;
public class Test {
    public static void main(String args[]){
        Vehicle bike = new Bike();
        bike.setWheels(2);
        bike.setSeats(1);
        bike.setAverage(30);


        Vehicle Car = new Car();
        bike.setWheels(4);
        bike.setSeats(5);
        bike.setAverage(50);

        List<Vehicle> vehicle = new ArrayList<>();
        List<Vehicle> record = new ArrayList<>();

        vehicle.add(bike);
        vehicle.add(Car);

        Vehicle recbike = bike.clone();

        record.add(recbike);

    }
}
