package ooc02;

public class MainProgram01 {

	public static void main(String[] args) {
		Person oktay;
		oktay = new Person( "Oktay Sinanoðlu" );
		Car rover = new Car( "34 OS 1934" );
		oktay.setCar( rover );
		System.out.println( oktay.introduceSelf() );
		Person serkan = new Person( "Serkan Anýlýr" );
		System.out.println( serkan.introduceSelf() );
	}

}
