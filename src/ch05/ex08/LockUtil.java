package ch05.ex08;

import java.util.concurrent.locks.ReentrantLock;

public class LockUtil {
  public static AutoCloseable asAutoCloseable(ReentrantLock lock) {
    lock.lock();
    return () -> lock.unlock();
  }

}
