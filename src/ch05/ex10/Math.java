package ch05.ex10;

import java.util.Arrays;

public class Math {

  public static int factorial(int n) {
    Exception e = new Exception();
    StackTraceElement[] frames = e.getStackTrace();
    System.out.println("#### " + n);
    Arrays.stream(frames).filter(frame -> frame.toString().contains("05.ex10.Math.factorial"))
        .forEach(System.out::println);

    if (n < 2)
      return 1;
    return n * factorial(n - 1);
  }

}
