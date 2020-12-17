package ch06;

public class Calculator5 {

	int x;
	int y;
	static int staticX = 0;
	static int staticY = 0;
	
	public void plus() {
		int result = x + y;
		System.out.println("µÎ ¼öÀÇ µ¡»ùÀº : " + result);
	}
	
	public static void staticPlus() {
		int result = staticX + staticY;
		System.out.println("µÎ ¼öÀÇ µ¡¼ÀÀº" + result);
	}
	
}
