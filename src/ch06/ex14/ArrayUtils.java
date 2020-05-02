package ch06.ex14;

import java.util.ArrayList;

public class ArrayUtils {
  public static <E extends AutoCloseable> void closeAll(ArrayList<E> list) throws Exception {
    Exception exception = null;
    for (E item : list) {
      try {
        item.close();
      } catch (Exception e) {
        if (exception != null) {
          exception = new Exception(e.getMessage(), exception);
        } else {
          exception = e;
        }
      }
    }
    if (exception != null) {
      throw exception;
    }
  }
}
