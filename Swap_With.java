package constructs;

import java.util.Scanner;

public class Swap_With {
	public static void main(String[] args) {
		int x, y, t;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of X and Y");
		x = scan.nextInt();
		y = scan.nextInt();
		System.out.println("before swapping numbers: " + x + "  " + y);
	
		t = x;
		x = y;
		y = t;
		System.out.println("After swapping: " + x + "   " + y);
		System.out.println();
	}
}
