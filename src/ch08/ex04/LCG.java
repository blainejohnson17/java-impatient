package ch08.ex04;

import java.util.stream.Stream;

public class LCG {
  public static Stream<Long> generate(long a, long c, long m, long seed) {
    return Stream.iterate(seed, x -> (a * x + c) % m);
  }
}
