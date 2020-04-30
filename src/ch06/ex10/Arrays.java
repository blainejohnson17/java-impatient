package ch06.ex10;

public class Arrays {

  public static <E extends Comparable<? super E>> E[] minMax(E[] a) {
    E[] b = a.clone();
    java.util.Arrays.sort(b);
    @SuppressWarnings("unchecked")
    E[] result = (E[]) java.lang.reflect.Array.newInstance(b[0].getClass(), 2);
    result[0] = b[0];
    result[1] = b[b.length - 1];
    return result;
  }

}
