package ch07;

// 클래스 B에서 클래스를 A를 기반으로 객체를 생성함
public class B {
	public void method() {
		A a = new A();
		a.field = "value";
		a.method();
	}
}
