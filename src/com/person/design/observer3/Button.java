package com.person.design.observer3;

import java.util.Observable;

public class Button extends Observable {
    public void onClick(){
        setChanged();
        notifyObservers();
    }
}
