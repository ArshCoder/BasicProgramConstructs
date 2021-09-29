package constructs;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		int year;
		System.out.println("Enter an Year :: ");
		try (Scanner object = new Scanner(System.in)) {
			year = object.nextInt();
		}
		if (((year % 4 == 0)))
			System.out.println("Specified year is a leap year");
		else
			System.out.println("Specified year is not a leap year");
	}
}
