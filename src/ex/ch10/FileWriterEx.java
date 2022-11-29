package ex.ch10;

import java.lang.Exception;

public class FileWriterEx {

	public static void main(String[] args) {
		try (FileWriter fw = new FileWriter("file.txt")){
			fw.write("Java");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		

//		try {
//			fw = new FileWriter("file.txt");
//			fw.write("Java");
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				fw.close();
//			} catch (IOException e) {
//			}
//		}

	}

}
