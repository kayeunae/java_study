package ex;

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
		if (id == "hong" && password == "12345") {
			return true;
		} else {
			return false;
		}
	}

	boolean logout(String id) {
		System.out.println(id + "님이 로그아웃 되었습니다.");
		return true;
	}

}
