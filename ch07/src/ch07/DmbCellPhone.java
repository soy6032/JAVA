package ch07;

//CellPhone Ŭ������ ��� ����
public class DmbCellPhone extends CellPhone{
//	DmbCellPhone���� model�� color�� ����
	int channel;
	
	DmbCellPhone(String model, String color, int channel){
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
