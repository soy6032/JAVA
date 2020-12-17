package ch04;
import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		문제1) 무한 루프를 사용하여 화면 UI가 매번 출력될 수 있도록하고 사용자의 입력에 의해서 프로그램이 종료되는 기능을
//		가지고 있는 구구단 출력 프로그램을 작성하시오
//		1. 종료 여부 입력
//		2. 출력할 단수 입력
//		** 문자열 비교 : 문자열변수.equals("비교할문자열");
		
		Scanner sc = new Scanner(System.in);
		String exit;// 종료 문자 받기 위한 변수
		
		System.out.println("구구단 출력하는 프로그램입니다."); //프로그램 시작 시 한번만 출력 (반복문 밖)
		
//		** 프로그램 메인 부분
		while(true) {
			
			System.out.print("출력할 단수를 입력해주세요 : "); 
			int dan = sc.nextInt();	//사용자 입력(숫자)
			
//			** 실제 구구단 출력 부분
			for(int i = 1; i < 10; i++) {
				System.out.println(dan + " * " + i + " = " + dan * i);
			}
			
//			** 프로그램 종료하는 부분
			System.out.print("프로그램을 종료하겠습니까?(y/n) :"); 
			exit = sc.next();// 사용자 입력(y/n)
			
//			equals() : 동일한 문자열일 경우 true출력, 다를 경우 false 출력
			if(exit.equals("y")) {
				System.out.println("종료");
				break; // 무한 루프를 빠져나옴
			}
		}
		
		sc.close();
	}
}
