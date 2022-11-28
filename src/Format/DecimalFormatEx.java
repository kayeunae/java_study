package Format;

import java.text.DecimalFormat;

public class DecimalFormatEx {

	public static void main(String[] args) {
		double num = 1234567.89;
		
		DecimalFormat df;
		
		//생성자를 주고 쌍따옴표 안에 원하는 패턴을 적어주면 됨
		df = new DecimalFormat("#,###"); 	//포맷을 정한다.
		System.out.println(df.format(num));	//포맷 메소드를 실행하고 괄호 안에 변수명 넣어주기.
		
		df = new DecimalFormat("#,###.0");
		System.out.println(df.format(num));
	}

}
