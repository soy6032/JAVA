package ch04;
//자바에서 콘솔 입력을 받기 위한 클래스 
import java.util.Scanner;

public class SwitchCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("메달의 색상을 영어로 입력해주세요: ");
		String medal = sc.next();
		
		
		switch(medal) {
		case "Gold" :
			System.out.println("금메달입니다.");
			break;
		case "Silver" :
			System.out.println("은메달입니다.");
			break;
		case "Bronze" :
			System.out.println("동메달입니다.");
			break;
		default:
			System.out.println("메달이 없습니다.");
			break;
		}
		
	}
	
	
	
	
	
}
