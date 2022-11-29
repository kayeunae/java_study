package ex.ch10;

import java.lang.Exception;

public class FileWriter implements AutoCloseable{
	
	public FileWriter(String filePath) throws Exception {
		System.out.println(filePath + "파일을 엽니다.");
	}
	
	public void write(String data) throws Exception {
		System.out.println(data + "를 파일에 저장합니다.");
		int a = a;
	}

	@Override
	public void close() throws Exception {
		System.out.println("파일을 닫습니다.");
		
	}

}
