
public class CircleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Circle pizza = new Circle(10, "자바 피자");
		
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle donut = new Circle();
		donut.name = "도넛";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
		
		
	}

}
