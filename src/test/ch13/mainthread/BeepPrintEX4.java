package test.ch13.mainthread;

import java.awt.Toolkit;

public class BeepPrintEX4 extends Thread {
	
	//run(): 실제 thread 가 실행되는 코드
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

	public static void main(String[] args) {
		//thread를 상속받아 객체 생성, 자식 객체(현재 클래스)를 넣어줘야 한다.(자동 형변환)
		Thread thread = new BeepPrintEX4();
		//run() 코드 실행됨
		thread.start();
		
		//메인 스레드
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				//sleep 메소드를 쓰기 위해서는 예외처리를 해줘야 함 ~!
				Thread.sleep(500);	//0.5초간 일시정지
			} catch (Exception e) {

			}
		}
	}

}





