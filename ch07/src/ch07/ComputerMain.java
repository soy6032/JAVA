package ch07;

public class ComputerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r = 10;
		
		Calculator cal = new Calculator();
		System.out.println("�� ���� : " + cal.areaCircle(r));
		System.out.println();
		
		Computer com = new Computer();
		System.out.println("�� ���� : " + com.areaCircle(r));
		
		com.plus(10, 5);
		com.minus(100, 20);
		com.multi(20, 2);
		
	}

}
