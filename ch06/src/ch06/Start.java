package ch06;

public class Start {
//클래스는 2가지 형태, 실행클래스, 라이브러리 클래스
//	실행 클래스는 main() 메서드를 가지고 있음
//	하나의 프로그램은 하나의 main() 메서드와 여러개의 라이브러리 클래스를 사지고 있음
//	main() 메서드는 프로그램 시작 지점
//	main() 메서드에서 여러개의 라이브러리 클래스를 객체화하여 라이브러리를 실행함
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		자바에서 변수 사용 시 선언만하고 초기화 하지않고 사용시 오류가 발생함
//		int studentId;
//		String studentName;
//		int grade;
//		String address;
//		
//		System.out.println(studentId);
//		System.out.println(studentName);
//		System.out.println(grade);
//		System.out.println(address);
		
//		Student 클래스를 클래스 변수 std로 개체화함
//		Student std = new Student();// 클래스 변수 객체 생성(인스턴스화, 객체화)
//		System.out.println(std.studentID);// 객체화된 클래스의 멤버변수 및 멤버 메서드를 가져다가 사용하려면 객체명.멤버변수명, 객체명.멤버메서드명으로 사용
//		System.out.println(std.studentName);
//		System.out.println(std.address);
//		System.out.println(std.grade);
		
//		클래스를 사용하는 이유
//		1. 여러개의 관련된 데이터를 한번에 모아서 사용하기 위함
//		배열을 사용해서 데이터를 저장해도 상관은 없으나 자바의 배열을 자바스크립트처럼 여러가지 데이터 타입을 한번에 저장할 수 없음
//		자바의 배열은 같은 종류의 데이터만 저장할 수 있음
//		2. 해당 특정 기능을 사용할 경우 데이터 및 기능을 사용하기 쉬움
//		3. 소스의 재활용이 쉬움,  기존의 소스도 짧아짐
		int studentId1 = 1;
		String studentName1 = "아이유";
		int grade1 = 102;
		String address1 = "서울";
		
		System.out.println(studentId1);
		System.out.println(studentName1);
		System.out.println(grade1);
		System.out.println(address1);
		
		int studentId2 = 2;
		String studentName2 = "유인나";
		int grade2 = 102;
		String address2 = "서울";
		
		System.out.println(studentId2);
		System.out.println(studentName2);
		System.out.println(grade2);
		System.out.println(address2);
		
		int studentId3 = 3;
		String studentName3 = "유재석";
		int grade3 = 102;
		String address3 = "서울";
		
		System.out.println(studentId3);
		System.out.println(studentName3);
		System.out.println(grade3);
		System.out.println(address3);
		
		int studentId4 = 4;
		String studentName4 = "유산슬";
		int grade4 = 102;
		String address4 = "서울";
		
		System.out.println(studentId4);
		System.out.println(studentName4);
		System.out.println(grade4);
		System.out.println(address4);
		
		int studentId5 = 5;
		String studentName5 = "유드래곤";
		int grade5 = 102;
		String address5 = "서울";
		
		System.out.println(studentId5);
		System.out.println(studentName5);
		System.out.println(grade5);
		System.out.println(address5);

//		전체 데이터를 저장하기 위해서 배열을 4개 선언함
//		문제점 : 데이터 저장 시 순서가 바뀔 경우 데이터의 무결성이 훼손됨
		int[] studentIds = new int[] {1, 2, 3 , 4, 5};
		String[] studentNames = new String[] {"아이유", "유인나", "유재석", "유산슬", "유드래곤"};
		int[] grades = new int[] {102, 102, 102 , 102, 102};
		String[] addrs = new String[] {"서울", "서울", "서울", "서울", "서울"};
		
		for(int i = 0; i < studentIds.length; i++) {
			System.out.println(studentIds[i]);
			System.out.println(studentNames[i]);
			System.out.println(grades[i]);
			System.out.println(addrs[i]);
		}
		
		
		Student std = new Student();
		std.inputInfo(1000, "아이유", 102, "서울");
		std.printInfo();
		
		Student std2 = new Student();
		std2.studentID = 2000;
		std2.studentName = "유재석";
		std2.grade = 102;
		std2.address = "서울";
		std2.printInfo();
		

		
	}

}

