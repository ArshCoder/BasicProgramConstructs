package constructs;

import java.util.Scanner;

public class coinFlip {
	public static void main(String args[]) {
		int heads = 0;
		int tails = 0;
		System.out.println("Enter number times you want to flip coin :: ");
		try (Scanner object = new Scanner(System.in)) {
			int count = object.nextInt();

			for (int x = 0; x < count; x++) {
				if (Math.random() < 0.5)
					tails++;
				else
					heads++;
			}

			int percentage_heads = (100 * heads) / count;
			int percentage_tails = (100 * tails) / count;
			System.out.println("Percentage of heads: " + percentage_heads + " %" + " vs Percentage of tails : "
					+ percentage_tails + " %");
		}

	}
}
