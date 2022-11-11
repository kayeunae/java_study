package test.ch02;

public class Promotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		byte byteValue = 10;
//		int intValue = byteValue;
//		System.out.println(intValue);
//		
//		
//		char charValue = '가';
//		intValue = charValue;
//		System.out.println(intValue);
//		
//		intValue = 50;
//		long longValue = intValue;
//		System.out.println(intValue);
//		
//		longValue = 100;
//		float floatValue = longValue;
//		System.out.println(longValue);
//		
//		floatValue = 100.5f;
//		double doubleValue = floatValue;
//		System.out.println(doubleValue);
		
		//char타입의 허용범위에는 음수가 포함되어있지 않음. 0 ~ 65535
		//그런데 byte의 허용범위에는 음수가 포함되어있음. -128 ~ 127
		
//		byte test = 65;
//		char charValue1 = test; //작동안함.

		//short와 char 사이에서도 자동형변환은 발생하지 않는다.
//		short a = 1;
//		char b = a;
//		
		
		
		
//		//강제타입변환
//		int intValue = 100;
////		int intValue = 1929723;
//		//byte byteValue = intValue; // 인트가 더 크므로 에러가 발생함.
//		byte byteValue = (byte) intValue; //int값을 byte값에 강제 형변환함. 다만 byte가 담을 수 없는 수일 경우 값이 짤림.
//		System.out.println(byteValue);
//		
//		long var1 = 300;
////		int var4 = var1; // int가 long보다 작으므로 강제형변환을 해야 정상작동한다.
//		int var4 = (int) var1;
//		System.out.println(var4);
//		
//		int var5 = 65;
//		char var6 = (char) var5;
//		System.out.println(var6);
//		
//		double var7 = 3.141592;
//		int var8 = (int)var7; // int는 정수형 이므로 소수점 아래가 짤린다.
//		System.out.println(var8);
//		
//
		
		
//		byte x = 10;
//		byte y = 20;
////		byte result = x + y; //오류발생함. :  연산하면 자동으로 int형이 되버려서 byte에서 쓰려면 강제형변환 없이 못씀. int x + int y 가 되버린것.
//		int result = x + y; // 해결책 1
//		byte result2 = (byte) (x + y);//해결책 2
		
		
//		byte v3 = 10;
//		int v4 = 100;
//		long v5 = 1000L;
//		long result3 = v3 + v4 + v5; //int로 하면 에러가 발생함. 이유는 여러개를 연산시 타입이 가장 큰 형으로 자동변환이 되있기 때문.
//		System.out.println(result3);
//		
//		char v6 = 'A';
//		char v7 = 1;
//		int result4 = v6 + v7;
//		System.out.println(result4);
//		
//		
//		int v8 = 10;
//		int result5 = v8 / 4;
//		double result6 = v8 / 4;
//		System.out.println(result6); //애초부터 정수끼리 계산했기때문에 double로 체크해도 소수점 아래 자리가 없음.
//		
//		int v9 = 10;
//		double result7 = v9 / 4;  // 정수끼리의 연산결과이므로 2가 나옴. (정수 / 정수)
////		double result7 = v9 / 4.0; // double형에서 4.0으로 나누었으므로 2.5가 나옴. (정수 / 실수)
//		System.out.println(result7);
//		
//		int v10 = 1;
//		int v11 = 2;
////		double result8 = v10 / v11; 
//		double result8 = (double)v10 / v11;
//		System.out.println(result7);
//		
//		String str = "안녕하세요";
//		int val = 1;
//		String val2 = "3"; 
//		//문자열이 하나라도 있으면 다 문자로 인식함.
//		System.out.println(str + val); //안녕하세요1 이라고 써있지만 숫자형1이 아니라 다 문자형이 된다.
//		System.out.println(val + val2); //숫자 13이 아닌 문자형 13이다.
//		System.out.println(2 + val + val2);//숫자 2와 val의 1 값이 더해져서 3이 찍히고, val2값인 문자형 3이 오면서 33 이라는 문자형이 된다.
//		
//		
//		//문자형을 byte로 변환하고싶을때
//		byte value = Byte.parseByte(val2);
//		//문자형을 int로 변환하고 싶을때
//		int value2 = Integer.parseInt(val2); 
//		//문자형을 double로 변환하고 싶을 때
//		double value3 = Double.parseDouble(val2);
//		
//		
//		//primitive 형을 문자형으로 변환하고 싶을 때.
//		String str2 = String.valueOf(val); //기본형(primitive형)을  -> string 으로 변환
//		String str3 = String.valueOf(3.14); // 소수 가 -> string으로
//		String str4 = String.valueOf(false); // true,false가 string으로
		
		
		
		
		//출력방식
		System.out.printf("이름: %s\n","감자바"); // 문자열로 출력
		System.out.printf("이름: %6s\n","감자바"); // 문자열 6자리를 출력해주세요, 빈자리 = 공백, 띄어쓰기 공간 바꾸고싶으면 -6 이라고 적으면 됨.
		System.out.printf("실수: %10.2f\n",3.14); // 실수   정수 7자리, 소수점1, 소수부분 2자리
		
		
		System.out.printf("이름: %d\n",262); // 정수로 출력
		
		System.out.printf("정수출력1: %6d\n",123); // 정수의 6자리를 출력해주세요, 빈자리 = 공백
		System.out.printf("정수출력1: %d, 실수출력: %f" ,123, 3.45); // 정수의 6자리를 출력해주세요, 빈자리 = 공백
		
		
		//문자열 s, 정수 d, 실수 f 
		
		
		
		
		
		
	}

}




/* 자동타입변환, 형변환
  바이트 크기가 작은 자료형에서 큰 자료형으로 형변환은 자동으로 이루어진다.
  덜 정밀한 자료형에서 더 정밀한 자료형으로 형변환은 자동으로 이루어진다.
  byte -> short(char) -> int -> long -> float -> double
 short와 char 사이도 자동형변환은 안된다.
 
 
 
 * 강제타입변환
  
 
 

 * 

 

 * 
 * */
