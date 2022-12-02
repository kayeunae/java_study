package test.ch14.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListTest {
	
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		LinkedList<String> list2 = new LinkedList<>();
		
		//시작 시간과 끝 시간을 저장할 변수 선언
		long startTime;
		long endTime;
		
		//ArrayList 소요 시간
		
		startTime = System.nanoTime();
		
		for(int i = 0; i < 10000; i++) {
			//0, String.valueOf(i) : (인덱스 번호, 들어간 데이터) => 0번 인덱스 값이 계속 수정됨
			list1.add(0, String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		
		System.out.printf("%-17s %8d ns \n", "ArrayList 걸린 시간: ", (endTime-startTime) );
		
		//LinkedList 소요 시간
		
		startTime = System.nanoTime();
		
		for(int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		
		System.out.printf("%-17s %8d ns \n", "LinkedList 걸린 시간: ", (endTime-startTime) );
	}

}