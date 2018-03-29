package hu.iit.uni.miskolc.oop;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		Random rnd = new Random();
		Employee[] employees = new Employee[number];

		for (int i = 0; i < employees.length; i++) {
			employees[i] = new Employee("employee" + i, rnd.nextInt(100000), LocalDate.of((1950+rnd.nextInt(70)), 01, 05));
		}


		System.out.println("initial");
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		Employee.setPensionageLimit(70);
		System.out.println("PensionAgeLimit Changed");
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i]);
		}

		System.out.println("5 �vn�l kevesebb van nyugd�jig");
		printWithYearsToPension(employees, 5);

		double avg=employees[0].yearsLeftToPension();
		for (int i = 1; i < employees.length; i++) {
			avg+=employees[i].yearsLeftToPension();
		}
		avg=avg/number;
		System.out.println(avg);
		printWithYearsToPension(employees, avg);


	}
	
	private static String getMonthNameFromMonthNumber(int number){
		String[] months = new String[13];
		months[1]="Janu�r";
		months[2]="Febru�r";
		months[3]="M�rcius";
		months[4]="�prilis";
		months[5]="M�jus";
		months[6]="J�nius";
		months[7]="J�lius";
		months[8]="Augusztus";
		months[9]="Szeptember";
		months[10]="Okt�ber";
		months[11]="November";
		months[12]="December";
		return months[number];
	}
	
	private static void printWithYearsToPension(Employee[] employees, double years) {
		for (Employee employee : employees) {
			if(employee.yearsLeftToPension()<years) {
				System.out.println(employee);
			}
		}
	}

}