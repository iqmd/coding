package com.ordersystem;


public class RemoveItem implements Command {
    private Item item;

    public RemoveItem(Item item){
       this.item = item;
    }

    @Override
    public void execute(){
        item.removeItem();
    }
}
