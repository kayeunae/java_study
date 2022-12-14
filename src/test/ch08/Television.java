package test.ch08;

public class Television implements RemoteControl {
	//필드
	private int volume;
	
	//인터페이스에서 추상메소드를 선언하면 자식 클래스에서 무조건 오버라이드를 해줘야 함.
	//★인터페이스에 정의된 추상메소드는 반드시 구현을 해줘야 한다★
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨: " + this.volume);
	}
	

}
