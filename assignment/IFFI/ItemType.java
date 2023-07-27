public class ItemType{
  private String name; // stores the name of the item type eg: food,chairs
  private double costPerDay;
  private double deposit;

  //getters
  public String getName(){
    return name;
  }

  public double getCostPerDay(){
    return costPerDay;
  }

  public double  getDeposit(){
    return deposit;
  }

  //setters

  public void setName(String name){
    this.name = name;
  }

  public void setcostPerDay(double costPerDay){
    this.costPerDay = costPerDay;
  }

  public void setDeposit(double deposit){
    this.deposit = deposit;
  }

  public void display(){
    System.out.println("\n\nItem type Details:");
    System.out.print("Name : "+this.getName()+"\n");
    System.out.printf("Cost Per Day: %.2f \n",this.getCostPerDay());
    System.out.println("Deposit: "+this.getDeposit()+"\n");
  }


}
