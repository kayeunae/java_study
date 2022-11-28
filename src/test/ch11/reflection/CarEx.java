package test.ch11.reflection;

public class CarEx {

	public static void main(String[] args) throws ClassNotFoundException {
		//class에 대한 정보가 clazz로 들어감
//		Class clazz = CarEx.class;	//클래스 정보를 얻는 첫 번째 방법
//		Class clazz = Class.forName("test.ch11.reflection.CarEx");	//클래스 정보를 얻는 두 번째 방법
		
		CarEx car = new CarEx();	//정보를 얻고 싶은 객체 생성(클래스에 대한 객체를 얻어옴)
		Class clazz = car.getClass(); //클래스 정보를 얻는 세 번째 방법
		
		System.out.println("패키지 이름: " + clazz.getPackage().getName());
		System.out.println("클래스의 간단한 이름: " + clazz.getSimpleName());
		System.out.println("클래스의 전체 이름: " + clazz.getName());
		
		
	}

}
