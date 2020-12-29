
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
		
		
//		Circle 클래스 타입의 5개짜리 배열만 생성
//		배열의 현재 index에는 내용이 비어있음(null)
//		해당 배열을 사용하려면 각 index에 객체를 생성하는 코드를 입력해야함.
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




















