public abstract class Vehicle implements Cloneable{
    private int wheels;
    private int seats;
    private int average;

    public int getWheels(){
        return wheels;
    }
    public void setWheels(int w){
        wheels = w;
    }
    public int getSeats(){
        return seats;
    }

    public void setSeats(int s){
        seats = s;
    }

    public int getAverage(){
        return average;
    }
    public void setAverage(int a){
        average = a;
    }

    abstract public Vehicle clone();

}
