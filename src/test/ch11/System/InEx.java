package test.ch11.System;

import java.io.IOException;

public class InEx {

	//throws 는 받을 곳이 필요함. main에서 던지면 JVM이 알아서 처리 ~_~
	public static void main(String[] args) throws IOException {
		int speed = 0;
		int keycode = 0;
		
		while(true) {
			//enter키를 읽지 않았을 때 실행하는 코드
			if(keycode != 10 || keycode != 13) {	//10, 13은 엔터
				if(keycode == 49) {			//49는 숫자 1
					speed++;
				} else if(keycode == 50) {	//숫자 2
					speed--;
				} else if(keycode == 51) {	//숫자 3
					break;					//while문 빠져나옴
				}
				
				System.out.println("--------------------");
				System.out.println("1. 증속 2. 감속 3. 중지");
				System.out.println("--------------------");
				System.out.println("현재속도=" + speed);
				System.out.println("선택: " );
			}
			keycode = System.in.read();	//key를 하나씩 읽음
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
