package ooc05;

public class MainProgram05 {

	public static void main(String[] args) {
		GalleryOwner halis = 
			new GalleryOwner("Halis Toprak");
		halis.setGalleryName("Toprak Oto");
		Car bmw = new Car("34 RA 440", halis);
		Car audi = new Car("06 AC 432", halis);
		if( halis.addCar(bmw) ) {
			System.out.println("��lem ba�ar�l�");
		}
		else {
			System.out.println("��lem ba�ar�s�z");
		}
		halis.addCar(audi);
		System.out.println(halis);
		System.out.println(bmw.introduceSelf());
		if( halis.searchCar(bmw) == true ) {
			System.out.println("Arama ba�ar�l�");
		}
		else
			System.out.println("Arama ba�ar�s�z");
		if( halis.removeCar(1) == audi )
			System.out.println("Silme ba�ar�l�");
		else
			System.out.println("Silme ba�ar�s�z");
		if( halis.searchCar(audi) == false ) 
			System.out.println("Silmenin ard�ndan Arama ba�ar�l�");
		else
			System.out.println("Silmenin ard�ndan Arama ba�ar�s�z");

	}

}
