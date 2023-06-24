public class Kmph implements Speed{
    LuxuryCar car;

    Kmph(LuxuryCar car){
        this.car = car;
    }
    public double getBuggati(){
        return car.getBuggati()*1.6;
    }
    public double getFerrari(){
        return car.getFerrari()*1.6;
    }




}
