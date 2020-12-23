package ch07_1;

public class HankookTire extends Tire {
	
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
		}
	
	@Override
	public boolean roll() {
		++accumlatedRotation;
		
		if(accumlatedRotation < maxRotation) {
//			오버라이딩을 통해서 내용 변경
			System.out.println(location + " HankookTire 수명 : " + (maxRotation - accumlatedRotation) + "회");
			return true;
		}
		else {
			System.out.println("***" + location + "HankookTire 펑크***");
			return false;
		}
	}

}
