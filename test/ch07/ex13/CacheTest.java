package ch07.ex13;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class CacheTest {

  @Test
  void testCache() {
    Cache<String, Integer> cache = new Cache<>(4);
    for (int i = 0; i < 4; i++) {
      cache.put(Integer.toString(i), i);
    }
    for (int i = 0; i < 4; i++) {
      assertTrue(cache.containsKey(Integer.toString(i)));
    }

    cache.put("4", 4);
    for (int i = 1; i < 5; i++) {
      assertTrue(cache.containsKey(Integer.toString(i)));
    }
    assertFalse(cache.containsKey("0"));
  }

}
