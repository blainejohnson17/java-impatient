package ch08.ex12;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import java.util.Arrays;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;

class ExerciseTest {

  @Test
  void testZip() {
    Stream<String> first = Arrays.asList("a", "b", "c", "d").stream();
    Stream<String> second = Arrays.asList("A", "B").stream();
    Stream<String> actual = Exercise.zip(first, second);
    String[] expected = {"a", "A", "b", "B", "c", null, "d"};
    assertArrayEquals(expected, actual.toArray(String[]::new));
  }

}
