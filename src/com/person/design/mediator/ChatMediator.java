package com.person.design.mediator;

import com.person.design.mediator.contract.Colleague;
import com.person.design.mediator.contract.Mediator;

public class ChatMediator extends Mediator {

    @Override
    public void mediate(String data) {
        for (Colleague colleague: colleagues) {

            colleague.handle(data);
        }
    }
}
