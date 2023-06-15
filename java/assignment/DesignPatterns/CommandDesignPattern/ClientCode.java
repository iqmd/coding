public class ClientCode {
    public static void main(String args[]){
        Icommand device;

        SwitchOn onbutton;
        SwitchOff offbutton;

        HomeAutomationRemote remote; 
        
        //Device

        device  = DeviceUtil.deviceSelect(); 

        //Switch on
        onbutton = new SwitchOn(device);
        remote =new HomeAutomationRemote(onbutton);
        remote.execute();

        //Swtich off
        offbutton = new SwitchOff(device);
        remote = new HomeAutomationRemote(offbutton);
        remote.execute();

        
        /*//Fan Object
        device  = new Fan(); 

        //Switch on Light
        onbutton = new SwitchOn(device);
        remote =new HomeAutomationRemote(onbutton);
        remote.execute();

        //Swtich off Light
        offbutton = new SwitchOff(device);
        remote = new HomeAutomationRemote(offbutton);
        remote.execute();*/
    }
}
