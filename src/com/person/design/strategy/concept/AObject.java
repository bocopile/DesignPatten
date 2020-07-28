package com.person.design.strategy.concept;

public class AObject {
	
	Ainterface ainterface;
	
	public AObject() {
		ainterface = new AInterfaceImpl();
	}
	
	public void funcAA() {
		
		//delecate
		ainterface.funcA();
		ainterface.funcA();
		
		//System.out.println("AAA");
		//System.out.println("AAA");
		

	}

}
