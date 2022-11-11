package test.ch04;

public class While_EX {

	public static void main(String[] args) {
		int i = 1;
		
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		
//		1~100까지 합계
		
//		int j= 1;
//		int sum = 0;
//		while(j <= 100) {
//			sum += j;
//			j++;
//		}
//		System.out.println(sum);
		
		do {
			i++;
			System.out.println(i);
		} while (i<=10);
		
	}

}
