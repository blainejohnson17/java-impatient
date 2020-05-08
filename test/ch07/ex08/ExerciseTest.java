package ch07.ex08;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class ExerciseTest {

  @Test
  void testWordLineNumbers() throws IOException {
    Path tempFile = Files.createTempFile("tempfiles", ".txt");
    BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile.toString()));
    bw.write("Three");
    bw.newLine();
    bw.write("tHree TWO");
    bw.newLine();
    bw.write("three two one");
    bw.close();

    Map<String, Set<Integer>> expected = new HashMap<>();
    expected.put("one", new HashSet<>(Arrays.asList(3)));
    expected.put("two", new HashSet<>(Arrays.asList(2, 3)));
    expected.put("three", new HashSet<>(Arrays.asList(1, 2, 3)));

    assertEquals(expected, Exercise.wordLineNumbers(tempFile.toString()));
  }

}
