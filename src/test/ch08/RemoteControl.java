package test.ch08;

public interface RemoteControl {
	//인터페이스에서는 추상메소드와 상수만 선언할 수 있기 때문에
	//상수를 선언할 때 static final을 안 붙이고, 데이터의 타입과 변수명만 적어줘도 된다.
	//인터페이스에 선언된 필드는 모두 public static final 특성을 갖는다.
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//public 추상메소드
	//public이 없어도 컴파일 과정에서 public abstract가 자동으로 붙는다.
	//->추상 메소드이므로...
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//디폴트 메소드: 인터페이스에서 실행 메소드를 구현하고 싶을 때
	//->오버라이드를 하지 않아도 에러가 나지는 않는다. 선택적으로 하면 됨
	//static이 생략되어 있음 > 객체 생성 불필요
	default void setMute(boolean mute) {	//음소거
		if(mute) {
			System.out.println("음소거 처리합니다.");
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("음소거 해제.");
		}
	}
	
	//정적(static) 메소드
	//구현 코드를 쓸 수 있음.
	//public이 없어도 컴파일 과정에서 public이 붙는다.
	//static > 객체 생성 불필요
	static void changeBattery() {
		System.out.println("건전지 교체.");
	}
	
}
