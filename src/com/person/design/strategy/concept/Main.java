package com.person.design.strategy.concept;

public class Main {

	/**
	 * Strategy Patten
	 * @param args
	 */
	public static void main(String[] args) {
		Ainterface ainterface = new AInterfaceImpl();
		
		ainterface.funcA();
		
		AObject aObj = new AObject();
		aObj.funcAA();
	}

}
