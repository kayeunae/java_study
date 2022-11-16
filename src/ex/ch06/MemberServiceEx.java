package ex.ch06;

public class MemberServiceEx {

	public static void main(String[] args) {
		
//		MemberService user1 = new MemberService("홍길동", "hong");
//		
//		System.out.println(user1.name);
//		System.out.println(user1.id);
		
		MemberService memberservice = new MemberService();
		
		boolean result = memberservice.login("hong", "12345");
		
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberservice.logout("hong");
		} else {
		     System.out.println("id 또는 password가 올바르지 않습니다.");
		}

		
	}

}
