package ex.ch0345;

import java.util.Scanner;

public class Ex_04 {

	@SuppressWarnings("resource")
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
		
//		3번.1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하는 코드를 작성하시오.
		
//		int i = 1;
//		int sum = 0;
//		
//		for(i = 1; i <= 20; i++ ){
//			if (!(i % 2 == 0) && !(i % 3 == 0)) {
//				sum += i;
//			}
//		}
//		System.out.println(sum);
		
		
//		4번. 주사위를 던져서 눈의 합이 5인 경우 종료하는 프로그램 작성	
//		while (true) {
//			int num1 = (int) (Math.random()*6) + 1;
//			int num2 = (int) (Math.random()*6) + 1;
//			
//			System.out.println("눈1: " + num1);
//			System.out.println("눈2: " + num2);
//			
//			int result = num1 + num2;
//			
//			if (result == 5) {
//				System.out.println("프로그램 종료");
//				break;
//				}
//		}
		
//		5번. 방정식 4x + 5y = 60의 모든 해를 구해서 (x, y) 형태로 출력하는 코드. 단, x와 y는 10 이하의 자연수
//		int x = 1, y =1;
//		
//		for (x = 1; x <= 10; x++) {
//			for (y = 1; y <= 10; y++) {
//				int result = 4 * x + 5 * y;			
//				if(result == 60) {
//					System.out.println("x: " + x + " y: " + y);										
//				}	
//			}
//		}
		
//		6번. 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해 나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하는 프로그램
		
//		int i = 1;
//		int j = -2;
//		int sum = i + j;
//		
//		while (true) {
//			i+=2;
//			while (true) {
//				j -=2;
//				if (sum <= 100) {
//					System.out.println(sum);
//					System.out.println("i: " + i + " j: " + j);
//				}
//			break;
//			}
//		} 
		
//		정답 !
//		int sum = 0;	//총합을 저장할 변수
//		int s = 1;		//값의 부호를 바꿔주는 데 사용할 변수
//		int num = 0;
//		
//		//무한 반복문, s에 -를 반복하게 해서 매번 부호를 바꿔줌
//		for (int i = 1; true; i++, s = -s) {
//			num = s * i;
//			sum += num;
//			if (sum >= 100) {
//				break;
//			}
//		}
//		System.out.println("num= " + num);
//		System.out.println("sum= " + sum);
		
//		7. 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램
		
//		for (int i = 1; i <= 6; i++) {
//			for (int j =1; j <=6; j++) {
//				if (i + j == 6) {
//					System.out.println("i: " + i + " j: " + j);
//				}
//			}
//		}
		
//		8번.
		
//		int i = (int) (Math.random() * 10);
//		int j = (int) (Math.random() * 10);
//		int k = (int) (Math.random() * 10);
//		int m = (int) (Math.random() * 10);
//		int num = i * 1000 + j * 100 + k * 10 + m;
//		
//		System.out.println("i: " + i + " j: " + j + " k: " + k + " m: " +m);
//		System.out.println(num);
//		
//		int sum = i + j + k + m;
//		
//		System.out.println(sum);
		
//		정답 !
//		int sum = 0;
//		int num = 12345;
//		
//		while (num > 0) {
//			sum += num % 10;
//			num /= 10;
//		}
//		System.out.println("sum: " + sum);
		
//		10번. 별 그림 만들기
		
//		for(int i = 1; i <= 5; i++) {			
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
////				if (j == i) {
////				}
//			}
//			System.out.println();
//		}
		
		
//		11번. 
//		int answer = (int) (Math.random()*100) + 1;
//		int input = 0;		//사용자 입력을 저장할 공간
//		int count = 0;		//시도횟수를 세기 위한 변수
//		System.out.println(answer);
//		//화면으로부터 사용자 입력을 받기 위해서 Scanner 클래스 사용
//		Scanner s = new Scanner(System.in);
//		do {
//			count++;
//			System.out.println("1과 100사이의 값을 입력하세요. : ");
//			input = s.nextInt(); 	//입력 받은 값을 변수 input에 저장
//			if (input < answer) {
//				System.out.println("더 큰 수를 입력하세요");
//			} else if(input > answer) {
//				System.out.println("더 작은 수를 입력하세요");
//			} else {
//				System.out.print(count + "번째 시도 ");
//				System.out.println("정답입니다 !");
//				System.out.println("프로그램이 종료됩니다.");
//				break;
//			}
//		} while (true);
		
//		12번.
		
//		int choice = 0;	//메뉴 선택
//		int in = 0;		//예금액
//		int out = 0;	//실제 출금액
//		int total = 0; 	//잔액
//				
//		Scanner sChoice = new Scanner(System.in);
//		Scanner sIn = new Scanner(System.in);
//		Scanner sOut = new Scanner(System.in);
//		
//		do {
//			System.out.println("------------------------------");
//			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
//			System.out.println("------------------------------");
//			System.out.print("선택> ");
//			choice = sChoice.nextInt();
//			if (choice == 1) {
//				System.out.print("예금액> ");
//				in = sIn.nextInt();
//				total = in - out;
//			} else if (choice == 2) {
//				System.out.print("출금액> ");
//				out = sOut.nextInt();
//				total = in - out;
//			} else if (choice == 3) {
//				total = in - out;
//				System.out.println("잔고> " + total);
//			} else if (choice < 1 || choice > 4) {
//				System.out.println("잘못된 선택입니다.");
//			}else {
//				System.out.println("프로그램 종료");
//				break;
//			}
//		} while (true);
		
		
//		정답 !
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		while (run) {
			System.out.println("------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------------");
			System.out.print("선택> ");
			int menuNum = scanner.nextInt();
			switch (menuNum) {
			case 1:
				System.out.print("예금액> ");
				balance += scanner.nextInt();
				break;
			case 2:
				System.out.print("출금액> ");
				balance -= scanner.nextInt();
				break;
			case 3:
				System.out.print("잔고: ");
				System.out.println(balance);
				break;
			case 4:
				run = false;
				break;
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
		
		
		
		
		
		
	}
}

