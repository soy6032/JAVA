package ch04;

import java.util.Scanner;

public class ForEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//for���� ����Ͽ� ����ڰ� �Է��� ������ �������� ����ϴ� ���α׷��� �ۼ��ϼ���.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� : ");
		
		int dan = sc.nextInt();
		
		for(int i = 1; i < 10; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
		
		sc.close();
		

	}

}
