package interfaceExample;

public class Cylinder extends Circle {
	
    private double height;
	
	public Cylinder() {
		
	}
	
	public Cylinder(double h, double r, int x, int y) {
		this.height = h;
		this.radius = r;
		this.x = x;
		this.y = y;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double area() {
		return 2*super.area() + 2*Math.PI*radius*height;
	}
	
	public double volume() {
		return super.area()*height; 
	}
	
	public String getName() {
		return "Cylinder";
	}
}
