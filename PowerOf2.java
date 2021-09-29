package constructs;

public class PowerOf2 {

	public static void main(String[] args) {
		double x = 2;
		double y = 1;
		for (y = 1; y < 31; y++)

			System.out.println("2^" + y + " = " + Math.pow(x, y));

	}
}
