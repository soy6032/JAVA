class ConstructorExample {
	int x;

	public void setX(int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public ConstructorExample(int x) {
		this.x = x;
	}

	public static void main(String[] args) {
		ConstructorExample a = new ConstructorExample(0);
		int n = a.getX();
	}
}


class Samp {
	
	int id;

	public Samp(int x) {
		this.id = x;
	}
	
	public Samp() {
		this(0);
		System.out.println("생성자호출");
		
	}
	
}
