package ch07.ex05;

import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class Exercise {
  public static void swap(List<?> list, int i, int j) {
    if (i >= list.size() || i < 0) {
      throw new IllegalArgumentException("i must be between 0 and " + (list.size() - 1));
    }
    if (j >= list.size() || j < 0) {
      throw new IllegalArgumentException("j must be between 0 and " + (list.size() - 1));
    }

    if (list instanceof RandomAccess) {
      randomAccessSwap(list, i, j);
    } else {
      seqAccessSwap(list, i, j);
    }
  }

  private static <E> void randomAccessSwap(List<E> list, int i, int j) {
    E tmp = list.get(i);
    list.set(i, list.get(j));
    list.set(j, tmp);
  }

  private static <E> void seqAccessSwap(List<E> list, int i, int j) {
    ListIterator<E> itI = list.listIterator(i);
    E elI = itI.next();

    ListIterator<E> itJ = list.listIterator(j);
    E elJ = itJ.next();

    itI.set(elJ);
    itJ.set(elI);
  }
}
