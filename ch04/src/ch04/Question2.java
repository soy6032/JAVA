package ch04;
import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		����1) ���� ������ ����Ͽ� ȭ�� UI�� �Ź� ��µ� �� �ֵ����ϰ� ������� �Է¿� ���ؼ� ���α׷��� ����Ǵ� �����
//		������ �ִ� ������ ��� ���α׷��� �ۼ��Ͻÿ�
//		1. ���� ���� �Է�
//		2. ����� �ܼ� �Է�
//		** ���ڿ� �� : ���ڿ�����.equals("���ҹ��ڿ�");
		
		Scanner sc = new Scanner(System.in);
		String exit;// ���� ���� �ޱ� ���� ����
		
		System.out.println("������ ����ϴ� ���α׷��Դϴ�."); //���α׷� ���� �� �ѹ��� ��� (�ݺ��� ��)
		
//		** ���α׷� ���� �κ�
		while(true) {
			
			System.out.print("����� �ܼ��� �Է����ּ��� : "); 
			int dan = sc.nextInt();	//����� �Է�(����)
			
//			** ���� ������ ��� �κ�
			for(int i = 1; i < 10; i++) {
				System.out.println(dan + " * " + i + " = " + dan * i);
			}
			
//			** ���α׷� �����ϴ� �κ�
			System.out.print("���α׷��� �����ϰڽ��ϱ�?(y/n) :"); 
			exit = sc.next();// ����� �Է�(y/n)
			
//			equals() : ������ ���ڿ��� ��� true���, �ٸ� ��� false ���
			if(exit.equals("y")) {
				System.out.println("����");
				break; // ���� ������ ��������
			}
		}
		
		sc.close();
	}
}
