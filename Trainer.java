//I worked on the homework assignment alone, using only course materials

public class Trainer extends Techmon {
	
	private String name;
	private int badges;
	private String techmonTeam[];  //string not techmon


	//constructors

	public Trainer() {
		this("George P. Burdell", 0, new String[6]); //new String[6]
	}
	public Trainer(String name) {
		this(name, 0, new String[6]); //same as above comment

	}
	public Trainer(String name, int badges, String[] techmonTeam) {    //String[] techmonTeam
		this.name = name;
		if ((badges < 0)||(badges > 8)) {
			this.badges = 0;
		}
		else {
		this.badges = badges;	
		}
		this.techmonTeam = techmonTeam;
	}




	//methods

	public String[] getTeam() {  //String[] getTeam()
		return techmonTeam;
	}




	
	public void addTechmon(Techmon techie) {
		int count = 0;
		for (int i = 0; i < this.techmonTeam.length; i++) {
			if (this.techmonTeam[i] == null) {
				this.techmonTeam[i] = techie.getName();
				count++;
				break;
			} else
				continue;
		}
		if (count == 0) {
			System.out.println("Cannot add " + techie + ", " + name + "'s team is full!");
		}
	}



	public int getTeamSize() {
		int techiecounter = 0;
		for (int i = 0; i < this.techmonTeam.length; i++) {
			if (this.techmonTeam[i] != null) {
				techiecounter++;
			}
		}
	return techiecounter;
	}

	String s = "";
	public void introduceTeam() {

		
		for (int i = 0; i < techmonTeam.length; i++){
			if (techmonTeam.length == 1) {
				System.out.println(s.concat(techmonTeam[0]));
				break;
			}
	        s = s.concat(techmonTeam[i]);
	        //System.out.print(techmonTeam[i]);
	        if (!(i == techmonTeam.length -1)) {
	        	s = s.concat(", ");
	       // }
			}
		}
		System.out.println(s);
	}
	int nulls = 0;
	public void playWithTechmon(Techmon techie) {
		if (techie == null) {
			nulls++;
		techie.setHappiness((int) (techie.getHappiness() + (techie.getHappiness() * .5)));
		if ((this.badges * 10) > techie.getLevel() + 1);
			techie.setLevel((techie.getLevel() + 1));
		}
	}

	// public void playWithTechmon(String techmonName) {
	// 	for (int i = 0; i < techmonTeam.length; i++) {
	// 		if (techmonTeam[i] != null) {
	// 			if (techmonName.equals(techmonTeam[i])) {
	// 				techmonTeam[i].setHappiness((int)(techmonName.getHappiness() + (techmonName.getHappiness() * .5)));
	// 				if ((this.badges * 10) > techmonTeam[i].getLevel()) {
	// 					techmonTeam[i].setLevel(techmonTeam[i].getLevel() + 1);
	// 				}
	// 			}


	// 		}
	// 	}
	// }

	public String toString() {
		
		if (badges == 8)
			return "My name is " + name + ", and I can now challenge the Techmon League with my team.";
		else 
			return "My name is " + name + ", and I still have to beat " + (8 - badges) + " gyms";
	}





}	

