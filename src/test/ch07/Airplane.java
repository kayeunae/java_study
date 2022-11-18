package test.ch07;

//클래스 앞에 final을 붙이면 절대 부모클래스로 사용할 수 없다.
//public final class Airplane {
public class Airplane {
	//메소드
	public void land() {
		System.out.println("착륙");
	}
	//메소드 앞에 final을 붙이면 그 메소드는 오버라이드 할 수 없음
	public void fly() {
		System.out.println("일반 비행");
	}
	public void takeOff() {
		System.out.println("이륙");
	}
}
