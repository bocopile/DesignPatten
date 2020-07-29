package com.person.design.factory.concrete;

import java.util.Date;

import com.person.design.factory.framework.Item;
import com.person.design.factory.framework.ItemCreator;

public class HpCreator extends ItemCreator {

	@Override
	protected void requestItemsInfo() {
		System.out.println("데이터베이스에서 마나 물약의 정보를 가져옵니다.");
		
	}

	@Override
	protected void createItemLog() {
		System.out.println("마나 물약을 새로 생성했습니다." + new Date());
		
	}

	@Override
	protected Item createItem() {
		//작업
		return new HpPotion();
	}

}
