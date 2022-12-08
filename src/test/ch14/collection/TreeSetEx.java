package test.ch14.collection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		
		//데이터 추가
		scores.add(7);
		scores.add(4);
		scores.add(1);
		scores.add(5);
		scores.add(9);
		
		System.out.println("<<오름차순>>");
		
		for (Integer s : scores) {
			System.out.print(s + " "); 	//자동 정렬이 됨.(오름차순)
		}
		System.out.println();
		
		System.out.println("가장 낮은 값: " + scores.first());
		System.out.println("가장 높은 값: " + scores.last());
		//lower, higher: 기준 값과 비교하여 데이터를 한 개씩만 찍는다. 
		System.out.println("5보다 작은 값: " + scores.lower(5));
		System.out.println("5보다 큰 값: " + scores.higher(5));
		
		//내림차순
		System.out.println();
		System.out.println("<<내림차순>>");
		
		NavigableSet<Integer> desc = scores.descendingSet();
		for(Integer s : desc) {
			System.out.print(s + " ");
		}
		
		System.out.println();

		//범위 검색 (5 <= scores)
		System.out.println();
		System.out.println("<<범위 검색>>");
		
		//tailSet(기준 값, boolean): 주어진 값보다 높은 값을 가져온다. boolean : 기준 값 포함 여부
		NavigableSet<Integer> rangeSet = scores.tailSet(5, false);
		for(Integer s: rangeSet) {
			System.out.print(s + " ");
		}
		
		System.out.println();
		
		//범위 검색 (4 <= scores < 9)
		rangeSet = scores.subSet(4, true, 9, false);
		for(Integer s : rangeSet) {
			System.out.print(s + " ");
		} 
		
	}

}
