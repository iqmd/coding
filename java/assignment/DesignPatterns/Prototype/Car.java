public class Car extends Vehicle {
    Car(){}
    Car(Car vehicleCar){
        super(vehicleCar);
    }
    public Vehicle clone(){
        return new Car(this);
    }
}
