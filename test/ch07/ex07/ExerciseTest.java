package ch07.ex07;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class ExerciseTest {

  @Test
  void testWordFrequency() throws IOException {
    Path tempFile = Files.createTempFile("tempfiles", ".txt");
    BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile.toString()));
    bw.write("Three");
    bw.newLine();
    bw.write("tHree TWO");
    bw.newLine();
    bw.write("three two one");
    bw.close();

    Map<String, Integer> expected = new HashMap<>();
    expected.put("one", 1);
    expected.put("two", 2);
    expected.put("three", 3);

    assertEquals(expected, Exercise.wordFrequency(tempFile.toString()));
  }

}
