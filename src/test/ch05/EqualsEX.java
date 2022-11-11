package test.ch05;

public class EqualsEX {

	public static void main(String[] args) {
		//String은 리터럴이 같으면 같은 주소를 가리킨다.(참조한다.)
		String strVar1= "홍길동";
		String strVar2= "김은애";
		
		//값을 비교하는 게 아니라 주소를 비교함
		if (strVar1 == strVar2) {
			System.out.println("strVal1와 strVar2는 참조가 같음");
		} else {
			System.out.println("strVal1와 strVar2는 참조가 다름");
		}
		
		//값을 비교할 땐 equals 함수를 사용
		if (strVar1.equals(strVar2)) {
			System.out.println("strVal1와 strVar2는 문자열이 같음");
		} else {
			System.out.println("strVal1와 strVar2는 문자열이 다름");
		}
		
		//객체 형태로 생성하면 리터럴이 같아도 다른 주소를 가리킴.
		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");
		
		if (strVar3 == strVar4) {
			System.out.println("strVal1와 strVar2는 참조가 같음");
		} else {
			System.out.println("strVal1와 strVar2는 참조가 다름");
		}
		
		//값을 비교할 땐 equals 함수를 사용
		if (strVar3.equals(strVar4)) {
			System.out.println("strVal1와 strVar2는 문자열이 같음");
		}
	}

}
