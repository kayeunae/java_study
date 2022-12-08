package test.ch16.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadEx2 {

	public static void main(String[] args) {
		try {
			FileInputStream is = new FileInputStream("C:/Temp/test2.db");
			
			byte[] data = new byte[100];
			
			while(true) {
				int num = is.read(data);	//최대 100 byte를 읽는다. 읽은 수는 리턴해줌. data에 읽은 내용 저장.
				
				if(num == -1) break; //파일의 끝에 도달했을 때 

				//100바이트씩 읽는데 다섯 번 읽으면 num이 다섯 번 ! 읽은 수 만큼만 출력하면 되니까 기준 값은 num으로 !
				for(int i = 0; i < num; i++) {
					System.out.println(data[i]);
				}
			}
			
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
