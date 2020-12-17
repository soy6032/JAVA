package ch04;

import java.util.Scanner;

public class ForEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//for문을 사용하여 사용자가 입력한 숫자의 구구간을 출력하는 프로그램을 작성하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단 : ");
		
		int dan = sc.nextInt();
		
		for(int i = 1; i < 10; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
		
		sc.close();
		

	}

}
