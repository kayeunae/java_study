package test.ch07;

public class Computer extends Calculator {
 
	//override: 부모 클래스에 있는 메소드를 재정의(반환타입, 메소드 이름, 매개변수 모두 같아야 함)
	@Override
	public double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
	

}
