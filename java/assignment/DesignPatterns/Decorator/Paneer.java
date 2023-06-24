public class Paneer implements Pizza{
    Pizza pizza;

    Paneer(Pizza pizza){
        this.pizza = pizza;
    }

    public String base(){
        return pizza.base()+" Paneer ";
    }
}
