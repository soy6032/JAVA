
public class Book {

	String title;
	String author;
	
//	기본 생성자
//	기본 생성자는 사용자가 단 한개의 생성자도 입력하지 않았을 경우 컴파일러가 자동으로 생성함
//  한개 이상의 생성자를 입력했을 경우 기본 생성자는 자동으로 생성되지 않음
//	기본 생성자를 활용할 경우 반드시 직접 입력해야함
	public Book() {
		title = "구름빵";
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
		System.out.println("제목 : " + this.title + "\n저자 : " + this.author);
	}
	
}
