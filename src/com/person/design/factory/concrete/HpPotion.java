package com.person.design.factory.concrete;

import com.person.design.factory.framework.Item;

public class HpPotion implements Item {

	@Override
	public void use() {
		System.out.println("체력 회복");
		
	}

}
