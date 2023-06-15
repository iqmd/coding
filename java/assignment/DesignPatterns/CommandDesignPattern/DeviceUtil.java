import java.util.Scanner;

public class DeviceUtil{


    public static Icommand deviceSelect(){
       String device;
       Scanner read = new Scanner(System.in);
       System.out.println("Operation On : ");
       device = read.nextLine(); 
       if(device == "Light"){
           return new Light();
       }else if(device == "Fan"){
           return new Fan();
       }else{
           return null;
       }
    }

}
