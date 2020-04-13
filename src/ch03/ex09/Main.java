package ch03.ex09;


public class Main {

  public static void main(String[] args) {
    Runnable t1 = () -> {
      for (int i = 0; i < 10; i++) {
        System.out.println("Task1." + i);
      }
    };

    Runnable t2 = () -> {
      for (int i = 0; i < 10; i++) {
        System.out.println("Task2." + i);
      }
    };

    Runnable t3 = () -> {
      for (int i = 0; i < 10; i++) {
        System.out.println("Task3." + i);
      }
    };

    System.out.println("## runTogether ##");
    TaskRunner.runTogether(t1, t2, t3);

    System.out.println("\n\n## runInOrder");
    TaskRunner.runInOrder(t1, t2, t3);
  }

}
