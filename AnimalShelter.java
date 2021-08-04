//I worked on the homework assignment alone, using only course materials.

import java.util.Scanner;
public class AnimalShelter {

	public static void main(String[] args) {

        String[][] shelter = {{"x", "x", "Stefanie", "x", "Tomas"}, 
        					  {"Leedan", "x", "x", "x", "x"},
        					  {"x", "x", "x", "Andhru", "x"}, 
        					  {"x", "Lio", "Rhitvic", "x", "x"}, 
        					  {"Nepun", "x", "x", "Avenash", "Dustan"}};
 
		int dogAvailability = 0;            //Counts how many dogs remain
		for (int i = 0; i<5; i++){
			for (int j = 0; j<5; j++){
				if (shelter[i][j] != "x"){
					dogAvailability += 1;
				}
			}

		}

		System.out.println("Welcome to the Animal Shelter!");

		Scanner input = new Scanner(System.in);

		while (dogAvailability > 0) {
		
			System.out.println("\nWould you like to adopt a pet? [Y]es, [N]o, or [E]xit");

			String answer = input.next();

			if (answer.equals("N")) {
				System.out.println("Next person in line!");
			}
			else if (answer.equals("E")) {
				System.out.println("We hope you come again!");
				return;
				
			}
			else if (answer.equals("Y")) { 
				System.out.println();   
				for (int i = 0; i<5; i++){           //Prints shelter array
	    			System.out.print("|");
	    			for (int j = 0; j<5; j++){
	        			System.out.print(shelter[i][j] + "|");
	    			}
	     		System.out.println();
				}

					while (dogAvailability > 0) {
						System.out.println("\nWhich pet are you interested in adopting?");
						String row = input.next();
						String col = input.next();
						int dogRow = Integer.parseInt(row);
						int dogCol = Integer.parseInt(col);
						

						if (dogRow > 4 || dogCol > 4 ) {
							System.out.println("\nLocation does not exist.");
							continue;
						}
						else if (shelter[dogRow][dogCol].equals("x")) {
							System.out.println("\nThere is no pet in this location.");
							continue;
						}
						else {
							System.out.println("\n" + shelter[dogRow][dogCol] + " has been successfully adopted!");
							shelter[dogRow][dogCol] = "x"; //Switched adopted dog to x
							dogAvailability -= 1;
							System.out.println();
							for (int i = 0; i<5; i++){     // Prints updated array
		    					System.out.print("|");
		    					for (int j = 0; j<5; j++){
		        					System.out.print(shelter[i][j] + "|");
		    					}
		     					System.out.println();
							}
							break;
						}	
				}				
				}								
			}		
		}

	}