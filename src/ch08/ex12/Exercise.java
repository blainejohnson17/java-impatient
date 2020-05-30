package ch08.ex12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Exercise {
  public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
    Iterator<T> firstIterator = first.iterator();
    Iterator<T> secondIterator = second.iterator();
    boolean useFirst = true;
    List<T> list = new ArrayList<>();
    while (firstIterator.hasNext() || secondIterator.hasNext()) {
      T el = null;
      try {
        el = useFirst ? firstIterator.next() : secondIterator.next();
      } catch (Exception e) {
        // do nothing
      }
      list.add(el);
      useFirst = !useFirst;
    }
    return list.stream();
  }
}
