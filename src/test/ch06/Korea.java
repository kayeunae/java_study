package test.ch06;

public class Korea {
	//final 필드: 저장된 값을 절대 변경할 수 없음. 최종값!
	//final 필드는 초기값을 무조건 줘야 한다. (필드 선언 시 주거나 혹은 생성자에서 줘야 한다.)
	final String nation = "대한민국";
	final String ssn;		//주민번호
	
	//인스턴스 필드
	String name;
	
	//생성자
	Korea(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	
	Korea(String ssn) {
		this.ssn = ssn;
	}
	
}
