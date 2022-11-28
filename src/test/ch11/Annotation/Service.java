package test.ch11.Annotation;

public class Service {
	//필드
	String test;
	
	//생성자
	Service(){}
	
	//메소드
	@PrintAnnotation
	public void method1() {
		System.out.println("method1");
	}
	
	@PrintAnnotation
	public void method2() {
		System.out.println("method2");
	}
	
	//값을 어노테이션에 넘겨줄 수 있음
	@PrintAnnotation(value="#", number=20)
	public void method3() {
		System.out.println("method3");
	}
}
