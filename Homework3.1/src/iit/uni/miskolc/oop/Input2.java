package iit.uni.miskolc.oop;

import java.util.Scanner;

public class Input2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Double a;
		Double b;
		Double c;

		while (true) {
			System.out.println("Enter the first number: ");
			a = scanner.nextDouble();
			System.out.println("Enter the second number: ");
			b = scanner.nextDouble();
			System.out.println("Enter the third number: ");
			c = scanner.nextDouble();
			Quadratic_equation.calc(a, b, c);
		}

	}

}
