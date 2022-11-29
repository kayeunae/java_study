package test.ch12;

public class GenericEx {

	public static void main(String[] args) {
		Box<String> box1 = new Box<String>();
//		Box<String> box1 = new Box<>(); 이것도 가능 !
		
		box1.content = "안녕하세요";
		String str = box1.content;
		System.out.println(str);
		
		//T를 통해서 타입을 언제든 변경할 수 있다.
		
		Box<Integer> box2 = new Box<>();
//		box2.content = "하이"; //X, int 타입이라 String 안됨
		box2.content = 123;
		int val = box2.content;
		System.out.println(val);
	}

}
