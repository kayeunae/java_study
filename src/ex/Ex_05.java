package ex;

import java.util.Arrays;

public class Ex_05 {

	public static void main(String[] args) {
//		6번.
//		int[][] array = {
//				{95, 86},
//				{83, 92, 96},
//				{78, 83, 93, 87, 88}
//		};
//		System.out.println(array.length);		//3
//		System.out.println(array[0].length);	//2
//		System.out.println(array[1].length);	//3
//		System.out.println(array[2].length);	//5
		
//		7번.
//		int[] arr = {10, 20, 30, 40, 50};
//		int sum = 0;
//		
//		for (int i = 0; i < arr.length; i++) {
//			sum += arr[i];
//		}
//		System.out.println(sum);
		
//		8번.
//		int[] array = {1, 5, 3, 8, 2};
//		int max = 0;
//		
//		for(int i = 0; i < array.length; i++) {
//			if(max < array[i]) {
//				max = array[i];
//			}
//		}
//		System.out.println("최댓값: " + max);
		
//		9번. 중첩for문
//		int[][] array = {
//				{95, 86},
//				{83, 92, 96},
//				{78, 83, 93, 87, 88}
//		};
		
//		System.out.println(array[0][0]);
//		int num = 0;
//		int sum= 0;
//		
//		for(int i = 0; i < 4; i++) {
//			for(int j = 0; j < 5; j++) {
//				num = array[i][j];
//				sum += num;
//				System.out.println(array[i][j]);
//				System.out.println(num);
//			}
//		}
		
//		정답 !
//		int sum = 0;
//		double avg = 0.0;
//		int count = 0;
//		for(int i = 0; i < array.length; i++) {
//			for(int j = 0; j < array[i].length; j++) {
//				sum += array[i][j];
//				count++;
//			}
//		}
//		avg = (double) sum / count;
//		System.out.println("sum: " + sum);
//		System.out.println("avg: " + avg);
		
//		10번.
		int[] ballArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] ball3 = new int[3];
		//배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
		for (int i = 0; i < ballArr.length; i++) {
			int j = (int) (Math.random() * ballArr.length);	// j = 0 ~ 8
			int tmp = 0;
			//tmp에 ballArr의 요소가 저장됨 (1~9)
			tmp = ballArr[i];
//			System.out.print(j);
//			System.out.print(",");
			//ballArr의 인덱스 번호를 랜덤으로 생성된 수 j로 변경(요소 위치 바뀜, 중복됨)
			ballArr[i] = ballArr[j];
//			System.out.print(j);
//			System.out.println();
			//중복 방지 ?!
			ballArr[j] = tmp;
			System.out.print(j);
		}
		System.out.println();
		System.out.println(Arrays.toString(ballArr));
		// 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.
		//ballArr 배열의 0번 인덱스부터 가져와 ball3 배열의 0번 인덱스부터 총 3개 데이터에 붙여넣는다. 
		System.arraycopy(ballArr, 0, ball3, 0, 3);
		
	
		for (int i = 0; i < ball3.length; i++) {
			System.out.print(ball3[i]);
		}
		System.out.println();
		
		
		
		
		
		
		
	}

}
