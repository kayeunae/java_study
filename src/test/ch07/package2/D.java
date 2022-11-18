package test.ch07.package2;

import test.ch07.package1.A;

public class D extends A {
	//protected는 상속을 통해서만 사용할 수 있다.
	//직접 생성은 불가하고, 부모 클래스의 데이터를 접근할 수만 있다.
	public D() {
		super(); //A클래스의 생성자 호출
	}
	
	public void method1() {
		super.field = "1";
		super.method();
		//상속을 받으면 현재 클래스에 필드를 선언하지 않았더라도 this를 사용해 부모클래스의 필드를 가져올 수 있다.
		this.field = "1";
		this.method();
	}
	
	protected void method2() {
		//protected 사용 시 직접 객체를 생성해서 사용할 수는 없다.
			A a = new A();	//x
			a.field = "1";	//x
			a.method();		//x
	}
}
