import java.util.Scanner;
import java.util.Random;
public class RandR6Op {

	public static void main(String[] args) {

	int keepRunning = 1;
	Random r = new Random();
	Scanner input = new Scanner(System.in);

	String[] attackers = {"Zero", "Ace", "Iana", "Kali", "Amaru", "Nokk", "Gridlock", "Nomad", "Maverick", "Lion", 
	                     "Finka", "Dokkaebi", "Zofia", "Ying", "Jackal", "Hibana", "Capitao", "Blackbeard", "Buck",
	                     "Sledge", "Thatcher", "Ash", "Thermite", "Montagne", "Twitch", "Blitz", "IQ", "Fuze", "Glaz"};

	String[] defenders = {"Aruni", "Melusi", "Oryx", "Wamai", "Goyo", "Warden", "Mozzie", "Kaid", "Clash", "Maestro",
	                      "Alibi", "Vigil", "Ela", "Lesion", "Mira", "Echo", "Caveira", "Valkyrie", "Frost", "Mute",
	                      "Smoke", "Castle", "Pulse", "Doc", "Rook", "Jager", "Bandit", "Tachanka", "Kapkan"};

	


	System.out.println("Hello! This is a random operator generator for Rainbow Six Siege.\n");
	
	while (keepRunning > 0) {

		System.out.print("Are you attacking or defending? Enter [a] or [d]:  ");

		String roundType = input.next().toLowerCase();

		if (roundType.equals("a")) {
			int randomNum = r.nextInt(attackers.length);
			System.out.println("\n" + attackers[randomNum] + "\n");
			while (keepRunning > 0) {
				System.out.print("Would you you like to pick another randomized operator[r], go back to the main menu[m], or end the program?[e] ");
				String answer = input.next();
				if (answer.equals("r")) {
					randomNum = r.nextInt(attackers.length);
					System.out.println("\n" + attackers[randomNum] + "\n");
					continue;
				}
				else if (answer.equals("m")) {
					break;
				}
				else if (answer.equals("e")) {
					System.out.println("\nSorry to see you go! Come back soon! The road to diamond continues!");
					keepRunning -= 1;
			}
			}
		}

		else if (roundType.equals("d")) {
			int randomNum = r.nextInt(defenders.length);
			System.out.println("\n" + defenders[randomNum] + "\n");
			while (keepRunning > 0) {
				System.out.print("Would you you like to pick another randomized operator[r], go back to the main menu[m], or end the program?[e] ");
				String answer = input.next();
				if (answer.equals("r")) {
					randomNum = r.nextInt(defenders.length);
					System.out.println("\n" + defenders[randomNum] + "\n");
					continue;
				}
				else if (answer.equals("m")) {
					break;
				}
				else if (answer.equals("e")) {
					System.out.println("\nSorry to see you go! Come back soon! The road to diamond continues!");
					keepRunning -= 1;
			}
			}
		}

		else {
			System.out.println("\nInvalid input. Please try again.");
			continue;
		}

	}



	}
}