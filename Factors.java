package constructs;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		int number = 0;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a number:: ");
		number = scan.nextInt();

		System.out.print("The Prime factors of " +number + " are: " );
		primeFactors(number);

		scan.close();
	}

	public static void primeFactors(int n) {

		while (n % 2 == 0) {
			System.out.print(2 + " ");
			n /= 2;
		}

		for (int i = 3; i <= Math.sqrt(n); i += 2) {

			while (n % i == 0) {
				System.out.print(i + " ");
				n /= i;
			}
		}

		if (n > 2)
			System.out.print(n);
	}

}
