package interfaceExample;

public class Circle extends Point{

	protected double radius;
	
	public Circle() {
		//no code necessary
	}
	
	public Circle(double r, int x, int y) {
		this.x = x;
		this.y = y;
		this.radius = r;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double area() {
		return Math.PI * radius * radius;
	}
	
	public String getName() {
		return "Circle";
	}
	
	
}
