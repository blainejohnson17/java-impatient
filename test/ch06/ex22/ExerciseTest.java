package ch06.ex22;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class ExerciseTest {

  @Test
  void testDoWork() {
    @SuppressWarnings("serial")
    class ThrowMe extends Exception {
    }

    Exception ex = assertThrows(ThrowMe.class, () -> {
      Exercise.doWork(() -> {
        throw new Exception("real exception");
      }, ThrowMe::new);
    });

    assertEquals("real exception", ex.getCause().getMessage());

  }
}
