package test.ch09.noname;

public class Car {
	//필드에 Tire 객체 대입
	//필드에서 익명 자식 객체 사용
	private Tire tire1 = new Tire();
	//중괄호 끝에 세미콜론 꼭 붙이기 !
	private Tire tire2 = new Tire() {
		//이름이 없는 클래스를 쓰는 것과 같다고 생각하면 됨.
		//Tire의 자식 클래스가 되어서 오버라이드가 가능해짐.
		// => 이름 없는 클래스를 생성함과 동시에 상속 + 자동 형변환까지!
		@Override
		public void roll() {
			System.out.println("한국 타이어가 굴러갑니다.");
		}
	};
	
	//메소드
	public void run1() {
		tire1.roll();
		tire2.roll();
	}
	
	public void run2() {
		//로컬 변수에 익명 자식 객체 사용
		Tire tire = new Tire() {
			@Override
			public void roll() {
				System.out.println("금호 타이어가 굴러갑니다.");
			}
			
		};
		
		tire.roll();
	}
	
	//메소드(매개변수 이용)
	public void run3(Tire tire) {
		tire.roll();
	}
	
}
