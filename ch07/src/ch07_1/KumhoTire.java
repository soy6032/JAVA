package ch07_1;

public class KumhoTire extends Tire {
	
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumlatedRotation;
		
		if(accumlatedRotation < maxRotation) {
			System.out.println(location + " KumhoTire ���� : " + (maxRotation - accumlatedRotation) + "ȸ");
			return true;
		}
		else {
			System.out.println("***" + location + "KumhoTire ��ũ ***");
			return false;
		}
	}


}
