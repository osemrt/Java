package nyp13b;

import nyp13b.Person.Employee;

public class TestInnerClassDirectly {
	public static void main( String[] args ) {
		Employee[] staff = new Employee[3];
		Person kisi;
		kisi = new Person("Osman Pamuko�lu");
		staff[0] = kisi.new Employee( 10000 );
		kisi = new Person("Nihat Gen�");
		staff[1] = kisi.new Employee( 7500 );
		kisi = new Person("Bar�� M�stecapl�o�lu");
		staff[2] = kisi.new Employee( 6000 );
		for( Employee eleman: staff ) 
			System.out.println( eleman );
	}
}
