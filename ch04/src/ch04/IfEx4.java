package ch04;

public class IfEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Math.random() : �ڹ� ���� ���� Ŭ�������� 0.0 ~ 1.0�̸��� ������ ���ڸ� ��ȯ�ϴ� �޼���
//		Math.random() * 20 �� 0 ~ 20������ ������ ����
		int score = (int)(Math.random() * 20) + 81;
		System.out.println(score);
		
		String grade;
		
		if(score >= 90) {
			if(score > 95) {
				grade = "A+";
			}
			else {
			grade = "A";
			}
		}
		else {
			if(score > 85) {
				grade = "B+";
			}
			else {
				grade="B";
			}
		}
		
		System.out.println("����� ������ " + score + "�̰�, ����� " + grade);

	}
}
