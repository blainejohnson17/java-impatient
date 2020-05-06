package ch07.ex03;

import java.util.HashSet;
import java.util.Set;

public class Exercise {

  public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
    Set<T> unionSet = new HashSet<>(set1.size() + set2.size());
    unionSet.addAll(set1);
    unionSet.addAll(set2);
    return unionSet;
  }

  public static <T> Set<T> intersection(Set<T> set1, Set<T> set2) {
    Set<T> intersectionSet = new HashSet<>(set1.size());
    intersectionSet.addAll(set1);
    intersectionSet.retainAll(set2);
    return intersectionSet;
  }

  public static <T> Set<T> difference(Set<T> set1, Set<T> set2) {
    Set<T> differenceSet = new HashSet<>(set1.size());
    differenceSet.addAll(set1);
    differenceSet.removeAll(set2);
    return differenceSet;
  }

}
