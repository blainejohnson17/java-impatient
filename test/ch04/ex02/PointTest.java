package ch04.ex02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class PointTest {
  @Test
  public void testPointToString() {
    Point point = new Point(1, 2);
    String expected = point.getClass().getName() + "@" + Integer.toHexString(point.hashCode())
        + ":x=" + point.getX() + "," + "y=" + point.getY();
    assertEquals(expected, point.toString());
  }

  @Test
  public void testPointEquals() {
    Point point = new Point(1, 2);
    Point refToPoint = point;
    assertTrue(point.equals(refToPoint));
    assertTrue(point.equals(new Point(1, 2)));
    assertFalse(point.equals(null));
    assertFalse(point.equals(new Point(1, 1)));
    assertFalse(point.equals(new Point(2, 1)));
    assertFalse(point.equals(new LabeledPoint(1, 2, "test")));
  }

  @Test
  public void testPointHashCode() {
    Point point = new Point(1, 2);
    Point refToPoint = point;
    assertTrue(point.hashCode() == refToPoint.hashCode());
    assertTrue(point.hashCode() == (new Point(1, 2)).hashCode());
    assertFalse(point.hashCode() == (new Point(1, 1)).hashCode());
    assertFalse(point.hashCode() == (new Point(2, 1)).hashCode());
    assertFalse(point.hashCode() == (new LabeledPoint(1, 2, "test")).hashCode());
  }

}
