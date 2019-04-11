package ooc07;

public class Bus implements CommercialVehicle {
	private int modelYear;
	private double tonnage;

	public Bus(int modelYear, double tonnage) {
		this.modelYear = modelYear;
		this.tonnage = tonnage;
	}
	public double calculateAmortizedTax( double baseTax, int currentYear ) {
		double ratioT, ratioA;
		if( tonnage < 1.0 )
			ratioT = 1.0;
		else if( tonnage < 5.0 )
			ratioT = 1.2;
		else if( tonnage < 10.0 )
			ratioT = 1.4;
		else
			ratioT = 1.6;
		ratioA = (currentYear - modelYear) * 0.05;
		if( ratioA > 2.0 )
			ratioA = 2.0;
		return baseTax * ratioT * ratioA;
	}
	public int getModelYear() { return modelYear; }
	public double getEngineVolume() { return tonnage; }
}
