public class Oven {
    public static void main(String args[]){
        Pizza pizza = new BakedPizza();

        pizza = new Paneer(pizza);
        pizza = new Chicken(pizza);

        System.out.println(pizza.base());
    }
}
