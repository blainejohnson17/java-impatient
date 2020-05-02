package ch06.ex15;

import java.util.ArrayList;
import java.util.function.Function;

public class ArrayUtils {

  public static <T, R> ArrayList<R> map(ArrayList<T> list, Function<T, R> func) {
    ArrayList<R> result = new ArrayList<>();
    for (T item : list) {
      result.add(func.apply(item));
    }
    return result;
  }

}
