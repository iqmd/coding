public class Chicken implements Pizza{
    Pizza pizza;

    Chicken(Pizza pizza){
        this.pizza = pizza;
    }

    public String base(){
        return pizza.base()+" + Chicken";
    }
}
