package test.ch02;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
//		var test = new Test()
		Scanner scanner = new Scanner(System.in);

		System.out.println("x값 입력: ");
		String strX = scanner.nextLine(); // 문자를 읽는다. enter키를 누르는 순간
		int x = Integer.parseInt(strX); // 문자열을 강제로 정수형으로 형변환하는것.

		System.out.println("y값 입력: ");
		String strY = scanner.nextLine(); // 문자를 읽는다. enter키를 누르는 순간
		int y = Integer.parseInt(strY); // 문자열을 강제로 정수형으로 형변환하는것.

		int result = x + y;
		System.out.println("result: " + result);
		System.out.println();

		while (true) {
			System.out.println();
			String data = scanner.nextLine();

			if (data.equals("q")) { // equals 는 비교하는것. 자바스크립트로 따지면 data === "q" 랑 같은의미. 입력받은 데이터가 q와 같은가 를 물어보는것.
				break;
			}
			;

			System.out.println("출력 문자: " + data);
			System.out.println();
		}
		System.out.println("종료");
	}

}

//ctrl + shift + f = 코드 자동정렬