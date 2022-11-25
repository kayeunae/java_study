package test.ch11.Math;

public class RandomEx {

			//API 도큐먼트. java.lang
	
	public static void main(String[] args) {
		//0.0 ~ 1.0 사이의 숫자 출력(소수, double 타입)
		System.out.println(Math.random());
		
		int n = 9;	//n개의 정수 (여기서는 9개의 숫자를 얻겠다 !)
		int start = 1;  //시작하는 숫자
		// => 1부터 9개의 정수를 얻겠다...
		int num =(int)(Math.random() * n) + start;
		
		System.out.println(num);
	}

}
