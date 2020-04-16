package ch04.ex04;

public class Line extends Shape {
  private final Point to;

  public Line(Point from, Point to) {
    super(from);
    this.to = to;
  }

  @Override
  public Point getCenter() {
    double dx = Math.abs(point.getX() - to.getX()) / 2;
    double dy = Math.abs(point.getY() - to.getY()) / 2;

    double x = Math.min(point.getX(), to.getX()) + dx;
    double y = Math.min(point.getY(), to.getY()) + dy;

    return new Point(x, y);
  }

  @Override
  public void moveBy(double dx, double dy) {
    super.moveBy(dx, dy);
    to.setX(to.getX() + dx);
    to.setY(to.getY() + dy);
  }

}
