package iit.uni.miskolc.oop;

import java.util.Scanner;

public class Mean {

	public static void main(String[] args) {
		int size = 10;
		double[] array = new double[size];
		double mean = 1.0;
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextDouble();
		}
		
		for (double d : array) {
			mean *= d;
		}
		
		mean = Math.pow(mean, 1.0/size);
		System.out.println(mean);
		
		

	}

}
