//I worked on the homework assignment alone, using only course materials.


public class Icemon extends Tekemon {
	
	private boolean pet;
	private static int icemonSize;
	private int icePoints;


	//constructors (2)


	public Icemon(String name) {
		this(name, 15, 100, true, 0);

	}
	public Icemon(String name, int level, int stamina, boolean pet, int icePoints) {
		super(name, level, stamina);
		this.pet = pet;
		this.icePoints = icePoints;
		icemonSize++;
	}

	//getters and setters

	public int getIcePoints() {
		return icePoints;
	}

	public void setIcePoints(int newIcePoints) {
		icePoints = newIcePoints;
	}

	//methods

	public void duel(Tekemon t) {
		if (t instanceof Icemon) { //makes sure object belongs to "Icemon" class and also will return false if null
			System.out.println("Cannot duel an ally!");
		}
		else if ((getStamina() == 0) || (t.getStamina() ==0)) {   //stamina of either tekemon can't be zero
			System.out.println("Cannot duel!");
		}
		else {
			t.setStamina((t.getStamina() - (2 * getLevel())));    //tekemon's stamina reduced by 2 * icemon's level
			if (t.getStamina() < 0) {		//checks if tekemon is defeated
				t.setStamina(0);  //Tekemon is defeated, stamina is zero
				setIcePoints((getIcePoints() + ((int)(Math.ceil((t.getLevel() * 0.5))))));        

				levelUp();
			}
		}
	}

	public void levelUp() {
		if (getLevel() >= 20) {
			int pointsToLevel = 30;
			while (getIcePoints() > 30) {
				setLevel((getLevel() + 1));
				setIcePoints((getIcePoints() - 30));
				System.out.println("Yay, I am now level " + getLevel() + "!");
			}

		}
		else {
			int pointsToLevel = 20;
			while (getIcePoints() > 20) {
				if (getLevel() <= 20) {
					setLevel((getLevel() + 1));
					setIcePoints((getIcePoints() - 20));
					System.out.println("Yay, I am now level " + getLevel() + "!");
				}
				else
					levelUp();
			}
		
		}

	}

	public void iceWreck() {
		double upgradedIcePoints = icePoints * ((icemonSize / 10.0) + 1);
		int newestIcePoints = (int) Math.floor(upgradedIcePoints); //rounds down to a decimal that can be converted into int
		setIcePoints(newestIcePoints);
	}

	public void brainFreeze() {
		if (getIcePoints() > 5) {
			setStamina((getStamina() + (icePoints / 2))); //should this  be Tekemon.setStamina() ?
			setIcePoints((getIcePoints() - 5));
			if (getIcePoints() < 0) {
				setIcePoints(0);
			}
		}
	}


	public boolean equals(Object o) {
		if (!(o instanceof Icemon)) { //makes sure object belongs to "Icemon" class and also will return false if null
			return false;
		}
		Icemon tekkie = (Icemon) o;
			return ((tekkie.getLevel() == getLevel()) && (tekkie.getName().equals(getName())) && (tekkie.getStamina() == getStamina()) && (tekkie.pet == pet));
	}

	public String toString() {
		if (pet)
			return super.toString() + "I am a Icemon, and I have a pet.";
		else
			return super.toString() +"I am a Icemon, and I do not have a pet.";
	}
}