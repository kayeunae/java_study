package ex.ch06;

public class Account {
	private int balance;
	final int MIN_BALANCE = 0;
	final int MAX_BALANCE = 1000000;
	
	//잔고
	public int getBalance() {
		return balance;
	}
	
	//입출금
	public void setBalance(int balance) {
		this.balance += balance;
		if(balance < 0 || balance > 1000000) {
			this.balance = balance;			
		}
	}
	
	
	
}
