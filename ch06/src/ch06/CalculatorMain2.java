package ch06;

public class CalculatorMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator2 cal = new Calculator2();
		cal.setting(10, 5);//setting �Ű����� int inputX, int inputY�� ������� ����
//		cal.x = 10;
//		cal.y = 5;
//		cal.setting(10, 5);���  cal.x = 10; cal.y = 5; �̷��� �ص� ��
		cal.plus();
		cal.minus();
		cal.multi();
		cal.div();
		
	}

}