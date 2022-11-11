package test.ch03;

public class ConditionalOperator {

	public static void main(String[] args) {
		
		int score = 85;
		char grade = (score > 90)? 'A' : ((score > 80)? 'B' : 'C'); 
		System.out.println(score + "점은 " + grade + "등급입니다");
		
	}

}
/*삼항연산자
조건식? 결과1   :   결과2
   (참일때 실행)(거짓일때 실행)

*/