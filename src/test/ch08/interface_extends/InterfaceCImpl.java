package test.ch08.interface_extends;

public class InterfaceCImpl implements InterfaceC {
//추상메소드는 무조건 오버라이드를 받아야 한다.
//InterfaceCImpl은 InterfaceC를, InterfaceC는 InterfaceA와 B를 상속한다.
//InterfaceA~C에 있는 모든 추상메소드를 오버라이드 함
	@Override
	public void methodA() {
		System.out.println("InterfaceCImpl methodA() 실행");
	}

	@Override
	public void methodB() {
		System.out.println("InterfaceCImpl methodB() 실행");
	}

	@Override
	public void methodC() {
		System.out.println("InterfaceCImpl methodC() 실행");
	}

}
