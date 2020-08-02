package com.person.design.mediator;

import com.person.design.mediator.contract.Colleague;

public class ChatColleague extends Colleague {

    @Override
    public void handle(String data) {
        System.out.println(this);
    }
}
