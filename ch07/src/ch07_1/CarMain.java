package ch07_1;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car();
		
		for(int i = 1; i <= 5; i++) {
			int problemLocation = car.run();
			switch (problemLocation) {
			case 1:
				System.out.println("�� ���� HankookTire�� ��ü");
				car.frontLeftTire = new HankookTire("�� ����" , 15);
				break;
			case 2:
				System.out.println("�� ������ KumhoTire�� ��ü");
				car.frontRightTire = new KumhoTire("�� ������" , 13);
				break;
			case 3:
				System.out.println("�� ���� HankookTire�� ��ü");
				car.backLeftTire = new HankookTire("�� ����" , 14);
				break;
			case 4:
				System.out.println("�� ������ KumhoTire�� ��ü");
				car.backRightTire = new KumhoTire("�� ������" , 17);
				break;
			}
			
			System.out.println("-------------------");
		}

	}

}
