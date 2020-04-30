package ch06.ex11;

import java.util.Objects;

public class Pair<E extends Comparable<? super E>> {
  private E first;
  private E second;

  public Pair(E first, E second) {
    this.first = first;
    this.second = second;
  }

  public E getFirst() {
    return first;
  }

  public E getSecond() {
    return second;
  }

  @SuppressWarnings("unchecked")
  @Override
  public boolean equals(Object otherObject) {
    if (this == otherObject)
      return true;
    if (otherObject == null)
      return false;
    if (getClass() != otherObject.getClass())
      return false;
    Pair<E> otherPair = (Pair<E>) otherObject;
    return Objects.equals(first, otherPair.first) && Objects.equals(second, otherPair.second);
  }

  @Override
  public int hashCode() {
    return Objects.hash(first, second);
  }


}
