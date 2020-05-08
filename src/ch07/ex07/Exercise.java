package ch07.ex07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Exercise {

  public static Map<String, Integer> wordFrequency(String filepath) {
    Map<String, Integer> freq = new TreeMap<>();
    Path file = Paths.get(filepath);
    try (InputStream in = Files.newInputStream(file);
        BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {
      String line = null;
      List<String> words = null;
      while ((line = reader.readLine()) != null) {
        words = Arrays.asList(line.split("\\PL+"));
        for (String word : words) {
          String lower = word.toLowerCase();
          freq.put(lower, freq.getOrDefault(lower, 0) + 1);
        }
      }
    } catch (IOException x) {
      System.err.println(x);
    }


    return freq;
  }

}
