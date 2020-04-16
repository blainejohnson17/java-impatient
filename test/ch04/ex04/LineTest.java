package ch04.ex04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LineTest {

  @Test
  public void test() {
    Line line = new Line(new Point(-1, -1), new Point(1, 1));
    assertEquals(0, line.getCenter().getX());
    assertEquals(0, line.getCenter().getY());

    line.moveBy(1, -2);
    assertEquals(1, line.getCenter().getX());
    assertEquals(-2, line.getCenter().getY());
  }

}
