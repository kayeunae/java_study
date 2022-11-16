package test.ch06.exam01.package1;

public class B2 {
	A2 a1 = new A2(true);		//O
	A2 a2 = new A2(1);		//O
//	A2 a3 = new A2("문자열");	//private이 지정된 생성자는 같은 클래스 내에서만 호출 가능.
}
