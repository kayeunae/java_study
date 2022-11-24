package test.ch09;

public class ALocal {
	//메소드
	void useB(int arg) {	//final int arg
		//final의 특성을 갖고 있음
		
		//로컬 변수
		int var = 1;	//=> final int var = 1;
		var= 2;
		
		class B {
			//인스턴스 필드
			int field1 = 1;
			
			//생성자
			B() {
				System.out.println("B생성자 실행");
			}
			
			//인스턴스 메소드
			void method1() {
				System.out.println("B메소드 실행");
			}
			
			//중첩된 클래스에서는 변수 값을 바꿀 수 없다.
			void method2() {
				arg = 2;
				var = 3;
			}
		}
		//메소드 안에서 객체 생성 !
		//로컬변수와 클래스는 메소드 안에서만 실행 가능
		B b = new B();	//생성자 실행
		System.out.println(b.field1);
		b.method1();
	}	
 }
