package test.ch10;

public class ExceptionEx3 {

	public static void main(String[] args) {
		String[] array = {"100", "1oo", null, "200"};
		
		for(int i = 0; i <= array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);	//int로 형변환
				System.out.println("array[" + i + "]:" + value);
				
				//ctrl + space 단축키로 선택
			} catch(ArrayIndexOutOfBoundsException e) {	//array.length 에러
				e.printStackTrace();
			} /*catch(NumberFormatException e) {	//형변환 에러
				e.printStackTrace();
			}*/ catch(NullPointerException | NumberFormatException e) {	//2가지 이상의 예외를 동일하게 처리
				System.out.println("데이터에 문제가 있음: " + e.getMessage());
		}
			//catch를 여러 번 쓸 때 디테일한 exception 을 먼저 써주고, 다음 catch에 exception만 쓰기 가능
		}
	}

}
