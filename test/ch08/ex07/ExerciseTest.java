package ch08.ex07;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class ExerciseTest {

  @Test
  void testFirstNWords() throws IOException {
    List<String> actual = Exercise.firstNWords("./resources/book-war-and-peace.txt", 6);
    List<String> expected = Arrays.asList("CHAPTER", "I", "Well", "Prince", "so", "Genoa");
    assertEquals(expected, actual);
  }

  @Test
  void testMostFrequentWords() throws IOException {
    List<String> actual = Exercise.mostFrequentWords("./resources/book-war-and-peace.txt", 3);
    List<String> expected = Arrays.asList("the", "and", "to");
    assertEquals(expected, actual);
  }

}
