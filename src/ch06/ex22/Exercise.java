package ch06.ex22;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

public class Exercise {
  public static <V, T extends Throwable> V doWork(Callable<V> c, Supplier<T> constr) throws T {
    try {
      return c.call();
    } catch (Throwable realEx) {
      T ex = constr.get();
      ex.initCause(realEx);
      throw ex;
    }
  }
}
