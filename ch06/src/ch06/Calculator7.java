package ch06;

public class Calculator7 {

	private int x;
	private int y;
	
//	�Ű������� 2�� �޴� ������
	public Calculator7(int x, int y) {
		System.out.println("�Ű����� 2���� ������ ã�ƿ�");
		this.x = x;
		this.y = y;
		
		
		getValues();
	}
//	�Ű������� 1�� �޴� ������
	public Calculator7(int x) {
//		�Ű����� 2���� �̵�
		this(x, 5);

	}
//	�Ű������� ���� �ʴ� ������
	public Calculator7() {
//		�Ű����� 1���� �̵�
		this(10);
	}
	
	public void getValues() {
		System.out.println("���� ������ ������ \nX : " + x + "\nY : " + y);
	}
	
	public void setValues(int x, int y) {
		System.out.println("���� �����մϴ�");
		this.x = x;
		this.y = y;
		
		getValues();
	}
	
	public void plus() {
		System.out.println(x + " + " + y + " = " + (x+y));
	}
	
}
