package com.uiwidgets;


/**
 * WindowsFactory
 */
public class WindowsFactory implements Factory{

    public Button createButton(){
        return new WinButton();
    }

    public TextField createTextField(){
        return new WinTextField();
    }

}
