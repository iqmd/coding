/**
 * TurnOnCommand
 */
public class AdjustBrightness implements Command{

    HomeAppliance appliance;

    AdjustBrightness(HomeAppliance appliance){
        this.appliance = appliance;
    }

  public  void execute(){
       System.out.println(appliance.getDesc()+" Adjusting brightness");
   }
}
