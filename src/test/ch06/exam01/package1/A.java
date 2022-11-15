package test.ch06.exam01.package1;

//클래스는 public, default 접근제한자를 가질 수 있다.
public class A {
	A a3 = new A("문자열");	//private 생성자
	
	
	public A(boolean b) {
	}

	//default 제한자를 준 것
	A(int b) {
	}

	private A(String s) {
	}
}
