package ch06;

import ch061.*;
//public ���� ������ ���
public class B {
//	A Ŭ������ default ���� �����ڸ� ����Ͽ� ������ ��Ű���� ����ϴ� BŬ�������� ȣ���� ������
	A a = new A();
	
	public B() {
		DEF def = new DEF();
		
//		ABC Ŭ������ ��������� protectedName �� ���� �����ڸ� protected�� ����Ͽ�
//		��ӹ��� Ŭ���������� ����� ���������� ��Ű���� �ٸ� Ŭ���������� ����� �� ����
//		System.out.println("��ӹ��� protectedName : " + def.protectedName);
		System.out.println("��ӹ��� publicName : " + def.publicName);
		System.out.println("�ڽ��� publicName : " + def.publicDEFName); 
	}
}
