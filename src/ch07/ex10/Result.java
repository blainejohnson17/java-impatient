package ch07.ex10;

import java.util.Objects;

public class Result {
  private int distance;
  private String previous;

  public Result(int distance, String previous) {
    this.distance = distance;
    this.previous = previous;
  }

  public int getDistance() {
    return distance;
  }

  public String getPrevious() {
    return previous;
  }

  @Override
  public String toString() {
    return super.toString() + "[distance=" + distance + ",previous=" + previous + "]";
  }

  @Override
  public int hashCode() {
    return Objects.hash(distance, previous);
  }

  @Override
  public boolean equals(Object otherObj) {
    if (this == otherObj) {
      return true;
    }
    if (otherObj == null) {
      return false;
    }
    if (getClass() != otherObj.getClass()) {
      return false;
    }
    Result otherResult = (Result) otherObj;
    return distance == otherResult.distance && Objects.equals(previous, otherResult.previous);
  }



}
