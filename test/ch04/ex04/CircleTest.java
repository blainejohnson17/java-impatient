package ch04.ex04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CircleTest {

  @Test
  public void testCircle() {
    Circle circle = new Circle(new Point(1, 1), 2);
    circle.moveBy(2, -2);
    assertEquals(3, circle.getCenter().getX());
    assertEquals(-1, circle.getCenter().getY());
  }

}
