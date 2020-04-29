package ch06.ex06;

import java.util.ArrayList;

public class ArrayUtils {

  public static <E> void appendWithExtend(ArrayList<E> destination, ArrayList<? extends E> source) {
    destination.addAll(source);
  }

  public static <E> void appendWithSuper(ArrayList<? super E> destination, ArrayList<E> source) {
    destination.addAll(source);
  }

}
