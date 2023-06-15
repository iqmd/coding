public class Veg implements Hotel{
    public void food(){
        System.out.println("We provide Veg food");
    }
    public void menu(){
        for(int i = 0; i < 5 ; i++){
            System.out.println("Veg item :"+ i+1);
        }
    }
}
