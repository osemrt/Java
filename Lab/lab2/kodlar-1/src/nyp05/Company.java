package nyp05;

public class Company {

	public static void main(String[] args) {
		Employee[] staff = new Employee[3];
		Manager boss = new Manager( "Cemalnur Sargut", 8000 );
		boss.setBonus( 2500 );
		staff[0] = boss;
		//staff[0] = new Manager( "Cemal nur Sargut", 8000, 2500 );
		staff[1] = new Employee( "Ya�ar Nuri �zt�rk", 7500 );
		staff[2] = new Employee( "Fatih ��tlak", 7000 );
		for( Employee author : staff )
			//System.out.println( author.getName() + " " + author.getSalary( ) );
			System.out.println(author);
	}

}
