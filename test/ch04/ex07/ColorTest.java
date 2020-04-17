package ch04.ex07;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ColorTest {

  @Test
  public void testColorValues() {
    Color[] expected = {Color.BLACK, Color.RED, Color.BLUE, Color.GREEN, Color.CYAN, Color.MAGENTA,
        Color.YELLOW, Color.WHITE};
    assertArrayEquals(expected, Color.values());
  }

  @Test
  public void testGetRed() {
    assertEquals(Color.RED, Color.getRed());
  }

  @Test
  public void testGetGreen() {
    assertEquals(Color.GREEN, Color.getGreen());
  }

  @Test
  public void testGetBlue() {
    assertEquals(Color.BLUE, Color.getBlue());
  }

}
