package ch07.ex09;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ExerciseTest {
  private Map<String, Integer> counts;
  private Map<String, Integer> expected;

  @BeforeEach
  public void initEach() {
    counts = new HashMap<>();
    counts.put("existing", 1);

    expected = new HashMap<>();
    expected.put("existing", 2);
    expected.put("new", 1);
  }

  @Test
  void testIncrementWithContains() {
    Exercise.incrementWithContains(counts, "existing");
    Exercise.incrementWithContains(counts, "new");

    assertEquals(expected, counts);
  }

  @Test
  void testIncrementWithGetNullCheck() {
    Exercise.incrementWithGetNullCheck(counts, "existing");
    Exercise.incrementWithGetNullCheck(counts, "new");

    assertEquals(expected, counts);
  }

  @Test
  void testIncrementWithGetOrDefault() {
    Exercise.incrementWithGetOrDefault(counts, "existing");
    Exercise.incrementWithGetOrDefault(counts, "new");

    assertEquals(expected, counts);
  }

  @Test
  void testIncrementWithPutIfAbsent() {
    Exercise.incrementWithPutIfAbsent(counts, "existing");
    Exercise.incrementWithPutIfAbsent(counts, "new");

    assertEquals(expected, counts);
  }

}
