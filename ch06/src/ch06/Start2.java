package ch06;

public class Start2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student2 studentAhn = new Student2(); //클래스의 변수 생성(객체 생성:객체화)
		studentAhn.studentName = "안연수";
//		클래스의 멤버는 해당 클래스를 객체화 시킨후 사용할 수 있음
//		System.out.println(student2);
//		System.out.println(student2.studentName);
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
		
	}

}
