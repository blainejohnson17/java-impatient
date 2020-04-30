package ch06.ex11;

import java.util.ArrayList;
import java.util.Collections;

public class Arrays {

  public static <E extends Comparable<? super E>> Pair<E> minMax(ArrayList<E> a) {
    return new Pair<E>(Collections.min(a), Collections.max(a));
  }

}
