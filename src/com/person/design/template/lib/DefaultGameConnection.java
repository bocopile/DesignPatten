package com.person.design.template.lib;

public class DefaultGameConnection extends AbstGameConnectHelper {

	@Override
	protected String doSecurity(String String) {
		System.out.println("디코드");
		return String;
	}

	@Override
	protected boolean authentication(String id, String password) {
		System.out.println("아이디/암호 확인과정");
		return true;
	}

	@Override
	protected int authorization(String username) {
		System.out.println("권한 확인");
		return 0;
	}

	@Override
	protected String connection(String info) {
		System.out.println("마지막 접속 단계");
		return info;
	}

}
