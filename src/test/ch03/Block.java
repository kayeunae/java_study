package test.ch03;

public class Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 15;
//		블럭을 기준으로 해서 밖에 있는 것을 블럭 안으로 가져올 수 있어도,
//		밖에서 블럭 안에 있는 것을 꺼내올 수는 없음.
//		안에서는 바깥 변수에 접근 가능, 바깥에서는 안의 변수에 접근 불가능.
//		if (v1 > 10) {
//			int v2 = v1 - 10;
//		}
//		
//		int v3 = v1 + v2 + 5;
		
		
		// %s: 문자열 출력(정수처럼 문자열 길이 설정 가능), \n:줄바꿈
		System.out.printf("이름: %s\n","메로나");
		
		// %d: 정수형태로 출력
		System.out.printf("이름: %d\n",25);
		
		// %(n)d:숫자의 길이 설정 가능 
		System.out.printf("정수출력1: %6d\n",123);		//왼쪽에 공백
		System.out.printf("정수출력1: %-6d\n",123);	//오른쪽에 공백
		
		// %f: 실수 출력
		System.out.printf("실수: %f\n",3.14);
		
		// %10.2f: 정수 7개, 소수점 1개, 소수 2개 (총 10개 문자 중 소수 두 자리)
		System.out.printf("실수: %10.2f\n",3.14);
		
		System.out.printf("정수출력1: %d, 실수출력: %f",123, 3.45);

	
	}

}
