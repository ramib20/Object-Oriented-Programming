
public class Gym extends Trainer {
	
	public static void main(String[] args) {


		Trainer trainer1 = new Trainer();
		Trainer trainer2 = new Trainer("Bobby Dodd");
		Techmon tech1 = new Techmon("Cmon", 21, 10);
		Trainer trainer3 = new Trainer("Ash", 8, new String[]{"Cmon"}); //new String[]{"Cmon"}
		Techmon tech2 = new Techmon("Pythmon", 13, 1);
		Techmon tech3 = new Techmon("Rubymon", 100);
		Techmon tech4 = new Techmon("Rustmon", 100);
		Trainer trainer4 = new Trainer("Gary", 8, new String[]{"Pythmon", "Rubymon", "Rustmon"});
		Techmon tech5 = new Techmon(); //generic one
		Techmon tech6 = new Techmon("DataStruct", 13, 32);
		Techmon tech7 = new Techmon("Assembly", 21);
		Techmon tech8 = new Techmon("Javamon", 13, 31);
		System.out.println(trainer1);
		System.out.println(trainer2);
		System.out.println(trainer3);
		System.out.println(trainer4);
		System.out.println(techmonPopulation);



		//trainer3.introduceTeam();
		//System.out.println(trainer2.getTeamSize());

		
		

		
			/*
		Techmon t1 = new Techmon();
		System.out.println(t1);
		
		t1.eatTechSnax();
		t1.cry();
		t1.assemble();
		System.out.println(t1);
		

*/

	}
}