package test.ch06.exam01.package2;

import test.ch06.exam01.package1.A;
import test.ch06.exam01.package1.B;

public class C {
//	A a = new A();	
//	B b = new B();
	
	A a1 = new A(true);		//O
	A a2 = new A(1);		//X - default
	A a3 = new A("문자열");	//X	- private
}
