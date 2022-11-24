package test.ch08.type2;

public class CastEx {

	public static void main(String[] args) {
		
		/*
		Vehicle vehicle = new Bus();	//자동 형변환
		vehicle.run();
//		vehicle.checkFare();	//자식 클래스는 오버라이드된 요소 외에 사용 불가.
		
		Bus bus = (Bus) vehicle;	//강제 형변환
		bus.run();
		bus.checkFare();
		*/
		
		
		Taxi taxi = new Taxi();
		Bus bus = new Bus();
		
		//Vehicle vehicle = new Taxi();
//		ride(taxi);
		ride(bus);
		
	}

	public static void ride(Vehicle vehicle) {
		//vehicle이 Bus 객체를 가지고 있는지 확인. Vehicle vehicle = new Bus(); <= 요거 맞는지 확인 !!
		//ride(taxi); : vehicle이 taxi를 가지고 있지 않으므로 if 문 실행X
		if (vehicle instanceof Bus) {
			
			Bus bus = (Bus) vehicle;	//강제 타입 변환
			bus.run();
			bus.checkFare();
		}
	}
	
}
