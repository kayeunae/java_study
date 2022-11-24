package test.ch08;

public class Audio implements RemoteControl {
	int volume;
	
	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
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
		System.out.println("현재 오디오 볼륨: " + volume);
	}
	
	//볼륨을 기억하는 필드
	private int memoryVolume;
	
	//디폴트 메소드는 오버라이드 시 반드시 public 접근 제한자를 붙여야 한다.
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			//this.volume은 상단에 선언한 필드
			this.memoryVolume = this.volume;
			System.out.println("음소거 처리합니다.");
			setVolume(RemoteControl.MIN_VOLUME);
		} else {
			System.out.println("음소거 해제");
			setVolume(this.memoryVolume);
		}
	}
	
	

}
