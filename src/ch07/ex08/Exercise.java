package ch07.ex08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Exercise {
  public static Map<String, Set<Integer>> wordLineNumbers(String filepath) {
    Map<String, Set<Integer>> wordMap = new HashMap<>();
    Path file = Paths.get(filepath);
    try (InputStream in = Files.newInputStream(file);
        BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {
      String line = null;
      List<String> words = null;
      int lineNum = 1;
      while ((line = reader.readLine()) != null) {
        words = Arrays.asList(line.split("\\PL+"));
        for (String word : words) {
          String lower = word.toLowerCase();
          wordMap.putIfAbsent(lower, new HashSet<>());
          wordMap.get(lower).add(lineNum);
        }
        lineNum++;
      }
    } catch (IOException x) {
      System.err.println(x);
    }

    return wordMap;
  }
}
