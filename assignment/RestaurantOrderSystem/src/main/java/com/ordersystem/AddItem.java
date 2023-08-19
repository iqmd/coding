package com.ordersystem;


public class AddItem implements Command {
    private Item item;
    private Order order = Order.getInstance();

    public AddItem(Item item){
       this.item = item;
    }

    @Override
    public void execute(){
        order.addItem(item);
    }
}
