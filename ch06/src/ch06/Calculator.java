package ch06;

public class Calculator {

	public void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	
	
//	�ܺο��� �Է¹��� �Ű����� 2���� ���Ͽ� ���������� �ǵ�����.
	public int plus(int x, int y) {
		int result = x + y;
		return result;
		//return Ű���带 ����Ͽ� ������� ȣ���� �������� �ǵ�����
	}
	
	public int minus(int x, int y) {
		int result = x - y;
		return result;
	}
	
	public int multiple(int x, int y) {
		int result = x * y;
		return result;
	}
	
	public double divide(int x, int y) {
		double result = x / y;
		return result;
	}
	
	public void powerOff() {
		System.out.println("������ ���ϴ�.");
	}

}