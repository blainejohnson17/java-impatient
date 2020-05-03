package ch07.ex01;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise {

  public static List<Integer> seiveWithHashSet(int n) {
    Set<Integer> set = new HashSet<>(n);
    for (int i = 2; i <= n; i++) {
      set.add(i);
    }

    for (int i = 2; i * i <= n; i++) {
      if (set.contains(i)) {
        for (int j = i * i; j <= n; j += i) {
          set.remove(j);
        }
      }
    }

    return new ArrayList<>(set);
  }

  public static List<Integer> seiveWithBitSet(int n) {
    BitSet set = new BitSet(n);
    set.set(2, n + 1);

    for (int i = 2; i * i <= n; i++) {
      if (set.get(i)) {
        for (int j = i * i; j <= n; j += i) {
          set.clear(j);
        }
      }
    }

    List<Integer> result = new ArrayList<>(set.cardinality());
    int i = set.nextSetBit(2);
    while (i > 0) {
      result.add(i);
      i = set.nextSetBit(++i);
    }
    return result;
  }
}
