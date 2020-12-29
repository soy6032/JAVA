
public class Book4 {

	private String title;
	private String author;
	
	
	public Book4() {
		this("氓力格");
	}
	
	public Book4(String title) {
		this(title,"氓历磊");
	}
	
	public Book4(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
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
	
	public void show() {
		System.out.println("氓 力格 : " + title + "\n氓 历磊 : " + author);
	}
	
}
