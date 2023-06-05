package JavaQuiz;

public class Employee {
	private String firstName;
	private String lastName;
	private int age;
	private boolean licence;
	
	public Employee(String firstName, String lastName, int age, boolean licence) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.licence = licence;	
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isLicence() {
		return licence;
	}

	public void setLicence(boolean licence) {
		this.licence = licence;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", licence=" + licence
				+ "]";
	}
}
