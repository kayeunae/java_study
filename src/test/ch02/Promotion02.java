package test.ch02;

public class Promotion02 {

	public static void main(String[] args) {
		
		//자동 형변환(Upcasting)
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);
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
//		System.out.println(floatValue);
//		
//		floatValue = 100.5f;
//		double doubleValue = floatValue;
//		System.out.println(doubleValue);

		//byte를 char로 자동형변환 하는 것은 불가함.
		//char 타입의 허용 범위는 음수를 포함하지 않음. byte는 음수를 포함함.
//		byte test = 65;
//		char charValue = test;
		
		//char 타입의 허용 범위는 음수를 포함하지 않음. short는 음수 있기 때문에 형변환X
//		short a = 1;
//		char b = a;
//		
//		강제형변환(Downcasting)
//		int intValue = 12029770;
//		byte byteValue =  (byte) intValue;
//		허용 범위를 벗어나 값이 잘리는 현상이 발생.
//		System.out.println(byteValue);
//		
//		
//		long var1 = 300;
//		int var4 = (int)var1;
//		System.out.println(var4);
//		
//		int var5 = 65;
//		char var6 = (char)var5;
//		System.out.println(var6);
//		
//		double var7 = 3.14;
//		int var8 = (int)var7;
//		System.out.println(var8);
//		
//		byte x = 10;
//		byte y = 20;
//		첫 번째 방법 (x, y가 int 형이라 byte로 묶일? 수 없다..?)
//		byte result = (byte) (x + y);
//		두 번째 방법
//		int  = x + y;
//		
//		byte v3 = 10;
//		int v4 = 100;
//		long v5 = 1000L;
//		long result3 = v3 + v4 + v5;
//		System.out.println(result3);
//		
//		char v6 = 'A';
//		char v7 = 6;
//		System.out.println(v6);
//		int result4 = v6 + v7;
//		System.out.println(result4);
//		System.out.println((char)result4);
//		
//		int v8 = 10;
//		int result5 = v8 / 4;	//정수 연산의 결과는 항상 정수
//		System.out.println(result5);
//		
//		int v9 = 10;
//		//result6의 결과가 int에서 double로 들어가면서 2.5로 변환됨
//		double result6 = v9 / 4;				//정수 연산의 결과는 항상 정수
//		double result60 = v9 / 4.0;
//		System.out.println("값1:" + result6);
//		System.out.println("값2:" + result60);	
//		
//		int v10 = 1;
//		int v11 = 2;
//		double result7 = v10 / v11;				//정수 연산의 결과는 항상 정수
//		double result70 = (double)v10 / v11;
//		System.out.println("값1:" + result7);	
//		System.out.println("값2:" + result70);
		
//		String str = "안녕하세요";
//		int val = 1;
//		String val2 = "3";
//		
//		System.out.println(str + val);
//		System.out.println(val + val2);
//		//2랑 val(1)이 먼저 연산되어 3이 되고, val2(3) 따로 출력. 33으로 보임.
//		System.out.println(2 + val + val2);
		
//		★★★ 중요 ★★★
//		byte value = Byte.parseByte(val2);	//문자형을 byte형으로 변환하는 방법
//		int value2 = Integer.parseInt(val2);	//문자형을 int형으로 변환하는 방법
//		double value3 = Double.parseDouble(val2);	//문자형을 double형으로 변환하는 방법

//		String str2 = String.valueOf(val);	//기본형(primitive)을 string형으로 변환
//		String str2 = String.valueOf(3.14)); //소수가 string 형으로 변환
//		String str2 = String.valueOf(true);	 //true값이 string형으로 변환
		
	}

}
