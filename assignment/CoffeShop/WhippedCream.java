public class WhippedCream  extends CoffeeDecorator{

    private Coffee coffee;

    WhippedCream(Coffee coffee){
        this.coffee = coffee;
    }

    public String getDescription(){
        return coffee.getDescription() + ", Whipped Cream";
    }

    public double cost(){
        return coffee.cost() + 1;
    }
}
