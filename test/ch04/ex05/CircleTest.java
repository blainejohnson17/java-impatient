package ch04.ex05;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class CircleTest {

  @Test
  public void testClone() {
    Circle circle = new Circle(new Point(0, 0), 2);
    Circle clone = circle.clone();

    assertEquals(0, clone.getCenter().getX());
    assertEquals(0, clone.getCenter().getY());

    clone.moveBy(1, 2);

    assertEquals(1, clone.getCenter().getX());
    assertEquals(2, clone.getCenter().getY());


    assertEquals(0, circle.getCenter().getX());
    assertEquals(0, circle.getCenter().getY());
  }

}
