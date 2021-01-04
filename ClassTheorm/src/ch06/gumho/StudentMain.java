package ch06.gumho;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new  Person();
		p1.name = "유재석";
		p1.age = 50;
		p1.gender = 'M';
		p1.email = "you@gmail.com";
		p1.getinfo();
		
		Student s1 = new Student();
		s1.studentNumber = "0001";
		s1.name = "아이유";
		s1.age = 28;
		s1.gender = 'F';
		s1.email = "iu@gmail.com";
		s1.classNumber = "c001";
		s1.getinfo();
		s1.getStudentInfo();
		
		
		System.out.println("-----자동타입변환-----");
//		클래스의 다형성, 부모 클래스인 Person 클래스 변수에 자손 클래스인 Student 클래스의 객체 s1을 대입(자동 타입 변환)
		Person p2 = s1;
		p2.getinfo();
//		p2.getStudentInfo(); //자손 클래스 타입의 객체인 s1을 부모 클래스 타입의 변수 p2에 대입하면 부모 클래스 타입의 멤버만 사용가능함,
//		자손 클래스 타입의 객체가 가지고 있는 데이터는 그래로 유지된다.
		System.out.println("-----강제타입변환-----");
//		원본이 Student클래스 타입의 객체이었으므로 부모 클래스인 Person 클래스 타입에서 
//		자손 클래스인 Student 클래스 타입으로 강제 타입 변환하여 대입이 가능 
//		강제 타입 변환하게 되면 원본이 원래 가지고 있었던 멤버를 모두 사용 가능하며, 해당 데이터도 그래도 유지됨
		Student s2 = (Student)p2;
		s2.getinfo();
		s2.getStudentInfo();
		
		System.out.println("------instanceof------");
		
		Person p3 = new Person();
		Student s3 = new Student();
		
		
		System.out.println(p3 instanceof Person);
		System.out.println(p3 instanceof Student);
		
		System.out.println(s3 instanceof Person);
		System.out.println(s3 instanceof Student);
		
		
		

	}
	
	

}
