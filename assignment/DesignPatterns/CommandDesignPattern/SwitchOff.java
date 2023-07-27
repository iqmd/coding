public class SwitchOff implements Command {
    private Icommand op;

    SwitchOff(Icommand op){
        this.op = op;
    }

    @Override
    public void execute(){
        this.op.off(); 
    }
}

