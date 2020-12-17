package ch04;
import java.util.Scanner;
public class WhileEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1;
		int sum = 0;
		
		while(num <= 10) {
			sum += num;
			num++;
		}
		
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
		
		System.out.println("-----구구단 출력-----");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 : ");
		int dan = sc.nextInt();
		int i = 1;
		
		while(i < 10) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
			
			i++;
		}
		
		sc.close();	
	}

}
