package test.ch11.wrapper;

public class BoxingUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer obj = 100;	//박싱: 기본 타입의 값을 포장 객체로 만드는 것
		int value = obj; 	//언박싱: 포장 객체를 기본타입으로 만드는 것
		
		//이 단계에서부터 언박싱이 되고, 그 다음에 연산
		int value2 = obj + 5;	//obj는 5와 연산되기 전에 언박싱 된다.
		
		System.out.println("value: " + obj.intValue());
		System.out.println("value: " + value2);

	}

}
