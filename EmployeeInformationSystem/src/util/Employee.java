package util;

public class Employee {

	String name;
	double salary;
	int workHours;
	int hireYear;
	
	public Employee(String name, double salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = (salary <= 0) ? 500 : salary;
		this.workHours = (workHours < 0) ? 0 : workHours;
		this.hireYear = (hireYear > 2021) ? 2021 : hireYear;
	}
	
	private double calculateTax() {
		if (this.salary <= 1000) {
			return 0;
		} else {
			return (this.salary * 3 / 100);
		}
	}
	
	private double calculateBonus() {
		if (this.workHours > 40) {
			return (this.workHours - 40) * 30;
		} else {
			return 0;
		}
	}
	
	private double calculateSalaryRaise() {
		int workYears = 2021 - this.hireYear;
		if (workYears < 10) {
			return (this.salary * (5.0/100));
		} else if (workYears < 20) {
			return this.salary * (10.0/100);
		} else {
			return (this.salary * (15.0/100));
		}
	}
	
	@Override
	public String toString() {
		return "Name: " + this.name +
				"\nSalary: " + this.salary +
				"\nHired in: " + this.hireYear +
				"\nTax: " + calculateTax() +
				"\nBonus: " + calculateBonus() +
				"\nRaise amount: " + calculateSalaryRaise() +
				"\nSalary with tax and bonus: " + (this.salary + calculateBonus() - calculateTax()) +
				"\nTotal Salary: " + (this.salary + calculateSalaryRaise());
	}
}
