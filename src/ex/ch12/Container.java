package ex.ch12;

public class Container<T> {
	public T t;
	
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t = t;
	}
}
