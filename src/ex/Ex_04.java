package ex;

public class Ex_04 {

	public static void main(String[] args) {

//		1번.
//		1-5
//		char ch = 'a';
//		System.out.println("영어:" + ch);
//		System.out.println("아스키 코드: " + (int)ch);

//		if (ch >= 65 && ch <= 90) {
//			System.out.println("대문자");
//		} else if (ch >= 97 && ch <= 122){
//			System.out.println("소문자");
//		} else {
//			System.out.println("영문이 아닙니다.");
//		}

//		int i = 2022;
//		if ((i % 4) == 0 && (i % 100) != 0 || (i / 400) == 0) {
//			System.out.println("true");
//		} else {
//			System.out.println("false");
//		}

//		boolean powerOn = false;
//		if (!powerOn) {
//			System.out.println(true);
//		}

//		String str = "yes";
//		String str1 = "yes";
//		if(str.equals(str)) {
//			System.out.println(true);
//		} else {
//			System.out.println(false);
//		}

//		2번.
//		int sum = 0;
//		for (int i = 1; i <= 100; i++) {
//			if (i % 3 == 0) {
//				sum += i;
//				System.out.println(i);
//			}
//		}
//		System.out.println("3의 배수의 합: " + sum);

//		3번.
		int num1 = (int) (Math.random()*6) + 1;
		int num2 = (int) (Math.random()*6) + 1;
		
		System.out.println("눈1: " + num1);
		System.out.println("눈2: " + num2);
		
		int result = num1 + num2;
		
		while (num1 <= 6) {
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(result);
			if (result == 5) {
				System.out.println("프로그램 종료");
				break;
			}
			}
		}

	}
