

public class Circle{
	String name;
	int radius;

	public Circle() {
		radius = 1;
		name = "";
	}
	
	public Circle(int r, String n) {
		this.radius = r;
		this.name = n;
    }
	
	public double getArea() {
	    double result = 3.14 * radius * radius;
	    return result;
	}
	
	
}

