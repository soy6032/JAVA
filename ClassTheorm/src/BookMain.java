
public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ����� ���ڸ� ��Ÿ���� title�� author ��� ������ ���� bookŬ������ �ۼ��ϰ�,
		// �����ڸ� �ۼ��Ͽ� ��������� �ʱ�ȭ�ϰ� ȭ�鿡 ����ϴ� ���α׷��� �ۼ��ϼ���
		// å 2�� ������ ����ϼ���
		
		Book book = new Book();
		book.getBook();
		
		Book book1 = new Book("å����1", "ȫ�浿");
		book1.getBook();
		
		Book book2 = new Book();
		book2.setBook("å����3", "�̱浿");
		book2.getBook();
		
		Book2 b2 = new Book2();
		b2.setPrice(1000);
		b2.setTitle("�����ϴٴ� ����");
		b2.setAuthor("����Ŭ����");
		
		System.out.println(b2.getAuthor());
		
		
	}

}
