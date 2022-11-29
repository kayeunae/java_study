package test.ch12.InterfaceGeneric;

public class GenericEx {

	public static void main(String[] args) {
		HomeAgency homeAgency = new HomeAgency();
		//homeAgency는 Home 객체 자체를 리턴받기 때문에 아래와 같이 작성
		//Home home = new Home();
		Home home = homeAgency.rent();
		home.turnOnLight();
		
		CarAgency carAgency = new CarAgency();
		//Car car = new Car();
		Car car = carAgency.rent();
		car.run();
	}

}
