package ch06;

public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		SingletonMain obj1 = new Singleton();
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
//		Singleton obj3 = new Singleton();
//		Singleton obj4 = new Singleton();
		
		if(obj1 == obj2) {
			System.out.println("����");
		}
		else {
			System.out.println("�ٸ���");
		}
		
//		if(obj3 == obj4) {
//			System.out.println("����");
//		}
//		else {
//			System.out.println("�ٸ���");
//		}
		
		
	}

}
