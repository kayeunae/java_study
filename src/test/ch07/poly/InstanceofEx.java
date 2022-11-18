package test.ch07.poly;

public class InstanceofEx {
	//메소드
	public static void personInfo(Person person) {	//static을 사용하면 객체를 생성하지 않고 바로 불러낼 수 있다.
		System.out.println("name: " + person.name);
		person.walk();
		
		if (person instanceof Student) { //person이 Student 객체를 참고하고 있나?!
			Student student = (Student)person;	//강제 타입변환
			student.study();
			System.out.println(student.studentNo);
		}
	}

	public static void main(String[] args) {
		Person p1 = new Person("홍길동"); // Person person = new Person("홍길동") 과 같다.
		personInfo(p1);
		
		Person p2 = new Student("김길동", 10);
		personInfo(p2);

	}

}
