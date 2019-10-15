package co.grandcircus;

import java.util.Scanner;

public class LabNumber3 {
	public static void main(String[] args) {

		int numIntake;
		String userName;
		String toContinue = "";

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hello! Please enter your name: ");
		
		userName = scanner.nextLine();

		System.out.println("Hello " + userName + "!");
		
		do {
		System.out.println("Hello! Please enter an integer between 1 and 100:");

		numIntake = scanner.nextInt();

		if (numIntake > 100 || numIntake <= 0) {
			System.out.println(userName + ", the integer you entered is not between 1 and 100. Please try again.");
		} else {
			if (numIntake > 60) {
				if (numIntake % 2 == 0) {
					System.out.println(numIntake + " Even.");
				} else {
					System.out.println(numIntake + " Odd and over 60.");
				}
			} else if (numIntake >= 26 && numIntake <= 60) {
				if (numIntake % 2 == 0) {
					System.out.println("Even.");
				} else {
					System.out.println("Odd.");
				}
			} else if (numIntake >= 2 && numIntake <= 25) {
				if (numIntake % 2 == 0) {
					System.out.println("Even and less than 25.");
				} else {
					System.out.println("Odd.");
				}
			} else {
				System.out.println("Odd.");
			}
		}
		
		System.out.println("Would you like to continue? (y/n)");
		
		//garbage intake line, for switching from int intake to string intake - toContinue
		scanner.nextLine();
		
		toContinue = scanner.nextLine().toLowerCase();
		
		} while (toContinue.equals("y") || toContinue.equals("yes") || toContinue.equals("yeah")
				|| toContinue.equals("yep") || toContinue.equals("yeppers"));
		
		System.out.println("Have a nice day " + userName + "!");
		
		scanner.close();
		
	}
}
