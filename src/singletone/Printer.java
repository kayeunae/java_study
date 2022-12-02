package singletone;

//프린터 객체는 무조건 하나만 생성되어야 한다.
//생성자에 private으로 접근 제한자를 둔다. (해당 클래스 내에서만 접근 가능, 외부에서 접근하지 못하고, 객체 생성 불가능)
public class Printer {
	//필드
	//2.내부에서 객체 생성. null을 줌으로써 객체를 할당하진 않았음.
	//static 전역 변수를 사용함으로써 printer 하나로 계속 사용함.
	private static Printer printer = null;
	
	//1.생성자를 private으로 바꿔준다.
	//외부에서 객체 생성을 못함
	private Printer() {
		
	}
	
	//메소드
	//2.싱글톤 구현
	public static Printer getPrinter() {
		if(printer == null) {
			//객체 할당
			//프린터 객체가 null이면 printer 객체 생성
			//객체가 한 번 생성되면 그 이후로는 printer를 리턴하고, 더이상 객체를 생성하지 않는다. => 싱글톤 !
			printer = new Printer();
		}
		//이미 printer 객체가 생성이 되어 있으면 나중에는 이미 생성된 printer가 리턴된다.
		return printer;
	}
	
}
