package ch03.ex14;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

  public static void main(String[] args) {
    Employee[] employees = {new Employee("Sally", 100000.00), new Employee("Abby", 100000.00),
        new Employee("Brian", 50000.00), new Employee("Aaron", 50000.00)};

    Arrays.sort(employees,
        Comparator.comparingDouble(Employee::getSalary).thenComparing(Employee::getName));

    for (Employee e : employees) {
      System.out.println(e.getName() + " " + e.getSalary());
    }

    Arrays.sort(employees, Comparator.comparingDouble(Employee::getSalary)
        .thenComparing(Employee::getName).reversed());

    for (Employee e : employees) {
      System.out.println(e.getName() + " " + e.getSalary());
    }
  }

}
