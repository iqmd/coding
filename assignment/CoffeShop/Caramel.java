public class Caramel extends CoffeeDecorator{

    private Coffee coffee;

    Caramel(Coffee coffee){
        this.coffee = coffee;
    }

    public String getDescription(){
        return coffee.getDescription() + ", Caramel";
    }

    public double cost(){
        return coffee.cost() + 1.50;
    }
}
