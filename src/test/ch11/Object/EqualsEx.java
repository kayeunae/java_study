package test.ch11.Object;

public class EqualsEx extends Object {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		//객체를 따로 생성했기 때문에 주소가 다르기 때문에 다르ㄷㅏ고 뜸
		//equals를 오버라이드 하여 문자열 비교로 바꾸었기 때문에 문자값을 비교하여 두 객체가 같다고 뜬다.
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2가 같습니다.");
		} else {
			System.out.println("obj1과 obj2가 다릅니다.");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3가 같습니다.");
		} else {
			System.out.println("obj1과 obj3가 다릅니다.");
		}
		
		
		
	}

}
