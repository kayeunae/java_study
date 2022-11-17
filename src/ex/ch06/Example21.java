package ex.ch06;

public class Example21 {

	static int max(int[] arr) {		
		if (arr == null || arr.length == 0) {
			return -999999;
		}
		//maxNum을 0 값으로 주면 배열에 음수가 있을 때 문제됨 ! 배열의 첫 번째 값으루...
		int maxNum = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > maxNum) {
				maxNum = arr[i];
			} else if (arr[i] < maxNum) {
				maxNum = maxNum;
			}
		}
		return maxNum;	
	}
	
	public static void main(String[] args) {
		int[] data = { 7,1,6,4,100,65,5565,6595,1,12 };
		System.out.println("data 배열: " + java.util.Arrays.toString(data));
		System.out.println("data 최대값:" + max(data));
		System.out.println("null 최대값:" + max(null));
		System.out.println("int[] {} 최대값:" + max(new int[] {})); // 크기가 0인 배열

	}

}
