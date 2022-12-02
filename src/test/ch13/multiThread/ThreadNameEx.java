package test.ch13.multiThread;

public class ThreadNameEx {

	public static void main(String[] args) {
		//main thread 이름 가져오기
		Thread mainThread = Thread.currentThread();	//main thread를 얻어온다.
		System.out.println(mainThread.getName());	//해당 thread의 이름을 가져온다.
		
		//thread 3개 생성
		for(int i = 0; i < 3; i++) {
			//익명 구현 객체로 만들어준다.
			Thread threadA = new Thread() { 	//익명구현객체 : 상속 + 클래스
				
				//Thread 클래스의 run() 메소드를 오버라이드.
				//run() : 실제 thread가 실행되는 코드
				@Override
				public void run() {
					System.out.println(getName() + "실행");	//thread 이름을 가져온다. (Thread-0, 1, 2, ...)
				}
			};
			
			//run() 메소드는 start() 메소드를 통해 실제로 실행된다.
			threadA.start();
		} //=====for
		
		
		//chat thread 생성 (thread의 이름을 지정할 수 있다.)
		Thread chatTread = new Thread() {
			@Override
			public void run() {
				System.out.println(getName() + "실행");	//thread 이름을 가져온다.
			}
		};
		
		chatTread.setName("chat-thread"); //thread가 실행되기 전에 이름을 바꾼다.
		chatTread.start();
		
	}

}
