package test.ch15.lamda;

public class Person {
	//메소드의 매개변수로 Calculable2 타입을 받음
	public void action(Calculable2 calculable2) {
		//데이터 처리부(데이터를 가지고만 있음)
		//리턴시킨 값을 여기 result에서 받음
		double result = calculable2.calc(10, 4);
		System.out.println("결과: " + result);
	}
}
