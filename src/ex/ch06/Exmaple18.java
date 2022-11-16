package ex.ch06;

public class Exmaple18 {
	int iv = 10;
	static int cv = 20;
	int iv2 = cv;
	static int cv2 = iv; // iv는 인스턴스 멤버로 static 변수 값에 들어갈 수 없다.
	
	static void staticMethod1() {
		System.out.println(cv);
		System.out.println(iv);	//static 메소드에 인스턴스 필드가 들어갈 수 없다.
	}
	
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);
	}
	
	static void staticMethod2() {
		staticMethod1();
		instanceMethod1();	//static 메소드에 인스턴스 메소드 불가
	}
	
	void instanceMethod2() {
		staticMethod1();
		instanceMethod1();
	}
}
