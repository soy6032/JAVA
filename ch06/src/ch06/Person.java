package ch06;

public class Person {

	String name;
	float height;
	float weight;
	
//	�⺻ ������, �ٸ������ڸ� ������� ��� ���� �����ڰ� �ڵ����� �������� �ʱ� ������ �ʿ��Ѱ�� ���� �����ؾߵ�
	public Person() {
		
	}
	public Person(String name) {
		this.name = name;
		getValues();
	}
	public Person(String name, float height, float weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		getValues();
	}
	
	public void getValues() {
		System.out.println("name : " + name + "\nheight : " +  height + "\nweight : "+ weight);
	}
	
}

// ���� 1) �ڵ����� ���� ������ ������ ���ִ� Ŭ������ �����Ͽ� �ڵ����� ���� ������ ����ϴ� ���α׷��� �ۼ�
//�⺻ ������ 1��
//�ڵ��� ���� �Է� �޼ҵ�, �ڵ��� ���� ��� �޼ҵ�
//Ŭ������ : Car , ����Ŭ���� CarMain
//ȸ��� �𵨸� ����(�ֹ߷�) ������(����) ũ��(����), ����, ����
//��¥_������ȣ_�̸�.zip

// ���� 2) ������ 3�� this ��� x 
// ���� 3) ������ ������ this ���










