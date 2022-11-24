package test.ch09.noname;

public class CarEx {

	public static void main(String[] args) {
		//Car 객체 생성
		Car myCar = new Car();
		myCar.run1();
		myCar.run2();
		//익명객체를 매개 변수로 사용할 때!
		//Tire tire =  new Tire(); 와 같아짐 !
		myCar.run3(new Tire() {
			@Override
			public void roll() {
				System.out.println("타이어가 데굴데굴 굴러갑니다.");
			}
			
		});
	}

}
