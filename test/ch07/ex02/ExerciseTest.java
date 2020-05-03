package ch07.ex02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class ExerciseTest {
  private List<String> strings = Arrays.asList("one", "Two", "threE");
  private List<String> expected = Arrays.asList("ONE", "TWO", "THREE");


  @Test
  void testToUpperWithIterator() {
    assertEquals(expected, Exercise.toUpperWithIterator(strings));
  }

  @Test
  void testToUpperWitLoop() {
    assertEquals(expected, Exercise.toUpperWithLoop(strings));
  }

  @Test
  void testToUpperWithReplaceAll() {
    assertEquals(expected, Exercise.toUpperWithReplaceAll(strings));
  }

}
