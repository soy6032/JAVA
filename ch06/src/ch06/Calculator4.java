package ch06;
//�Ϲ����� ����� Ȱ���� ���� Ŭ����
public class Calculator4 {

	int x;
	int y;
	static int staticX = 10;
	static int staticY = 5;
	
	public void plus() {
		int result = x + y;
		System.out.println("�μ��� ������ : " + result);
	}
	
	public void minus() {
		int result = x - y;
		System.out.println("�� ���� ������ : " + result);
	}
	
//	���� ��� �޼ҵ��� multi()�� ���� ��� ������ ��� ����
	public static void multi() {
//		int result = x * y;
		int result = staticY * staticY;
		System.out.println("�� ���� ������ : " + result);
	}
	
	public void divide() {
//		�ν��Ͻ� ����� ���� ����� ��� ����
		int result = staticX / staticY;
		System.out.println("�� ���� �������� :" + result);
	}
	
	
	
}
