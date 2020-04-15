package ch04.ex02;

import java.util.Objects;

public class LabeledPoint extends Point {
  private String label;

  public LabeledPoint(double x, double y, String label) {
    super(x, y);
    this.label = label;
  }

  public String getLabel() {
    return label;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), label);
  }

  @Override
  public boolean equals(Object otherObj) {
    if (!super.equals(otherObj))
      return false;
    LabeledPoint otherPoint = (LabeledPoint) otherObj;
    return Objects.equals(label, otherPoint.label);
  }

  @Override
  public String toString() {
    String append = ",label=" + getLabel();
    return super.toString() + append;
  }

}
