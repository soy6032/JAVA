
public class Book4Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book4[] book4 = new Book4[5];
		
		book4[0] = new Book4();
		book4[1] = new Book4("가나다라");
		book4[2] = new Book4("마바사아", "ABCD");
		book4[3] = new Book4("마바사아", "EFGH");
		book4[4] = new Book4("마바사아", "EFGH");
		
		for(int i = 0; i < book4.length; i++) {
			book4[i].show();
			System.out.println("--------");
		}
		
	}

}
