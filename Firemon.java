//I worked on the homework assignment alone, using only course materials.

import java.util.Random;
public class Firemon extends Tekemon {
	
	private int knowledgeLevel;
	private int firePoints;
	Random rand = new Random();

	//constructors 

	public Firemon(String name) {
		this(name, 30, 20, 30, 0);

	}
	public Firemon(String name, int level, int stamina, int knowledgeLevel, int firePoints) {
		super(name, level, stamina);
		this.knowledgeLevel = knowledgeLevel;
		this.firePoints = firePoints;
	}



	//getters and setters

	public int getKnowledgeLevel() {
		return knowledgeLevel;
	}
	public int getFirePoints() {
		return firePoints;
	}
	public void setKnowledgeLevel(int newKnowledgeLevel) {
		knowledgeLevel = newKnowledgeLevel;
	}
	public void setFirePoints(int newFirePoints) {
		firePoints = newFirePoints;
	}



	//methods

	public void duel(Tekemon t) {
		if (t instanceof Firemon) { //makes sure object belongs to "Icemon" class and also will return false if null
			System.out.println("Cannot duel an ally!");
		}
		if ((getStamina() == 0) || (t.getStamina() ==0)) {   //stamina of either tekemon can't be zero
			return;
		}
		else {
			if (getKnowledgeLevel() > 13) {
				int n = rand.nextInt(11);
				if ((n == 1) || (n == 3) || (n == 5) || (n == 7) || (n == 9)) {
					fireFight();
				}
			}

		}

	
	}

	public void levelUp() {
		if (getLevel() >= 30) {
			int pointsToLevel = 40;
			while (getFirePoints() > 30) {
				setLevel((getLevel() + 1));
				setFirePoints((getFirePoints() - 30));
				System.out.println("Yay, I am now level " + getLevel() +"!");
			}

		}
		else {
			int pointsToLevel = 20;
			while (getFirePoints() > 20) {
				if (getLevel() <= 20) {
					setLevel((getLevel() + 1));
					setFirePoints((getFirePoints() - 20));
					System.out.println("Yay, I am now level " + getLevel() + "!");
				}
				else
					levelUp();
			}
		
		}

	}

	public void fireFight() {

		if (getStamina() > 25) {
			if (getKnowledgeLevel() >= 30) {
				setFirePoints((getFirePoints() + 20));
			}
			else {
				setFirePoints((getFirePoints() + 10));
			}
			System.out.println("We won the fight, yay!");
		}

	}

	public boolean equals(Object o) {
		if (!(o instanceof Firemon)) { //makes sure object belongs to "Icemon" class and also will return false if null
			return false;
		}
		Firemon tekkie = (Firemon) o;
			return ((tekkie.getLevel() == getLevel()) && (tekkie.getName().equals(getName())) && (tekkie.getStamina() == getStamina()) && (tekkie.getKnowledgeLevel() == getKnowledgeLevel()));
	}

	public String toString() {
		
		return super.toString() + "I am a Firemon, and I have " + getKnowledgeLevel() + " knowledge.";
	}














}