package nyp01c;

public class StringOps02 {
	   public static void main( String args[] ) {
			String strA = "�stanbul", strB = "Y�ld�z";
			System.out.println(strA.contains(strB));
			strB = "tan";
			System.out.println(strA.contains(strB));
			strB.toUpperCase();
			System.out.println(strB);
			System.out.println(strA.contains(strB));
			strB = strB.toUpperCase();
			System.out.println(strB);
			System.out.println(strA.contains(strB));
		   }
}
