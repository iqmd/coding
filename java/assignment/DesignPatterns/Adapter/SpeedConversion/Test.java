public class Test {
    public static void main(String args[]){
        //Us
        LuxuryCar uscar = new LuxuryCar();
        System.out.println("US car : "+uscar.getFerrari());

        //Uk
        Kmph ukcar = new Kmph(uscar);
        System.out.println("UK car :"+ukcar.getFerrari());
    }
}
