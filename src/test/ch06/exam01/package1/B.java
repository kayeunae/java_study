package test.ch06.exam01.package1;

public class B {
	A a1 = new A(true);		//O
	A a2 = new A(1);		//O
	A a3 = new A("문자열");	//private이 지정된 생성자는 같은 클래스 내에서만 호출 가능.
}
