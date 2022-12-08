package test.ch16.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadEx {

	public static void main(String[] args) {
		try {
			FileInputStream is = new FileInputStream("C:/Temp/test1.db");
			
			while(true) {
				int data = is.read();	//1byte씩 읽기, 더이상 읽을 게 없으면 -1을 뱉음 !
				
				if(data == -1) break; //파일의 끝에 도달했을 때 
				
				System.out.println(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
