package com.person.design.strategy.example;

public class GameCharactor {

	private Weapon weapon;
	
	//교환 기능
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void attack() { 
		
		if(weapon == null) {
			System.out.println("맨손공격");
		}else {
			//delegate
			weapon.attack();
		}
		

	}
	
}
