package ch08.ex08;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import java.io.IOException;
import org.junit.jupiter.api.Test;

class ExerciseTest {

  @Test
  void testWordsWithNVowels() throws IOException {
    String[] actual = Exercise.wordsWithNVowels(11);
    String[] expected = {"aminoacetophenetidine", "palaeometeorological", "pericardiomediastinitis",
        "zoologicoarchaeologist"};
    assertArrayEquals(expected, actual);
  }

}
