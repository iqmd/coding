public class Car extends Vehicle {
    public Vehicle clone(){
        return new Car(this);
    }
}
