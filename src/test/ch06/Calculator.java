package test.ch06;

public class Calculator {
//	같은 패키지 안에 있으면 public 없어도 된다.
//	리턴 값이 없는 메소드 선언 (void)
	void powerOn() {
		System.out.println("전원을 켭니다.");
//		return;		//리턴 값에 아무것도 주지 않거나 안 쓴다.
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
//	int형으로 리턴 값이 있는 메소드
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
//	double형으로 리턴 값이 있는 메소드
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
	
}