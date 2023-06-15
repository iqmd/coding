public class VegNonBoth implements Hotel{
    public void food(){
        System.out.println("We provide Non - Veg and Veg food");
    }
    public void menu(){
        for(int i = 0; i < 5 ; i++){
            if(i%2==0)
                System.out.println("Non-Veg item :"+ i+1);
            else
                System.out.println("Veg item :"+ i+1);

        }
    }
}
