package test.ch11.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		Date now = new Date();	//현재 날짜와 시간 생성 객체
		System.out.println(now);
		String strNow1 = now.toString(); //객체 타입을 String 타입으로 변경
		System.out.println(strNow1); 	 //문자열로 변경됨
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss"); //포맷 형태 객체 생성
		String strNow2 = sdf.format(now); //Date 객체를 넣어준다.
		System.out.println(strNow2);
	}

}
