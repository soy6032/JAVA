
public class Book {

	String title;
	String author;
	
//	�⺻ ������
//	�⺻ �����ڴ� ����ڰ� �� �Ѱ��� �����ڵ� �Է����� �ʾ��� ��� �����Ϸ��� �ڵ����� ������
//  �Ѱ� �̻��� �����ڸ� �Է����� ��� �⺻ �����ڴ� �ڵ����� �������� ����
//	�⺻ �����ڸ� Ȱ���� ��� �ݵ�� ���� �Է��ؾ���
	public Book() {
		title = "������";
		author = "";
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public void setBook(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public void getBook() {
		System.out.println("���� : " + this.title + "\n���� : " + this.author);
	}
	
}
