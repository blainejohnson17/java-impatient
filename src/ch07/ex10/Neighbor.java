package ch07.ex10;

import java.util.Objects;

public class Neighbor implements Comparable<Neighbor> {
  private String name;
  private int distance;

  public Neighbor(String name, int distance) {
    this.name = name;
    this.distance = distance;
  }

  public String getName() {
    return name;
  }

  public int getDistance() {
    return distance;
  }

  @Override
  public int compareTo(Neighbor o) {
    return distance - o.distance;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
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
    Neighbor otherNeighbor = (Neighbor) otherObj;
    return Objects.equals(name, otherNeighbor.name);
  }



}
