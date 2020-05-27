package ch08.ex02;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class ExerciseTest {

  @Test
  void testCountLongWords() throws IOException, URISyntaxException {
    String contents =
        new String(Files.readAllBytes(Paths.get("./resources/book-war-and-peace.txt")),
            StandardCharsets.UTF_8);
    List<String> words = Arrays.asList(contents.split("\\PL+"));
    long start = System.currentTimeMillis();
    long count = Exercise.countLongWords(words);
    long end = System.currentTimeMillis();
    System.out.println("countLongWords ms: " + (end - start));
  }

  @Test
  void countLongWordsParallel() throws IOException, URISyntaxException {
    String contents =
        new String(Files.readAllBytes(Paths.get("./resources/book-war-and-peace.txt")),
            StandardCharsets.UTF_8);
    List<String> words = Arrays.asList(contents.split("\\PL+"));
    long start = System.currentTimeMillis();
    long count = Exercise.countLongWordsParallel(words);
    long end = System.currentTimeMillis();
    System.out.println("countLongWordsParallel ms: " + (end - start));
  }
}
