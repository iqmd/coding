public class SpeedMPH implements Speed{
    LuxuryCar car;
    SpeedMPH(LuxuryCar car){
        this.car = car;
    }
    public double getSpeed(String cars){
        switch(cars){
            case "Ferrari":
            return car.getFerrari();

            case "Buggati":
            return car.getBuggati();

            default:
            return 0;
        }
    }
} 
