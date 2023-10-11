
public class Circle extends Shape{

	private double areaCircle;
	
	public Circle() {
		
	}
	
	public Circle(double radius) {
		super(radius);
	}
	
	public void calcArea() {
		this.areaCircle = this.getDim1() * this.getDim2() * 3.14;
		System.out.println("Area of circle : " + this.areaCircle);
	}
}
