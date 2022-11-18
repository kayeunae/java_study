package test.ch07;

//supersonic : 초음속
public class SuperesonicAirplane extends Airplane {
	//상수
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	//필드 (상태 필드)
	public int flyMode = NORMAL;

	@Override
	//부모클래스와 자식클래스의 필드가 다를 때 if문을 이용해서 필요에 맞게 사용 가능 !
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속 비행");
		} else {	// normal 일 때는
			//super: 부모클래스 => 부모클래스의 .이하 요소를 가져와 실행한다.
			//super.메소드명() => 부모클래스의 메소드 실행. 부모클래스의 우선순위가 더 높음.
			super.fly();
		}
	}
	
	
}
