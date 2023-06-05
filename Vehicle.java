package JavaQuiz;

public abstract class Vehicle {
	private String brand, model;
	private int numberOfWheel;
	private int enginePower;
	protected String fuelType;
	
	
	public Vehicle(String brand, String model, int numberOfWheel, int enginePower) {
		super();
		setBrand(brand);
		setModel(model);
		setNumberOfWheel(numberOfWheel);
		setEnginePower(enginePower);
		
	}

	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getNumberOfWheel() {
		return numberOfWheel;
	}
	
	public void setNumberOfWheel(int numberOfWheel) {
		this.numberOfWheel = numberOfWheel;
	}
	
	public int getEnginePower() {
		return enginePower;
	}
	
	public void setEnginePower(int enginePower) {
		this.enginePower = enginePower;
	}
	
	public abstract void setFuelType();
	
	
	@Override
	public String toString() {
	
		return "Brand: " + model + "NumberOfWheel: " + numberOfWheel + "Engine Power: " + enginePower;
	}


}
