public class NumericalIntegratorUsingTrapRule {
	public static double func(double x) {
		double f_x = Math.pow(x, 2) ;
		return f_x;
	}

	public static void main(String[] args) {
		// This is a simple riemann sum calculator using the trapezoidal rule.
		// Alter lowerBound, upperBound, numberOfRectangles, and func 

		double x = 2;
		double lowerBound = -2;
		double upperBound = 4;
		int numberOfRectangles = 4;
		// the number of rectangles is n+1 according to the definition of a riemann sum.
		double dx = (upperBound - lowerBound) / (numberOfRectangles - 1);
		double sum = 0;
		for (int i = 0; i < numberOfRectangles - 1; i++) {
			x = lowerBound + i * dx;
			double f_x = func(x);
			double f_x2 = func(x + dx);
			double area = (f_x * dx) + (f_x2 * dx);
			sum += area / 2;
		}
		System.out.println(sum);
	}
}
