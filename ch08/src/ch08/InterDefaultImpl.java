package ch08;

public class InterDefaultImpl implements InterDefault {

	@Override
	public void method1() {
		System.out.println("오버라이딩된 mothod1");
	}

	@Override
	public void method2() {
		System.out.println("오버라이딩된 method2");
	}
	
//	인터페이스의 디폴드 메서드는 일반적인 메서드이기 때문에 인터페이스를 상속받았을 경우 디폴드 메서드를 오버라이딩 할필요가 없음
//	부모의 메서드이기 떄문에 오버라이딩해서 사용할 수 있음
	@Override
	public void defaultMethod() {
		System.out.println("InterDefaultImpl 클래스에서 오버라이딩한 defaultMethod");
	}
	
//	@Override
//	public abstract void defaultMethod();

	
	
}
