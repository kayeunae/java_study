package test.ch11.wrapper;

public class ValueCompareEx {

	public static void main(String[] args) {
		Integer obj1 = 300; 	//기본 타입이 아니라 객체! 객체는 값이 아닌 주소를 갖고 있다.
		Integer obj2 = 300;		//기본 타입을 Integer라는 객체로 박싱 !
		System.out.println(obj1 == obj2);	// 주소를 비교하기 때문에 다른 값이라고 뜬다.
		System.out.println(obj1.equals(obj2));	//문자열 자체를 비교.
		System.out.println();
		
		/*
		 * [값을 비교하는 타입]
		 * Byte, Short, Integer : -128 ~ 127 
		 */
		
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println(obj3 == obj4);
		System.out.println(obj3.equals(obj4));

	}

}
