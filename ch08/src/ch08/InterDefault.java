package ch08;

public interface InterDefault {

//	추상메소드
	public void method1();
	public void method2();
	
	public default void defaultMethod() {
		System.out.println("InterDefault 인터페이스의 디폴트 메소드");
	}
	
}
