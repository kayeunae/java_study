package test.ch12.Method;

public class GenericEx {

	// 제네릭 메소드
	// 객체를 생성하지 않고 바로 사용하기 위해 static 붙임
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>(); // 객체 선언
		box.set(t);
		return box;
	}

	public static void main(String[] args) {
		//제네릭 메소드 호출
		//1. T를 Integer 로 대체
		Box<Integer> box1 = boxing(100); //box 객체 생성되고, set 함수 실행됨.
		int intValue = box1.get();
		System.out.println(intValue);
		
		//2. T를 String 으로 대체
		Box<String> box2 = boxing("조규성");
		String strValue = box2.get();
		System.out.println(strValue);
	}

}
