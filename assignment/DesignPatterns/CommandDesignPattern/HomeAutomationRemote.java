public class HomeAutomationRemote  {
    public Command command;

    HomeAutomationRemote(Command c){
        this.command = c;
    }

    public void execute(){
        this.command.execute();
    }
}
