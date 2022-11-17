package ex.ch06;

import java.util.Scanner;

public class BankAccount22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 |5.종료");
			System.out.println("----------------------------------------");
			System.out.print("선택> ");
			
			String choice = scan.nextLine();
			
			switch (choice) {
			case 1:
				System.out.print("계좌번호: ");
				String account = scan.nextLine();
				System.out.print("계좌주: ");
				String name = scan.nextLine();
				System.out.println("초기입금액: ");
//				int first = scan.nextLine();
				break;
//			case 2:
//				
//				break;
//			case 3:
//				
//				break;
//			case 4:
//				
//				break;
//			case 5:
//				
//				break;
//				
			
			}
	
		
		
		
		
		}
		
		
		
	}

}
