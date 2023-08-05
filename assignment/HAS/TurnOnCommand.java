/**
 * TurnOnCommand
 */
public class TurnOnCommand implements Command{

    HomeAppliance appliance;

    TurnOnCommand(HomeAppliance appliance){
        this.appliance = appliance;
    }

    public void execute(){
        System.out.println(appliance.getDesc()+" Turned On..");
    }
}
