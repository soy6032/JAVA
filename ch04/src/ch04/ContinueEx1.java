package ch04;

public class ContinueEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int total = 0;
		
		for(int num = 1; num <= 100; num ++) {
			if(num % 2 == 0) {
				continue;
			}
			total += num;
		}
		
		System.out.println("1부터 10까지의 홀수의 합은 : " + total + "입니다.");
		
	}

}
