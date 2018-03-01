package iit.uni.miskolc.oop;

public class Util {
	public static void calculate(String operator, Double firstNumber, Double secondNumber) {
		System.out.print("Result: ");
		switch (operator) {
		case "-":
			System.out.println(firstNumber - secondNumber);
			break;
		case "+":
			System.out.println(firstNumber + secondNumber);
			break;
		case "*":
			System.out.println(firstNumber * secondNumber);
			break;
		case "/":
			if (!secondNumber.equals(0.0))
				System.out.println(firstNumber / secondNumber);
			else
				System.out.println("Cannot divide with 0");
			break;
		default:
			System.out.println("Unknow operator");
			break;
		}

	}

}
