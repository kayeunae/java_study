package singletone;

public class User {
	//필드
	//사용자 이름
	private String name;
	
	public User(String name) {
		this.name = name;
	}
	
	public void print() {
		//static을 사용해 객체를 선언하지 않고도 바로 사용 가능하다.
		Printer printer = Printer.getPrinter();
		//printer.toString() 객체의 주소를 보여줌
		System.out.println(this.name + "사용자가 사용하는 프린트: " + printer.toString());
	}
	
}
