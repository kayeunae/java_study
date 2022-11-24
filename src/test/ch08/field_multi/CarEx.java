package test.ch08.field_multi;

public class CarEx {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
		
		//다형성
		//타이어 객체 교체
		myCar.tire1 = new KumhoTire();
		myCar.tire2 = new KumhoTire();
		myCar.run();
	}

}
