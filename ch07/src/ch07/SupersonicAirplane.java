package ch07;

public class SupersonicAirplane extends Airplane{

//	static final �� ����Ͽ� ����� ������
//	Ŭ������.����� ���·� ����ؾ���
//	����� ����� ���ÿ� �ʱ�ȭ, Ȥ�� static{} �ڵ��
	
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
//	AirPlane Ŭ�������� ��ӹ��� fly()�޼��带 �������̵���
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("������ �����մϴ�.");
		}
		else {
//			�θ� Ŭ������ fly() �޼��带 ȣ��
			super.fly();
		}
		
	}
}
