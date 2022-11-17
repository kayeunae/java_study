package test.ch07;

public class SmartPhoneEx {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("갤럭시", "은색");
		
		//phone에서 상속받은 필드 읽기: 자식 객체에도 부모 필드에 접근 가능
		System.out.println(myPhone.model + "," + myPhone.color);
		
		//phone에서 상속받은 메소드: 자식 객체에서 부모 메소드에 접근 가능
		myPhone.bell();
		myPhone.sendVoice("여부세용");
		myPhone.recieveVoice("넹 전화받았습니다~");
		myPhone.hangUp();
		
		myPhone.setWifi(false);
		System.out.println(myPhone.wifi);
		
	}

}
