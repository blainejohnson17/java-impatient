package ch07.ex09;

import java.util.Map;

public class Exercise {
  public static void incrementWithContains(Map<String, Integer> counts, String key) {
    if (counts.containsKey(key)) {
      counts.put(key, counts.get(key) + 1);
    } else {
      counts.put(key, 1);
    }
  }

  public static void incrementWithGetNullCheck(Map<String, Integer> counts, String key) {
    Integer prevCount = counts.get(key);
    if (prevCount != null) {
      counts.put(key, prevCount + 1);
    } else {
      counts.put(key, 1);
    }
  }

  public static void incrementWithGetOrDefault(Map<String, Integer> counts, String key) {
    counts.put(key, counts.getOrDefault(key, 0) + 1);
  }

  public static void incrementWithPutIfAbsent(Map<String, Integer> counts, String key) {
    counts.putIfAbsent(key, 0);
    counts.put(key, counts.get(key) + 1);
  }
}
