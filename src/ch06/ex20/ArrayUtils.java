package ch06.ex20;

public class ArrayUtils {

  @SafeVarargs
  public static final <T> T[] repeat(int n, T... objs) {
    @SuppressWarnings("unchecked")
    T[] result = (T[]) java.lang.reflect.Array.newInstance(objs.getClass().getComponentType(),
        n * objs.length);
    for (int i = 0; i < n; i++) {
      System.arraycopy(objs, 0, result, i * objs.length, objs.length);
    }
    return result;
  }

}
