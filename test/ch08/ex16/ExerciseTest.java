package ch08.ex16;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;

class ExerciseTest {

  @Test
  void testLongStringsSerial() throws IOException {
    try (Stream<String> lines = Files.lines(Paths.get("resources/book-war-and-peace.txt"))) {
      Stream<String> strings = lines.flatMap(line -> Stream.of(line.split("\\PL+")));
      List<String> threeLongest = Exercise.longStringsSerial(strings, 3);
      List<String> expected =
          Arrays.asList("characteristically", "characteristically", "characteristically");
      assertEquals(expected, threeLongest);
    } ;
  }

  @Test
  void testLongStringsParallel() throws IOException {
    try (Stream<String> lines = Files.lines(Paths.get("resources/book-war-and-peace.txt"))) {
      Stream<String> strings = lines.flatMap(line -> Stream.of(line.split("\\PL+")));
      List<String> threeLongest = Exercise.longStringsParallel(strings, 3);
      List<String> expected =
          Arrays.asList("characteristically", "characteristically", "characteristically");
      assertEquals(expected, threeLongest);
    } ;
  }

  @Test
  void testLongStringsPeformance() throws IOException {
    long count = 500;
    try (Stream<String> lines = Files.lines(Paths.get("resources/book-war-and-peace.txt"))) {
      Stream<String> strings = lines.flatMap(line -> Stream.of(line.split("\\PL+")));
      long startParallel = System.currentTimeMillis();
      Exercise.longStringsParallel(strings, count);
      long endParallel = System.currentTimeMillis();
      System.out.println("longStringsParallel: " + (endParallel - startParallel));
    } ;

    try (Stream<String> lines = Files.lines(Paths.get("resources/book-war-and-peace.txt"))) {
      Stream<String> strings = lines.flatMap(line -> Stream.of(line.split("\\PL+")));
      long startSerial = System.currentTimeMillis();
      Exercise.longStringsSerial(strings, count);
      long endSerial = System.currentTimeMillis();
      System.out.println("longStringsSerial: " + (endSerial - startSerial));
    } ;
  }

}
