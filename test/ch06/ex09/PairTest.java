package ch06.ex09;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

public class PairTest {

  @Test
  public void testFirstLast() {
    ArrayList<String> stringList = new ArrayList<>(java.util.Arrays.asList("a", "b", "c"));

    Pair<String> firstLast = Arrays.firstLast(stringList);
    Pair<String> expected = new Pair<>("a", "c");
    assertEquals(expected, firstLast);
  }

}
