package ch07;

public class People {

	public String name;
	public String ssn;
	
//	다른 생성자가 존재할 경우에 super() 를 통해서 호출하고자 하면 아무런 기능이 없더라도 
//	기본생성자를 생성하여야함
	public People() {
		
	}
	
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
}
