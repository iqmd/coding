public class SwitchOn implements Command {
    private Icommand op;

    SwitchOn(Icommand op){
        this.op = op;
    }

    @Override
    public void execute(){
        this.op.on(); 
    }
}
