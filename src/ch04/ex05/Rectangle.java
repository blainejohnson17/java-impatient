package ch04.ex05;

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

  @Override
  public Rectangle clone() {
    return new Rectangle(point.clone(), height, width);
  }
}
