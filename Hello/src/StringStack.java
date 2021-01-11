
public class StringStack implements Stack{

	
	int num = 0;
	String[] str;
	
	public StringStack(int num) {
		// TODO Auto-generated constructor stub
		 
		str = new String[num];
		this.num = num;
	}
		

	
	@Override
	public int length() {
		// TODO Auto-generated method stub
		return num;
	}

	@Override
	public int capacity() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean push(String val) {
		// TODO Auto-generated method stub
		return false;
	}

}
