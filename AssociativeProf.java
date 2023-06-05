package JavaQuiz;

public class AssociativeProf extends Academicians{

	public AssociativeProf(String firstName, String lastName, int age, boolean licence) {
		super(firstName, lastName, age, licence);
		
	}

	@Override
	public void setVehicleObj(Vehicle vehicleObj) {
		if(vehicleObj instanceof Car) {
			this.vehicleObj = vehicleObj;
			System.out.println(this.getFirstName() + " araci almaya uygun");
		}
		else {
			System.out.println(this.getFirstName() + " araci almaya uygun degil");
		}
	}
	
	@Override
	public double getSalary() {
		
		return wage*2;
	}
	
	@Override
	public String toString() {
		
		return super.toString()+"associativeProf{" + "wage=" + getSalary() + '}';
	}

}
