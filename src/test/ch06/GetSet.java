package test.ch06;

public class GetSet {
	private int speed;
	private boolean stop;	//자동차가 멈췄을 때 true, 달릴 때 false
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
			return; //void에서는 return 생략 가능하지만 if문 함수를 끝내야 하기 때문에 일부러 적어둠.
		}
		this.speed = speed;
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		if (stop == true) this.speed = 0;
	}
	
	/*
	//필드의 값을 가져올 수 있는 기능
	public int getSpeed() {
		return this.speed;
	}

	//바깥 쪽에서 필드에 값을 넣어줄(바꿀) 수 있는 기능
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	*/
	


}
