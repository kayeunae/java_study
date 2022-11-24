package test.ch09;

public class AStaticEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AStatic이라는 객체를 생성한 게 아니라 클래스를 사용해서 가지고 온 것.
		//static 클래스이므로 상위 객체를 생성하지 않고 바로 사용할 수 있음.
		AStatic.B b = new AStatic.B();
		
		System.out.println("B클래스 필드: " + b.field1);
		b.method1();
	}

}
