package ch06;

public class CalculatorMain4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator8 cal8 = new Calculator8();
		System.out.println("���ΰ� 10�� ���簢���� ���̴� : " + cal8.areaRectangle(10));
		System.out.println("���ΰ� 10�̰�, ���ΰ� 5�� ���簢���� ���� : " + cal8.areaRectangle(10, 5));

		
		System.out.println("------�����ε�------");
		
		Calculator9 cal9 = new Calculator9();
		
		System.out.println("���� 2���� �Է��ϴ� ���� : " + cal9.plus(10, 5));
		System.out.println("���� 1���� �Ǽ� 1���� �Է��ϴ� ���� : " + cal9.plus(10, 5.0));
		System.out.println("�Ǽ� 2���� ���� 1���� �Է��ϴ� ���� : " + cal9.plus(10.0, 5));
		System.out.println("�Ǽ� 2���� �Է��ϴ� ���� : " + cal9.plus(10.0, 5.0));
		
		System.out.println("------����1------");
		
		Calculator10 cal10 = new Calculator10();
		System.out.println("���� 2���� �Է��ϴ� ���� : " + cal10.plus(10, 5));
		System.out.println("���� 1���� �Ǽ� 1���� �Է��ϴ� ���� : " + cal10.plus(10, 5.0));
		System.out.println("�Ǽ� 2���� ���� 1���� �Է��ϴ� ���� : " + cal10.plus(10.0, 5));
		System.out.println("�Ǽ� 2���� �Է��ϴ� ���� : " + cal10.plus(10.0, 5.0));
		
		System.out.println("���� 2���� �Է��ϴ� ���� : " + cal10.minus(10, 5));
		System.out.println("���� 1���� �Ǽ� 1���� �Է��ϴ� ���� : " + cal10.minus(10, 5.0));
		System.out.println("�Ǽ� 2���� ���� 1���� �Է��ϴ� ���� : " + cal10.minus(10.0, 5));
		System.out.println("�Ǽ� 2���� �Է��ϴ� ���� : " + cal10.minus(10.0, 5.0));
		
		System.out.println("���� 2���� �Է��ϴ� ���� : " + cal10.mul(10, 5));
		System.out.println("���� 1���� �Ǽ� 1���� �Է��ϴ� ���� : " + cal10.mul(10, 5.0));
		System.out.println("�Ǽ� 2���� ���� 1���� �Է��ϴ� ���� : " + cal10.mul(10.0, 5));
		System.out.println("�Ǽ� 2���� �Է��ϴ� ���� : " + cal10.mul(10.0, 5.0));
		
		System.out.println("���� 2���� �Է��ϴ� ������ : " + cal10.div(10, 5));
		System.out.println("���� 1���� �Ǽ� 1���� �Է��ϴ� ������ : " + cal10.div(10, 5.0));
		System.out.println("�Ǽ� 2���� ���� 1���� �Է��ϴ� ������ : " + cal10.div(10.0, 5));
		System.out.println("�Ǽ� 2���� �Է��ϴ� ������ : " + cal10.div(10.0, 5.0));
		
		System.out.println("���� 2���� �Է��ϴ� ������ : " + cal10.rest(10, 5));
		System.out.println("���� 1���� �Ǽ� 1���� �Է��ϴ� ������ : " + cal10.rest(10, 5.0));
		System.out.println("�Ǽ� 2���� ���� 1���� �Է��ϴ� ������ : " + cal10.rest(10.0, 5));
		System.out.println("�Ǽ� 2���� �Է��ϴ� ������ : " + cal10.rest(10.0, 5.0));
		
		
		
		
		
		
		System.out.println("------����2------");
		
		Calculator11 cal11 = new Calculator11(10, 5);
		
		cal11.plus(10, 10);

	}

}
