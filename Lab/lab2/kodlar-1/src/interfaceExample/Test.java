package interfaceExample;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Point point = new Point(4, 5);
		
		Circle circle = new Circle(3.5, 4, 5);
		
		Cylinder cylinder = new Cylinder(5, 3.5, 4, 5);
		
		Shape arrayOfShapes [];
		
		arrayOfShapes = new Shape[3];
		
		arrayOfShapes[0] = point;
		arrayOfShapes[1] = circle;
		arrayOfShapes[2] = cylinder;
		
		String output = "";
		
		for (int i = 0; i < arrayOfShapes.length; i++) {
			output += "\n" + arrayOfShapes[i].getName() + " : " + 
		              "\nArea" + " : " + 
					  arrayOfShapes[i].area() +
		              "\nVolume" + " : " + 
					  arrayOfShapes[i].volume();
		}
		
		System.out.println(output);
		
		
	}

}
