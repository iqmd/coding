/**
 * Client
 */
public class Client {
    public static void main(String[] args) {
        Coffee coffee = new Espresso();
        coffee = new Milk(coffee);
        coffee = new Caramel(coffee);

        System.out.println(coffee.getDescription());
        System.out.println("Cost : $ "+coffee.cost());

    }
}
