package test.ch04;

public class If_EX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 99;
		String name = "고양이";

		if (score >= 90) {
			System.out.println("90점 이상입니다.");
			if (name.equals(name)) {
				System.out.println(name + "90점 이상입니다.");
			}
		} else if (score >= 80) {
			System.out.println("80점 이상입니다.");
		} else if (score >= 70) {
			System.out.println("70점 이상입니다.");
		} else {
			System.out.println("70점 미만입니다.");
		}

		// 랜덤 숫자 뽑기
		// Math.random() 만 적으면 0.0~1.0 사잇값만 출력
		// *6 +1 을 붙여주면 1~6까지 출력
		
		int num = (int) (Math.random() * 6) + 1;
		
		if (num == 1) {
			System.out.println("1번");
		} else if (num == 2) {
			System.out.println("2번");
		} else if (num == 3) {
			System.out.println("3번");
		} else if (num == 4) {
			System.out.println("4번");
		} else if (num == 5) {
			System.out.println("5번");
		} else {
			System.out.println("6번");
		}

		// 랜덤 숫자 뽑기 (switch문)
		// 마지막 case는 그 밖에 모든 경우라는 의미로 default를 준다. default에는 break가 필요없다.
		/*
		 * 사용 가능한 자료형 byte, char, short, int, long, String(클래스)
		 */
		switch (num) {
		case 1:
			System.out.println("1번");
			break;
		case 2:
			System.out.println("2번");
			break;
		case 3:
			System.out.println("3번");
			break;
		case 4:
			System.out.println("4번");
			break;
		case 5:
			System.out.println("5번");
			break;
		default:
			System.out.println("6번");
		}

		char grade = 'C';
		switch (grade) {
		case 'A':
			System.out.println("1번");
			break;
		case 'B':
			System.out.println("2번");
			break;
		case 'C':
			System.out.println("3번");
			break;
		case 'D':
			System.out.println("4번");
			break;
		case 'E':
			System.out.println("5번");
			break;
		default:
			System.out.println("6번");
		}

	}

}
