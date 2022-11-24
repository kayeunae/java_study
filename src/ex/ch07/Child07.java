package ex.ch07;

public class Child07 extends Parent07 {
	public String name;
	
	public Child07() {
		//super();
		this("홍길동");
		System.out.println("Child() call");
	}
	
	public Child07(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
