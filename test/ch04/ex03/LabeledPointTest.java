package ch04.ex03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LabeledPointTest {
  @Test
  public void testLabeledPoint() {
    LabeledPoint labeledPoint = new LabeledPoint(1, 2, "test");
    assertEquals(labeledPoint.getSuperX(), labeledPoint.getX());
    assertEquals(labeledPoint.getSuperY(), labeledPoint.getY());
  }
}
