package test.ch05;

public class StringMethod {

	public static void main(String[] args) {
		
		String board = "1,자바 학습, 참조 타임 String 공부중";
		
//		자바에서의 배열 []
//		split() 괄호 안 기호 또는 문자를 기준으로 구분을 해 배열로 넣는다.
		String[] tokens = board.split(",");
		
		for (int i = 0; i<tokens.length; i++) {
			System.out.println(tokens[i]);
		}
				
		/*
//		indexOf : 해당하는 문자열의 시작 인덱스 번호 추출 (공백도 인식함)
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location); // 3 출력
		
		String substring = subject.substring(location);
		System.out.println(substring);
		
//		해당하는 단어가 없으면 -1 출력함
		if (location == -1) {
			System.out.println("해당 문자열이 없습니다.");
		}
		
//		contains : 문자열이 있는지 없는지 확인 가능. true/false로 리턴받기 때문에 boolean 이용
		boolean result = subject.contains("자바");
		
		if (result) {
			System.out.println("자바와 관련된 책입니다.");
		} else {
			System.out.println("자바와 관련없는 책입니다.");
		}
		*/
		
		/*
//		substring 함수
		String ssn = "950624-1230123";
		//substring(n, n) 시작 인덱스, 끝 인덱스
		String firstName = ssn.substring(0, 6);
		System.out.println(firstName);
		
		//substring(n) n번 인덱스부터 끝까지
		String secondName = ssn.substring(7);
		System.out.println(secondName);
		*/
		
		/*
//		replace method
		String oldStr = "자바 문자열";
		String newStr = oldStr.replace("자바","JAVA");	//문자열로 return해줌.
		
		System.out.println(oldStr);
		System.out.println(newStr);
		*/
		
		
		/*
		String ssn = "9506241230123"; //주민등록번호
//		charAt(인덱스 넘버)
		char sex = ssn.charAt(6);
//		length(): 자릿수 계산
		int length = ssn.length();
		
		System.out.println(length);
		
		if (length == 13) {		
			System.out.println("주민번호 자릿수가 맞습니다.");
		} else {
			System.out.println("주민번호 자릿수가 맞지 않습니다.");
		}
		
		switch (sex) {
		case '1' :
		case '3' :
			System.out.println("남자");
			break;
		case '2' :
		case '4' :
			System.out.println("여자");
			break;
		}
		*/
		
	}

}
