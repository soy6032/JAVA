package ch06.gumho;

public abstract class Animal {

	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
//	추상 메서드, 추상 메서드는 코드 블럭이 없음, 자손 클래스에서 상속받아 오버라이딩으로 구현해야함
//	추상 메서드는 코드 블럭이 없기 때문에 매개 변수가 들어가는 () 이후에 바로 세미콜론을 사용함
	public abstract void sound();
	
}
