package ch06.ex10;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class ArraysTest {

  @Test
  public void testMinMax() {
    String[] stringArray = {"b", "e", "a", "c"};
    String[] expectedMinMax = {"a", "e"};
    assertArrayEquals(expectedMinMax, Arrays.minMax(stringArray));

    String[] expectedOriginal = {"b", "e", "a", "c"};
    assertArrayEquals(expectedOriginal, stringArray);
  }

}
