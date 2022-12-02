package test.ch14.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
//		Map<> map = new HashMap<>();
		//HashMap<key, 객체>
		HashMap<String, Integer> map = new HashMap<>();
		
		//여기서는 String이 key, int가 value
		//아래 요소 하나 하나를 entry(key + value)라고 함 !
		map.put("김은애", 90);
		map.put("신정호", 85);
		map.put("정민구", 95);
		//key가 동일하므로 value는 95로 대체 !
		map.put("이상민", 90);
		map.put("이상민", 95);
		
		System.out.println("총 Entry 수: " + map.size());
	
		//key로 값 얻기
		String key = "이상민";
		int value = map.get(key);
		
		System.out.println("점수: " + value);
	}

}
