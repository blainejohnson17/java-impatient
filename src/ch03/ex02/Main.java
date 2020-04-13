package ch03.ex02;

public class Main {

  public static void main(String[] args) {
    Employee[] employees = {new Employee("Sally", 90000.00), new Employee("Sarah", 100000.00),
        new Employee("Susan", 50000.00)};
    Employee emp = (Employee) largest(employees);
    System.out.println(emp.getName());
  }

  public static Measurable largest(Measurable[] objects) {
    double largestVal = Double.MIN_VALUE;
    Measurable largestObj = null;
    for (Measurable obj : objects) {
      if (obj.getMeasure() > largestVal) {
        largestObj = obj;
        largestVal = obj.getMeasure();
      }
    }
    return largestObj;
  }

}
