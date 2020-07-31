package com.person.design.abstactFactory.gt;

import com.person.design.abstactFactory.abs.BikeFactory;
import com.person.design.abstactFactory.abs.Body;
import com.person.design.abstactFactory.abs.Wheel;


public class GtFactory implements BikeFactory {
    @Override
    public Body createBody() {
        return new GtBody();
    }

    @Override
    public Wheel createWheel() {
        return new GtWheel();
    }
}
