package ex.ch12;

public class Container03<T, Z> {
	T t;
	Z z;
	
	void set(T t, Z z) {
		this.t = t;
		this.z = z;
	}
	
	T getKey() {
		return t;
	}
	Z getValue() {
		return z;
	}
}
