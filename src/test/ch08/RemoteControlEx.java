package test.ch08;

public class RemoteControlEx {

	public static void main(String[] args) {
		/*
		RemoteControl rc = new Television();
		rc.turnOn();
		
		RemoteControl rc2 = new Audio();
		rc2.turnOn();
		*/
		
		//RemoteControl타입의 rc라는 객체를 선언한다.
		/*
		RemoteControl rc;
		
		//Television 클래스를 rc 객체에 넣어준다. 
		rc = new Television();
		rc.turnOn();
		rc.setVolume(20);
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		//인터페이스에 선언된 상수는 static의 특성을 가졌기 때문에 객체를 생성하지 않고 호출한다.
		System.out.println(RemoteControl.MAX_VOLUME);
		System.out.println(RemoteControl.MIN_VOLUME);
		*/
		
		RemoteControl rc;
		
		rc =  new Television();
		rc.turnOn();
		rc.setVolume(5);
		
		rc.setMute(true);
		rc.setMute(false);
		
		System.out.println("==============");
		
		rc =  new Audio();
		rc.turnOn();
		rc.setVolume(5);
		
		rc.setMute(true);
		rc.setMute(false);
		
		RemoteControl.changeBattery();
	}

}
