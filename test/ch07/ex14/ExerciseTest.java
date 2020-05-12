package ch07.ex14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class ExerciseTest {

  @Test
  void testImmutableRange() {
    List<Integer> range = Exercise.immutableRange(3);
    assertEquals(Arrays.asList(0, 1, 2, 3), range);
    assertThrows(UnsupportedOperationException.class, () -> range.add(4));
    assertThrows(UnsupportedOperationException.class, () -> range.remove(0));
    assertThrows(UnsupportedOperationException.class, () -> range.clear());
  }

}
