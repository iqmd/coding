public class Car{
    String brand;

    Car(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }
    

    public static void main(String args[]){

        Car eco = new Car("Honda");
        
        System.out.println(eco.getBrand());

    }

}
