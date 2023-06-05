package JavaQuiz;

public abstract class Academicians extends Employee {

	protected int wage=8500;
	protected Vehicle vehicleObj;
	
	public Academicians(String firstName, String lastName, int age, boolean licence) {
		super(firstName, lastName, age, licence);
	}

	public Vehicle getVehicleObj() {
		return vehicleObj;
	}

	public abstract void setVehicleObj(Vehicle vehicleObj);
	
	public abstract double getSalary();

	@Override
	public String toString() {
		return super.toString() + "Academicians{" + "vehicleObj=" + vehicleObj + '}';
	}
	
	

}
