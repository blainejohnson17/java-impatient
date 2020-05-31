package ch08.ex13;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Exercise {
  public static <T> ArrayList<T> reduceFormOne(Stream<ArrayList<T>> stream) {
    return stream.reduce((a, b) -> {
      a.addAll(b);
      return a;
    }).orElse(new ArrayList<>());
  }

  public static <T> ArrayList<T> reduceFormTwo(Stream<ArrayList<T>> stream) {
    return stream.reduce(new ArrayList<>(), (a, b) -> {
      a.addAll(b);
      return a;
    });
  }

  public static <T> ArrayList<T> reduceFormThree(Stream<ArrayList<T>> stream) {
    return stream.reduce(new ArrayList<>(), (a, b) -> {
      a.addAll(b);
      return a;
    }, (a, b) -> {
      a.addAll(b);
      return a;
    });
  }
}
