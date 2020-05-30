package ch08.ex10;

import java.util.stream.Stream;

public class Exercise {
  public static double maxLength(Stream<String> stringStream) {
    return stringStream.mapToInt(String::length).max().orElse(0);
  }
}
