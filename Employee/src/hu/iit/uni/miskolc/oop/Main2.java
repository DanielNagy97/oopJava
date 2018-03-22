package hu.iit.uni.miskolc.oop;

import java.util.Random;

public class Main2 {

	public static void main(String[] args) {
		Employee[] employeeArray = new Employee[3];
		for (int i = 0; i < employeeArray.length; i++) {
			employeeArray[i] = new Employee();
			employeeArray[i].setName("employee"+(i+1));
			employeeArray[i].setSalary(Math.abs(new Random().nextInt()));
			
		}
		
		for (int i = 0; i < employeeArray.length; i++) {
			System.out.println(employeeArray[i]);
		}
		
		Employee employeeWithHighestSalary=employeeArray[0];
		
		for (int i = 0; i < employeeArray.length; i++) {
			if(employeeWithHighestSalary.isBigerSalary(employeeArray[i])){
				employeeWithHighestSalary=employeeArray[i];
			}
			
		}
		System.out.println("legalacsonyabb fizetés: "+employeeWithHighestSalary);
		
		
		double averageSalary = 0.0;
		
		for (int i = 0; i < employeeArray.length; i++) {
			averageSalary+=employeeArray[i].getSalary();
		}
		System.out.println("Átlagfizetés: " +(long)averageSalary/employeeArray.length);
		
		
		int taxSum = 0;
		
		for (int j = 0; j < employeeArray.length; j++) {
			taxSum+= employeeArray[j].getTax();
		}
		System.out.println("Az általuk befizetett adó összértéke: "+taxSum);
		
	}

}
