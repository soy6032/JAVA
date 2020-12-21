package ch07;

public class Car {

	public int speed;
	
	public void speedUp() {
		speed++;
	}
	
	public final void stop() {
		System.out.println("∏ÿ√„");
		
		speed = 0;
	}
	
}
