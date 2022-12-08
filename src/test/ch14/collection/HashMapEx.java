package test.ch14.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
//		Map<> map = new HashMap<>();
		//HashMap<key, 객체>
		HashMap<String, Integer> map = new HashMap<>();
		
		//여기서는 String이 key, int가 value
		//아래 요소 하나 하나를 entry(key + value)라고 함 !
		map.put("김용수", 100);
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
		
		System.out.println();
		
		//반복해서 키와 값을 얻기 첫 번째 방법
		//key 값 얻기
		Set<String> keySet = map.keySet();
		System.out.println(keySet);
		
		Iterator<String> keyIterator = keySet.iterator();	//반복된 키를 얻는다.
		System.out.println(keyIterator.next());
		
		//value 값 얻기
		while (keyIterator.hasNext()) { //다음 키가 있는지 찾는다.
			String k = keyIterator.next();
			Integer v = map.get(k);
			System.out.println(k + ":" + v);
		}
		
		System.out.println();
		
		//반복해서 키와 값을 얻기 두 번째 방법
		//Entry<key type, value type>
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) { //다음 키가 있는지 찾는다.
			Entry<String, Integer> entry = entryIterator.next();
			String k = entry.getKey();	//key 값을 가져온다.
			Integer v = entry.getValue(); //값을 가져온다.
			System.out.println(k + ":" + v);
		}
		
	}

}
