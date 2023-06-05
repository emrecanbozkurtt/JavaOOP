package JavaQuiz;

import java.util.Random;

public class Bike extends Vehicle {

	public Bike(String brand, String model, int numberOfWheel, int enginePower) {
		super(brand, model, numberOfWheel, enginePower);
		
	}
	
	public void setFuelype() {
		String[] fuelTypes= {"electricity", "gasoline"};
		Random r=new Random();
		this.fuelType=fuelTypes[r.nextInt(2)];
	}
	
	@Override
	public String toString() {
		
		return "bike{'" + "fuelType=" + fuelType + '\'' + '}' ;
	}

	

	
	
}
