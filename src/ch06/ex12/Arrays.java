package ch06.ex12;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Arrays {

  public static <E> void minMax(List<E> list, Comparator<? super E> comp, List<? super E> result) {
    result.add(Collections.min(list, comp));
    result.add(Collections.max(list, comp));
  };

}
