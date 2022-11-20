package ex.ch06;

public class BankAccount {
	//필드(속성):
	private String ano;		//계좌번호
	private String owner;	//계좌주
	private int balance;	//잔고
	
	//생성자(객체가 생성될 때 초기화 시킬 코드) //생성자로 setter의 역할을 하고 있음...
	public BankAccount(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	//메소드(기능)
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
}
