package ooc05;

public class GalleryOwner extends Person {
	private String galleryName;
	private Car[] cars;
	private int carCount;

	public GalleryOwner( String isim ) { 
		super( isim );
		carCount = 0;
		cars = new Car[30];
	}
	public String getGalleryName() { return galleryName; }
	public void setGalleryName(String galleryName) { 
		this.galleryName = galleryName; 
	}
	public String toString( ) {
		String intro = "[GalleryOwner]"+introduceSelf();
		intro += " and I run a car gallery named " + galleryName;
		intro += ", having " + carCount + " cars to sell.";
		return intro;
	}
	public boolean addCar( Car araba ) {
		if( carCount < cars.length ) {
			cars[ carCount ] = araba;
			carCount++;
			return true;
		}
		return false;
	}
	public boolean searchCar( Car aCar ) {
		for( int i = 0; i < carCount; i++ )
			if( cars[i] == aCar )
				return true;
		return false;
	}
	public boolean searchCar( String plate ) {
		for( int i = 0; i < carCount; i++ )
			if( cars[i].getPlate().compareTo(plate) == 0 )
				return true;
		return false;
	}
	public Car removeCar( int carID ) {
		if( carID < 0 || carID > carCount-1 )
			return null;
		Car theCar = cars[carID];
		for( int i = carID; i < carCount; i++ ) 
			cars[i] = cars[i+1];
		cars[carCount] = null;
		return theCar;
	}
}
