package test.ch03;

public class CompareOperation {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		
		boolean result1 = (num1 == num2);
		
		System.out.println("result1: " + result1);
		
		char char1 = 'A'; //사실은 65
		char char2 = 'B'; //사실은 66
		boolean result2 = (char1 < char2);
		System.out.println("result2: " + result2);

		int num3 = 1;
		double num4 = 1.0;
		boolean result3 = (num3 == num4);
		System.out.println("result3: " + result3);

		
		
		//실수끼리 비교할때 float와 double은 고민해야한다.
		//double이 정밀도가 더 높아서 값이 같지 않다고 판단.
		//정확하게 비교하기 위해서는 타입을 맞춰줘야한다.
		float num5 = 0.1f;
		double num6 = 0.1;
		boolean result4 = (num5 == num6); 
		boolean result5 = (num5 == (float)num6);		
		System.out.println("result4: " + result4);
		System.out.println("result5: " + result5);
		
		
		
		String str1 = "자바";
		String str2 = "java";
		//String 형은 비교를 하기위해서 eqauls 를 사용해야.
		boolean result6 = (str1.equals(str2));
		boolean result7 = (!str1.equals(str2));
		
		System.out.println("result6: " + result6);
		System.out.println("result7: " + result7);
		
	
	}
	

}
