package test.ch06.exam01.package1;

public class B {
	public void method( ) {
	A a = new A();
	
	a.field1 = 1;	//o
	a.field2 = 1;	//o
//	a.field3 = 1;	//x => private(같은 클래스 안에서만 실행 가능)으로 선언됨.
	a.method1();	//o
	a.method2();	//o
//	a.method3();	//x => private(같은 클래스 안에서만 실행 가능)으로 선언됨.

	
	}
}
