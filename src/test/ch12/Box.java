package test.ch12;
//1. 해당 클래스에서 제네릭 타입 선언 (<T>)
/*
 추후 타입을 지정하게 되면 <T> 자리에 지정한 타입이 들어간다고 보면 됨.
 */
public class Box<T> {
	//T: content 필드의 타입이 어떤 게 올지 모른다.
	public T content;
}
