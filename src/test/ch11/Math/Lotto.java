package test.ch11.Math;

import java.util.Arrays;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		//선택 번호 (내가 선택한 번호)
		int[] selectNumber = new int[6]; //로또 번호 6개가 저장될 배열
		Random random = new Random(3); //seed 값 3
		System.out.println("선택 번호: ");
		
		//랜덤한 숫자 6개를 생성해서 배열에 넣어줌.
		for(int i = 0; i < 6;  i++) {
			selectNumber[i] = random.nextInt(45) + 1; // 1~45범위의 숫자로 만든다.
			System.out.println(selectNumber[i] + " ");
			
		}
		
		System.out.println("");

		//당첨 번호 (컴퓨터에서 주는 번호)
		int[] winNumber = new int[6]; //로또 번호 6개가 저장될 배열
		Random random2 = new Random(5);//seed 값 5
		System.out.println("당첨 번호: ");
		
		//랜덤한 숫자 6개를 생성해서 배열에 넣어줌.
				for(int i = 0; i < 6;  i++) {
					winNumber[i] = random2.nextInt(45) + 1; // 1~45범위의 숫자로 만든다.
					System.out.println(winNumber[i] + " ");
					
				}
		
		
		//당첨 여부
		Arrays.sort(selectNumber); // 비교하기전에 배열 값을 정렬해줍니다. 배열 내부의 값들이 정렬된 상태로 바뀝니다.
		Arrays.sort(winNumber);
		
		boolean result = Arrays.equals(selectNumber, winNumber); //배열을 정렬해두었으므로 둘을 비교할 수 있게되었습니다.
		System.out.println("당첨여부: ");
		
		if (result) {
			System.out.println("당첨입니다");
		} else {
			System.out.println("아쉽게도 낙첨되었습니다.");
		}
	}	

}
