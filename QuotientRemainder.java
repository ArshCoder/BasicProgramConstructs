package constructs;

import java.util.Scanner;

public class QuotientRemainder {

	public static void main(String[] args) {

		int dividend = 25, divisor = 4;

		int quotient = dividend / divisor;
		int remainder = dividend % divisor;

		System.out.println("Quotient = " + quotient);
		System.out.println("Remainder = " + remainder);
	}
	public static void findFactor(int n) {
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				System.out.print(i + "\t");
		}
	}

	public static void main1(String[] args) {
		int number = 0;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a number:: ");
		number = scan.nextInt();

		System.out.print("The factors are:: ");
		findFactor(number);

		scan.close();

	}
}
