package ch07.ex11;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercise {

  public static List<String> shuffleInner(String sentence) {
    List<String> words = Arrays.asList(sentence.split("\\PL+"));
    Collections.shuffle(words.subList(1, words.size() - 1));
    return words;
  }

}
