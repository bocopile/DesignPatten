package com.person.design.abstactFactory.sam;

import com.person.design.abstactFactory.abs.BikeFactory;
import com.person.design.abstactFactory.abs.Body;
import com.person.design.abstactFactory.abs.Wheel;

public class SamFactory implements BikeFactory {

    @Override
    public Body createBody() {
        return new SamBody();
    }

    @Override
    public Wheel createWheel() {
        return new SamWheel();
    }
}
