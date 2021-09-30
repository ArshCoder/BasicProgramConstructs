package constructs;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		int x, y, z;
		int Largest_Number;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a  first number :: ");
		x = scan.nextInt();

		System.out.println("Enter a  secound number :: ");
		y = scan.nextInt();

		System.out.println("Enter a third number :: ");
		z = scan.nextInt();
		scan.close();

		Largest_Number = (x > y) ? (x > z ? x : z) : (y > z ? y : z);
		System.out.println("Largest number amoung above :: " + Largest_Number);

	}

}
