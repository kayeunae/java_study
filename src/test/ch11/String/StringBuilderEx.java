package test.ch11.String;

public class StringBuilderEx {

	public static void main(String[] args) {
		String data = new StringBuilder()
				.append("DEF") // append : 문자열 끝에 글자를 넣어주는 것
				.insert(0, "ABC")	// insert: 문자열 중간에 위치 지정하여 글자 넣어줌.(위치, 문자열)
				.delete(3, 4)	//delete: 문자열 일부 삭제(시작 인덱스, 끝 이전 인덱스)
				.toString();	//아직까진 StringBuilder타입. 완성된 문자열을 String 타입으로 리턴
		
		System.out.println(data); // DEF 가 출력됨

	}

}
