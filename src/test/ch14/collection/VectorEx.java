package test.ch14.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// vector 생성하는 두 가지 방법 !
		// vector의 상위 인터페이스로 List를 가지고 있다. (자동 형변환)
//		List<Board> list2 = new Vector<>();
//		Vector<Board> list = new Vector<>();
		ArrayList<Board> list = new ArrayList<>();
		

		Thread threadA = new Thread() {

			@Override
			public void run() {
				for(int i = 1; i <= 1000; i++) {
					list.add(new Board("제목", "내용", "글쓴이"));
				}
			}
			
		};
		
		
		Thread threadB = new Thread() {

			@Override
			public void run() {
				for(int i = 1001; i <= 2000; i++) {
					list.add(new Board("제목", "내용", "글쓴이"));
				}
			}
			
		};
		
		threadA.start();
		threadB.start();
		/*
		 * vector는 동기이기 때문에 threadA가 진행되는 동안 list 객체를 잠그고 있다?
		 * threadA가 끝나면 threadB가 순차적으로 실행됨.	
		 * 반면, arraylist는 비동기이기 때문에 마구마구 ~
		 */
		
		//작업 스레드들이 모두 종료될 때까지 메인 스레드를 기다리게 하는 코드
		try {
			threadA.join();
			threadB.join();
		} catch(Exception e) {
		}
		
		int size = list.size();
		System.out.println("총 객체의 수: " + size);
		System.out.println();

	}

}
