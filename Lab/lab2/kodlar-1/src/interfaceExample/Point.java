package interfaceExample;

public class Point implements Shape {
   protected int x, y;
   
	public Point() {
		  // no code necessary 
	 }
   
	public Point(int x, int y){
		   this.x = x;
		   this.y = y;
	   }
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public double area() {
		return 0.0;
	}
	
	public double volume() {
		return 0.0;
	}
	
	public String getName() {
		return "Point";
	}
}
