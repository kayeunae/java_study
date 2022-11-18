package test.ch07.poly;

public class Driver {
	//메소드(매개변수로 다형성을 구현한다.)
	//Vehicle (객체)타입의 vehicle 변수명
	public void drive(Vehicle vehi) {
	// vehicle을 제외한 나머지 값이 뭐가 들어올지 모름
		vehi.run();
	}
}
