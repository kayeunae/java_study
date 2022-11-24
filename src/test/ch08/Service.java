package test.ch08;

public interface Service {
	// 디폴트 메소드
	default void defaultMethod1() {
		System.out.println("defaultMethod1 종속 코드");
	}

	default void defaultMethod2() {
		System.out.println("defaultMethod2 종속 코드");
	}

	/*
	 * JAVA 1.8 에서는 지원이 안 되는 듯 !
	//private 메소드
	private void defaultCommon() {
		System.out.println("defaultMethod1 중복 코드");
		System.out.println("defaultMethod2 중복 코드");
	}
	*/
	
	// 정적 메소드
	static void staticMethod1() {
		System.out.println("staticMethod1 중복 코드");
	}

	static void staticMethod2() {
		System.out.println("staticMethod2 종속 코드");
	}

}
