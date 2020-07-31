package com.person.design.decorator.concrete;

import com.person.design.decorator.abst.AbstAdding;
import com.person.design.decorator.abst.IBeverage;

public class Milk extends AbstAdding {

    public Milk(IBeverage meterial) {
        super(meterial);
    }

    @Override
    public int getTotalPrice() {
        return super.getTotalPrice()+50;
    }


}
