package nyp09b;

public class USIS {

	public static void main(String[] args) {
		Course oop = new Course("0112562", "Obj. Or. Prog.", 30);
		Student yasar = new Student("09011034","Ya�ar Nuri �zt�rk");
		if( !oop.addStudent(yasar) )
			System.out.println("Problem #1");
		if( oop.addStudent(yasar) )
			System.out.println("Problem #2");
		Student yunus = new Student("09011045","Yunus Emre Sel�uk");
		oop.addStudent(yunus);
		Student fatih = new Student("09011046","Fatih ��tlak");
		oop.addStudent(fatih);
		Student cemal = new Student("09011047","Cemalnur Sargut");
		if( !oop.addStudent(cemal) )
			System.out.println("Problem #3");
		if( oop.findStudent("09011046") != fatih )
			System.out.println("Problem #4");
		System.out.println("End of test");
		Student std = new Student("011011007","james Bond");
		oop.addStudent(std);
		Student nur = new Student("011011007","Hayat Nur Artt�ran");
		oop.addStudent(nur); //bu bir sorun! 
		if(oop.findStudent("011011007")==nur)
			System.out.println("Problem #5");
		
		oop.showClassList();
	}

}
