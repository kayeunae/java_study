package test.ch03;

public class Acc {

	public static void main(String[] args) {
		/* 정확한 계산은 정수로 해야해
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		//정확한 계산은 항상 정수로 해야한다.
		double result = apple - number * pieceUnit;
		System.out.println("사과 1개에서 남은 양: " + result);
		*/
		
		
		
		/* 소수를 표현하고싶다면 정수로 계산 후 소수로 만들어줘야해
		int apple = 1;
		int totalPiece = apple * 10;
		int number = 7;
		
		//정확한 계산은 항상 정수로 해야한다.
		int result = totalPiece - number;
		System.out.println("사과 1개에서 남은 양: " + result/10.0);
		//소수로 표현하고 싶으면 정수 이후 소수로 만들어주면 된다.
		
		*/
		
		
		/* 무한대를 나누고 싶다면 정수로는 안돼
		int x = 5;
		int y = 0;
		int result = 5 / 0; //0으로 나누면 무한대의 값을 정수로 표현할 수 없어서 Exception 에러가 발생.
		System.out.println(result);
		*/
		
		
		int x = 5;
		double y = 0.0;
		double z = x / y; 
//		double z = x % y;
//		System.out.println(z); // 40번 : Infinity 출력 ,  41번 : NaN 출력
		//무한대냐? 그렇다 = true , 아니다 = false , NaN이냐? 그렇다 = true, 아니다 = false
		if (Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		} else {
			System.out.println(z);
		}
		
		

	}

}
