package ch02;

public class ImplicitConversion {
	public void implicitConversion(){
		System.out.println("-----�ڵ� Ÿ�� ��ȯ-----");
		
		byte bNum = 10;
		int iNum = bNum; //byte -> int �ڵ� Ÿ�� ��ȯ
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20; // 4byte ������
		float fNum = iNum2; // 4byte �Ǽ���
//		���������� �Ǽ����� �� ū ������ Ÿ��
//		int -> float ���� �ڵ� Ÿ�� ��ȯ
		
		System.out.println(iNum2);
		System.out.println(fNum);
		
		double dNum;
 		dNum = fNum + iNum; // ū ������ Ÿ�԰� ���� ������ Ÿ���� ������ ��� ū ������ Ÿ������ �ڵ� Ÿ�� ��ȯ��
// 		����� ������� float Ÿ�������� ����� ������ double Ÿ���̹Ƿ� double Ÿ������ �ڵ� Ÿ�� ��ȯ��
		System.out.println(dNum);
	}
}
