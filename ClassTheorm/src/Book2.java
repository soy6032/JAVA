
//	Getter/Setter 를 사용하는 이유는 객체의 메버에 함부러 접근을 허가하지 않기 위해서
//	입력되는 데이터를 검증하기 위해서 사용

public class Book2 {

//	제목, 저자, 출판사, 가격
	private String title;
	private String author;
	private String publisher;
	private double price;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
	
}
