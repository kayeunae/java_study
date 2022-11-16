package test.ch06.exam01.package2;

import test.ch06.exam01.package1.A;
import test.ch06.exam01.package1.B;

public class C {
	public C() {
		A a = new A();
		
		a.field1 = 1;	//o
//		a.field2 = 1;	//x => default(같은 패키지 안에서만 실행 가능)으로 선언됨.
//		a.field3 = 1;	//x => private(같은 클래스 안에서만 실행 가능)으로 선언됨.
		a.method1();	//o
//		a.method2();	//x => default(같은 패키지 안에서만 실행 가능)으로 선언됨.
//		a.method3();	//x => private(같은 클래스 안에서만 실행 가능)으로 선언됨.
	}
	
//	A a = new A();	
//	B b = new B();
	
//	A a1 = new A(true);		//O
//	A a2 = new A(1);		//X - default
//	A a3 = new A("문자열");	//X	- private
}
