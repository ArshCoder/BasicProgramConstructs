package constructs;

import java.util.Scanner;

public class QuadraticEquation {
	public static void main(String args[]) {
		double root2 = 0, root1 = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of a ::");
		double a = scan.nextDouble();

		System.out.println("Enter the value of b ::");
		double b = scan.nextDouble();

		System.out.println("Enter the value of c ::");
		double c = scan.nextDouble();
		scan.close();

		double determinant = (b * b) - (4 * a * c);
		double sqrt = Math.sqrt(determinant);

		if (determinant > 0) {
			root1 = (-b + sqrt) / (2 * a);
			root2 = (-b - sqrt) / (2 * a);
			System.out.println("Roots are :: " + root1 + " and " + root2);
		} else if (determinant == 0) {
			System.out.println("Root is :: " + (-b + sqrt) / (2 * a));
		}
	}
}
