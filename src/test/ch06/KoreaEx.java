package test.ch06;

public class KoreaEx {

	public static void main(String[] args) {
		Korea k1 = new Korea("123456-1234567", "김자바");
		//인스턴스는 값 변경이 자유로움. 아래와 같이 변경하면 됨
		k1.name = "김은애";
		//final은 저장된 값을 변경할 수 없으므로 에러가 뜸.
//		k1.nation = "미국";
		
		System.out.println(k1.nation);
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		
		System.out.println("=========================");
		
		Korea k2 = new Korea("12446-2513215");
		
		System.out.println(k2.nation);
		System.out.println(k2.name);
		System.out.println(k2.ssn);
		
	}

}
