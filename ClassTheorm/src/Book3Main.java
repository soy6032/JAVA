
public class Book3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book3[] book3 = new Book3[5];
		
		book3[0] = new Book3("����ٶ�", "ABCD");
		book3[1] = new Book3("���ٻ��", "EFGH");
		book3[2] = new Book3("���ٻ��2", "EFGH");
		book3[3] = new Book3("���ٻ��3", "EFGH");
		book3[4] = new Book3("���ٻ��4", "EFGH");
		
		System.out.println("å���� : " +  book3[0].title + "\nå ���� : " + book3[0].author);
		System.out.println("å���� : " +  book3[1].title + "\nå ���� : " + book3[1].author);
		System.out.println("å���� : " +  book3[2].title + "\nå ���� : " + book3[2].author);
		System.out.println("å���� : " +  book3[3].title + "\nå ���� : " + book3[3].author);
		System.out.println("å���� : " +  book3[4].title + "\nå ���� : " + book3[4].author);
	}

}
