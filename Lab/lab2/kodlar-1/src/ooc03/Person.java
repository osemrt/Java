package ooc03;

public class Person {
	private String name;
	private Car car;

	public Person( String name ) {
		this.name = name;
	}

	public String getName( ) { return name; }
	public Car getCar( ) { return car; }
	public void setCar( Car car ) { this.car = car; }
	
	public String introduceSelf( ) {
		String intro;
		intro = "[PERSON] My name is " + name;
		if( car != null )
			intro += " and the plate of my car is " 
				+ car.getPlate();
		return intro;
	}

}
