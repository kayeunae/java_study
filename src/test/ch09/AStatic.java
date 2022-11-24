package test.ch09;

public class AStatic {
	//사용 가능한 접근 제한자: public, private, default 3개
	static class B {
		int field1 = 1;
		
		B() {
			System.out.println("b생성자 실행");
		}
		
		void method1() {
			System.out.println("b메소드 실행");
		}
	}
	
	//1. 필드로 사용
	B field = new B();
	
	//static 클래스이기 때문에 정적 필드 값으로 사용 가능
	static B field2 = new B();
	
	//2. 생성자에서 사용
	AStatic() {
		B b = new B();
	}
	
	//3. 메소드에서 사용
	void method1() {
		B b = new B();
	}
	
	//정적 메소드로 사용 가능
	 static void method2() {
		B b = new B();
	}
}
