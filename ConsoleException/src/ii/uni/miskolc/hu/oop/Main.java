package ii.uni.miskolc.hu.oop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[5];
		
		for (int i =0; i< array.length; i++) {
			try {
					array[i] = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Nem szám");
			}
		}
		
		
		for (int number : array) {
			System.out.println(number);
		}
		
		for(int i = 0; i< array.length; i++){
			try{
				array[i]= Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e){
				System.out.println("Nem szám");
			}
		}
		
		
		for (int number : array){
			System.out.println(number);
		}
		
		
		public static int readFromConsole(){
			int number =0;
			try{
				
			}
		}
		
		
		
		
		
	}

}
