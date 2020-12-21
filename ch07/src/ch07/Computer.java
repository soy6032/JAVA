package ch07;

public class Computer extends Calculator {
	
	@Override
	double areaCircle(double r) {
		System.out.println("Computer °´Ã¼ÀÇ areaCircle() ½ÇÇà");
		return Math.PI * r * r;
	}
	
	private void printer(int result, char oper) {
		if(oper == '+') {
			System.out.println("µÎ¼öÀÇ µ¡¼ÀÀº : " + result);
		}
		else if (oper == '-') {
			System.out.println("µÎ¼öÀÇ –E¼ÀÀº : " + result);
		}
		else if (oper == '*') {
			System.out.println("µÎ¼öÀÇ °ö¼ÀÀº : " + result);
		}
		else {
			System.out.println("µÎ¼öÀÇ ³ª´°¼ÀÀº : " + result);
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
