package ex.ch06;

public class Example20 {

	static boolean isNumber(String str) {
		
		//배열로 풀 때 -> 주어진 값이 null 이면 배열화를 할 수 없기 때문에 main에서 if문 적용2332
		char[] arr = str.toCharArray();

		//문자를 검출 !
		for (int i = 0; i < arr.length; i++) {
			// arr[i]가 숫자면 true를 반환하기 때문에 if 문 자체가 성립되지 않는다.
			// arr[i]가 문자면 false를 반환해서 return 값에 false ! -> 문자 검출
			if (Character.isDigit(arr[i]) == false) {
				return false;
			} 
		}
		return true;
		
		
		
		//선생님 가이드
		
//		for(int i = 0; i < str.length(); i++) {
//			//charAt(i): 문자열의 i번째 요소를 가져온다.
//			char ch = str.charAt(i);
//			//System.out.println("값:" + ch);
//			
//			if(ch < '0' || ch > '9') {	//숫자가 아님. '0' = 48, '8' = 56, '9' = 57
//				return false;
//			}
//			
//		}
//		return true;
		
	}

	public static void main(String[] args) {

		String str = "215556";
		
		if(str == null || str.equals("")) {
			System.out.println(str + "는 숫자입니까? " + "false");
		} else {
		char[] arr = str.toCharArray();
		System.out.println(arr[1]);
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		str = "1234o";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		}
	}

}
