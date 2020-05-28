package ch08.ex05;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;

class ExerciseTest {

  @Test
  void testLetters() {
    String s = "Hello";
    Stream<String> expected = Stream.of("H", "e", "l", "l", "o");
    Stream<String> actual = Exercise.letters(s);
    assertArrayEquals(expected.toArray(), actual.toArray());
  }

}
