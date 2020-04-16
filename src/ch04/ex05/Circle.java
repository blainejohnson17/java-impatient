package ch04.ex05;

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

  @Override
  public Circle clone() {
    Point clonedPoint = point.clone();
    return new Circle(clonedPoint, radius);
  }
}
