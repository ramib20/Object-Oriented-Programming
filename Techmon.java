//I worked on the homework assignment alone, using only course materials

public class Techmon {

	private String name;
	private int level;
	private int happiness;
	public static int techmonPopulation = 0;

	
	//constructors (3)
	public Techmon() {
		this("Buzz", 100, 252);
	}
	public Techmon(String name, int level) {
		this(name, level, 30);
	}
	public Techmon(String name, int level, int happiness) {
		this.name = name;
		if (level < 0) {
			this.level = 0;
		}
		else if (level > 100) {
			this.level = 100;
		}
		else {
		this.level = level;	
		}

		if (happiness < 0) {
			this.happiness = 0;
		}
		else if (happiness > 252) {
			this.happiness = 252;
		}
		else {
		this.happiness = happiness;	
		}
		techmonPopulation++;
	}


	//getters

	public String getName() {
		return this.name;
	}
	public int getHappiness() {
		return happiness;
	}

	public int getLevel() {
		return level;
	}

	//setters

	public void setHappiness(int newHappiness) {
		this.happiness = happiness;
	}

	public void setLevel(int newLevel) {
		this.level = level;
	}

	public void eatTechSnax() {
		double doubleHappiness = (double)happiness * 1.25;
		happiness = (int) Math.round(doubleHappiness);
		System.out.println("Yum Blue Donkey");
		if (happiness > 252) {
			happiness = 252;
		}
	}

	public void cry() {
		if (happiness <= 50) {
			happiness = happiness / 2;
		}
		else {
			double doubleHappiness = (double)happiness * 0.75;
			happiness = (int) Math.round(doubleHappiness);
		}
	}


	public static void assemble() {
		if (techmonPopulation > 5) 
			System.out.println("Stampede!!");
		else
			System.out.println("These " + techmonPopulation + " are really cute!");
	}



	public String toString() {
		return "My name is " + name + ", my level is " + level + ", and my happiness is " + happiness +"!";
	}

}