package ch061;

import ch06.*;
public class C {
	
	
	public static void main(String[] args) {
		
//		AŬ������ default ���� �����ڸ� ����Ͽ� �ٸ� ��Ű���� ����ϴ� CŬ���������� ������ �Ұ�����.
//		A a = new A();
//		BŬ������ public ���� �����ڸ� ����Ͽ� �ٸ� ��� Ŭ���������� ������ ������
//		B b = new B();
		
		
		ABC abc = new ABC();
//		privateName�� ABC Ŭ������ ��������� ���� �����ڸ� private�� 
//		����ϱ� ������ �ش� ��ü �������� ��밡��
//		System.out.println("privateName : " + abc.privateName);
		System.out.println("protectedName : " + abc.protectedName);
		System.out.println("publicName : " + abc.publicName);
		
		DEF def = new DEF();
		
		System.out.println("��ӹ��� protectedName : " + def.protectedName);
		System.out.println("��ӹ��� publicName : " + def.publicName);
		System.out.println("�ڽ��� publicName : " + def.publicDEFName); 
		
		
		
	}
	

}
