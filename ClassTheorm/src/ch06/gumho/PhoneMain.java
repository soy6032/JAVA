package ch06.gumho;

public class PhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Phone 클래스는 추상클래스이므로 객채를 생성할 수 없음
//		Phone p1 = new Phone("유재석");
//		Phone p2;
//		Phone p3 = new SmartPhone("유재석"); 은 가능함
		
//		Phone 클래스의 멤버를 사용하려면 Phone 클래스를 상속받아 자손 클래스가 
//		Phone 클래스의 멤버를 모두 구현하면 사용할 수 있음
		SmartPhone sp1 = new SmartPhone("아이유");
		sp1.turnOn();
		sp1.internetSearch();
		sp1.turnOff();
		
	}

}
