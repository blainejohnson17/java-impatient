package ch03.ex02;

public class Employee implements Measurable {
	private double salary;
	private String name;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public double getMeasure() {
		return getSalary();
	}

	public double getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}
}
