package test.ch08.field_multi;

public class DriverEx {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//Vehicle vehicle = new Bus(); => 자동 형변환
		driver.drive(bus);
		//Vehicle vehicle = new Taxi(); => 자동 형변환
		driver.drive(taxi);
		
	}

}
