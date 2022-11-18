package ex.ch06;

import java.util.Scanner;

public class BankApplication {
	// 스캐너 객체 생성
	private static Scanner scanner = new Scanner(System.in);
	//accountArray 에 BankAccount 타입의 객체 데이터를 배열로 넣는다. 
	//계좌 객체를 담을 배열. 객체 배열의 초기값은 null !
	private static BankAccount[] accountArray = new BankAccount[100];

	public static void main(String[] args) {
		
		boolean run = true;
		while(run) {
		System.out.println("----------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 |5.종료");
		System.out.println("----------------------------------------");
		System.out.print("선택> ");
		int selectNo = scanner.nextInt();
		
		if(selectNo == 1) createAccount();
		else if (selectNo == 2) accountList();
		else if (selectNo == 3) deposit();
		else if (selectNo == 4) withdraw();
		else if (selectNo == 5) run = false;
		}

		System.out.println("프로그램 종료.");
	}
	
	// static 이 있어야 main 메소드에서 바로 호출 가능
	// 1. 계좌 생성
	public static void createAccount() {
		System.out.println("---------");
		System.out.println("계좌생성");
		System.out.println("---------");
		
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		
		System.out.print("계좌주: ");
		String owner = scanner.next();
		
		System.out.print("초기입금액: ");
		int balance = scanner.nextInt();
		
		BankAccount newAccount = new BankAccount(ano, owner, balance); //계좌 생성
		
		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] == null) {	  //null을 이용해 빈 방 체크 !
				accountArray[i] = newAccount; //생성한 계좌를 배열에 넣어준다.
				System.out.println("결과: 계좌가 생성되었습니다.");
				break; //break를 하지 않으면 나머지 배열에 같은 계좌가 들어감. 계좌를 넣고 for 반복문을 끝낸다.
			}
			//System.out.println(accountArray[i]);
		}
	}

	// 2. 계좌 목록
	public static void accountList() {
		System.out.println("---------");
		System.out.println("계좌목록");
		System.out.println("---------");
		
		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] == null) {
				break;
			}
			System.out.print(accountArray[i].getAno());
			System.out.print(" ");
			System.out.print(accountArray[i].getOwner());
			System.out.print(" ");
			System.out.print(accountArray[i].getBalance());
			System.out.println(" ");
			
		}
	}

	// 3. 예금
	//계좌번호, 예금액 입력받기 (scanner)
	//계좌번호로 계좌를 찾아야 한다.
	// => Account account = findAccount(ano) 호출
	//찾은 계좌에 예금을 해준다.
	// => account.setBalance(account.getBalance() + 예금액);
	 
	 
	public static void deposit() {
		System.out.println("---------");
		System.out.println("예금");
		System.out.println("---------");
		
		System.out.println("계좌번호: ");
		String ano = scanner.next();
		findAccount(ano);
		System.out.println(ano);

	}

	// 4. 출금
	public static void withdraw() {
	}

	//5. accountArray 배열에서 ano와 동일한 Account 객체를 찾는 역할을 한다.
	private static BankAccount findAccount(String ano) {
		BankAccount account = null;	//Account 타입의 account 변수 생성
		
		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] != null) {	//null이 아니면 계좌가 있다
				//불러온 계좌 안에 있는 계좌 번호와 매개변수로 받아온 계좌번호 ano가 같은지 체크
				String dbAno = accountArray[i].getAno();
				if(dbAno.equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	}
	
	/* 내가 짠 거...
	private static Account findAccount(String ano) {
		for(int i = 0; i < accountArray.length; i++) {
			if (!ano.equals(accountArray[i].getAno())) {
				System.out.println("잘못된 계좌번호입니다.");
				break;
			} 
		}
		return null;
	}
	*/
	
}
