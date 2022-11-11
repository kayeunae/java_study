package test.ch05;

public class ArrayEx {

	public static void main(String[] args) {

		/*
//		String season2[];		//값이 없는 상태로 배열만 선언
//		[] 위치는 둘 다 가능 !
//		String[] season = {"Spring", "Summer", "Fall", "Winter"};
		String season[] = {"Spring", "Summer", "Fall", "Winter"};
		
		System.out.println(season[0]);
		System.out.println(season[1]);
		System.out.println(season[2]);
		System.out.println(season[3]);
//		System.out.println(season[4]);   //배열을 넘어가면 오류가 뜬다
		
		season[1] = "여름";
		System.out.println(season[1]);
		System.out.println();
		
		int[] scores = {83, 90, 87};
		
//		총합, 평균 구하기 (for문 이용)
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		
//		정수는 정수끼리 연산! 연산 후에 double로 형 변환하는 게 정확하다.
		double avg = (double) sum/3;
		
		System.out.println("총합=" + sum + "\n" + "평균=" + avg);
		*/
		
		/*
		 배열 선언할 때 타입에 따른 초기값
		 int, short, byte: 0
		 long: 0L
		 char: '\u0000'
		 float: 0.0f
		 double: 0.0
		 boolean: false
		 
		 String: null (class는 초기값이 null)
		 */
		
//		new 연산자를 이용한 배열 생성
//		아직 데이터는 없지만 3개의 데이터 방을 만들었당 ~!
		int[] arr1 = new int[3];
		
		for (int i = 0; i < 3; i++) {
//			System.out.println(arr1[i]);
			arr1[i] = 10;
		}
		
		for (int i = 0; i < 3; i++) {
			System.out.println(arr1[i]);
		}
		
		
		double[] arr2 = new double[3];
		
		for (int i = 0; i < 3; i++) {
			System.out.println(arr2[i]);
		}
		
		String[] arr3 = new String[3];
		
		for (int i = 0; i < 3; i++) {
			System.out.println(arr3[i]);
		}
		
//		length는 값을 가져올 수만 있고 지정하는 건 안 된다. 아래와 같이 사용 불가 !
//		arr3.length = 10;
		
		
	}

}
