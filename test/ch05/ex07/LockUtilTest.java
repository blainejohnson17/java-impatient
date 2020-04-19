package ch05.ex07;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.verify;
import java.util.concurrent.locks.ReentrantLock;
import org.junit.jupiter.api.Test;



public class LockUtilTest {

  @Test
  public void testAsAutoCloseable() throws Exception {
    ReentrantLock lock = mock(ReentrantLock.class);
    AutoCloseable closeable = LockUtil.asAutoCloseable(lock);
    verify(lock).lock();

    reset(lock);

    closeable.close();
    verify(lock).unlock();
  }

}
