package ch04.ex02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class LabeledPointTest {
  @Test
  public void testLabeledPointToString() {
    LabeledPoint labeledPoint = new LabeledPoint(1, 2, "test");
    String expected = labeledPoint.getClass().getName() + "@"
        + Integer.toHexString(labeledPoint.hashCode()) + ":x=" + labeledPoint.getX() + "," + "y="
        + labeledPoint.getY() + ",label=" + labeledPoint.getLabel();
    assertEquals(expected, labeledPoint.toString());
  }

  @Test
  public void testLabeledPointEquals() {
    LabeledPoint point = new LabeledPoint(1, 2, "test");
    LabeledPoint refToPoint = point;
    assertTrue(point.equals(refToPoint));
    assertTrue(point.equals(new LabeledPoint(1, 2, "test")));
    assertFalse(point.equals(null));
    assertFalse(point.equals(new LabeledPoint(1, 1, "test")));
    assertFalse(point.equals(new LabeledPoint(2, 1, "test")));
    assertFalse(point.equals(new LabeledPoint(1, 2, "testt")));
    assertFalse(point.equals(new Point(1, 2)));
  }

  @Test
  public void testLabeledPointHashCode() {
    LabeledPoint point = new LabeledPoint(1, 2, "test");
    LabeledPoint refToLabeledPoint = point;
    assertTrue(point.hashCode() == refToLabeledPoint.hashCode());
    assertTrue(point.hashCode() == (new LabeledPoint(1, 2, "test")).hashCode());
    assertFalse(point.hashCode() == (new LabeledPoint(1, 1, "test")).hashCode());
    assertFalse(point.hashCode() == (new LabeledPoint(1, 2, "testt")).hashCode());
    assertFalse(point.hashCode() == (new LabeledPoint(1, 2, "Test")).hashCode());
    assertFalse(point.hashCode() == (new LabeledPoint(2, 1, "test")).hashCode());
    assertFalse(point.hashCode() == (new Point(1, 2)).hashCode());
  }
}
