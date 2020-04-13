package ch03.ex08;

public class Main {

  public static void main(String[] args) {
    Runnable worldGreeter = new Greeter(10, "World");
    Runnable lifeGreeter = new Greeter(10, "Life");

    Thread thread1 = new Thread(worldGreeter);
    Thread thread2 = new Thread(lifeGreeter);

    thread1.start();
    thread2.start();
  }

}
