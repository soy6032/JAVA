package ch06;

public class CalculatorMain3 {

//	static
//	1. ��üȭ���� �ʰ� ��� ���
//	2. ���� ��ü�� �����ϴ� ������
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		���� ����� ����� ����
//		��üȭ �۾����� �ٷ� ���� ���(static)�� ����� �� ����
		Calculator3.x = 10;
		Calculator3.y = 5;
		Calculator3.plus();
		Calculator3.minus();
		
//		�ν��Ͻ� ����� ����� ����
//		��üȭ �۾� ���̴� �ν��Ͻ� ����� ����� �Ұ���
		Calculator4 cal4 = new Calculator4();// -->��üȭ
		cal4.x = 10;
		cal4.y = 5;
		cal4.plus();
		cal4.minus();
		cal4.divide();
		cal4.multi();//���� �ɹ� �޼ҵ�� ��üȭ�ؼ� ����ϸ� �ȵ�.
//		���� ��� �޼ҵ�� Ŭ������.�޼ҵ�� ���� ���
		Calculator4.multi();
		
//		�ν��Ͻ� ����� ���� ����� ����� �� ����
//		��������� ���� ����� ��밡��
		
		
		System.out.println("\n------------\n");
		
		Calculator5 cal1 = new Calculator5();
		Calculator5 cal2 = new Calculator5();
		
		cal1.x = 10;
		cal1.y = 5;
		cal1.plus();
		
		cal2.x = 100;
		cal2.y = 50;
		cal2.plus();
		
		System.out.println(cal1.x);
		System.out.println(cal2.x);
		
		System.out.println(cal1.staticX);
		System.out.println(cal2.staticX);
		System.out.println(cal1.staticY);
		System.out.println(cal2.staticY);
		
		cal1.staticX = 1000;
		cal2.staticY = 500;
//		�Ʒ��� ���´� ����� �� ������ ����ϸ� �ȵ�(cal1.staticX --> X)
		System.out.println(cal1.staticX);
		System.out.println(cal2.staticX);
		System.out.println(cal1.staticY);
		System.out.println(cal2.staticY);
//		���� ��� ����ε� ���� 
		System.out.println(Calculator5.staticX);
		
		System.out.println("\n----------\n");
		
//		�����ڴ� ��ü ������ �ڵ� ����
		Calculator6 cal61 = new Calculator6();
		Calculator6 cal62 = new Calculator6(10, 5);
		Calculator6 cal63 = new Calculator6(10);
		
//		cal61.x = 10;
//		cal61.y = 5;
//		���α׷� ����� �Ź� �ʿ��� ���� �Է��ؾ���.
//		�Ǽ��� setValue()�� �������� �ʰ� plus()�� ���� �� ������ �߻�
//		setValue() �������� �ʾ��� ��쿡�� �⺻���� �ԷµǾ� ����Ǳ⸦ ���Ұ�� �����ڸ� ���
//		cal61.setValue(1000, 500);
		cal61.setValue(100, 50);
		cal61.currentValue();
		cal61.plus();
		
		System.out.println("\n-----������ �����ε�-----\n");
		
//		Calculator7 cal71 = new Calculator7(10, 5);
		
//		Calculator7 cal72 = new Calculator7(10);
		
		Calculator7 cal73 = new Calculator7();
		
	}


	
}











