package ch061;

public class Car {
//접근 제한자 private를 사용하여 외부에서 멤버 변수에 직접 접근이 불가능함
//동일한 클래스 멤버끼리는 아무런 제약이 없이 사용이 가능함
	private int speed;
	private boolean stop;
	
	
	
	public int getSpeed() {
//		멤버변수인 speed를 제약없이 사용
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed < 0) {
//			멤버변수인 speed를 제약없이 사용
			this.speed = 0;
			return; //메소드 즉시 종료
		}
		else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		
		this.stop = stop;
		this.speed = 0;
		
	}
	
}
