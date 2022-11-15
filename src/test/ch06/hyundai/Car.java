package test.ch06.hyundai;

import test.ch06.hankook.SnowTire;
import test.ch06.kumho.AllSeasonTire;

public class Car {
	//다른 패키지에 있는 class는 반드시 패키지 import 해줘야 한다.(3,4번 라인)
	SnowTire snowT = new SnowTire();
	AllSeasonTire allT = new AllSeasonTire();
	Test test = new Test();
	//임포트하지 않고 다른 패키지의 클래스를 가져오는 방법. 단, 코드가 지저분해져서 거의 쓰지 않으니 참고만!
	test.ch06.hankook.Tire tire1 = new test.ch06.hankook.Tire();

}
