package ch061;

public class Car {
//���� ������ private�� ����Ͽ� �ܺο��� ��� ������ ���� ������ �Ұ�����
//������ Ŭ���� ��������� �ƹ��� ������ ���� ����� ������
	private int speed;
	private boolean stop;
	
	
	
	public int getSpeed() {
//		��������� speed�� ������� ���
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed < 0) {
//			��������� speed�� ������� ���
			this.speed = 0;
			return; //�޼ҵ� ��� ����
		}
		else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		
		this.stop = stop;
		this.speed = 0;
		
	}
	
}
