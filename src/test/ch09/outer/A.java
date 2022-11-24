package test.ch09.outer;

public class A {
	//A 클래스의 인스턴스 필드와 메소드
	int field1;
	void method1() {}
	
	//A클래스의 정적 필드와 메소드
	static int field2;
	static void method2() {}
	
	//인스턴스 멤버 클래스
	//바깥 클래스의 모든 필드와 메소드 사용 가능
	class B {
		void method() {
			field1 = 10;	//o
			method1();		//o
			
			field2 = 5;		//o
			method2();		//o
		}
	}
	
	//정적 멤버 클래스
	//바깥 클래스의 정적 필드와 정적 메소드 사용 가능
	static class C {
		void method() {
			//★정적 멤버 클래스에서는 바깥 클래스의 인스턴스 필드와 메소드에 접근할 수 없다.
			field1 = 10;	//x
			method1();		//x
			
			field2 = 5;		//o
			method2();		//o
		}
	}
}
