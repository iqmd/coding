/**
 * TurnOnCommand
 */
public class TurnOffCommand implements Command{
    HomeAppliance appliance;
    TurnOffCommand(HomeAppliance appliance){
        this.appliance = appliance;
    }

  public  void execute(){
       System.out.println(appliance.getDesc()+" Turned Off..");
   }
}
