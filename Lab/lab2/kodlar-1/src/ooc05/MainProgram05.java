package ooc05;

public class MainProgram05 {

	public static void main(String[] args) {
		GalleryOwner halis = 
			new GalleryOwner("Halis Toprak");
		halis.setGalleryName("Toprak Oto");
		Car bmw = new Car("34 RA 440", halis);
		Car audi = new Car("06 AC 432", halis);
		if( halis.addCar(bmw) ) {
			System.out.println("Ýþlem baþarýlý");
		}
		else {
			System.out.println("Ýþlem baþarýsýz");
		}
		halis.addCar(audi);
		System.out.println(halis);
		System.out.println(bmw.introduceSelf());
		if( halis.searchCar(bmw) == true ) {
			System.out.println("Arama baþarýlý");
		}
		else
			System.out.println("Arama baþarýsýz");
		if( halis.removeCar(1) == audi )
			System.out.println("Silme baþarýlý");
		else
			System.out.println("Silme baþarýsýz");
		if( halis.searchCar(audi) == false ) 
			System.out.println("Silmenin ardýndan Arama baþarýlý");
		else
			System.out.println("Silmenin ardýndan Arama baþarýsýz");

	}

}
