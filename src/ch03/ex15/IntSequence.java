package ch03.ex15;

public interface IntSequence {
  default boolean hasNext() {
    return true;
  };

  int next();


}
