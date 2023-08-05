public class Espresso extends  Coffee{
    Espresso(){
        description="A basic Espresso Coffee";
    }
    public String getDescription(){
        return description;
    }

    public double cost(){
        return 2.50;
    }
}
