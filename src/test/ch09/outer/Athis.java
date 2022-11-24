package test.ch09.outer;

public class Athis {
	//Athis 클래스의 인스턴스 필드
	String field = "A-field";
	
	//Athis 클래스의 인스턴스 메소드
	void method() {
		System.out.println("A-method");
	}
	
	//인스턴스 멤버 클래스
	class B {
		//B 클래스의 인스턴스 필드
		//Athis 클래스의 필드와 이름이 같아도 다른 클래스이기 때문에 오류가 없음. (근데 사용할 때 헷갈릴 걸...?)
		String field = "B-field";
		
		//B 클래스의 인스턴스 메소드
		void method() {
			System.out.println("B-method");
		}
		//B 클래스의 인스턴스 메소드
		void print() {
			//B클래스의 인스턴스 필드와 메소드 호출
			System.out.println(this.field);
			this.method();
			
			//변수명이 같은 A클래스의 인스턴스 필드와 메소드 호출. this.~~ 앞에 외부 클래스명을 붙여준다.
			System.out.println(Athis.this.field);
			Athis.this.method();
		}
	}
	//A클래스의 인스턴스 메소드
	void useB() {
		B b = new B();
		b.print();
	}
}
