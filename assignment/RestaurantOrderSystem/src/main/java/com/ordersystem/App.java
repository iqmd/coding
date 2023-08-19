package com.ordersystem;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
        Waiter orderItems = new Waiter();

        Item item1 = new Item("noodles");
        Item item2 = new Item("eggroll");

        orderItems.setCommand(new AddItem(item1));
        orderItems.executeCommand();
        orderItems.setCommand(new AddItem(item2));
        orderItems.executeCommand();
        orderItems.setCommand(new SubmitOrder());
        orderItems.executeCommand();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
