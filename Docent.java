package JavaQuiz;

public class Docent extends Academicians{

	public Docent(String firstName, String lastName, int age, boolean licence) {
		super(firstName, lastName, age, licence);
		
	}

	@Override
	public void setVehicleObj(Vehicle vehicleObj) {
		if(vehicleObj instanceof Bike) {
			this.vehicleObj = vehicleObj;
			System.out.println(this.getFirstName() + " araci almaya uygun");
		}
		else {
			System.out.println(this.getFirstName() + " araci almaya uygun degil");
		}
	}
	
	@Override
	public double getSalary() {
		
		return wage*3;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + "docent{" + "wage=" + getSalary() + '}';
	}
	
}
