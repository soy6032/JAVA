
public class Calculator {

   public static void main(String[] args) {
      int i;
      int j;
      i =10;
      j =20;
      System.out.println(i+j);   
   }
}

class A { 
	private int a; 
	public A() {
		
	}
	protected A(int i) { 
		a = i;
		} 
	} 
class B extends A { 
	private int b; 
	public B() {
		b = 0; 
		} 
	}

