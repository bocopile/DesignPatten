package com.person.design.decorator.concrete;

import com.person.design.decorator.abst.IBeverage;

public class Base  implements IBeverage {

    @Override
    public int getTotalPrice() {
        return 0;
    }

}
