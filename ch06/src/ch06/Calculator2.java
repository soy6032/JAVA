package ch06;


public class Calculator2 {

	int x; // --> 10
	int y; // --> 5
	
	
// 	������ Ŭ���������� ��ü���� ���� �ʴ´�.
	public void setting(int inputX, int inputY) {
		x = inputX; 
//		main ���� ���� 10�� x�� ����
//		(int inputX, int inputY�� �ش� �ڵ�� �������� �������)
//		�׷��� ������� x, y�� �Է¹޾Ҵ� ���� ����
		y = inputY;
	}
	
	
//	return���� ���� ��� void ���
	public void printer(int result, int oper) {
		switch(oper) {
		case '+':
			System.out.println("�μ��� ���� : " + result);
			break;
		case '-':
			System.out.println("�μ��� ������ : " + result);
			break;
		case '*':
			System.out.println("�μ��� ���� : " + result);
			break;
		case '/':
			System.out.println("�μ��� �������� : " + result);
			break;
		}
	}
	
//	return���� ���� ��� void ���
	public void plus() {
		int result = x + y;
		printer(result, '+'); // result�� '+'���� printer�� ����
	}
	
	public void minus() {
		int result = x - y;
		printer(result, '-');
	}
	
	public void multi() {
		int result = x * y;
		printer(result, '*');
	}
	
	public void div() {
		int result = x / y;
		printer(result, '/');
	}
	
	
	
	
	
}