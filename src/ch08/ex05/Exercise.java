package ch08.ex05;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise {
  public static Stream<String> letters(String s) {
    return IntStream.range(0, s.length()).mapToObj(i -> s.substring(i, i + 1));
  }
}
