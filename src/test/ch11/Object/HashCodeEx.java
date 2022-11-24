package test.ch11.Object;

public class HashCodeEx {

	public static void main(String[] args) {
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(1, "홍길동");
		Student s3 = new Student(2, "홍길동");
		Student s4 = new Student(1, "김길동");
		Student s5 = new Student(1, "김길동");
	
		
		
	
		//hashcode : 객체를 식별하는 정수(객체의 메모리 번지를 이용해서 만들어짐)
//		System.out.println(s1.hashCode() + "," + s2.hashCode());
		
		/*
		 * equals 오버라이드 하기 전에는 '다릅니다'가 찍힘 !
		if(s1.hashCode() == s2.hashCode()) {
			System.out.println("s1과 s2가 같습니다.");
		} else {
			System.out.println("s1과 s2가 다릅니다.");
		}
		*/
		
		//객체의 주소를 비교하는 게 아니라 객체의 값을 비교하고 싶을 때는
		//object의 equals를 오버라이딩
		//객체의 주소를 비교하고 싶을 때는 hashcode 오버라이딩해서 이용 !
		if(s1.hashCode() == s2.hashCode()) {
			if(s1.equals(s2)) {
				System.out.println("논리적 동등입니다.");
			} else {
				System.out.println("no하고 name 데이터가 다르므로 논리적 동등이 아닙니다.");
			}
		}
	}

}
