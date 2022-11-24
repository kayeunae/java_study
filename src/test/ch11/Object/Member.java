package test.ch11.Object;

//Object는 최상위 클래스이다. 항상 클래스 명 뒤에 extends Object 가 붙어있다. (내 눈에만 안 보여..)
public class Member extends Object {
	//필드
	public String id;
	
	//생성자
	public Member(String id) {
		this.id = id;
	}
	
	//논리적 동등 : 객체의 주소와 상관없이 필드의 값으로 비교
	@Override
	// Object obj = new Member("blue")와 같음
	public boolean equals(Object obj) {
		//obj가 Member 객체를 가지고 있냐?
		if (obj instanceof Member) {		//강제 형변환을 하기 위해 검사
			Member target = (Member)obj;  //강제 형변환 : 자식 객체에 있는 필드를 가져오기 위해
			//필드의 id와 target의 id 비교. (필드 id > blue, target id > blue)
			if(id.equals(target.id)) {	//여기서의 equals는 String의 equals(순수하게 문자값 비교)
				return true;
			}
		}
		//오브젝트가 멤버 객체를 가지고 있지 않으면 false를 줌
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	/*
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = obj1;
		//현재 stack 영역에서 obj1과 2는 같은 주소를 가지고 있고, heap 영역에 같은 객제가 있을 것 !
		
		//equals를 오버라이드할 수 있다 ! 
		System.out.println(obj1.equals(obj2));	//번지수를 비교
		System.out.println(obj1 == obj2);	//번지수를 비교 (실제 데이터 비교는 아님)
		
		String a = "1";
		String b = "2";
		
		if(a == b);			//X, 주소를 비교
		if(a.equals(obj2));	//O, 값을 비교
		
		
		//논리적 동등 :  같은 객체든 다른 객체든 객제 저장 데이터가 동일하다.
		//객체 자체를 비교한다는 건 주소를 비교한다는 의미이기 때문에 equals를 오버라이드 !
	}
	*/
}
