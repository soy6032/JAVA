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
		
		System.out.println("1���� 10������ Ȧ���� ���� : " + total + "�Դϴ�.");
		
	}

}
