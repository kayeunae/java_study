package test.ch11.Annotation;

import java.lang.reflect.*;

public class PrintAnnotationEx {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method[] declareMethods = Service.class.getDeclaredMethods();
		for(Method method : declareMethods) {
			//PrintAnnotation 타입으로 ~ 	getAnnotation 해주고 괄호 안에 얻어도고 싶은 어노테이션에 대한 정보...입력...
			//PrintAnnotation 얻기
			PrintAnnotation printAno = method.getAnnotation(PrintAnnotation.class);
			//getAnnotation : 메소드에 적용된 printAnnotation을 가져온다. 
			
			printLine(printAno);
			
			//invoke: 메소드 실행시키는 메소드.. 괄호 안에는 객체를 넣어줘야 함. => service 객체에 있는 현재 메소드를 실행
			method.invoke(new Service()); 	//메소드 실행
		}
	
	}
	//PrintAnnotation 같은 건 변수가 아니라 속성이라고 함.
	public static void printLine(PrintAnnotation printAno) {
		if(printAno != null) {
			//number 속성 값 얻기, number() : PrintAnnotation에서 선언한 number()
			int number = printAno.number();
			String value = printAno.value();
			
			System.out.println(number);
			System.out.println(value);
		}
	}
}
