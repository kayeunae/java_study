package test.ch15.lamda;

@FunctionalInterface
public interface Calculable2 {
	//람다식 이용을 위해서는 추상메소드를 한 개만 가지고 있어야 함.
	double calc(double x, double y);
}
