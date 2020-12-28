
public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 제목과 저자를 나타내는 title과 author 멤버 변수를 가진 book클래스를 작성하고,
		// 생성자를 작성하여 멤버변수를 초기화하고 화면에 출력하는 프로그램을 작성하세요
		// 책 2권 정보를 출력하세요
		
		Book book = new Book();
		book.getBook();
		
		Book book1 = new Book("책제목1", "홍길동");
		book1.getBook();
		
		Book book2 = new Book();
		book2.setBook("책제목3", "이길동");
		book2.getBook();
		
		Book2 b2 = new Book2();
		b2.setPrice(1000);
		b2.setTitle("공정하다는 착각");
		b2.setAuthor("마이클센델");
		
		System.out.println(b2.getAuthor());
		
		
	}

}
