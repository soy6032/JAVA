package ch07;


//People Ŭ������ ��ӹ޾� name, ssn �� ����� ������
public class Student extends People {

	public int studentNo;
	
//	�θ� Ŭ������ ��ӹ��� �ڼ� Ŭ������ ��ü ������ �θ�Ŭ������ �����ڸ� ȣ���ؾ���
//	�����Ϸ��� �ڵ����� �θ� Ŭ������ �����ڸ� ȣ���ϴ� ���� �θ� Ŭ������ �⺻ ������ ����
//	�θ� Ŭ������ �⺻ Ŭ������ ������ ���� ���� ��� �����ڰ� ���� �θ� Ŭ������ �����ڸ� ȣ���ؾ���
//	�θ� Ŭ������ �����ڸ� ȣ���ϱ� ���� ��ɾ��� super()�� ���� ù�ٿ� �Է��ؾ�
	public Student(String name, String ssn, int studenNo) {
 		super(name, ssn);
		this.studentNo = studenNo;
	}
	
}
