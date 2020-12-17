package ch06;

public class Student {

//	필드, 클래스 멤버변수
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void inputInfo(int id, String name, int grad, String addr) {
		studentID = id;
		studentName = name;
		grade = grad;
		address = addr;
	}
	
//	멤버 메서드
	public void printInfo() {
		System.out.println(studentID);
		System.out.println(studentName);
		System.out.println(grade);
		System.out.println(address);
	}
	
	
	
	
	
//	메소드: 클래스의 기능을 수행하는 부분 (js의 함수와 동일)
//	클래스에 포함되어 있을 경우 메소드라고 한다.
//	호출해서 실행할 수 있는 중괄호{} 블록
//	메소드를 호출하면 중괄호{}블록에 있는 모든 코드들이 일괄 실행
	
//  접근제어자 리턴타입 메소드이름 ([매개변수선언,...]){
//		실행할 코드를 작성하는 곳
//	}
//	
//	리턴타입 --> 메소드가 리턴하는 결과 타입 표시 (메소드 실행된 후 호출한 시점으로 되돌려주는 데이터)
//			   리턴값이 있을 수도 있고 없을 수도 있음
//			   리턴값이 없을 경우 void를 사용
//
//	매개변수 --> 메소드가 실행할 때 필요한 데이터를 외부에서 받기위한 변수 (자바는 매개변수의 데이터 타입과 이름을 함께 입력)
//			   매개변수도 필요없을 수도 있음-> ()만 입력
//			   값을 직접입력해도 되고, 변수를 입력해도 된다.
	
//	return문 --> 1. 리턴값이 있는 메소드: 해당 메소드를 실행후 그 결과값을 되돌려주는 기능
//				return문 뒤에 실행문이 올 수 없음
	
//	        	2. 메소드 실행을 중지하고 리턴값을 지정하는 역활: 메서드는 return을 만나면 즉시 실행 중지
//				메소드 실행을 강제 종료 시키는 역활
	
//	메소드의 호출
//	클래스내부 : 메소드 이름으로 호출(객체명X)
//	클래스외부: 객체 생성 후, 참조 변수를 이용해 호출
	
}
