package ch06.ex09;

import java.util.ArrayList;

public class Arrays {

  public static <E> Pair<E> firstLast(ArrayList<E> a) {
    return new Pair<E>(a.get(0), a.get(a.size() - 1));
  }

}
