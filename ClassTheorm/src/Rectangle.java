
public class Rectangle {
	
	int width;
	int height;
	
	public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
 
    public void sum() {
        System.out.println("�ѷ� : " + (this.width + this.height) *2);
    }
 
    public void area() {
        System.out.println("���� : " + (this.width * this.height));
    }

}
