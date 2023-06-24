public class MPHtoKmphAdapter implements Speed {

    Speed mph;
    MPHtoKmphAdapter(Speed mph){
        this.mph = mph;
    }

    public double getSpeed(String cars){
        return mph.getSpeed(cars)*1.6;
    }
}
