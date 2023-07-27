public class Bike extends Vehicle {
    Bike(){}
    Bike(Bike vehicleBike){
        super(vehicleBike);
    }
    public Vehicle clone(){
        return new Bike(this);
    }
}
