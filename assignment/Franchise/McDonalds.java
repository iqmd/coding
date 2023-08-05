public class McDonalds implements Franchise{
    private double cost = 175690;
    private double register = 4123;

    private int options = 3;

    public double getCost(){
        return cost;
    }

    public int getOptions(){
        return options;
    }

    public void setCost( double cost ){
        this.cost = cost;
    }

    public void setOptions( int options ){
        this.options = options;
    }

    public double getRegistration(){
        return register;
    }

    public void setRegistration( int register ){
        this.register = register;
    }
    
}
