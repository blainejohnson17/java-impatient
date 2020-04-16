package ch04.ex01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PointTest {
  @Test
  public void testPointTest() {
    Point point = new Point(1, 2);
    assertEquals(1, point.getX());
    assertEquals(2, point.getY());
  }

}
