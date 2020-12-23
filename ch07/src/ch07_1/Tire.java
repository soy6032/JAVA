package ch07_1;

public class Tire {

	public int maxRotation;
	public int accumlatedRotation;
	public String location;
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {
		++accumlatedRotation;
		
		if(accumlatedRotation < maxRotation) {
			System.out.println(location + " Tire ���� : " + (maxRotation - accumlatedRotation) + "ȸ");
			return true;
		}
		else {
			System.out.println("*** " + location + "Tire ��ũ***");
			return false;
		}
	}
	
}
