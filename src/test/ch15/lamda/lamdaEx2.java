package test.ch15.lamda;

public class lamdaEx2 {

	public static void main(String[] args) {
		//데이터 처리방법은 외부에서 !
		Person person = new Person();
		person.action((x, y) -> {
			double result = x + y;
			return result;
		});
		
		//데이터 처리의 다형성
		person.action((x, y) -> x + y);
		person.action((x, y) -> x - y);
		person.action((x, y) -> x * y);
		
	}

}
