package ch08.ex14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;

class ExerciseTest {

  @Test
  void testAverage() {
    Stream<Double> stream = Stream.of(1.0, 2.0, 3.0);
    Double actual = Exercise.average(stream);
    assertEquals(2.0, actual);
  }

}
