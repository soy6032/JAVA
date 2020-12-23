package ch07_1;

public class ChildMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent parent = new Parent();
		
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		Child child = new Child();
		child.field1 = "child data1";
		child.field2 = "child data2";
		child.method1();
		child.method2();
		child.method3();
		
		System.out.println("-----------");
		
		parent = child;
		parent.method1();
		parent.method2();
		
		Child child2 = (Child)parent;
		child2.field2 = "child data2";
		child2.method3();
		
	}

}
