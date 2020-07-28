package com.person.design.template.main;

import com.person.design.template.lib.AbstGameConnectHelper;
import com.person.design.template.lib.DefaultGameConnection;

public class Main {

	public static void main(String[] args) {
		AbstGameConnectHelper helper = new DefaultGameConnection();
		
		helper.requestConnection("계정정보");
	}
}
