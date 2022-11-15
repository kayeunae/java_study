package test.ch06;

public class Calculator2 {
	//1. 필드
	static double pi = 3.14159;
	static String model = "calc1";
	static String number = "1";
	static String info;
	
	//info 변수에 언더바를 붙여서 이름을 지어달라는 요청이 들어왔다.
	//static 블록: static 필드에 대한 초기화 작업이 필요할 때 사용
	static {
		//	this.model, this.number XXX (static에는 this NO!)
		info = model + "_" + number;	//calc1_1 값이 들어올 것
	}
	
	//2. 메소드 
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}



}

