package test.ch06.exam01.package1;

//클래스는 public, default 접근제한자를 가질 수 있다.
public class A2 {
	A2 a3 = new A2("문자열");	//private 생성자
	
	
	public A2(boolean b) {
	}

	//default 제한자를 준 것
	A2(int b) {
	}

	private A2(String s) {
	}
}
