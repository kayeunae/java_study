package test.ch13.mainthread;

import java.awt.Toolkit;

public class BeepPrintEx3 {

	public static void main(String[] args) {
		//Runnable : thread 실행을 위한 인터페이스
		Thread thread = new Thread() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i = 0; i < 5; i++) {
					toolkit.beep(); //빔 소리를 냄 띵!띵!띵!
					try {
						//1000 = 1초, 500 = 0.5초
						Thread.sleep(500);	//띵 소리 내고 0.5초 쉬어준다.
					} catch (Exception e) {

					}
				}
			}
		};
		
		//실제 thread 실행을 위해서 start를 적어줘야 함.
		thread.start();
		
		
		//메인 스레드
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);	//0.5초간 일시정지
			} catch (Exception e) {

			}
		}
		
		/*
		 * 소리랑 글자가 동시에 나옴 !
		 */
	}

}
