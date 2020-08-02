package com.person.design.facade.main;

import com.person.design.facade.system.Facade;

public class Application {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.process();

    }
}
