package test.ch07;

//부모 클래스
public class Phone {
	// 필드
	public String model; // 모델명
	public String color; // 컬러
	
	//생성자
	//생성자를 작성하지 않으면 자바 컴파일러에서 디폴트 생성자를 만든다.
	
	//1번 생성자
	public Phone(String model, String color) {
		System.out.println("부모 생성자 호출");
		this.model= model;
		this.color= color;
	}
	
	//2번 생성자
//	public Phone(String model, String color) {
//		this.model = model;
//		this.color = color;
//	}
	
	
	// 메소드
	public void bell() {
		System.out.println("벨이 울립니다.");
	}

	public void sendVoice(String message) {
		System.out.println("내 목소리: " + message);
	}

	public void recieveVoice(String message) {
		System.out.println("상대방 목소리: " + message);
	}

	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}

}
