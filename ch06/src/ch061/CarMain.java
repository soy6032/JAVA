package ch061;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car myCar = new Car();
		myCar.setSpeed(-50);
		
		System.out.println("���� �ӵ� : " + myCar.getSpeed());
		
		myCar.setSpeed(60);
		
		if(myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("���� �ӵ� : " + myCar.getSpeed());

	}

}
