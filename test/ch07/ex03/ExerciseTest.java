package ch07.ex03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

class ExerciseTest {

  @Test
  void testUnion() {
    Set<String> set1 = new HashSet<>(Arrays.asList("one", "two"));
    Set<String> set2 = new HashSet<>(Arrays.asList("two", "three"));
    Set<String> unionSet = Exercise.union(set1, set2);
    Set<String> expected = new HashSet<>(Arrays.asList("one", "two", "three"));
    assertEquals(expected, unionSet);
  }

  @Test
  void testIntersection() {
    Set<String> set1 = new HashSet<>(Arrays.asList("one", "two"));
    Set<String> set2 = new HashSet<>(Arrays.asList("two", "three"));
    Set<String> intersectionSet = Exercise.intersection(set1, set2);
    Set<String> expected = new HashSet<>(Arrays.asList("two"));
    assertEquals(expected, intersectionSet);
  }

  @Test
  void testDifference() {
    Set<String> set1 = new HashSet<>(Arrays.asList("one", "two"));
    Set<String> set2 = new HashSet<>(Arrays.asList("two", "three"));
    Set<String> diffSet = Exercise.difference(set1, set2);
    Set<String> expected = new HashSet<>(Arrays.asList("one"));
    assertEquals(expected, diffSet);
  }

}
