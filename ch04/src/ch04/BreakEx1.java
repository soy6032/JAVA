package ch04;
import java.util.Scanner;
public class BreakEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("-----�Ϲ����� break ���");
		Scanner sc = new Scanner(System.in);
		System.out.println("����� ���� �ܼ��� �Է����ּ���: ");
		int dan = sc.nextInt();
		
		for(int i = 2; i < 10; i++) {
			System.out.println("-----" + i + "�� ���-----");
			for(int j = 1; j < 10; j++) {
				if(dan == i) {
					break;
				}
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}
		
		System.out.println("-----label�� Ȱ���� break ���");
		
		label:for(int i = 2; i < 10; i++) {
			System.out.println("-----" + i + "�� ���-----");
			for(int j = 1; j < 10; j++) {
				if(dan == i) {
					break label;
				}
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}
	}

}
