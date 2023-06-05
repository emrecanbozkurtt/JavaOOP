package JavaQuiz;

public class ResearchAssistant extends Academicians {

	public ResearchAssistant(String firstName, String lastName, int age, boolean licence) {
		super(firstName, lastName, age, licence);
		
	}
	
	@Override
	public void setVehicleObj(Vehicle vehicleObj) {
		if(vehicleObj instanceof Scooter) {
			this.vehicleObj = vehicleObj;
			System.out.println(this.getFirstName() + " araci almaya uygun");
		}
		else {
			System.out.println(this.getFirstName() + " araci almaya uygun degil");
		}
	}

	@Override
	public double getSalary() {
		
		return wage*1.5;
	}
	
	@Override
	public String toString() {
		
		return super.toString()+"ResearchAssistand{" + "wage=" + getSalary() + '}';
	}

}
