package test.ch12.extend;

public class GenericEx {
	
	//리턴 타입은 boolean
	public static <T extends Number> boolean compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		
		return (v1 == v2);
	}

	public static void main(String[] args) {
		boolean result1 = compare(10, 20);
		System.out.println(result1);
		
		boolean result2 = compare(4.5, 4.5);
		System.out.println(result2);
		
//		boolean result3 = compare("a", "a");	//X
//		System.out.println(result3);
		
	}

}

/*
 * doubleValue는 추상 메소드임
 * double의 오버라이드 된 doubleValue 메소드가 실행되는....?
 */
