package ch06.ex15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class ArrayUtilsTest {

  @Test
  void testMap() {
    ArrayList<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));
    ArrayList<String> actual = ArrayUtils.map(list, (e) -> e.toUpperCase());

    ArrayList<String> expected = new ArrayList<>(Arrays.asList("A", "B", "C"));
    assertEquals(expected, actual);
  }

}
