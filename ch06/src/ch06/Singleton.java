package ch06;

public class Singleton {

	private static Singleton single = new Singleton();
	
//	���� ������ private�� �����ڿ� ����ϰ� �Ǹ� �����ڿ� ������ �Ұ����Ͽ� ��ü�� ������ �� ����
//	�����Ϸ��� �ڵ����� �����ϴ� �⺻ �����ڴ� ���� �����ڰ� public��
	private Singleton() {
		
	}
	static Singleton getInstance() {
		return single;
	}
	
}
