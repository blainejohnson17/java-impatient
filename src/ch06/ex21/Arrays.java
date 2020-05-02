package ch06.ex21;

public class Arrays {
  @SafeVarargs
  public static <T> T[] construct(int n, T... empty) {
    return java.util.Arrays.copyOf(empty, n);
  }
}
