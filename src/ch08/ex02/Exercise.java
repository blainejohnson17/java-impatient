package ch08.ex02;

import java.util.List;

public class Exercise {
  public static long countLongWords(List<String> words) {
    return words.stream().filter(w -> w.length() > 12).count();
  }

  public static long countLongWordsParallel(List<String> words) {
    return words.parallelStream().filter(w -> w.length() > 12).count();
  }
}
