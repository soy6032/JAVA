package ch06.gumho;

//추상 클래스를 상속 받았을 경우 추상클래스의 멤버 중 추상 멤버를 전부 구현하지 않을 경우 해당 클래스도 추상 클래스호 선언해야함
//모든 추상 멤버를 구형해야지만 일반클래스로 사용할 수 있음
public abstract class Dog extends Animal{

	public Dog() {
		this.kind = "포유류";
	}
	
}

class chihuahua extends Dog{
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("멍멍왈왈");
	}
	
}
