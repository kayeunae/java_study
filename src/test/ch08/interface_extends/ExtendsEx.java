package test.ch08.interface_extends;

public class ExtendsEx {

	public static void main(String[] args) {
		InterfaceCImpl impl = new InterfaceCImpl();
		InterfaceA ia = impl;	//자동 형변환
		ia.methodA();
		
		InterfaceB ib = impl;
		ib.methodB();
		
		//★Interface A와 B를 상속받아서 methodA, B 모두 가져다 쓸 수 있다.
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
//		impl.methodA();
//		impl.methodB();
//		impl.methodC();
	}

}
