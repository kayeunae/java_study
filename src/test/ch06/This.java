package test.ch06;

public class This {
	String model;
	int speed;
	
	//매개변수명이 필드에 있는 데이터명과 같으면 필드데이터에는 this를 붙인다.
	This(String model) {
		this.model = model;
	}

	//this. 생략 불가 :  변수명과 필드명이 같음. 이럴 때는 필드에 this. 를 붙여줌. 생성자, 메소드 모두 마찬가지
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	//this. 생략 가능 : 같은 클래스 간의 메소드를 호출 시 this. 생략 가능 
	void run() {
		setSpeed(100);	//this. 생략 가능
		System.out.println(this.model + "," + this.speed);	//this. 생략 가능
	}
}
