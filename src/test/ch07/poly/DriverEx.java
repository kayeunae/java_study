package test.ch07.poly;

public class DriverEx {

	public static void main(String[] args) {
		Driver driv = new Driver();	//Driver 객체를 생성한다.
		
		//Taxi tax = new Taxi();
		Bus bus = new Bus();

		//driv.drive(tax);
		driv.drive(bus);
		
		//= Vehicle vehicle = new Bus(); 와 같은 코드라고 할 수 있다. => 자동타입변환
		//자동타입변환을 하면 자식 클래스에 있는 오버라이드 요소에 접근할 수 있다.
		
		
	}

}
