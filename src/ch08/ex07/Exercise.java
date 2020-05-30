package ch08.ex07;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Exercise {
  public static List<String> firstNWords(String filepath, long n) throws IOException {
    try (Stream<String> lines = Files.lines(Paths.get(filepath))) {
      return lines.flatMap(line -> Arrays.stream(line.split("\\PL+")))
          .filter(
              token -> token.length() > 0 && token.codePoints().allMatch(Character::isAlphabetic))
          .limit(n).collect(Collectors.toList());
    }
  }

  public static List<String> mostFrequentWords(String filepath, long n) throws IOException {
    try (Stream<String> lines = Files.lines(Paths.get(filepath))) {
      return lines.flatMap(line -> Arrays.stream(line.split("\\PL+")))
          .filter(
              token -> token.length() > 0 && token.codePoints().allMatch(Character::isAlphabetic))
          .map(word -> word.toLowerCase())
          .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
          .stream().sorted(Entry.<String, Long>comparingByValue().reversed()).limit(n)
          .map(e -> e.getKey()).collect(Collectors.toList());
    }
  }
}
