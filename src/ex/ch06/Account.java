package ex.ch06;

public class Account {
	private int balance;
	//상수
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	
	//잔고
	public int getBalance() {
		return balance;
	}
	
	//입출금
	public void setBalance(int balance) {
		//1. 0 <= balance <= 1000000 범위일 때
		//2. 정상 범위가 아닐 때
		if(balance < 0 || balance > 1000000) {
			this.balance = 	getBalance();
		} else {
			this.balance = balance;			
		}
	}
	
	
	
}
