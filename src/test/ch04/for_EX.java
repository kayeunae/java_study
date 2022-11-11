package test.ch04;

public class for_EX {

	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 1; i <=100; i++) {
//			sum = sum + i;
			sum += i;
		}
		
		System.out.println("sum=" + sum);
		
//		for(float x=0.1f; x<=1.0f; x+=0.1f) {
//			
//		}
		
//		이중for문 (구구단 출력)
		for (int m=2; m<=9; m++) {
			System.out.println("***" + m + "단 ***");
			for (int n=1; n<=9; n++) {
				System.out.println(m + "x" + n + "=" + (m * n));
			}
			
		}
		
//		for (int i=1; i<=10; i++) {
//			System.out.println(i);
//		}
		
		// 초기값과 증감은 두 개씩 입력할 수 있다. 조건은 한 개만!
//		for (int i=1, j=11; i<=10 && j <=15; i++, j++) {
//			System.out.println(i);
//			System.out.println(j);
//		}
		
//		int j = 0;
//		for (int i=1; i<=10 && j<=10; j++) {
//			System.out.println(j);
//		}
	}

}
