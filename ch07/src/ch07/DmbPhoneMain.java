package ch07;

public class DmbPhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 10);
		
//		�θ� Ŭ������ CellPhone Ŭ�������� ��ӹ���
		System.out.println("�� : " + dmbCellPhone.model);
		System.out.println("���� : " + dmbCellPhone.color);
		
//		�۽� Ŭ������ DmbCellPhone Ŭ������ ��ü ��� ����
		System.out.println("ä�� : " + dmbCellPhone.channel);
		
//		�θ� Ŭ������ CellPhone Ŭ�������� ��ӹ��� ��� �޼���
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������");
		dmbCellPhone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�Դϴ�.");
		dmbCellPhone.sendVoice("�� �ݰ����ϴ�.");
		dmbCellPhone.hangUp();
		
//		�ڽ� Ŭ������ DmbCellPhone Ŭ������ ��ü ��� �޼���
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
		

	}

}
