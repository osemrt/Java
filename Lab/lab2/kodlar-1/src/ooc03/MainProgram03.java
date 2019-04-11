package ooc03;

public class MainProgram03 {

	public static void main(String[] args) {
		/*
		Person oktay = new Person("Oktay Sinanoðlu");
		Car rover = new Car("06 OS 1934");
		oktay.setCar(rover);
		rover.setOwner(oktay);
		System.out.println( oktay.introduceSelf() );
		System.out.println( rover.introduceSelf() );

		Person serkan = new Person("Serkan Anýlýr");
		Car honda = new Car("34 JAXA 73",serkan);
		serkan.setCar(honda);
		System.out.println( serkan.introduceSelf() );
		System.out.println( honda.introduceSelf() );
		*/
		Person oktay = new Person("Oktay Sinanoðlu");
		Car rover = new Car("06 OS 1934");
		oktay.setCar(rover);
		Person serkan = new Person("Serkan Anýlýr");
		rover.setOwner(serkan);
		serkan.setCar(rover);
		System.out.println( oktay.introduceSelf() );
		System.out.println( serkan );
		System.out.println( rover );
	}

}
