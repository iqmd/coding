public class Test {
    public static void main(String[] args) {
        LuxuryCar car = new LuxuryCar();

        //US
        Speed uscar = new SpeedMPH(car);
        System.out.println(uscar.getSpeed("Ferrari"));

        //UK
        Speed ukcar = new MPHtoKmphAdapter(uscar);
        System.out.println(ukcar.getSpeed("Buggati"));
    }
}
