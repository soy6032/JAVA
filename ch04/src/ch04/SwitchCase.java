package ch04;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ranking = (int)(Math.random() * 10) + 1;
		char medalColor;
		
		switch(ranking) {
		case 1: 
			medalColor = 'G';
			break;
		case 2: 
			medalColor = 'S';
			break;
		case 3: 
			medalColor = 'B';
			break;
		default:
			medalColor = 'A';
		}
		
		System.out.println(ranking + "�� �޴��� ������ " + medalColor + "�Դϴ�.");

	}

}
