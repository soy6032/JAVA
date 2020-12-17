package ch05;

import java.util.Scanner;

public class ArrayEx1 {
	public void arrayEx1() {
		int[] intArr1; //배열 선언만 진행
		int[] intArr2 = null; // 배열 선언 및 null로 초기화
		int intArr3[] = {1, 2, 3, 4, 5}; // 배열 선언과 동시에 데이터 입력
		int intArr4[] = new int[5]; // 배열의 크기를 5로 고정하고 데이터는 미입력

		intArr1 = new int[3];
		intArr1[0] = 1;
		intArr1[1] = 2;
		intArr1[2] = 3;
		System.out.println("배열 intArr1의 길이 " + intArr1.length);
		
		intArr2 = new int[3];
		intArr2[0] = 10;
		intArr2[1] = 20;
		intArr2[2] = 30;
		System.out.println("배열 intArr2의 길이 " + intArr2.length);
		
		intArr3[4] = 500;
		System.out.println("배열 intArr3의 index 4번 값 출력 : " + intArr3[4]);
		
		intArr4[0] =1000;
		System.out.println("배멸 intArr4[0]의 값 : " + intArr4[0]);
		
	}
	
	public void arrayEx2() {
		System.out.println("-----arrayEx2-----");
		int score[] = {80, 90, 75};
		
		System.out.println("-----배열 직접 출력-----");
		System.out.println("score[0] : " + score[0]);
		System.out.println("score[1] : " + score[1]);
		System.out.println("score[2] : " + score[2]);
		
		System.out.println("-----for문 이용하여 배열 출력-----");
		for(int i = 0; i < score.length; i++) {
			System.out.println("score[" + i + "] : " + score[i]);
		}
	}
	
	public void arrayEx3() {
//		문제3) 배열(크기5)을 사용하여 점수의 총합과 평균을 구하는 프로그램 
//		사용자 점수 입력은 원할 경우 구현
		System.out.println("-----arrayEx3-----");
		
		int score[] = new int[5];
		int total = 0;
		double average = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < score.length; i++) {
			System.out.print((i + 1) + "번 점수입력 : ");
			score[i] = sc.nextInt();
			total += score[i];
		}
		average = (double)total / score.length;
		System.out.print("총점 : " + total + " , 평균 : " + average);
	}
}
