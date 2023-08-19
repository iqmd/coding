package com.ordersystem;


public class SubmitOrder implements Command {
    private Order order = Order.getInstance();

    public SubmitOrder(){
    }

    @Override
    public void execute(){
        order.submit();
    }
}
