package ch04.ex04;

public class Circle extends Shape {
  private final double radius;

  public Circle(Point center, double radius) {
    super(center);
    this.radius = radius;
  }

  @Override
  public Point getCenter() {
    return point;
  }
}
