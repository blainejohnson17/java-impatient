package ch04.ex02;

import java.util.Objects;

public class Point {
  private double x;
  private double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y);
  }

  @Override
  public boolean equals(Object otherObj) {
    if (otherObj == null)
      return false;
    if (this == otherObj)
      return true;
    if (getClass() != otherObj.getClass())
      return false;
    Point otherPoint = (Point) otherObj;
    return x == otherPoint.x && y == otherPoint.y;
  }

  @Override
  public String toString() {
    String append = ":x=" + getX() + ",y=" + getY();
    return super.toString() + append;
  }

}
