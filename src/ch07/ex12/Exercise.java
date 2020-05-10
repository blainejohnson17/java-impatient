package ch07.ex12;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercise {
  public static String shuffleWords(String sentence) {
    List<String> words = Arrays.asList(sentence.split("\\PL+"));
    Collections.shuffle(words);
    String first = words.get(0);
    String capitalized = first.substring(0, 1).toUpperCase() + first.substring(1);
    words.set(0, capitalized);

    return String.join(" ", words) + ".";
  }
}
