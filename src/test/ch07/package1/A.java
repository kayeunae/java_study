package test.ch07.package1;

// protected => 상속 관계, 같은 패키지일 때 접근 가능(필드, 생성자, 메소드에 적용 가능)
public class A {
	//필드
	protected String field;
	
	//생성자
	protected A() {}
	
	//메소드
	protected void method1() {}

}
