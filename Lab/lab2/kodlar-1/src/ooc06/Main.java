package ooc06;

public class Main {

	public static void main(String[] args) {
		Child ahmet = new Child("Ahmet K���k",5); //5 ayl�k
		Toy lego = new Toy("123456","Lego Star Wars",4); //4 ya�
		Clothing pinny = new Clothing("86978945","mama �nl���",0,24); //0-24 ay
		if( lego.isSuitable(ahmet) )
			System.out.println("Deneme 1 hatal�");
		else
			System.out.println("Deneme 1 tamam");
		if( pinny.isSuitable(ahmet) )
			System.out.println("Deneme 2 tamam");
		else
			System.out.println("Deneme 2 hatal�");
	}

}
