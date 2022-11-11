package test.ch04;

import java.util.Scanner;

public class KeyControlEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1,2를 입력했을 때 속도를 증가, 감속시키고, 3입력 시 종료시키는 프로그램
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int speed = 0;
		
		while(run) {
			System.out.println("-----------------");
			System.out.println("1.증속, 2.감소, 3.중지");
			System.out.println("-----------------");
			System.out.println("선택: ");
			
			//scanner에서 입력받은 값은 String으로 받는다. 숫자를 원하면 강제 형변환 !
			String strNum = scanner.nextLine();
			
			if (strNum.equals("1")) {
				speed++;
				System.out.println("현재속도: "+ speed);
			} else if (strNum.equals("2")) {
				speed--;
				System.out.println("현재속도: "+ speed);				
			} else if (strNum.equals("3")) {
				run = false;			
				System.out.println("프로그램 종료");
//				break;
//				continue;
				
			}
		}
	}

}
