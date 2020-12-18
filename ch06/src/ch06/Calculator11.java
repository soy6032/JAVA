package ch06;

public class Calculator11 {
	
	double x; 
	double y; 
	
	public Calculator11(int x, int y) {
		this((double)x, (double)y);
	}
	public Calculator11(double x, int y) {
		this(x, (double)y);
	}
	public Calculator11(int x, double y) {
		this((double)x, y);
	}
	public Calculator11(double x, double y) {
		this.x = x; 	
		this.y = y;
		plus(x, y);
		minus(x, y);
		mul(x, y);
		div(x, y);
		rest(x, y);
	}
	
	
	public void printer(double result, int oper) {
		
		if(oper == '+') {
			System.out.println("µÎ¼öÀÇ µ¡¼ÀÀº : " + result);
		}
		else if(oper == '-') {
			System.out.println("µÎ¼öÀÇ »¬¼ÀÀº : " + result);
		}
		else if(oper == '*') {
			System.out.println("µÎ¼öÀÇ °ö¼ÀÀº : " + result);
		}
		else if(oper == '/') {
			System.out.println("µÎ¼öÀÇ ³ª´°¼ÀÀº : " + result);
		}
		else if(oper == '%') {
			System.out.println("µÎ¼öÀÇ ³ª¸ÓÁö´Â : " + result);
		}
		
	}
	
	public void printer(int result, int oper) {
		
		if(oper == '+') {
			System.out.println("µÎ¼öÀÇ µ¡¼ÀÀº : " + result);
		}
		else if(oper == '-') {
			System.out.println("µÎ¼öÀÇ »¬¼ÀÀº : " + result);
		}
		else if(oper == '*') {
			System.out.println("µÎ¼öÀÇ °ö¼ÀÀº : " + result);
		}
		else if(oper == '/') {
			System.out.println("µÎ¼öÀÇ ³ª´°¼ÀÀº : " + result);
		}
		else if(oper == '%') {
			System.out.println("µÎ¼öÀÇ ³ª¸ÓÁö´Â : " + result);
		}
		
	}
	
	
	public void plus(int x, int y) {
		int result = x + y;
		printer(result, '+'); 
	}
	public void plus(double x, double y) {
		double result = x + y;
		printer(result, '+'); 
	}
	public void plus(int x, double y) {
		double result = x + y;
		printer(result, '+'); 
	}
	public void plus(double x, int y) {
		double result = x + y;
		printer(result, '+'); 
	}
	
	
	
	public void minus(int x, int y) {
		int result = x - y;
		printer(result, '-'); 
	}
	public void minus(double x, double y) {
		double result = x - y;
		printer(result, '-'); 
	}
	public void minus(int x, double y) {
		double result = x - y;
		printer(result, '-'); 
	}
	public void minus(double x, int y) {
		double result = x - y;
		printer(result, '-'); 
	}
	
	public void mul(int x, int y) {
		int result = x * y;
		printer(result, '*'); 
	}
	public void mul(double x, double y) {
		double result = x * y;
		printer(result, '*'); 
	}
	public void mul(int x, double y) {
		double result = x * y;
		printer(result, '*'); 
	}
	public void mul(double x, int y) {
		double result = x * y;
		printer(result, '*'); 
	}
	
	
	public void div(int x, int y) {
		int result = x / y;
		printer(result, '/'); 
	}
	public void div(double x, double y) {
		double result = x / y;
		printer(result, '/'); 
	}
	public void div(int x, double y) {
		double result = x / y;
		printer(result, '/'); 
	}
	public void div(double x, int y) {
		double result = x / y;
		printer(result, '/'); 
	}
	
	public void rest(int x, int y) {
		int result = x % y;
		printer(result, '%'); 
	}
	public void rest(double x, double y) {
		double result = x % y;
		printer(result, '%'); 
	}
	public void rest(int x, double y) {
		double result = x % y;
		printer(result, '%'); 
	}
	public void rest(double x, int y) {
		double result = x % y;
		printer(result, '%'); 
	}
	
	
	

}
