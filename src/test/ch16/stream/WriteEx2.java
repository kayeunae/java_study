package test.ch16.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class WriteEx2 {

	public static void main(String[] args) {
		try {
			//바이트 스트림 중에서 출력 스트림 (외부에 파일을 내보내는 것)
			FileOutputStream fo = new FileOutputStream("C:/Temp/test2.db");	//파일을 만든다
			
			byte[] array = {10, 20, 30};
			
			fo.write(array); //buffer에 모아놓음.
			
			// 아직 파일에 쓰지 않은 상태. buffer 상태 !
			
			fo.flush();	//buffer에 있는 바이트를 출력하고 buffer를 비움(test2.db에 작성된다.) 이 때 파일에 작성!!
			fo.close();	//출력 스트림은 반드시 닫아서 사용한 메모리를 해제.
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
