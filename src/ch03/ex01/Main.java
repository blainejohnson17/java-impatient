package ch03.ex01;

public class Main {

	public static void main(String[] args) {
		Employee[] employees = { new Employee(100000.00), new Employee(50000.00) };
		double averageEmployeeMeasure = average(employees);
		System.out.println(averageEmployeeMeasure);
	}

	public static double average(Measurable[] objects) {
		double ave = 0;
		for (Measurable obj : objects) {
			ave += obj.getMeasure();
		}

		if (objects.length > 0) {
			ave /= objects.length;
		}

		return ave;
	}

}
