package test.ch06;

public class CalculatorEx {

	public static void main(String[] args) {
//		메소드만 선언했고, 생성자는 만들지 않았음.
//		컴파일 과정에서 자동으로 생성자는 생기지만 현재 파일에서는 사용하지 않을 예정.
		Calculator myCalc = new Calculator();
		
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println(result1);
		
		int x = 10, y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println(result2);
		
		myCalc.powerOff();
		
		
	}

}
