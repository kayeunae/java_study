package test.ch07.poly;

public class CarEx {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		//Tire 객체를 넣어준다.
		myCar.tire = new HankookTire();
		myCar.run();
	}

}
