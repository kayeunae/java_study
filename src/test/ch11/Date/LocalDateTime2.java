package test.ch11.Date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTime2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime2 now = LocalDateTime2.now();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		System.out.println("현재시간: " + now.format(dtf));
		
		LocalDateTime2 result1 = now.plusYears(1); //1년 더함
		System.out.println(result1.format(dtf));
		
		LocalDateTime2 result2 = now.minusMonths(2); //2개월 뺌
		System.out.println(result2.format(dtf));
		
		LocalDateTime2 result3 = now.plusDays(7); //7일 더함
		System.out.println(result3.format(dtf));
	}

}
