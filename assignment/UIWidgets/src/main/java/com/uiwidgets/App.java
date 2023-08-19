package com.uiwidgets;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        //Windows Factory
        Factory  buttonFactory = new MacFactory();
        Factory textfielFactory = new WindowsFactory();

        Button button = buttonFactory.createButton();
        TextField text =  textfielFactory.createTextField();

        button.click();
        text.input();
    }
}
