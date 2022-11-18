package test.ch07;

public class ChildEx {

	public static void main(String[] args) {
		/*
		//자식 객체
		Child child = new Child();
		Parent parent = child; //자동 타입 변환 (첫 번째 방법)
		
		parent.method1();
		//parent로 불렀지만, 오버라이드한 child 메소드를 가져온다.
		//★오버라이드된 메소드를 불러온다.
		parent.method2();
		//★자동형변환이 일어났을 때: 자식 객체에 있는 메소드는 불러오지 못한다.
		//parent.method3();
		
		parent.a = 2;
		//★자식 객체에 있는 필드는 불러오지 못한다.
		//parent.b = 1;
		 */
		
		Parent parent = new Child(); //자동타입변환 (두 번째 방법)
		
		//instanceof: 자바에서 제공하는 객체 타입 확인을 위한 연산자 
		//parent가 Child 타입이 아니라면(Child객체를 담고 있지 않다면) 강제타입 변환을 할 수 없으므로
		if(parent instanceof Child) {	//parent 매개 변수가 Child 객체를 담고 있는지 확인
			//강제형변환은 자동타입변환 후에 할 수 있다.
			Child child = (Child)parent; //강제타입 변환
			child.b = 1;	//자식 객체에 있는 필드에 접근 가능
			System.out.println(child.b); //b 값이 바뀌었는지 확인
			child.method1();
			child.method3();	// 자식 메소드에 있는 필드에 접근 가능			
		} else {
			System.out.println("Child 객체 타입이 아닙니다");
		}
		
	
	}
}
