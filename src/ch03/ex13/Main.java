package ch03.ex13;

public class Main {

  public static void main(String[] args) {
    Runnable t1 = () -> System.out.println("t1");
    Runnable t2 = () -> System.out.println("t2");
    Runnable t3 = () -> System.out.println("t3");

    Runnable[] taskArray = {t1, t2, t3};

    Runnable taskBundle = inOrder(taskArray);

    taskBundle.run();
  }

  public static Runnable inOrder(Runnable[] tasks) {
    return () -> {
      for (Runnable task : tasks) {
        task.run();
      }
    };
  }

}
