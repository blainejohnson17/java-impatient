package ch08.ex13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;

class ExerciseTest {
  private static final List<String> expected = Arrays.asList("one", "two", "three", "four");

  @Test
  void testReduceFormOne() {
    Stream<ArrayList<String>> stream = Stream.of(new ArrayList<>(Arrays.asList("one", "two")),
        new ArrayList<>(Arrays.asList("three", "four")));
    assertEquals(expected, Exercise.reduceFormOne(stream));
  }

  @Test
  void testReduceFormTwo() {
    Stream<ArrayList<String>> stream = Stream.of(new ArrayList<>(Arrays.asList("one", "two")),
        new ArrayList<>(Arrays.asList("three", "four")));
    assertEquals(expected, Exercise.reduceFormTwo(stream));
  }

  @Test
  void testReduceFormThree() {
    Stream<ArrayList<String>> stream = Stream.of(new ArrayList<>(Arrays.asList("one", "two")),
        new ArrayList<>(Arrays.asList("three", "four")));
    assertEquals(expected, Exercise.reduceFormThree(stream));
  }

}
