
public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person();
		
		
		Person p2;
		p2 = new Person();
		
		p1.name = "������";
		p1.gender = 'F';
		p1.height = 165;
		p1.weight = 40.0;
		p1.married = false;
		p1.getInfo();
		
		p2.name = "����";
		p2.gender = 'F';
		p2.height = 166;
		p2.weight = 44.0;
		p2.married = false;
	
		
		Student student1 = new Student();
		student1.StudentID = "1234";
		student1.name= "ȫ�浿";
		student1.grade= 2;
		student1.getStudent();
		
		Student student2 = new Student();
		student2.StudentID = "5678";
		student2.name= "�ڱ浿";
		student2.grade= 3;
		student2.getStudent();
	}
	

}
