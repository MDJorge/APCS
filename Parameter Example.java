import java.util.*;

public class Integrate {

	public static void main(String[] args) {

		int iteration;
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		double p = 0.0;
		int lowx, highx;

		System.out.println("Find the area of a curve\n");

		try (Scanner scanner = new Scanner(System.in)) {
			a = promptForDouble(scanner, "What is the value of a? ");
			b = promptForDouble(scanner, "What is the value of b? ");
			c = promptForDouble(scanner, "What is the value of c? ");
			p = promptForDouble(scanner, "What is the value of p? ");
			lowx = promptForInt(scanner, "What is the low limit of x?");
			highx = promptForInt(scanner, "What is the high limit of x? ");
			iteration = promptForInt(scanner, "What is the number of iterations? ");
		}
		
		double areaSum = getArea(iteration, lowx, highx, a, b, c, p);
		
		System.out.println(areaSum);

	}
	
	private static double promptForDouble(Scanner scanner, String question) {
		System.out.print(question);
		double var = scanner.nextDouble();
		System.out.println();
		return var;
	}
	
	private static int promptForInt(Scanner scanner, String question) {
		System.out.print(question);
		int var = scanner.nextInt();
		System.out.println();
		return var;
	}
	
	private static double getArea(int iteration, int lowx, int highx, double a, double b, double c, double p) {
		double range = highx - lowx;
		double base = range / iteration;
		double z = lowx;
		double areaSum = 0.0;
		for (int i = lowx; i <= highx; i += base) {
			double side = (a * Math.pow(z,p)) + (z * b) + c;
			z = i + base;
			double rectArea = side * base;
			areaSum = areaSum + rectArea;
		}
		return areaSum;
	}

}