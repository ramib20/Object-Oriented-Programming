//I worked on the homework assignment alone, using only course materials.

public abstract class Tekemon {
	private String name;
	private int level;
	private int stamina;


	//constructor

	public Tekemon(String name, int level, int stamina) {    
		this.name = name;
		this.level = level;
		if (stamina < 0) {
			this.stamina = 0;
		}
		else {
		this.stamina = stamina;
		}
	}

	//getters and setters

	public String getName() {
		return name;
	}
	public int getLevel() {
		return level;
	}

	public int getStamina() {
		return stamina;
	}

	public void setName(String newName) {
		name = newName;
	}
	public void setLevel(int newLevel) {
		level = newLevel;
	}
	public void setStamina(int newStamina) {
		stamina = newStamina;
	}


	//methods

	public abstract void duel(Tekemon t);
	public abstract void levelUp();

	public void potion() {
		stamina += 15;
	}

	public boolean equals(Object o) {
		if (!(o instanceof Tekemon)) { //makes sure object belongs to "Tekemon" class and also will return false if null
			return false;
		}
		Tekemon tekkie = (Tekemon) o;
			return ((tekkie.level == level) && (tekkie.name.equals(name)) && (tekkie.stamina == stamina));
	}

	public String toString() {
		return "My name is " + name + ", and I am a Tekemon. My level is " + level + " and my current stamina is " + stamina + ".";
	}



}