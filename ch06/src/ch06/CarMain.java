package ch06;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cal myCar = new Cal();
		
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();
		
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		}
		else {
			System.out.println("gas를 주입해야 합니다.");
		}
		
	}

}