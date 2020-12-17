package ch06;

public class Calculator {

	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	
//	외부에서 입력받은 매개변수 2개를 합하여 정수형으로 되돌려줌.
	public int plus(int x, int y) {
		int result = x + y;
		return result;
		//return 키워드를 사용하여 결과값을 호출한 시점으로 되돌려줌
	}
	
	public int minus(int x, int y) {
		int result = x - y;
		return result;
	}
	
	public int multiple(int x, int y) {
		int result = x * y;
		return result;
	}
	
	public double divide(int x, int y) {
		double result = x / y;
		return result;
	}
	
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}

}