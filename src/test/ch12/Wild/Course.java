package test.ch12.Wild;

public class Course {
	//모든 사람이 수강신청 가능
	// ?: 와일드 카드 타입 파라메터
	// 아래 매개변수는 Applicant<?> = new Applicant<Person>(new Person()) 과 같다 ! 
	public static void registerCourse1(Applicant<?> applicant) {
		//.getClass().getSimpleName(): 해당 클래스의 이름을 가져온다.
		System.out.println(applicant.kind.getClass().getSimpleName() + "이 Course1을 등록.");
	}
	
	//학생만 수강신청 가능
	//자기 자신과 하위 클래스만 제네릭 타입으로 사용 가능
	public static void registerCourse2(Applicant<? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "이 Course2를 등록.");
	}
	
	//직장인 및 일반인만 수강신청 가능
	//자기 자신과 부모클래스만 제네릭 타입으로 사용 가능
	public static void registerCourse3(Applicant<? super Worker> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "이 Course3을 등록.");
	}
}
