package com.person.design.abstactFactory.main;

import com.person.design.abstactFactory.abs.BikeFactory;
import com.person.design.abstactFactory.abs.Body;
import com.person.design.abstactFactory.abs.Wheel;
import com.person.design.abstactFactory.sam.SamFactory;

public class Main {

    public static void main(String[] args) {
        BikeFactory factory = new SamFactory();
        Body body = factory.createBody();
        Wheel wheel = factory.createWheel();

        System.out.println(body.getClass());
        System.out.println(wheel.getClass());


    }
}
