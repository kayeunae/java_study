package test.ch07.poly;

public class Student extends Person {
	//필드
	public int studentNo;
	
	//생성자
	public Student(String name, int StudentNo) {
		super(name); //부모 생성자 호출
		this.studentNo = StudentNo; 
	}
	
	//메소드
	public void study() {
		System.out.println("공부를 합니다.");
	}
}
