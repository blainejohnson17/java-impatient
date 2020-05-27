package ch08.ex03;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise {
  public static Stream<int[]> streamOfIntArray(int[] intArray) {
    return Stream.of(intArray);
  }

  public static IntStream streamOfInt(int[] intArray) {
    return IntStream.of(intArray);
  }
}
