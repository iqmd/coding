public class Bike extends Vehicle {
    public Vehicle clone(){
        return new Bike(this);
    }
}
