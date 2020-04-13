package ch03.ex05;

public interface IntSequence {
  default boolean hasNext() {
    return true;
  };

  int next();

  public static IntSequence constant(int num) {
    return () -> num;
  }
}
