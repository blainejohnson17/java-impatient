package ch06.ex11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

public class ArraysTest {

  @Test
  public void testMinMax() {
    ArrayList<Integer> intList = new ArrayList<>(java.util.Arrays.asList(2, 1, 4, 3));

    Pair<Integer> minMax = Arrays.minMax(intList);
    Pair<Integer> expected = new Pair<>(1, 4);
    assertEquals(expected, minMax);
  }

}
