package test.ch06;

public class Car2 {
	//인스턴스 필드
	int speed;
	
	//인스턴스 메소드
	void run() {
		//speed에 this. 붙여도 되고, 안 붙여도 됨! 왜?
		System.out.println(this.speed + "으로 달립니다.");
	}
	
	void run2() {
		//아래와 같이 메소드 간 호출도 가능함.
		this.run();
		//speed에 this. 붙여도 되고, 안 붙여도 됨! 왜?
		System.out.println(this.speed + "으로 달립니다.");
	}
	
	//정적(static) 블록
	//static에서는 인스턴스와 관련된 어떤 것도 접근할 수 없다.
	static { 
		this.speed = 200;	// X
		this.run();			// X
	}	
	
	//정적(static) 메소드
	static void simulate() {
		this.speed = 200;	// X
		this.run();			// X
		
		//메소드에서 객채 생성도 가능(인스턴스)
		Car2 myCar = new Car2();
		
		//myCar라는 객체에 Car2라는 인스턴스가 들어있다.
		//정적 메소드에서 인스턴스 멤버를 사용하려면 메소드 안에 인스턴스를 생성하고, 인스턴스 변수를 사용해야 한다.
		myCar.speed = 200;
		myCar.run();
	}

	public static void main(String[] args) {
		//어차피 메인 메소드가 Car2 클래스 안에 있으므로 Car2.simulate라고 적지 않아도 되는 것. 붙인다고 문제되는 건 아님.
		simulate();
		
		//위의 정적 메소드에서 선언한 myCar와 바로 아래의 myCar는 완전히 다른 객체임! 변수명만 같은 것..
		//만약 같은 객체라면 결과값이 동일해야 함.
		Car2 myCar = new Car2();
		
		myCar.speed = 60;
		myCar.run();
		
	}

}
