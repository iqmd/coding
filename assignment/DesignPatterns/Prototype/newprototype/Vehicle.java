public abstract class  Vehicle implements Prototype {
    private String model;
    private String brand;

    public Vehicle(){

    }

    public Vehicle(Vehicle vehicle){
        this.brand = vehicle.brand;
        this.model = vehicle.model;
    }

    public Vehicle clone(){
        return new Vehicle(this);
    }
}
