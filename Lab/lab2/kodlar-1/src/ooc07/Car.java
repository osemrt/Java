package ooc07;

public class Car implements CommercialVehicle, PersonalVehicle {
	private int modelYear;
	private double engineVolume;

	public Car(int modelYear, double engineVolume) {
		this.modelYear = modelYear;
		this.engineVolume = engineVolume;
	}
	public double calculateTax( double baseTax ) {
		return baseTax * engineVolume;
	}
	public double calculateAmortizedTax( double baseTax, int currentYear ) {
		//Tax can be reduced %10 for each year as amortization
		int age = currentYear - modelYear;
		if( age < 10 )
			return baseTax * engineVolume * (1-age*0.10);
		return baseTax * engineVolume * 0.10;
	}
	public int getModelYear() { return modelYear; }
	public double getEngineVolume() { return engineVolume; }
}
