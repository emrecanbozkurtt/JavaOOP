package JavaQuiz;

import java.util.Random;

public class Car extends Vehicle {

	public Car(String brand, String model, int numberOfWheel, int enginePower) {
		super(brand, model, numberOfWheel, enginePower);
		
	}
	
	@Override
	public void setFuelype() {
		String[] fuelTypes= {"diesel", "gasoline","LPG"};
		Random r=new Random();
		this.fuelType=fuelTypes[r.nextInt(3)];
	}
	
	@Override
	public String toString() {
		
		return "car{" + "fuelType='" + fuelType + '\'' + '}';
	}
	
}
