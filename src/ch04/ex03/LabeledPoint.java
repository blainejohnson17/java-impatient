package ch04.ex03;

public class LabeledPoint extends Point {
  private String label;

  public LabeledPoint(double x, double y, String label) {
    super(x, y);
    this.label = label;
  }

  public String getLabel() {
    return label;
  }

  public double getSuperX() {
    return x;
  }

  public double getSuperY() {
    return y;
  }
}
