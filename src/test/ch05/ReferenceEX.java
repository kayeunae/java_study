package test.ch05;

public class ReferenceEX {

	public static void main(String[] args) {
		
		int[] scores = { 95, 71, 84, 93, 87 };
		int sum = 0;
		
		for (int score : scores) {
			System.out.println(score);
			sum += score;
		}
		
		System.out.println(sum);
		
		
		
		
		int[] oldIntArray = {1, 2, 3,};
		int[] newIntArray = new int[5];
		
//		배열 복사를 함과 동시에 크기를 늘려줌
//		for (int i = 0; i < oldIntArray.length; i++) {
//			newIntArray[i] = oldIntArray[i];
//		}
		
		System.arraycopy(oldIntArray, 0, newIntArray, 0, oldIntArray.length);
//		System.arraycopy(원본배열, 원본배열 복사 시작 인데스, 새 배열, 새 배열에 붙여넣기 할 인덱스 번호, 복사 항목 수)
		
		
		for (int i = 0; i < newIntArray.length; i++) {
			System.out.println(newIntArray[i] + ", ");
		}
		
		
		/*
		 * 기본 타입을 원소로 갖는 배열을 어떻게 참조하는지!
//		배열은 참조 타입 !
		
		int[] arr1;
		int[] arr2;
		int[] arr3;
		
		arr1 = new int[] {1, 2, 3};
		arr2 = new int[] {1, 2, 3};
//		데이터를 넘겨주는 것이 아니라, 메모리 주소를 넘겨주는 것! 헷갈리지 마세용
		arr3 = arr2;
		
		
//		값을 비교하는 게 아니라 메모리 주소를 비교하는 것
		System.out.println(arr1 ==  arr2);
//		arr2의 메모리 주소를 arr3로 넘겨줬으니 같은 값
		System.out.println(arr2 ==  arr3);
		
		int[] intArray = null;
		intArray[0] = 10;
		*/
		
		/*
		String[] strArray = new String[3];
//		[0]과 [1]은 리터럴이 같으므로 동일한 주소를 가지고 있음.
		strArray[0] = "java";
		strArray[1] = "java";
		strArray[2] = new String("java");
		
		System.out.println(strArray[0] == strArray[1]);
		System.out.println(strArray[0] == strArray[2]);
		System.out.println(strArray[0].equals(strArray[2]));
		*/
	}

}
