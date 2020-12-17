package ch06;

public class CalculatorMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator2 cal = new Calculator2();
		cal.setting(10, 5);//setting 매개변수 int inputX, int inputY에 순서대로 대입
//		cal.x = 10;
//		cal.y = 5;
//		cal.setting(10, 5);대신  cal.x = 10; cal.y = 5; 이렇게 해도 됨
		cal.plus();
		cal.minus();
		cal.multi();
		cal.div();
		
	}

}