package ch06.ex12;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;

public class ArraysTest {

  @Test
  public void testMinMax() {
    List<String> stringList = java.util.Arrays.asList("ee", "aaa", "bb", "c", "ff");
    Comparator<String> lengthComp = (x, y) -> x.length() - y.length();
    List<String> result = new ArrayList<>();
    Arrays.minMax(stringList, lengthComp, result);
    assertEquals(java.util.Arrays.asList("c", "aaa"), result);
  }

}
