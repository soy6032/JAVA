package ch06;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cal myCar = new Cal();
		
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();
		
		if(gasState) {
			System.out.println("����մϴ�.");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		}
		else {
			System.out.println("gas�� �����ؾ� �մϴ�.");
		}
		
	}

}