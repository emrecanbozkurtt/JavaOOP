package JavaQuiz;

public class Test {

	public static void main(String[] args) {
		   Vehicle car = new Car("audi","a5",4,170);

	       Academicians emrecan = new AssociativeProf("emrecan","bozkurt",21,true);

	       emrecan.setVehicleObj(car);

	       System.out.println(emrecan.toString());





	        Vehicle bike = new Bike("honda","1000rr",2,200);

	        Academicians furkan = new Docent("furkan","han",20,true);

	        furkan.setVehicleObj(bike);

	        System.out.println(furkan.toString());





	        Vehicle scooter = new Scooter("audi","a5",4,170);

	        Academicians ozgur = new ResearchAssistant("ozgur","altuner",22,true);

	        ozgur.setVehicleObj(car);

	        System.out.println(ozgur.toString());


	}

}
