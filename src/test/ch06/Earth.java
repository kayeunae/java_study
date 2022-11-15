package test.ch06;

public class Earth {
	//상수(변수명을 대문자로 선언해야 함.)
	//final: 절대 변경X, static: 전역 변수
	static final double EARTH_RADIUS = 6400;		//지구의 둘레
	static final double EARTH_SURFACE_AREA;			//지구의 표면적
	
	//static 블록: static 필드를 초기화 해줄 때 사용한다.
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
	
}
