
public class Rectangle extends Shape {

	private double rectArea;
	
		
	public Rectangle() {
		super();
	}


	public Rectangle(double l, double b) {
		super(l, b);
	}
	
	public void calcArea() {
		this.rectArea = this.getDim1() * this.getDim2();
		System.out.println("Area of rect : " + this.rectArea);
	}
}
