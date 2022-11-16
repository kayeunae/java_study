package ex.ch06;

public class MemberService {
	// 필드
	String name = "홍길동";
	String id;
	String password;
	int age = 24;

	// 생성자
	MemberService() {}

	MemberService(String name, String id) {
		this.name = name;
		this.id = id;
//		this(name, id);
	}


	// 메소드
	boolean login(String id, String password) {
		//== : 주소값 비교, equals 메소드 : 리터럴 비교
		if (id.equals("hong") && password.equals("12345")) {
			return true;
		} else {
			return false;
		}
	}

	void logout(String id) {
		System.out.println(id + "님이 로그아웃 되었습니다.");
	}

}
