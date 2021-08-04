//I worked on the homework assignment alone, using only course materials.


import java.util.Scanner;
import java.text.DecimalFormat;
public class CarWash1331 {

	public static void main(String[] args) {

		DecimalFormat rounding = new DecimalFormat("0.00");
		double subtotal = 0.0;
		double discount = 0.0;
		int programCanRun = 0;

		System.out.println("Welcome to Car Wash 1331!\n\nSedan/Coupe: $13.31\nTruck: $21.10\nSUV/Minivan: $35.10");

		Scanner input = new Scanner(System.in);

		System.out.print("\nSelect the type of vehicle: ");

		String car = input.next().toLowerCase();


		if (car.equals("sedan") || car.equals("coupe")) {               //if (x.equals(y))
			subtotal += 13.31;
			}
			else if (car.equals("truck")) {
				subtotal += 21.10;
			}
			else if (car.equals("suv") || car.equals("minivan")) {
				subtotal += 35.10;
			}
			
			else {
				return;
			}

		

		System.out.print("\nWould you like to add Wax for $3.00: ");

		String wax = input.next().toLowerCase();

		if (wax.equals("yes")) {
			subtotal += 3.0;
		}

		System.out.print("Would you like to add Tire Polish for $5.00: ");

		String polish = input.next().toLowerCase();

		if (polish.equals("yes")) {
			subtotal += 5.0;
		}

		System.out.print("Would you like to add an Interior Vacuum for $7.00: ");

		String vacuum = input.next().toLowerCase();

		if (vacuum.equals("yes")) {
			subtotal += 7.0;
		}



		System.out.print("\nDo you have a discount code/coupon? ");

		String coupon = input.next().toLowerCase();
		if (coupon.equals("yes")) {
			System.out.print("Please enter the discount code: ");
			input.nextLine();
			String code = input.nextLine().toLowerCase();

		
			if ((code).equals("1331 wash!")) {
				System.out.println("\nDiscount code is valid and accepted!");
				discount += 0.10;
			}
			else {
				System.out.println("\nDiscount code is invalid and not accepted!");
			}
		}



		System.out.print("\nWhat percentage would you like to tip? ");

		double tip = input.nextDouble();

		if (tip < 0.0) {
			tip = 0.18;
		}
		else {
			tip = (tip / 100.00);
		}




		double discountTotal = subtotal * discount;

		double tipMoney = subtotal * tip;

		double finalTotal = (subtotal - discountTotal + tipMoney);

		System.out.println("\nSubtotal: $" + rounding.format(subtotal));
		System.out.println("Discount: $" + rounding.format(discountTotal));
		System.out.println("Tip: $" + rounding.format(tipMoney));
		System.out.println("Total: $" + rounding.format(finalTotal));	




		



	}






}
