package ch08.ex08;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Exercise {
  private static final List<Character> VOWELS = Arrays.asList('a', 'e', 'i', 'o', 'u');

  public static String[] wordsWithNVowels(long n) throws IOException {
    return Files.lines(Paths.get("/usr/share/dict/words"))
        .filter(word -> word.chars().mapToObj(i -> (char) i)
            .filter(c -> VOWELS.contains(Character.toLowerCase(c))).count() == n)
        .toArray(String[]::new);
  }
}
