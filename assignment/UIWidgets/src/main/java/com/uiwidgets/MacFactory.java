package com.uiwidgets;


public class MacFactory implements Factory{

    public Button createButton(){
        return new MacButton();
    }

    public TextField createTextField(){
        return new MacTextField();
    }

}
