package hu.iit.uni.miskolc.oop;

public class Main {

	public static void main(String[] args) {
		Employee daniel = new Employee();
		daniel.setName(("Nagy Dániel"));
		daniel.setSalary((0));
		System.out.println(daniel.toString());
		daniel.raiseSalary(500);
		System.out.println(daniel);
		System.out.println(daniel.isBetweenSalary(200, 1000));
		System.out.println(daniel.isBetweenSalary(1000, 2000));
		System.out.println(daniel.getTax());
		
		Employee bence = new Employee();
		bence.setName("Bence Bogdany");
		bence.setSalary(20000);
		System.out.println(daniel.getName()+" fizetése nagyobb: "+daniel.isBigerSalary(bence));
		
	}

}
