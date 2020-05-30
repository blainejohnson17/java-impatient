package ch08.ex09;

import java.util.stream.Stream;

public class Exercise {
  public static double averageLength(Stream<String> stringStream) {
    return stringStream.mapToInt(String::length).average().orElse(0);
  }
}
