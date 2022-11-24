package test.ch10;

public class ExceptionEx1 {
	
	public static void printLength(String data) {
		try { //실행시킬 코드를 작성
		//.length() : String형 문자의 수 count
		int result = data.length();
		System.out.println("문자 수: " + result);
		} catch(NullPointerException e) {	//에러가 났을 때 실행 시킬 코드
			//Exception e 만 적어도 됨!
			//e: 에러의 원인인 문자열이 담겨 있음.
			
			//예외 처리 정보를 얻는 세 가지 방법
//			System.out.println(e.getMessage());	//예외 발생 이유
//			System.out.println(e.toString());	//예외 발생 이유 + 예외의 종류 리턴
			e.printStackTrace();				//예외 발생 이유 + 예외의 종류 리턴 + 예외 발생 지점
		} finally {	//finally : optional. 에러 여부와 상관없이 마지막에 무조건 실행되는 코드
			System.out.println("마무리 실행 \n");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작\n");
		printLength("ThisIsJava");
		printLength(null);
		System.out.println("프로그램 종료\n");
		
	}

}
