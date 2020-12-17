package ch06;

public class Calculator6 {

	private int x;
	private int y = 10;
	
//	생성자
//	생성자는 객체 생성 시 가장 먼저 실행됨
//	멤버 변수의 초기화 및 멤버 메소드 실행
//	생성자는 메소드와 거의 동일한 기능을 가지고 있음
//	생성자는 반환값이 없음 (return 키워드를 사용하지 않음)
	public Calculator6() { // --> 생성자는 클래스명과 동일한 이름을 사용
		this.x = 10;
		this.y = 5;
//		return; 메모리에 등록과 동시에 메모리에서 삭제
	}
	public Calculator6(int x) { // --> 생성자는 클래스명과 동일한 이름을 사용
		this.x = 10;
	}
	public Calculator6(int x, int y) { // --> 생성자는 클래스명과 동일한 이름을 사용
		this.x = 10;
		this.y = 5;
		
		currentValue();
		
	}
//	this --> 객체의 자기자신
	public void setValue(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void currentValue() {
		System.out.println("현재 x : " + x);
		System.out.println("현재 y : " + y);
	}
	public void plus() {
		System.out.println("두 수의 덧셈은 : " + ( x + y ));
	}
	
}
