package ch06.gumho;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		추상 클래스는 객체화할 수 없음
//		Animal ani = new Animal();
//		추상 클래스인 Animal을 상속받아 추상 메서드인 sound()를 오버라이딩하여 구현하지 않았기 때문에 Dog클래스도 추상 클래스가 됨
//		Dog dog = new Dog();
		Cat cat = new Cat();
		chihuahua chi = new chihuahua();
		cat.sound();
		cat.breathe();
		chi.sound();
		
	}

}
