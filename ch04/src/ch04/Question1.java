package ch04;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int randomNum = (int)(Math.random() * 10);
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է� : ");
		
		int myNum = sc.nextInt();
		
		
		if(randomNum == myNum) {
			System.out.println(randomNum + " " + myNum);
			System.out.println("����");
		}
		else {
			System.out.println(randomNum + " " + myNum);
			System.out.println("��");
		}
		
	}

}
