package ch08.ex09;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;

class ExerciseTest {

  @Test
  void testAverageLength() {
    Stream<String> stringStream = Stream.of("this", "is", "a", "stream", "of", "string");
    double actual = Exercise.averageLength(stringStream);
    double expected = 3.5;
    assertEquals(expected, actual);
  }

}
