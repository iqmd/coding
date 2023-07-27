import java.util.Scanner;
public class Main{
  public static void main(String args[]){

    Scanner read = new Scanner(System.in);

    ItemType userdefine = new ItemType();

    System.out.println("Enter the item type name");

    String itemtype = read.nextLine();
    userdefine.setName(itemtype);

    System.out.println("Enter the cost per day ");

    double costperday = read.nextDouble();
    userdefine.setcostPerDay(costperday);


    System.out.println("Enter the deposit");
    double deposit= read.nextDouble();
    userdefine.setDeposit(deposit);


    userdefine.display();

  }
}
