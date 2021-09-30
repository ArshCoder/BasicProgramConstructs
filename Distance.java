package constructs;

import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number :: ");
		int x = scan.nextInt();

		System.out.println("Enter a number :: ");
		int y = scan.nextInt();

		scan.close();

		double distance = Math.sqrt(Math.pow(x, x) + Math.pow(y, y));

		System.out.println("Euclidean Distance from (0, 0) to (" + x + ", " + y + ") is " + distance);

	}

}
