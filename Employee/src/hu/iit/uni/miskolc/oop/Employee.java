package hu.iit.uni.miskolc.oop;

public class Employee {
	private String name;
	private Integer salary;
	
	public boolean isBetweenSalary(int lowerSalary, int upperSalary) {
		if(salary<upperSalary && salary > lowerSalary){
			return true;
		}
		return false;
	}
	
	public double getTax() {
		return salary*0.16;
	}
	
	public boolean isBigerSalary(Employee otherEmployee){
		if(salary>otherEmployee.salary){
			return true;
		}
		return false;
	}
	
	
	public void raiseSalary(int raise) {
		setSalary(getSalary() + raise);
	}
	
	public String toString() {
		return "Név: " + getName() + ", fizetés: "+getSalary();
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
