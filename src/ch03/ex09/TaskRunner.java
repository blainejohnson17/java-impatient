package ch03.ex09;

import java.util.ArrayList;

public class TaskRunner {
  public static void runTogether(Runnable... tasks) {
    ArrayList<Thread> threads = new ArrayList<Thread>();

    for (Runnable task : tasks) {
      threads.add(new Thread(task));
    }

    threads.forEach(t -> t.start());
    threads.forEach(t -> {
      try {
        t.join();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    });
  }

  public static void runInOrder(Runnable... tasks) {
    for (Runnable task : tasks) {
      task.run();
    }
  }
}
