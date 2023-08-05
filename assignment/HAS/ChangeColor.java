/**
 * TurnOnCommand
 */
public class ChangeColor  implements Command{
    HomeAppliance appliance;

    ChangeColor(HomeAppliance appliance){
        this.appliance = appliance;
    }

  public  void execute(){
       System.out.println(appliance.getDesc()+" changing colors");
   }
}
