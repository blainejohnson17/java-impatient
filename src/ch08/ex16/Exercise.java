package ch08.ex16;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise {
  public static List<String> longStringsSerial(Stream<String> stream, long count) {
    return stream.sorted(Comparator.comparing(String::length).reversed()).limit(count)
        .collect(Collectors.toList());
  }

  public static List<String> longStringsParallel(Stream<String> stream, long count) {
    return stream.parallel().sorted(Comparator.comparing(String::length).reversed()).limit(count)
        .collect(Collectors.toList());
  }
}
