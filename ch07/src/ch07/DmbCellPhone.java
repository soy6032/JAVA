package ch07;

//CellPhone Ŭ������ ��� ����
public class DmbCellPhone extends CellPhone{
//	DmbCellPhone���� model�� color�� ����
	int channel;
	
//	�ڼ� ��ü�� �����ڰ� ���� ��� �����Ϸ��� �ڵ����� �����ڸ� �߰���
//	�ڵ����� �߰��� �⺻ �������� ù�ٿ� super() �� �ڵ����� �Է��Ͽ� �θ� ��ü�� �����ڸ� ȣ����
	
//	�ڼ� ��ü�� �����ڸ� ����Ͽ��� ��� �����Ϸ��� super()�� ����Ͽ� �θ� ��ü�� �����ڸ� �ڵ����� ȣ��
//	�θ� ��ü�� �����ڰ� �Ű������� ������ �ִ� �����ڿ��� ��� �ڼ� ��ü���� �θ� ��ü�� �����ڸ� ��������� ȣ����
	DmbCellPhone(String model, String color, int channel){
//		super();�� �ڵ����� ����
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
//	�θ� Ŭ������ CellPhone���� ��ӹ��� �޼���, ��� ���� �޼���� �̹� �����Ǿ� �ֱ� ������ �ڽ� Ŭ������ ������ �ʿ䰡 ����

//	�ڽ� Ŭ������ DmbCellPhone �� ��ü ��� �޼���, ��ü ��� �޼����̱� ������ �����ؾ���	
	void turnOnDmb() {
		System.out.println("ä�� " + channel + "�� DMB��� ������ �����մϴ�.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä��" + channel + "������ �ٲ޴ϴ�.");
	}
	
	void turnOffDmb() {
		System.out.println("Dmb ��� ������ ���ϴ�.");
	}
}
