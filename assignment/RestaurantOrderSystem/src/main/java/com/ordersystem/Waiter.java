package com.ordersystem;


/**
 * Waiter
 */
public class Waiter {
    Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void executeCommand(){
        command.execute();
    }
}
