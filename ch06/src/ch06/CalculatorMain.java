package ch06;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator myCal = new Calculator(); //Calculator Ŭ������ myCal ������ ��ü����
		myCal.powerOn();//Calculator Ŭ������ ��� �޼ҵ� powerOn()�� ����
		
//		������ ���� result�� �����ϰ� CalculatorŬ������ ��� �޼ҵ� plus()�� ����
//		�Ű����� 5, 6�� �Ѱ��༭ ����
		int result = myCal.plus(5, 6);
		System.out.println("result = " + result);
		
		int minusResult = myCal.minus(5, 6);
		System.out.println("minusResult = " + minusResult);
		
		int multipleResult = myCal.multiple(5, 6);
		System.out.println("multipleResult = " + multipleResult);
		
//		��� ������ �ƴ� �׳� �Ϲ� ����
		byte x = 10;
		byte y = 4;
//		myCal�� ��� �޼ҵ� divide() ����
//		�Ű����� x, y 2���� ������ ����
//		divide()�޼ҵ�� �Ű������� int Ÿ���� ���� 2�� ������ ������ �Ѱ��� x, y�� byte Ÿ���̾���
//		int Ÿ���� byte Ÿ�Ժ��� ������ Ÿ���� ũ�Ⱑ ũ�⶧���� byteŸ���� int Ÿ������ �ڵ�Ÿ�Ժ�ȯ�� �߻���.
		
		double dResult = myCal.divide(x, y);
		
		System.out.println("dResult = " + dResult);
		
		myCal.powerOff();
		
		
	}

	
	
}


//����1) CalculatorŬ������ �����Ͽ� ���ϱ�, ���� �޼ҵ带 �����ϰ� ����ϴ� ���α׷��� �ۼ��ϼ���

//���ϱ� �޼ҵ�� : multiple
//���� �޼ҵ�� : minus

//����2) Calculator2 Ŭ������ �����ϰ�, ��Ģ������ ���� ������� x, y�� ��� �޼���
//plus, minus, multi, div �� �����ϰ�, �����͸� �Է��ϱ� ���� ����޼��� setting() 
//������� �޼ҵ� printer()�� ���� ��Ģ������ �����ϴ� ���α׷�
// ������ ������� : x, y
// ������ �޼ҵ�: plus, minus, multi, div, setting, printer
//setting, printer�� �Ű������� ����, �������� �Ű����� ����
//plus, minus, multi, div�� ��������� �̿��ؼ� ����
//����� printer �޼ҵ带 �̿��ؼ� ������
//������� x, y�� ������ ��Ģ����
