package ch08;

public interface MyInterface {

	public void method1();
	
	public default void method2() {
		System.out.println("MyInterface의 method2");
	}
	
}
