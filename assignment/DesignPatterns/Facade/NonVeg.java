public class NonVeg implements Hotel{
    public void food(){
        System.out.println("We provide Non - Veg food");
    }

    public void menu(){
        for(int i = 0; i < 5 ; i++){
            System.out.println("Non-Veg item :"+ i+1);
        }
    }
}
