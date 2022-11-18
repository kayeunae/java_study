package test.ch07;

public class SupersonicAirplaneEx {

	public static void main(String[] args) {
		SuperesonicAirplane sa = new SuperesonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SuperesonicAirplane.SUPERSONIC;
		sa.fly();
		
	}

}
