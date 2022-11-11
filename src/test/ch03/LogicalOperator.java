package test.ch03;

public class LogicalOperator {

	public static void main(String[] args) {
		int charCode = '3';
		
		if ((65<=charCode) & (charCode<=90)) { //65~90사이
			System.out.println("대문자이군요.");
		}

		if ((97<=charCode) && (charCode<=122)) { //97~122사이
			System.out.println("소문자이군요.");
		}

		if ((48<=charCode) && (charCode<=57)) { //48~57사이
			System.out.println("0-9 숫자군요.");
		}
		
		int value = 9;
		//배수 구하기 = 나머지를 찾으면 됨. 
		if ((value%2 == 0) | (value%3==0)) {
			System.out.println("2또는 3의 배수");
		}
		
		if ((value%2 == 0) || (value%3==0)) {
			System.out.println("2또는 3의 배수");
		}
	
	}

}


/* 
&& : 앞에있는게 false면 뒤에 있는식을 계산하지 않음.

& : 앞이 false여도 뒤를 계산함. (근데 결과는 똑같긴함. 잘안쓰임)



|| : 앞이 true 면 뒤에 있는식을 계산하지 않음(비교하지않음)

| : 앞이 true여도 뒤를 계산함 (근데 결과는 똑같긴함. 잘안쓰임)


비트연산자 ^
 */