
public class InsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[5];
		int[] arr2 = {1, 2, 3, 4, 5};
		
		Circle[] c;
		c = new Circle[5];
		
		for(int i = 0; i < c.length; i++) {
			c[i] = new Circle();
		}
		
		
		System.out.println("----------");
		
		
//		Circle Ŭ���� Ÿ���� 5��¥�� �迭�� ����
//		�迭�� ���� index���� ������ �������(null)
//		�ش� �迭�� ����Ϸ��� �� index�� ��ü�� �����ϴ� �ڵ带 �Է��ؾ���.
		Circle[] c3 = new Circle[5]; 
		
		for(int i = 0; i < c3.length; i++) {
			int result = (int)(Math.random() * 10) + 1;
			c3[i] = new Circle();
		}
		System.out.println(c3[0].name);
		System.out.println(c3[0].radius);
		c3[0].getArea();
		
		
	}

}




















