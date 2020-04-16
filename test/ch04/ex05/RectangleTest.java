package ch04.ex05;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RectangleTest {

  @Test
  public void test() {
    Rectangle rectangle = new Rectangle(new Point(0, 2), 2, 3);
    Rectangle clone = rectangle.clone();

    assertEquals(1.5, clone.getCenter().getX());
    assertEquals(1, clone.getCenter().getY());

    clone.moveBy(-1.5, 1);

    assertEquals(0, clone.getCenter().getX());
    assertEquals(2, clone.getCenter().getY());

    assertEquals(1.5, rectangle.getCenter().getX());
    assertEquals(1, rectangle.getCenter().getY());
  }

}
