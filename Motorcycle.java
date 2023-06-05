package JavaQuiz;

import java.util.Random;

public class Motorcycle extends Vehicle{

	public Motorcycle(String brand, String model, int numberOfWheel, int enginePower) {
		super(brand, model, numberOfWheel, enginePower);
		
	}

	@Override
	public void setFuelType() {
		String[] fuelTypes = {"electricity","gasoline"};
		Random r = new Random();
		this.fuelType = fuelTypes[r.nextInt(2)];
	}
	
	@Override
	public String toString() {
		return "motorcycle{" + "fuelType='" + fuelType + '\'' + '}';
	}
	
	

}
