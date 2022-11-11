package test.ch02;

public class Hello {
	// run 버튼(컨F11)누르면 main 내에 있는게 가장 먼저 실행됨.
	// 실행시키고 싶은 코드는 main 안에 작성할 것.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("hello! java! 컨트롤 F11 : 실행");
//	
//		int a = 10; // a는 변수 , 10 = 리터럴 = 사용자가 직접 지정한것.
//		int b = 12;
//		int c = 17, d = 27; //한줄에 작성하기 가능 
//		int result = a + b;
//		
//		int num = 0;
//		
//		System.out.println(result);
//		System.out.println(c + d);
//		System.out.println("결과:" + result);
//		System.out.println(a + num);
//		
//		
//		byte e = 10;
//		short f = 20;
//		int g = 300;
		int var1 = 0b1011; //2진수
		int var2 = 0206; //8진수
		int var3 = 365; //10진수
		int var4 = 0xB3; // 16진수
		long var5 = 10000000000000L; //뒤에 L 붙이면 범위 넘어갔다는 오류 사라짐, 소문자 L인 => l 도 가능함
		long var6 = 99999222333322l;
		char c1 = 'A'; //char 에는 문자열을 단 1개 만 쓸 수 있다.
		char c2 = 65; // 65는 유니코드에서 A를 뜻함.
		
		
		float var7  = 0.32153212345754f; // float의 경우 뒤에 f를 붙여줘야.
		double var8 = 0.32153212345754; // float보다 정밀도가 더 높기때문에 숫자를 끝까지 보여줌.
		double y = 5e2; //5.0 x 10의 2승 = 500.0
		double var9 = 0.12E-2; // 0.12 * 10의 -2승 = 0.0012
		double var10 = 2e-3; // 2.0 * 10^-3
		float var11 = 2e-3f;
		
		
		boolean stop = true;
		
		int x = 10;
		boolean result1 = (x == 20);
		
		
		//출력은 항상 10진수로 됌.
//		System.out.println(var1 + ":" + var2 + ":" + var3 + ":" + var4);
//		System.out.println(var5);
//		System.out.println(var6);
//		System.out.println(c1 + "," + c2); 
//		System.out.println(var7 + "," + var8);
//		System.out.println(var10);
//		System.out.println(var11);
		System.out.println(result1);
		
		if (stop) {
			System.out.println("장비를 정지합니다");			
		}
		
		String name = "정민구";
		String name2 = "나는 \"정민구\" 입니다 "; //중간에 " 혹은 ' 를 출력하고싶다면 이스케이프 문자인 \ 를 써줍니다.
		String name3 = "나는 \\정민구\\입니다"; // \를 표현하고싶으면 \\ 두번사용
		String name4 = "나는 줄바꿈을 해주는 \\n\\ \n입니다"; //줄바꿈용 \n
		String One = "AAA";
		//char c1 = 'A';    char의 경우 작은따옴표를 써야하며. 문자를 단 1개만 사용가능.
		//String의 경우 "" 큰 따옴표를 써야하며 문자를 여러개 사용 가능.
		System.out.println(One);
		System.out.println(name2);
		System.out.println(name3);
		System.out.println(name4);
		
	}

	
	/*주석ㅇ비니다
	주석입니다*/
	//주석입니다
	/** 주석입니다 ,api 도큐먼트 작성할 때 **/
	
}


/* 자료형
 정수 : byte, short, int, long   크기(byte) 1 2 4 8    예시 : 10, 20
 
 실수 : float, double            크기(byte) 4 8        예시 : 23.4f, 34.567    
  
 문자 : char                     크기(byte) 2          예시 : 'A', 'a'
 
 논리 : boolean                  크기(byte) 1          예시 : true(참), false(거짓)
 

 
 
 
 
 
 
 
 */
