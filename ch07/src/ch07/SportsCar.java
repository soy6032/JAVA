package ch07;

public class SportsCar extends Car {

	@Override
	public void speedUp() {
		speed = speed + 10;
	}
	
	
//	car클래스의 stop() 메서드가 final 를 사용하였기 떄문에 오버라이딩이 되지 않음
//	@Override
//	public void stop() {
//		
//	}
	
}
