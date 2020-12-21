package ch07;

public class Computer extends Calculator {
	
	@Override
	double areaCircle(double r) {
		System.out.println("Computer ��ü�� areaCircle() ����");
		return Math.PI * r * r;
	}
	
	private void printer(int result, char oper) {
		if(oper == '+') {
			System.out.println("�μ��� ������ : " + result);
		}
		else if (oper == '-') {
			System.out.println("�μ��� �E���� : " + result);
		}
		else if (oper == '*') {
			System.out.println("�μ��� ������ : " + result);
		}
		else {
			System.out.println("�μ��� �������� : " + result);
		}
	}
	
	@Override
	public int plus(int x, int y) {
		int result = x + y;
		printer(result, '+');
		return result;
	}
	
	@Override
	public int minus(int x, int y) {
		int result = x - y;
		printer(result, '-');
		return result;
	}
	
	@Override
	public int multi(int x, int y) {
		int result = x * y;
		printer(result, '*');
		return result;
	}
	
	@Override
	public int div(int x, int y) {
		int result = x / y;
		printer(result, '/');
		return result;
	}
	
}
