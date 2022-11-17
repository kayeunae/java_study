package test.ch07;

public class SmartPhone extends Phone{
	//필드
	public boolean wifi;
	
	//생성자 (생성자 이름은 클래스명과 똑같이 !)
	public SmartPhone(String model, String color) {
		super(model, color);				//부모 생성자 호출 (1번 생성자에 대응)
//		super(model, color);	//2번 생성자에 대응
		System.out.println("자식 생성자 호출");
		//부모 클래스에서 생성한 필드를 가져다 자유롭게 사용 가능
		//부모 필드에 초기값을 준다.
//		this.model = model;		//부모 필드에 접근하여 값을 주는 것. (초기값 설정)
//		this.color = color;		//초기값 설정
	}
	
	//메소드
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.print("와이파이 상태 변경: ");
	}
	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}
}
