package ch08.ex17;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;

class ExerciseTest {

  @Test
  void testRemoveAdjacentDups() {
    Stream<String> stream = Stream.of("a", "a", "b", "a", "c", "b", "c", "c");
    Stream<String> deDupped = Exercise.removeAdjacentDups(stream.parallel());
    List<String> expected = Arrays.asList("a", "b", "a", "c", "b", "c");
    List<String> actual = deDupped.collect(Collectors.toList());
    assertEquals(expected, actual);
  }

}
