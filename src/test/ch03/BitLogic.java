package test.ch03;

public class BitLogic {

	public static void main(String[] args) {
		System.out.println("45 & 25 = " + (45 & 25));
		System.out.println("45 | 25 = " + (45 | 25));
		System.out.println("45 ^ 25 = " + (45 ^ 25));
		System.out.println("~45 = " + (~45));
		System.out.println("----------------------구분선--");

		// 얘는 참고용
		byte recieveData = -128;
		int unsignedInt = Byte.toUnsignedInt(recieveData);
		System.out.println(unsignedInt);

	}

}
/*
 * 비트 논리 연산자 1 = T , 0 = F , 2진수로 비교함 & AND(논리곱) 두 비트 모두 1일 경우에만 연산결과가 1 (True)
 * | OR(논리합) 두 비트 중 하나만 1이면 연산결과는 1 ^ XOR(배타적 논리합) 두 비트중 하나는 1이고 다른 하나가 0일 경우 연산
 * 결과는 1 11 = 0 , 10 = 1, 01 = 1, 00 = 0 ~ NOT(논리부정) 보수(반대로 바꾸는것 1은 -> 0으로 , 0은 -> 1로)
 */

