package com.person.design.strategy.example;

public class Main {

	
	public static void main(String[] args) {
		
		GameCharactor charactor = new GameCharactor();
		
		charactor.attack();
		
		// 칼 공격
		charactor.setWeapon(new Knife());
		charactor.attack();
		
		// 검 공격
		charactor.setWeapon(new Sword());
		charactor.attack();
		
		// 도끼 공격
		charactor.setWeapon(new Ax());
		charactor.attack();
		
	}
}
