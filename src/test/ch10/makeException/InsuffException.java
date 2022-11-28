package test.ch10.makeException;

public class InsuffException extends Exception {	//자바 자체에 있는 exception 예외 클래스를 상속함
	public InsuffException() {
	}

	public InsuffException(String message) {
		super(message); 
	}
}
