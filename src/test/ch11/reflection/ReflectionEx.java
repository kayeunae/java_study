package test.ch11.reflection;

//import 할 때 뒤에 *을 붙여주면 reflect 이하 모든 메소드를 사용 가능
//import java.lang.reflect*

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionEx {

	public static void main(String[] args) {
		Class clazz = Car.class; //Car 객체
		
		System.out.println("[생성자 정보]");
		//Constructor 타입의 객체로, 생성자 정보를 배열로 준다.
		Constructor[] constructors = clazz.getDeclaredConstructors();
		for(Constructor constructor : constructors) {
			System.out.print(constructor.getName() + "(");
			//파라메터의 타입을 불러온다.
			Class[] parameters = constructor.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
		
		
		System.out.println("[필드 정보]");
		Field[] fields = clazz.getDeclaredFields();
		for(Field field : fields) {
			System.out.println(field.getType().getName()+ " " + field.getName());
		}
		
		System.out.println("[메소드 정보]");
		Method[] methods = clazz.getDeclaredMethods();
		for(Method method : methods) {
			System.out.print(method.getName() + "(");
			//파라메터의 타입을 불러온다.
			Class[] parameters = method.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
	} //===========main method

	//Class 배열에 파라미터 객체가 하나씩 들어있겠구낭 ~
	private static void printParameters(Class[] parameters) {
		for(int i = 0; i < parameters.length; i++) {
			System.out.print(parameters[i].getName());
			if(i < (parameters.length-1)) { //마지막 파라미터 뒤에 콤마가 찍히지 않게 조건 설정 !
				System.out.print(",");	//매개변수 사이에 콤마를 찍는다.
			}
		}
	}
	
}
