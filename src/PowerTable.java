import java.util.Scanner;

public class PowerTable {

	public static void main(String[] args) {
		// ask user for int
		// print table headers
		// loop that increments from 1 to userEntry
		// within loop create table that print num, numSquared, numCubed in a table
		// ask user if they continue (loop again)

		Scanner scnr = new Scanner(System.in);
		int userEntry;
		// int num;
		int numSquared;
		int numCubed;
		boolean cont = true;
		String yesNo;

		System.out.println("Learn your squares and cubes with the Powers Table by Bolanle Aduroja");

		// TODO: Add do while loop
		do {
			System.out.print("\n" + "Enter an integer: ");

			// user input
			userEntry = scnr.nextInt();

			// print table headers
			System.out.printf("Number");
			System.out.printf("%15s", "Squared");
			System.out.printf("%15s", "Cubed" + "\n");
			System.out.print("=======");
			System.out.printf("%14s", "=======");
			System.out.printf("%15s", "=======" + "\n");

			// loop that starts at 1 then increments to userEntry. Does math every
			// iteration.
			for (int i = 1; i <= userEntry; i++) {
				numSquared = i * i;
				numCubed = i * i * i;
				System.out.printf("%7d", i);
				System.out.printf("%7s", " ");
				System.out.printf("%7d", numSquared);
				System.out.printf("%4s", " ");
				System.out.printf("%10d", numCubed);
				System.out.println("");
			}

			// ask user to continue
			do {
				System.out.print("\n" + "Continue? (y/n): ");
				yesNo = scnr.next().trim().toLowerCase();

			} while (!yesNo.equals("n") && !yesNo.equals("y"));

			if (yesNo.equals("n")) {
				cont = false;
				System.out.println("\n" + "Thank you for using the Powers Table.");

			}

		} while (cont == true);
		scnr.close();
	}
}
