package ch06;


public class Calculator2 {

	int x; // --> 10
	int y; // --> 5
	
	
// 	동일한 클래스끼리는 객체명을 쓰지 않는다.
	public void setting(int inputX, int inputY) {
		x = inputX; 
//		main 에서 받은 10을 x에 넣음
//		(int inputX, int inputY는 해당 코드블럭 내에서만 살아있음)
//		그래서 멤버변수 x, y에 입력받았던 값을 대입
		y = inputY;
	}
	
	
//	return값이 없을 경우 void 사용
	public void printer(int result, int oper) {
		switch(oper) {
		case '+':
			System.out.println("두수의 합은 : " + result);
			break;
		case '-':
			System.out.println("두수의 뺄샘은 : " + result);
			break;
		case '*':
			System.out.println("두수의 곱은 : " + result);
			break;
		case '/':
			System.out.println("두수의 나눗셈은 : " + result);
			break;
		}
	}
	
//	return값이 없을 경우 void 사용
	public void plus() {
		int result = x + y;
		printer(result, '+'); // result와 '+'값을 printer로 전달
	}
	
	public void minus() {
		int result = x - y;
		printer(result, '-');
	}
	
	public void multi() {
		int result = x * y;
		printer(result, '*');
	}
	
	public void div() {
		int result = x / y;
		printer(result, '/');
	}
	
	
	
	
	
}