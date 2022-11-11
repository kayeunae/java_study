package test.ch01;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("hello! java!");
//		int a = 10; //int:변수의 타입(자료형) a:변수(하나의 값을 저장할 수 있는 메모리 번지에 붙여진 이름) 10:리터럴(사용자 지정값)
		
		int var1 = 0b1011;	//2진수
		int var2 = 0206;	//8진수
		int var3 = 365;		//10진수
		int var4 = 0xB3;	//16진수
		long var5 = 10000000000000L;
		char c1 = 'A';	//char는 작은 따옴표를 쓰고 문자를 하나만 써야 함.
		char c2 = 65;	//65: 유니코드 A에 해당하는 값.
		
		float var6 = 0.1235464423135f;
		double var7 = 0.1235464423135;
		double var8 = 3e6;		 // 3.0 * 10^6
		double var9 = 2e-3;		 // 2.0 * 10^-3
		double var11 = 2e-3f;	 // 2.0 * 10^-3
		
		boolean stop = true;
		
		int x = 10;
		boolean result1 = (x == 20);
		
		
//		if (stop) {
//			System.out.println("정지합니다.");
//		}
		
		String name = "김은애";
		String name2 = "나는 \"김은애\" 입니다";		//이스케이프 문자는 js 와 비슷함.
		String one = "A"; 	//String은 큰 따옴표를 쓰고 문자 1개 혹은 여러개
		
		
		//System.out.println(var1 + ":" + var2 + ":" + var3 +  ":" + var4);
		//진법으로 작성해도 출력은 10진수로 된다.
		//System.out.println(var5);
//		System.out.println(c1 + "," + c2);
//		System.out.println(var6 +"," + var7);
//		System.out.println(var9);
//		System.out.println(stop);
//		System.out.println(name2);
		
		
		
	}

}
