package ch06.ex08;

public class Pair<E extends Comparable<? super E>> {
  private E first;
  private E second;

  public Pair(E first, E second) {
    // this.first = first;
    this.second = second;
  }

  public E getFirst() {
    return first;
  }

  public E getSecond() {
    return second;
  }

  public E max() {
    if (first.compareTo(second) > 0) {
      return second;
    }
    return first;
  }

  public E min() {
    if (first.compareTo(second) < 0) {
      return first;
    }
    return second;
  }

}
