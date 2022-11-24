package test.ch10.Resource;

public class TrywithResourceEx {

	public static void main(String[] args) {
//		//try 안에서 객체 생성
//		try(MyResource res = new MyResource("A")) {
//			String data = res.read1();
//			int value = Integer.parseInt(data);	//int 형 변환
//			//파일 닫는 메소드를 여기에 작성하지 않았는데 자동으로 실행시킴
//		} catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
		
		//try 안에서 객체 생성
		try(MyResource res = new MyResource("A")) {
			String data = res.read2();	//NumberFormatException 에러 발생
			int value = Integer.parseInt(data);	//int 형 변환
			//파일 닫는 메소드를 여기에 작성하지 않았는데 자동으로 실행시킴
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
