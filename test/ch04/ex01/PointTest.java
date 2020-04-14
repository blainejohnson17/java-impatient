package ch04.ex01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class PointTest {
  @Test
  void testPointTest() {
    Point point = new Point(1, 2);
    assertEquals(1, point.getX());
    assertEquals(2, point.getY());
  }

}
