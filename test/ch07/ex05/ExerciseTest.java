package ch07.ex05;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class ExerciseTest {

  @Test
  void testSwapWithRandomAccess() {
    List<String> list = new ArrayList<>(Arrays.asList("zero", "one", "two"));
    Exercise.swap(list, 2, 1);
    assertEquals(Arrays.asList("zero", "two", "one"), list);

    Exercise.swap(list, 1, 1);
    assertEquals(Arrays.asList("zero", "two", "one"), list);

    Exercise.swap(list, 0, 2);
    assertEquals(Arrays.asList("one", "two", "zero"), list);
  }

  @Test
  void testSwapWithoutRandomAccess() {
    List<String> list = new LinkedList<>(Arrays.asList("zero", "one", "two"));
    Exercise.swap(list, 2, 1);
    assertEquals(Arrays.asList("zero", "two", "one"), list);

    Exercise.swap(list, 1, 1);
    assertEquals(Arrays.asList("zero", "two", "one"), list);

    Exercise.swap(list, 0, 2);
    assertEquals(Arrays.asList("one", "two", "zero"), list);
  }

  @Test
  void testSwapWithIllegalArgs() {
    assertThrows(IllegalArgumentException.class, () -> {
      Exercise.swap(Arrays.asList("a"), 1, 0);
    });

    assertThrows(IllegalArgumentException.class, () -> {
      Exercise.swap(Arrays.asList("a"), 0, 1);
    });

    assertThrows(IllegalArgumentException.class, () -> {
      Exercise.swap(Arrays.asList("a"), -1, 0);
    });

    assertThrows(IllegalArgumentException.class, () -> {
      Exercise.swap(Arrays.asList("a"), 0, -1);
    });
  }

}
