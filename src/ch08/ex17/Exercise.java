package ch08.ex17;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Exercise {
  public static <T> Stream<T> removeAdjacentDups(Stream<T> stream) {
    return stream.reduce(new ArrayList<T>(), (List<T> a, T x) -> {
      if (a.size() == 0 || a.get(a.size() - 1) != x) {
        a.add(x);
      }
      return a;
    }, (List<T> a, List<T> right) -> {
      List<T> left = new ArrayList<>(a);
      if (left.isEmpty())
        return right;
      else if (!right.isEmpty())
        left.addAll(left.get(left.size() - 1).equals(right.get(0)) ? right.subList(1, right.size())
            : right);
      return left;
    }).stream();
  }
}
