package test.ch13.mainthread;

import java.awt.Toolkit;

public class BeepPrintEx {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			toolkit.beep(); //빔 소리를 냄 띵!띵!띵!
			try {
				//1000 = 1초, 500 = 0.5초
				Thread.sleep(500);	//띵 소리 내고 0.5초 쉬어준다.
			} catch (Exception e) {

			}
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);	//0.5초간 일시정지
			} catch (Exception e) {

			}
		}
		
		/*
		 * 두 for 문이 동시에 실행되지 않음 !
		 */
	}

}
