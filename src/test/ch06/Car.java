package test.ch06;

public class Car {
//	1. 필드: 객체의 데이터를 저장 (멤버 변수)
//	필드는 로컬 변수와는 다름(변수와 역할은 같지만)! 객체 내부에서 쓰거나 객체를 통해서만 쓸 수 있다.
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	int speed;
//	boolean start;	//시동 여부

	
//	생성자 오버로드 (두 개 이상의 생성자, 같은 이름의 메소드를 여러 개 선언)
	Car(String model) {
//		this.model = model;
//		Car(String model, String color, int maxSpeed) 이 부분 호출
		this(model, "은색", 350);
	}
	
	Car(String model, String color) {
		this.model = model;
		this.color = color;
//		this(model, color, 250);
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
//	java에서는 생성자를 명시하지 않으면 컴파일 과정에서 생성자를 생성해준다. 다만 빈 값의 형태로 !
	Car(String model, String color, int maxSpeed, int speed) {
		this.model = model;		//this.model: String model의 값 뒤의 model: new Car의 변수값
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.speed = speed;
	}
	
	/*
	타입에 따른 초기값
	 int, short, byte: 0
	 long: 0L
	 char: '\u0000'
	 float: 0.0f
	 double: 0.0
	 boolean: false
	 
	 String: null
	 */
	
//	여기도 주석 추가해볼게여 ~!

	}
