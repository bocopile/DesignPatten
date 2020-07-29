package com.person.design.factory.concrete;

import com.person.design.factory.framework.Item;

public class MpPotion implements Item {

	@Override
	public void use() {
		System.out.println("마나 회복");
		
	}

}
