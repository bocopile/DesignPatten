package com.person.design.template.lib;

public abstract class AbstGameConnectHelper {
	
	//알고리즘의 단계 이므로 외부에 노출되면 안됨
	protected abstract String doSecurity(String String);
	protected abstract boolean authentication(String id, String password);
	protected abstract int authorization(String username);
	protected abstract String connection(String info);
	
	//접속을 도와주는 템플릿 메소드
	public String requestConnection(String encodedInfo) {
		
		// 보안과정 -> 암호화 된 문자열을 디코드(복호화)
		String decodeInfo = doSecurity(encodedInfo);
		
		// 반환된것을 가지고 아이디, 암호를 할당한다.
		String id ="AA";
		String pw = "BB";
		if(authentication(id, pw)) {
			
		}else {
			throw new Error("아이디 , 암호 불일치");
		}
		
		//
		String username = "userName";
		int i = authorization(username);
		
		switch(i) {
			case -1:
				throw new Error("셧다운");
			case 0:  // 게임 메니저
				System.out.println("게임");
				break;
			case 1:  // 유료회원
				break;
			case 2:  // 무료회원
				break;
			case 3:  // 권한 없음
				break;
			default: // 기타 사항
				break;
		}
		
		return connection(decodeInfo);
	}

}
