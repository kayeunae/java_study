package test.ch11.Math;

import java.util.Random;

public class RandomEx2 {
	
	//API 도큐먼트. java.util
	/*
	 * random() : 현재 날짜를 기준으로 랜덤한 숫자 생성
	 * random(seed) : 종잣값을 이용해서 랜덤한 숫자 생성
	 */

	public static void main(String[] args) {
		Random rand = new Random();
		
		for(int i = 0; i <= 5; i++) {
			//nextInt(n): int 타입의 난수 생성, (0 <= ~ < n 까지의 난수)
			System.out.print(rand.nextInt(10) + ",");
		}
		
		System.out.println("");
		
		Random rand2 = new Random(100);	//seed를 넣어줌
		for(int i = 0; i <= 5; i++) {
			System.out.print(rand2.nextInt(10) + ",");
			// => 고정된 숫자가 나옴
		}
	}

}
