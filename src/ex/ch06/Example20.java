package ex.ch06;

public class Example20 {

	static boolean isNumber(String str) {
		char[] arr = str.toCharArray();

//		문자를 검출 !
		for (int i = 0; i < arr.length; i++) {
			// arr[i]가 숫자면 true를 반환하기 때문에 if 문 자체가 성립되지 않는다.
			// arr[i]가 문자면 false를 반환해서 return 값에 false ! -> 문자 검출
			if (Character.isDigit(arr[i]) == false) {
				return false;
			} else {
			}
		}
		return true;

	}

	public static void main(String[] args) {

		String str = "123";
//		char[] arr = str.toCharArray();
//		System.out.println(arr[1]);
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		str = "1234o";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));

	}

}
