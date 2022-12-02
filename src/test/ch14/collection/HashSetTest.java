package test.ch14.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
//		Set<String> set = new HashSet<String>();
		HashSet<String> set = new HashSet<String>();
		
		//String은 문자열이 똑같으면 스택 영역에 같은 주소를 가지고 있어서 힙 영역의 같은 객체를 가리킨다.
		set.add("java-a");
		set.add("java-b");
		set.add("java-c");
		set.add("java-a");
		
		int size = set.size();
		System.out.println(size);
		
		//똑같은 문자열은 중복 저장하지 않으므로 size를 출력하면 3이 나온다.
	}
}
