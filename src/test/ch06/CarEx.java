package test.ch06;

public class CarEx {

	public static void main(String[] args) {
//		1. 객체 생성 
//		객체 외부에서 접근할 때는 myCar.model 와 같은 식으로 접근해야 함.
//		객체가 생성될 때 객체가 실행된다. (Car의 매개 변수?에 아래의 값이 들어감)
		Car myCar = new Car("그랜저", "검정", 250);
		
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		System.out.println(myCar.maxSpeed);
		System.out.println(myCar.speed);

		System.out.println("=====================");

		Car car2 = new Car("자가용");
		System.out.println(car2.model);
		System.out.println(car2.color);
		
		System.out.println("=====================");

		Car car3 = new Car("법인", "빨강");
		System.out.println(car3.model);
		System.out.println(car3.color);
		
//		실행 순서를 이해해야 한다...~!
		
	}

}
