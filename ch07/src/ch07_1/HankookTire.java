package ch07_1;

public class HankookTire extends Tire {
	
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
		}
	
	@Override
	public boolean roll() {
		++accumlatedRotation;
		
		if(accumlatedRotation < maxRotation) {
//			�������̵��� ���ؼ� ���� ����
			System.out.println(location + " HankookTire ���� : " + (maxRotation - accumlatedRotation) + "ȸ");
			return true;
		}
		else {
			System.out.println("***" + location + "HankookTire ��ũ***");
			return false;
		}
	}

}
