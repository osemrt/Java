package ooc01d;
import java.util.*;
public class Car {
   private String plate;
   public String getPlate() {
      return plate;
   }
   public void setPlate(String plate) {
      this.plate = plate;
   }
   public Car( String plateNr ) {
      plate = plateNr;
   }
   public void introduceSelf( ) {
      System.out.println( "My plate: " + getPlate() );
   }
   public static void main( String[] args ) {
      Car aCar;
      Scanner input = new Scanner( System.in );
      System.out.print("Enter a license plate: ");
      String plateNr =  input.nextLine( );
      aCar = new Car( plateNr );
      aCar.introduceSelf( );
      input.close();
   }
}
