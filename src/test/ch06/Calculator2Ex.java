package test.ch06;

public class Calculator2Ex {

	public static void main(String[] args) {
//		Calculator2 calc2 = new Calculator2();	//객체 생성 (인스턴스)
//		기존에 필드, 메소드 불러오던 방식 (객체명.필드or메소드)
//		calc2.pi = 10;
//		calc2.plus(1, 2);
		
//		static: 'new' 요소 없이 인스턴스 멤버를 불러올 수 있다.
		Calculator2.plus(1, 2);		//객체(인스턴스)를 생성하지 않아도 클래스를 통해서 접근 가능
		Calculator2.minus(1, 2);
		System.out.println(Calculator2.pi);
	}

}
