package ch04.ex04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RectangleTest {

  @Test
  public void testRectangle() {
    Rectangle rectangle = new Rectangle(new Point(0, 2), 2, 3);
    rectangle.moveBy(-1.5, -1);
    assertEquals(0, rectangle.getCenter().getX());
    assertEquals(0, rectangle.getCenter().getY());
  }

}
