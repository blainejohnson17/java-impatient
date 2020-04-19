package ch05.ex11;

import org.junit.jupiter.api.Test;

class MathTest {

  @Test
  void testMin() {
    int[] numbers = java.util.stream.IntStream.rangeClosed(0, 10000).toArray();

    long startTime = System.nanoTime();

    Math.min(numbers);

    long endTime = System.nanoTime();

    long timeElapsed = endTime - startTime;

    System.out.println("Execution time in nanoseconds  : " + timeElapsed);
  }

  // nanosec w/ assertion enabled -> 2420566
  // nanosec w/ assertion disabled -> 473468
  // nanosec w/ assertion removed -> 429998

}
