package JavaQuiz;

public class Scooter extends Vehicle{

	public Scooter(String brand, String model, int numberOfWheel, int enginePower) {
		super(brand, model, numberOfWheel, enginePower);
		
	}
	
	@Override
	public void setFuelType() {
		this.fuelType = "electricity";
	}
	
	@Override
	public String toString() {
		return "scooter{" + "fuelType='" + fuelType + '\'' + '}';
	} 

}
