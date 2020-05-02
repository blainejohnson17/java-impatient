package ch06.ex20;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class ArrayUtilsTest {

  @Test
  void testRepeat() {
    assertArrayEquals(new String[] {"a", "b", "a", "b"}, ArrayUtils.repeat(2, "a", "b"));
    assertArrayEquals(new Integer[] {1, 2, 3, 1, 2, 3, 1, 2, 3}, ArrayUtils.repeat(3, 1, 2, 3));
  }

}
