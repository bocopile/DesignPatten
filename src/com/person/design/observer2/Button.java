package com.person.design.observer2;

import java.util.Observable;

public class Button extends Observable {

    public void onCLick(){
        setChanged();
        notifyObservers();
    }

}
