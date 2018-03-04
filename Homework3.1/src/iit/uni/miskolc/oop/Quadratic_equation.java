package iit.uni.miskolc.oop;

public class Quadratic_equation {
	public static void calc(Double a, Double b, Double c) {
		
		System.out.print("Roots: ");

		Double determinant = b * b - (4 * a * c);
		Double[] Roots = { 0.0, 0.0 };

		if (a.equals(0.0))
			System.out.println("The given equation is not quadratic");
		if (determinant < 0.0)
			System.out.println("There aren't any real roots");
		if (determinant == 0.0) {
			Roots[0] = (-b) / (2 * a);
			Roots[1] = (-b) / (2 * a);
		} else {
			Roots[0] = (-b + Math.sqrt(determinant)) / (2 * a);
			Roots[1] = (-b - Math.sqrt(determinant)) / (2 * a);
		}
		
		System.out.printf("%lf,%lf",Roots[0], Roots[1]);

	}

}
