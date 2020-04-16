package ch04.ex04;

public class Rectangle extends Shape {
  private final double height;
  private final double width;

  public Rectangle(Point topLeft, double height, double width) {
    super(topLeft);
    this.height = height;
    this.width = width;
  }

  @Override
  public Point getCenter() {
    double x = point.getX() + width / 2;
    double y = point.getY() - height / 2;
    return new Point(x, y);
  }

}
