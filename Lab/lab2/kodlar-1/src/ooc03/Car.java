package ooc03;
public class Car {
	private String plate;
	private Person owner;

	public Car( String plate ) { this.plate = plate; }
	public Car( String plate, Person owner ) {
		this.plate = plate;
		this.owner = owner;
	}
	public void setOwner( Person owner ) { this.owner = owner; }
	public Person getOwner() { return owner; }
	public String getPlate( ) { return plate; }
	public void setPlate( String plate ) { this.plate = plate; }
	public String toString( ) {
		String intro;
		intro = "[CAR] My license plate is " + getPlate() + 
			" and my owner is " + owner.getName();
		return intro;
	}
}
