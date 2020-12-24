
public class Rectangle {
	
	int width;
	int height;
	
	public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
 
    public void sum() {
        System.out.println("µ—∑π : " + (this.width + this.height) *2);
    }
 
    public void area() {
        System.out.println("≥–¿Ã : " + (this.width * this.height));
    }

}
