package ch04.ex01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LabeledPointTest {
  @Test
  public void testLabeledPoint() {
    LabeledPoint labeledPoint = new LabeledPoint(1, 2, "test");
    assertEquals(1, labeledPoint.getX());
    assertEquals(2, labeledPoint.getY());
    assertEquals("test", labeledPoint.getLabel());
  }
}
