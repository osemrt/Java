package nyp09a;

public class USIS {

	public static void main(String[] args) {
		Course oop = new Course("0112562", "Obj. Or. Prog.", 3);
		Student yasar = new Student("09011034","Ya�ar Nuri �zt�rk");
		if( !oop.addStudent(yasar) )
			System.out.println("Problem #1");
		boolean result;
		result = oop.addStudent(yasar);
		if( result == true )
			System.out.println("Problem #2");
		Student yunus = new Student("09011045","Yunus Emre Sel�uk");
		oop.addStudent(yunus);
		Student fatih = new Student("09011046","Fatih ��tlak");
		oop.addStudent(fatih);
		Student cemalnur = new Student("09011047","Cemalnur Sargut");
		if( oop.addStudent(cemalnur) )
			System.out.println("Problem #3");
		if( oop.findStudent("09011046") != fatih )
			System.out.println("Problem #4");
		if( oop.findStudent(fatih.getNumber()) == null )
			System.out.println("Problem #5");
		System.out.println("End of test\n");
		oop.showClassList();
		
		
	}

}
