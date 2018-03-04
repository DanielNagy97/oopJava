package iit.uni.miskolc.oop;

import java.util.Scanner;

public class Input1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String equation;
		Double a;
		Double b;
		Double c;

		while (true) {
			equation = scanner.nextLine();
			a = Double.parseDouble(equation.split(",")[0]);
			b = Double.parseDouble(equation.split(",")[1]);
			c = Double.parseDouble(equation.split(",")[2]);

			Quadratic_equation.calc(a, b, c);
		}
		
	}

}
